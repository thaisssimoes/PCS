/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Gerenciador;
import static controller.Gerenciador.obterAluno;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.Instant;
import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.Border;
import model.entity.Aluno;
import model.entity.Professor;
import model.requerimento.Requerimento;

/**
 *
 * @author labccet
 */
public class RequerimentoGeralAnexoAluno extends javax.swing.JFrame {

    /**
     * Creates new form telaAluno
     */
    public RequerimentoGeralAnexoAluno() {
        initComponents();
        criarRequerimento(requerimento);
        preencherTela();
        
        dataAberturaLabel.setText(String.valueOf(LocalDate.now()));
        dataFechamentoFixo.setVisible(false);
        dataFechamentoLabel.setVisible(false);
       
    }
    Aluno aluno;
    Requerimento requerimento = new Requerimento();
    
    public RequerimentoGeralAnexoAluno(Aluno aluno, String titulo) {
        this.setTitle(titulo);
        initComponents();
        this.aluno = aluno;
        preencherTela();
        preencherCamposEscrita();
        centralizarTela();

    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numeroProtocoloLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dataFechamentoFixo = new javax.swing.JLabel();
        dataAberturaLabel = new javax.swing.JLabel();
        dataFechamentoLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nomeCompletoAlunoLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        matriculaAlunoLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        emailAlunoLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        telefoneAlunoLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        periodoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoAreaTexto = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        cancelarBotao = new javax.swing.JButton();
        enviarBotao = new javax.swing.JButton();
        disciplinaComboBox = new javax.swing.JComboBox();
        disciplinaLabelFixo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        respostaAreaTexo = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        anexo2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        anexo1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel2.setBackground(new java.awt.Color(56, 113, 156));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iBSI.png"))); // NOI18N

        numeroProtocoloLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numeroProtocoloLabel.setForeground(new java.awt.Color(255, 255, 255));
        numeroProtocoloLabel.setText("numero de protocolo");

        statusLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("status");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de abertura:");

        dataFechamentoFixo.setForeground(new java.awt.Color(255, 255, 255));
        dataFechamentoFixo.setText("Data de fechamento:");

        dataAberturaLabel.setForeground(new java.awt.Color(255, 255, 255));
        dataAberturaLabel.setText("dd/mm/yyyy");

        dataFechamentoLabel.setForeground(new java.awt.Color(255, 255, 255));
        dataFechamentoLabel.setText("dd/mm/yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(591, 591, 591)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroProtocoloLabel)
                            .addComponent(statusLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataFechamentoFixo)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataAberturaLabel)
                            .addComponent(dataFechamentoLabel))
                        .addGap(138, 138, 138))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(dataAberturaLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(numeroProtocoloLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(statusLabel)
                                    .addComponent(dataFechamentoFixo)
                                    .addComponent(dataFechamentoLabel))))
                        .addGap(19, 19, 19))))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nome:");

        nomeCompletoAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeCompletoAlunoLabel.setText("Nome Completo do Aluno");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Matrícula:");

        matriculaAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        matriculaAlunoLabel.setText("123456789");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("E-mail:");

        emailAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailAlunoLabel.setText("nome.sobrenome@uniriotec.br");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Telefone:");

        telefoneAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefoneAlunoLabel.setText("(21) 9-2222-2222");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Período:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("período");

        periodoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        periodoLabel.setText("X");

        descricaoAreaTexto.setColumns(20);
        descricaoAreaTexto.setRows(5);
        jScrollPane1.setViewportView(descricaoAreaTexto);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Descrição:");

        cancelarBotao.setBackground(new java.awt.Color(56, 113, 156));
        cancelarBotao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelarBotao.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBotao.setText("Voltar");
        cancelarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotaoActionPerformed(evt);
            }
        });

        enviarBotao.setBackground(new java.awt.Color(56, 113, 156));
        enviarBotao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enviarBotao.setForeground(new java.awt.Color(255, 255, 255));
        enviarBotao.setText("Enviar");
        enviarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBotaoActionPerformed(evt);
            }
        });

        disciplinaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administração Financeira", "Álgebra Linear", "Análise de Algoritmo", "Análise de Sistemas", "Análise Empresarial e Admin.", "Banco de Dados I", "Banco de Dados II", "Cálculo Diferenc. e Integral I", "Cálculo Diferenc. e Integral II", "Desenvolv. de Páginas Web", "Empreendedorismo", "Estatística", "Estruturas de Dados I", "Estruturas de Dados II", "Estruturas Discretas", "Fund. de Sist. de Informação", "Gerência de Proj. de Informat.", "Interação Humano Computador", "Introdução à Lógica Computac.", "Linguag. Formais e Autômatos", "Matemática Básica", "Organização de Computadores", "Probabilidade", "Processos de Software", "Programação Modular", "Projeto de Graduação I", "Projeto de Graduação II", "Proj. e Const. de Sistemas", "Proj. Const. Sistemas-SGBD", "Redes de Computadores I", "Redes de Computadores II", "Sistemas Operacionais", "Técnicas de Programação I", "Técnicas de Programação II", "Teorias e Práticas Discursivas" }));

        disciplinaLabelFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        disciplinaLabelFixo.setText("Disciplina:");

        respostaAreaTexo.setColumns(20);
        respostaAreaTexo.setRows(5);
        respostaAreaTexo.setEnabled(false);
        jScrollPane2.setViewportView(respostaAreaTexo);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Resposta:");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/documentoAnexar.png"))); // NOI18N

        jLabel4.setText("Anexo");

        javax.swing.GroupLayout anexo2Layout = new javax.swing.GroupLayout(anexo2);
        anexo2.setLayout(anexo2Layout);
        anexo2Layout.setHorizontalGroup(
            anexo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anexo2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(anexo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel4))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        anexo2Layout.setVerticalGroup(
            anexo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, anexo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(5, 5, 5))
        );

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/documentoAnexar.png"))); // NOI18N

        jLabel6.setText("Anexo");

        javax.swing.GroupLayout anexo1Layout = new javax.swing.GroupLayout(anexo1);
        anexo1.setLayout(anexo1Layout);
        anexo1Layout.setHorizontalGroup(
            anexo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anexo1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(anexo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel6))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        anexo1Layout.setVerticalGroup(
            anexo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, anexo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(21, 21, 21)
                                .addComponent(nomeCompletoAlunoLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(21, 21, 21)
                                .addComponent(emailAlunoLabel)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefoneAlunoLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matriculaAlunoLabel)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(disciplinaLabelFixo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(disciplinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(anexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(anexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelarBotao, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enviarBotao)))))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(nomeCompletoAlunoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(emailAlunoLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(matriculaAlunoLabel)
                            .addComponent(jLabel19)
                            .addComponent(periodoLabel)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(telefoneAlunoLabel))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(disciplinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(disciplinaLabelFixo))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarBotao)
                    .addComponent(enviarBotao))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void preencherCamposEscrita() {
        emailAlunoLabel.setText(aluno.getEmail());
        nomeCompletoAlunoLabel.setText(aluno.getNome());
        matriculaAlunoLabel.setText(aluno.getMatricula());
        telefoneAlunoLabel.setText(aluno.getTelefoneCelular());
        dataAberturaLabel.setText(String.valueOf(LocalDate.now()));
        periodoLabel.setText(aluno.getPeriodo());
        
    }
    
    private void preencherCamposLeitura() {
        Aluno aluno = (Aluno) requerimento.getRequerente();
        emailAlunoLabel.setText(aluno.getEmail());
        nomeCompletoAlunoLabel.setText(aluno.getNome());
        matriculaAlunoLabel.setText(aluno.getMatricula());
        telefoneAlunoLabel.setText(aluno.getTelefoneCelular());
        dataAberturaLabel.setText(requerimento.getDataCriacao());
        
    }
    
    private void preencherTela() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        String titulo = this.getTitle();
        System.out.println(titulo);
        numeroProtocoloLabel.setVisible(false);
        statusLabel.setVisible(false);
        dataFechamentoLabel.setVisible(false);
        dataFechamentoFixo.setVisible(false);
        if (titulo.equals("Realização de segunda chamada")
                || titulo.equals("Revisão de prova")
                || titulo.equals("Isenção ou aproveitamento de disciplina")) {
            disciplinaLabelFixo.setVisible(true);
            disciplinaComboBox.setVisible(true);
            anexo1.setVisible(true);
            anexo2.setVisible(true);
        } else {
            disciplinaLabelFixo.setVisible(false);
            disciplinaComboBox.setVisible(false);
            anexo1.setVisible(false);
            anexo2.setVisible(false);
            this.setBounds(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2, 700, 500);
            
        }
    }
    
    private void centralizarTela() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }


    private void enviarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBotaoActionPerformed
       if(descricaoAreaTexto.getText().equals("")||descricaoAreaTexto.getText().equals(" ")){
            PreenchaDadosPopUp alertaFaltaDados = new PreenchaDadosPopUp();
            alertaFaltaDados.setVisible(true);
        }
        else{
        
            criarRequerimento(requerimento);
            ConfirmacaoEnvio janelaConfirmacao = new ConfirmacaoEnvio(aluno, requerimento);
            janelaConfirmacao.setVisible(true);
       }


    }//GEN-LAST:event_enviarBotaoActionPerformed

    private void cancelarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotaoActionPerformed
        TelaAluno janelaTelaAluno = new TelaAluno(aluno);
        janelaTelaAluno.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_cancelarBotaoActionPerformed
    
    private void criarRequerimento(Requerimento requerimento) {
        numeroProtocoloLabel.setText(requerimento.getNumeroProtocolo());
        requerimento.setDataCriacao(LocalDate.now().toString());
        requerimento.setDescricao(descricaoAreaTexto.getText());
        requerimento.setRequerente(aluno);
        requerimento.setStatus("TRIAGEM");
        requerimento.setTipoRequerimento(this.getTitle());
        requerimento.setResposta(""); 
        requerimento.setDisciplina(String.valueOf(disciplinaComboBox.getSelectedItem()));
        if (!requerimento.getDisciplina().equals(null)) {
            requerimento.setAreaResponsavel(controller.Gerenciador.obterProfessorDisciplina(String.valueOf(disciplinaComboBox.getSelectedItem())));

        } else if(this.getTitle().equals("Cancelamento de matrícula") || this.getTitle().equals("Revisão de prova")) {
            requerimento.setAreaResponsavel(Gerenciador.obterProfessorCargo(encontrarCargoTipoRequerimento()));
        }
        else{
            requerimento.setAreaResponsavel(Gerenciador.criarTecnicoGenerico());

        }
    }

     private String encontrarCargoTipoRequerimento() {
        if (this.getTitle().equals("Cancelamento de matrícula")) {
            return "Diretor";
        } else if (this.getTitle().equals("Revisão de prova")) {
            return "Chefe de Departamento";
        } else {
            return "Criar tecnico";
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequerimentoGeralAnexoAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel anexo1;
    private javax.swing.JPanel anexo2;
    private javax.swing.JButton cancelarBotao;
    private javax.swing.JLabel dataAberturaLabel;
    private javax.swing.JLabel dataFechamentoFixo;
    private javax.swing.JLabel dataFechamentoLabel;
    private javax.swing.JTextArea descricaoAreaTexto;
    private javax.swing.JComboBox disciplinaComboBox;
    private javax.swing.JLabel disciplinaLabelFixo;
    private javax.swing.JLabel emailAlunoLabel;
    private javax.swing.JButton enviarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel matriculaAlunoLabel;
    private javax.swing.JLabel nomeCompletoAlunoLabel;
    private javax.swing.JLabel numeroProtocoloLabel;
    private javax.swing.JLabel periodoLabel;
    private javax.swing.JTextArea respostaAreaTexo;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel telefoneAlunoLabel;
    // End of variables declaration//GEN-END:variables
}
