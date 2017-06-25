/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author RafaelSalazarStavale
 */

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

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
	public void escreveXML(Type type, boolean x) {
		if (x)
			lista.add(type);
		else
			lista.remove(type);

		try {
			XMLEncoder encoder = null;
			try {
				encoder = new XMLEncoder(new FileOutputStream(nomeArquivo));
				encoder.writeObject(lista);

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

}
