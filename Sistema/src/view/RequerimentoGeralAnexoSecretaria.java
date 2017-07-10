/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static controller.Gerenciador.obterAluno;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import model.entity.Aluno;
import model.entity.Tecnico;
import model.requerimento.Requerimento;

/**
 *
 * @author labccet
 */
public class RequerimentoGeralAnexoSecretaria extends javax.swing.JFrame {

    /**
     * Creates new form telaAluno
     */
    public RequerimentoGeralAnexoSecretaria() {
        initComponents();
    }
    Tecnico tecnico;
    Requerimento requerimento;
    Aluno aluno;
    public RequerimentoGeralAnexoSecretaria(String cpf, String senha, String titulo) {
        this.setTitle(titulo);
        initComponents();
        preencherTela();
        preencherCampos();
        centralizarTela();
        initComponents();
        this.tecnico = tecnico;
        centralizarTela();
    }
    public RequerimentoGeralAnexoSecretaria(Requerimento requerimento,String titulo){
        this.setTitle(titulo);
        initComponents();
        this.requerimento = requerimento;
        this.aluno = (Aluno) requerimento.getRequerente();
        preencherTela();
        preencherCampos();
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
        jLabel15 = new javax.swing.JLabel();
        emailAlunoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoAreaTexto = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        exportarBotao = new javax.swing.JButton();
        rejeitarBotao = new javax.swing.JButton();
        aceitarBotao = new javax.swing.JButton();
        disciplinaLabelFixo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        respostaAreaTexto = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        anexo2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        anexo1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        disciplinaLabel = new javax.swing.JLabel();
        matriculaAlunoLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        periodoLabel = new javax.swing.JLabel();
        telefoneAlunoLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        voltarBotao = new javax.swing.JButton();

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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(numeroProtocoloLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(statusLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataFechamentoFixo)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataAberturaLabel)
                            .addComponent(dataFechamentoLabel))
                        .addGap(183, 183, 183))))
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

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("E-mail:");

        emailAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailAlunoLabel.setText("nome.sobrenome@uniriotec.br");

        descricaoAreaTexto.setColumns(20);
        descricaoAreaTexto.setRows(5);
        descricaoAreaTexto.setEnabled(false);
        jScrollPane1.setViewportView(descricaoAreaTexto);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Descrição:");

        exportarBotao.setBackground(new java.awt.Color(56, 113, 156));
        exportarBotao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exportarBotao.setForeground(new java.awt.Color(255, 255, 255));
        exportarBotao.setText("Exportar");
        exportarBotao.setEnabled(false);
        exportarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarBotaoActionPerformed(evt);
            }
        });

        rejeitarBotao.setBackground(new java.awt.Color(56, 113, 156));
        rejeitarBotao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rejeitarBotao.setForeground(new java.awt.Color(255, 255, 255));
        rejeitarBotao.setText("Rejeitar");
        rejeitarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejeitarBotaoActionPerformed(evt);
            }
        });

        aceitarBotao.setBackground(new java.awt.Color(56, 113, 156));
        aceitarBotao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aceitarBotao.setForeground(new java.awt.Color(255, 255, 255));
        aceitarBotao.setText("Aceitar");
        aceitarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceitarBotaoActionPerformed(evt);
            }
        });

        disciplinaLabelFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        disciplinaLabelFixo.setText("Disciplina:");

        respostaAreaTexto.setColumns(20);
        respostaAreaTexto.setRows(5);
        respostaAreaTexto.setEnabled(false);
        jScrollPane2.setViewportView(respostaAreaTexto);

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

        disciplinaLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        disciplinaLabel.setText("Disciplina:");

        matriculaAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        matriculaAlunoLabel.setText("123456789");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Matrícula:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Período:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("período");

        periodoLabel.setText("X");

        telefoneAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefoneAlunoLabel.setText("(21) 9-2222-2222");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Telefone:");

        voltarBotao.setBackground(new java.awt.Color(56, 113, 156));
        voltarBotao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voltarBotao.setForeground(new java.awt.Color(255, 255, 255));
        voltarBotao.setText("Voltar");
        voltarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(disciplinaLabelFixo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(disciplinaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(anexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(anexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(21, 21, 21)
                                        .addComponent(nomeCompletoAlunoLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(21, 21, 21)
                                        .addComponent(emailAlunoLabel)))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneAlunoLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(matriculaAlunoLabel)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(periodoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel20))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(voltarBotao)
                        .addGap(57, 57, 57)
                        .addComponent(rejeitarBotao)
                        .addGap(60, 60, 60)
                        .addComponent(exportarBotao)
                        .addGap(59, 59, 59)
                        .addComponent(aceitarBotao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nomeCompletoAlunoLabel)
                    .addComponent(jLabel14)
                    .addComponent(matriculaAlunoLabel)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(periodoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(emailAlunoLabel)
                    .addComponent(jLabel18)
                    .addComponent(telefoneAlunoLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disciplinaLabelFixo)
                            .addComponent(disciplinaLabel))))
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rejeitarBotao)
                        .addComponent(exportarBotao)
                        .addComponent(aceitarBotao))
                    .addComponent(voltarBotao))
                .addContainerGap(47, Short.MAX_VALUE))
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
    
    
    private void preencherCampos() {
        emailAlunoLabel.setText(aluno.getEmail());
        nomeCompletoAlunoLabel.setText(aluno.getNome());
        matriculaAlunoLabel.setText(aluno.getMatricula());
        telefoneAlunoLabel.setText(aluno.getTelefoneCelular());
        dataAberturaLabel.setText(requerimento.getDataCriacao());
        statusLabel.setText(requerimento.getStatus());
        numeroProtocoloLabel.setText(requerimento.getNumeroProtocolo());
        descricaoAreaTexto.setText(requerimento.getDescricao());
        disciplinaLabel.setText(requerimento.getDisciplina());
        respostaAreaTexto.setText(requerimento.getResposta());
        periodoLabel.setText(aluno.getPeriodo());
    }
    
      private void preencherTela(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        String titulo = this.getTitle();
        System.out.println(titulo);
        dataFechamentoLabel.setVisible(false);
        dataFechamentoFixo.setVisible(false);

        if(titulo.equals("Realização de segunda chamada")
            || titulo.equals("Revisão de prova")
            || titulo.equals("Isenção ou aproveitamento de disciplina")){
            disciplinaLabelFixo.setVisible(true);
            disciplinaLabel.setVisible(true);
            anexo1.setVisible(true);
            anexo2.setVisible(true);
        }
        else{         
            disciplinaLabelFixo.setVisible(false);
            disciplinaLabel.setVisible(false);
            anexo1.setVisible(false);
            anexo2.setVisible(false);
            this.setBounds(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2, 700, 550);
               
        }
    }
    private void centralizarTela() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }


    private void aceitarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceitarBotaoActionPerformed
        requerimento.setStatus("DESIGNADO");
        controller.Gerenciador.analisaRequerimento(requerimento);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_aceitarBotaoActionPerformed

    private void exportarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarBotaoActionPerformed
        PopupComentario janelaComentario = new PopupComentario();
        janelaComentario.setVisible(true);    }//GEN-LAST:event_exportarBotaoActionPerformed

    private void rejeitarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejeitarBotaoActionPerformed
        PopupComentario janelaComentario = new PopupComentario(requerimento, "REJEITADO");
        janelaComentario.setVisible(true);             
        this.setVisible(false);
        this.dispose();;

    }//GEN-LAST:event_rejeitarBotaoActionPerformed

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_voltarBotaoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RequerimentoGeralAnexoSecretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceitarBotao;
    private javax.swing.JPanel anexo1;
    private javax.swing.JPanel anexo2;
    private javax.swing.JLabel dataAberturaLabel;
    private javax.swing.JLabel dataFechamentoFixo;
    private javax.swing.JLabel dataFechamentoLabel;
    private javax.swing.JTextArea descricaoAreaTexto;
    private javax.swing.JLabel disciplinaLabel;
    private javax.swing.JLabel disciplinaLabelFixo;
    private javax.swing.JLabel emailAlunoLabel;
    private javax.swing.JButton exportarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JButton rejeitarBotao;
    private javax.swing.JTextArea respostaAreaTexto;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel telefoneAlunoLabel;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables
}
