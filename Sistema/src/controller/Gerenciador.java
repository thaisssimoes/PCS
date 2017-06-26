package controller;

import dao.XMLHandler;
import model.requerimento.Requerimento;
import view.Login;

public class Gerenciador {

    private static Login login;
    private static XMLHandler handler;

    public static void main(String[] args) {
        login = new Login();
    }

    public void analisar(Requerimento requerimento) {

        if (requerimento.getStatus() == "TRIAGEM") {
            handler = new XMLHandler<>("Secretaria.xml");
            handler.escreveXML(requerimento);

        }
    }

    public void persistir(Requerimento requerimento, XMLHandler handler) {

    }
}
