package utils;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe que manipula um arquivo XML.
 * 
 */
public class XMLHandler<Type> {

	private ArrayList<Type> lista = new ArrayList<Type>();
	private String nomeArquivo;
	
	public XMLHandler(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	/**
	 * Retorna um ArrayList do tipo especificado.
	 */
	public ArrayList<Type> getLista() {
		return lista;
	}

	/**
	 * Escreve no arquivo XML.
	 */
	public void escreveXML(Type type) {
		lista.add(type);
		if(lista.isEmpty())
			System.out.println("vazia");
		try {
			XMLEncoder encoder = null;
			try {
				encoder = new XMLEncoder(new FileOutputStream(nomeArquivo));
				encoder.writeObject(lista.get(0));

			} finally {
				if (encoder != null)
					encoder.close();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Lê o arquivo XML.
	 */
	@SuppressWarnings("unchecked")
	public void leXML() {

		try {
			XMLDecoder decoder = null;
			try {
				decoder = new XMLDecoder(new FileInputStream(nomeArquivo));
				lista = (ArrayList<Type>) decoder.readObject();
			} finally {
				if (decoder != null)
					decoder.close();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void updateXML(Type type, String id) {
		leXML();

	}
}
