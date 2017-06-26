package controller;

import dao.XMLManager;
import dao.XMLHandler;
import model.entity.Aluno;
import model.entity.Usuario;
import view.Login;

public class Gerenciador {

    private static Login login;
    private static XMLHandler handler;
    private static XMLManager leitor;
    private static XMLManager manager = new XMLManager();

    public static void main(String[] args) {
        // login = new Login();

        Aluno aluno = new Aluno("999", "Raf", "09/19/1991", "endereco1");
        manager.gravarXML(aluno);
        manager.lerXML();

        // Usuario usuario = retornaUsuario("999", "senha", "ALUNO");
        //Requerimento requerimento = new Requerimento(requerente, areaResponsavel, status, descricao, dataCriacao, dataSolucao, feedback)
    }

//    public static void retornaUsuario(String cpf, String senha, String tipoLogin) {
//        if (tipoLogin == "ALUNO") {
//            handler = new XMLHandler<Aluno>("aluno.xml");
//            //handler.escreveXML();
//
//        }
}

//    public void analisar(Requerimento requerimento) {
//
//        if (requerimento.getStatus() == "TRIAGEM") {
//            //   handler = new XMLHandler<>("Secretaria.xml")
//            // handler.escreveXML(requerimento);
//
//        }
//    }
//
//    public void persistir(Requerimento requerimento, XMLHandler handler) {
//
//    }
