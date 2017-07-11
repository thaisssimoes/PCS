/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static controller.Gerenciador.buscarRequerimentoProtocolo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.entity.Tecnico;
import model.requerimento.Requerimento;

/**
 *
 * @author labccet
 */
public class TelaSecretaria extends javax.swing.JFrame {

    /**
     * Creates new form telaAluno
     */
    public TelaSecretaria() {

        initComponents();
        centralizarTela();

    }
    Tecnico tecnico;

    public TelaSecretaria(Tecnico tecnico) {

        initComponents();
        this.tecnico = tecnico;
        preencherCampos();
        centralizarTela();
        popularRequerimentosSecretaria();
        popularRequerimentos();
        popularRequerimentosTriagem();
        popularRequerimentosFinalizados();
                        

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
        logoutLabel = new javax.swing.JLabel();
        painelRequerimentosProfessores = new javax.swing.JTabbedPane();
        morraDesgracado = new javax.swing.JScrollPane();
        tabelaTodosRequerimentos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaTriagem = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaRequerimentoSecretaria = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRequerimentosFinalizados = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        emailTecnicoLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        telefoneCelTecnicoLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        siapeTecnicoLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        centroAcademicoTecnicoLabel = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lotacaoTecnicoLabel = new javax.swing.JLabel();
        nomeCompletoTecnicoLabel = new javax.swing.JLabel();
        quadradoAtualizar = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        setinhaAtualizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel2.setBackground(new java.awt.Color(56, 113, 156));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iBSI.png"))); // NOI18N

        logoutLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Trocar de Usuário");
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logoutLabel)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutLabel)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))))
        );

        painelRequerimentosProfessores.setBackground(new java.awt.Color(255, 255, 255));

        if("Professor".equals("Decano") || "Professor".equals("Chefe de Departamento")){
            tabelaTodosRequerimentos = new javax.swing.JTable();
        }
        tabelaTodosRequerimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Protocolo", "Nome Requerente", "Tipo", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaTodosRequerimentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaTodosRequerimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaTodosRequerimentosMouseClicked(evt);
            }
        });
        morraDesgracado.setViewportView(tabelaTodosRequerimentos);

        painelRequerimentosProfessores.addTab("Todos os Requerimentos", morraDesgracado);

        tabelaTriagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Protocolo", "Nome Requerente", "Tipo", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaTriagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaTriagemMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaTriagem);
        tabelaTriagem.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        painelRequerimentosProfessores.addTab("Triagem de Requerimentos", jScrollPane4);

        tabelaRequerimentoSecretaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Protocolo", "Nome Requerente", "Tipo", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRequerimentoSecretaria.setToolTipText("");
        tabelaRequerimentoSecretaria.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaRequerimentoSecretaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRequerimentoSecretariaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaRequerimentoSecretaria);
        tabelaRequerimentoSecretaria.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        painelRequerimentosProfessores.addTab("Requerimentos da Secretaria", jScrollPane3);

        tabelaRequerimentosFinalizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Protocolo", "Nome Requerente", "Tipo", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRequerimentosFinalizados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaRequerimentosFinalizados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRequerimentosFinalizadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRequerimentosFinalizados);

        painelRequerimentosProfessores.addTab("Requerimentos Finalizados", jScrollPane1);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nome:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("E-mail:");

        emailTecnicoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailTecnicoLabel.setText("nome.sobrenome@uniriotec.br");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Telefone:");

        telefoneCelTecnicoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefoneCelTecnicoLabel.setText("(21) 9-2222-2222");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Matrícula SIAPE:");

        siapeTecnicoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        siapeTecnicoLabel.setText("SIAPE");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Centro Acadêmico:");

        centroAcademicoTecnicoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        centroAcademicoTecnicoLabel.setText("CCET");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Lotação:");

        lotacaoTecnicoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lotacaoTecnicoLabel.setText("Escola de Informática Aplicada");

        nomeCompletoTecnicoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeCompletoTecnicoLabel.setText("Nome Completo do Tecnico");

        quadradoAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        quadradoAtualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 113, 156), 2, true));
        quadradoAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quadradoAtualizarMouseClicked(evt);
            }
        });

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));

        jLabel36.setText("Atualizar");

        setinhaAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        setinhaAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setinhaAtualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout quadradoAtualizarLayout = new javax.swing.GroupLayout(quadradoAtualizar);
        quadradoAtualizar.setLayout(quadradoAtualizarLayout);
        quadradoAtualizarLayout.setHorizontalGroup(
            quadradoAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadradoAtualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
            .addGroup(quadradoAtualizarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(quadradoAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setinhaAtualizar)
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quadradoAtualizarLayout.setVerticalGroup(
            quadradoAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadradoAtualizarLayout.createSequentialGroup()
                .addGroup(quadradoAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quadradoAtualizarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel35))
                    .addGroup(quadradoAtualizarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(setinhaAtualizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(painelRequerimentosProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefoneCelTecnicoLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailTecnicoLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeCompletoTecnicoLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(centroAcademicoTecnicoLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lotacaoTecnicoLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(siapeTecnicoLabel)))
                        .addGap(24, 24, 24)
                        .addComponent(quadradoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(nomeCompletoTecnicoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(emailTecnicoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(telefoneCelTecnicoLabel)))
                    .addComponent(quadradoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(centroAcademicoTecnicoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(lotacaoTecnicoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(siapeTecnicoLabel))))
                .addGap(28, 28, 28)
                .addComponent(painelRequerimentosProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limparTabela(){
        DefaultTableModel model = (DefaultTableModel) tabelaTriagem.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tabelaTodosRequerimentos.getModel();
        DefaultTableModel model3 = (DefaultTableModel) tabelaRequerimentoSecretaria.getModel();
        DefaultTableModel model4 = (DefaultTableModel) tabelaRequerimentosFinalizados.getModel();

        model.setRowCount(0);
        model2.setRowCount(0);
        model3.setRowCount(0);
        model4.setRowCount(0);

    }
    
    private void setinhaAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setinhaAtualizarMouseClicked
        limparTabela();
        popularRequerimentosSecretaria();
        popularRequerimentos();
        popularRequerimentosTriagem();
        popularRequerimentosFinalizados();
    }//GEN-LAST:event_setinhaAtualizarMouseClicked

    private void quadradoAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quadradoAtualizarMouseClicked
      limparTabela();
        popularRequerimentosSecretaria();
        popularRequerimentos();
        popularRequerimentosTriagem();
        popularRequerimentosFinalizados();
    }//GEN-LAST:event_quadradoAtualizarMouseClicked

    private void tabelaTriagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTriagemMouseClicked
        tabelaTriagem = (JTable) evt.getSource();
        
        if (evt.getClickCount() == 2) {
            int numeroLinha = tabelaTriagem.getSelectedRow();
            String numeroProtocolo = (String) tabelaTriagem.getValueAt(numeroLinha,0);
            String tipoRequerimento =(String) tabelaTriagem.getValueAt(numeroLinha,1);
            ArrayList<Requerimento> requerimento = buscarRequerimentoProtocolo(numeroProtocolo);
            RequerimentoGeralAnexoSecretaria requerimentoAlunoLeitura;
            requerimentoAlunoLeitura = new RequerimentoGeralAnexoSecretaria(requerimento.get(0),tipoRequerimento);
            requerimentoAlunoLeitura.setVisible(true);
        }    }//GEN-LAST:event_tabelaTriagemMouseClicked

    private void tabelaRequerimentoSecretariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRequerimentoSecretariaMouseClicked
        tabelaRequerimentoSecretaria = (JTable) evt.getSource();
        
        if (evt.getClickCount() == 2) {
            int numeroLinha = tabelaRequerimentoSecretaria.getSelectedRow();
            String numeroProtocolo = (String) tabelaRequerimentoSecretaria.getValueAt(numeroLinha,0);
            String tipoRequerimento =(String) tabelaRequerimentoSecretaria.getValueAt(numeroLinha,1);
            ArrayList<Requerimento> requerimento = buscarRequerimentoProtocolo(numeroProtocolo);
            RequerimentoGeralAnexoSecretariaLeitura requerimentoAlunoLeitura;
            requerimentoAlunoLeitura = new RequerimentoGeralAnexoSecretariaLeitura(requerimento.get(0),tipoRequerimento);
            requerimentoAlunoLeitura.setVisible(true);
        }
    }//GEN-LAST:event_tabelaRequerimentoSecretariaMouseClicked

    private void tabelaTodosRequerimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTodosRequerimentosMouseClicked
        tabelaTodosRequerimentos = (JTable) evt.getSource();
        
        if (evt.getClickCount() == 2) {
            int numeroLinha = tabelaTodosRequerimentos.getSelectedRow();
            String numeroProtocolo = (String) tabelaTodosRequerimentos.getValueAt(numeroLinha,0);
            String tipoRequerimento =(String) tabelaTodosRequerimentos.getValueAt(numeroLinha,1);
            ArrayList<Requerimento> requerimento = buscarRequerimentoProtocolo(numeroProtocolo);
            RequerimentoGeralAnexoSecretaria requerimentoAlunoLeitura;
            requerimentoAlunoLeitura = new RequerimentoGeralAnexoSecretaria(requerimento.get(0),tipoRequerimento);
            requerimentoAlunoLeitura.setVisible(true);
        }
    }//GEN-LAST:event_tabelaTodosRequerimentosMouseClicked

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void tabelaRequerimentosFinalizadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRequerimentosFinalizadosMouseClicked
        tabelaRequerimentosFinalizados = (JTable) evt.getSource();
        
        if (evt.getClickCount() == 2) {
            int numeroLinha = tabelaRequerimentosFinalizados.getSelectedRow();
            String numeroProtocolo = (String) tabelaRequerimentosFinalizados.getValueAt(numeroLinha,0);
            String tipoRequerimento =(String) tabelaRequerimentosFinalizados.getValueAt(numeroLinha,1);
            ArrayList<Requerimento> requerimento = buscarRequerimentoProtocolo(numeroProtocolo);
            RequerimentoGeralAnexoSecretariaLeituraFinalizados requerimentoAlunoLeitura;
            requerimentoAlunoLeitura = new RequerimentoGeralAnexoSecretariaLeituraFinalizados(requerimento.get(0),tipoRequerimento);         
            requerimentoAlunoLeitura.setVisible(true);

        }
    }//GEN-LAST:event_tabelaRequerimentosFinalizadosMouseClicked

     private void popularRequerimentosFinalizados(){
        DefaultTableModel model = (DefaultTableModel) tabelaRequerimentosFinalizados.getModel();
        ArrayList<Requerimento> requerimentos = controller.Gerenciador.buscarRequerimentoFinalizado();
        Object rowData[] = new Object[4];
        for (int i = 0; i < requerimentos.size(); i++) {
            rowData[0] = requerimentos.get(i).getNumeroProtocolo();
            rowData[1] = requerimentos.get(i).requerente.getNome();
            rowData[2] = requerimentos.get(i).getTipoRequerimento();
            rowData[3] = requerimentos.get(i).getStatus();
            model.addRow(rowData);
        }
     } 
    private void popularRequerimentosTriagem() {

        DefaultTableModel model = (DefaultTableModel) tabelaTriagem.getModel();
        ArrayList<Requerimento> requerimentos = controller.Gerenciador.buscarTriagem();
        Object rowData[] = new Object[4];
        for (int i = 0; i < requerimentos.size(); i++) {
            rowData[0] = requerimentos.get(i).getNumeroProtocolo();
            rowData[1] = requerimentos.get(i).requerente.getNome();
            rowData[2] = requerimentos.get(i).getTipoRequerimento();
            rowData[3] = requerimentos.get(i).getStatus();
            model.addRow(rowData);
        }
    }
    
    private void popularRequerimentos() {

        DefaultTableModel model = (DefaultTableModel) tabelaTodosRequerimentos.getModel();
        ArrayList<Requerimento> requerimentos = controller.Gerenciador.buscarRequerimentoRequerenteAluno();
        Object rowData[] = new Object[4];
        for (int i = 0; i < requerimentos.size(); i++) {
            rowData[0] = requerimentos.get(i).getNumeroProtocolo();
            rowData[1] = requerimentos.get(i).requerente.getNome();
            rowData[2] = requerimentos.get(i).getTipoRequerimento();
            rowData[3] = requerimentos.get(i).getStatus();
            model.addRow(rowData);
        }
    }
    
      private void popularRequerimentosSecretaria() {

        DefaultTableModel model = (DefaultTableModel) tabelaRequerimentoSecretaria.getModel();
        ArrayList<Requerimento> requerimentos = controller.Gerenciador.buscarRequerimentoAreaResponsavelTecnico();
        Object rowData[] = new Object[4];
        for (int i = 0; i < requerimentos.size(); i++) {
            rowData[0] = requerimentos.get(i).getNumeroProtocolo();
            rowData[1] = requerimentos.get(i).requerente.getNome();
            rowData[2] = requerimentos.get(i).getTipoRequerimento();
            rowData[3] = requerimentos.get(i).getStatus();
            model.addRow(rowData);
        }
    }
    
    
    private void centralizarTela() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }
    private void preencherCampos() {
        this.centroAcademicoTecnicoLabel.setText(tecnico.getCentroAcademico());
        this.emailTecnicoLabel.setText(tecnico.getEmail());
        this.lotacaoTecnicoLabel.setText(tecnico.getLotacao());
        this.nomeCompletoTecnicoLabel.setText(tecnico.getNome());
        this.telefoneCelTecnicoLabel.setText(tecnico.getTelefoneCelular());
        this.siapeTecnicoLabel.setText(tecnico.getSiape());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel centroAcademicoTecnicoLabel;
    private javax.swing.JLabel emailTecnicoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel lotacaoTecnicoLabel;
    private javax.swing.JScrollPane morraDesgracado;
    private javax.swing.JLabel nomeCompletoTecnicoLabel;
    private javax.swing.JTabbedPane painelRequerimentosProfessores;
    private javax.swing.JPanel quadradoAtualizar;
    private javax.swing.JLabel setinhaAtualizar;
    private javax.swing.JLabel siapeTecnicoLabel;
    private javax.swing.JTable tabelaRequerimentoSecretaria;
    private javax.swing.JTable tabelaRequerimentosFinalizados;
    private javax.swing.JTable tabelaTodosRequerimentos;
    private javax.swing.JTable tabelaTriagem;
    private javax.swing.JLabel telefoneCelTecnicoLabel;
    // End of variables declaration//GEN-END:variables

    
}
