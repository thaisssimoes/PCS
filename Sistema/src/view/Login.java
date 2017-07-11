/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Autenticacao;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;
import model.entity.Aluno;
import model.entity.Professor;
import model.entity.Tecnico;
import model.entity.Usuario;

/**
 *
 * @author labccet
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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

        jPanel2 = new javax.swing.JPanel();
        tipoUsuario = new javax.swing.JComboBox<String>();
        campoCPF = new javax.swing.JTextField();
        //try{
            //javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            //campoCPF = new javax.swing.JFormattedTextField(cpf);
            //}
        //catch (Exception e){
            //}
        campoSenha = new javax.swing.JPasswordField();
        botaoLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(56, 113, 156));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));

        tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aluno", "Professor", "Tecnico" }));

        campoCPF.setText("CPF");
        campoCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCPFColocarTexto(evt);
            }
        });
        campoCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCPFLimparTexto(evt);
            }
        });
        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });

        campoSenha.setText("senha");
        campoSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoSenhaLimparTabFocus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoSenhaColocarTexto(evt);
            }
        });
        campoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoSenhaLimparSenha(evt);
            }
        });
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        campoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_enter(evt);
                campoSenhaLimparTab(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoSenhaLimparTab(evt);
            }
        });

        botaoLogin.setText("Entrar");
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iBSI.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(botaoLogin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel4)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(botaoLogin)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void centralizarTela() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }


    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
        String senha;
        String cpf;
        String tipoUsuarioString;

        Aluno aluno = null;
        Professor professor = null;
        Tecnico tecnico = null;
        tipoUsuarioString = String.valueOf(tipoUsuario.getSelectedItem());
        senha = String.valueOf(campoSenha.getPassword());
        cpf = campoCPF.getText();
        boolean autenticado = Autenticacao.reconhecerUsuario(tipoUsuarioString, cpf, senha);
        if (autenticado) {
                this.setVisible(false);
                this.dispose();

                if (tipoUsuarioString.equals("Aluno")) {
                aluno = controller.Gerenciador.obterAluno(cpf, senha);
                TelaAluno janelaTelaAluno = new TelaAluno(aluno);
                janelaTelaAluno.setVisible(true);
            } else if (tipoUsuarioString.equals("Professor")) {
                professor = controller.Gerenciador.obterProfessorCPF(cpf, senha);
                TelaProfessor janelaTelaProfessor = new TelaProfessor(professor);
                janelaTelaProfessor.setVisible(true);
            } else {
                tecnico = controller.Gerenciador.obterTecnico(cpf, senha);
                TelaSecretaria janelaTelaTecnico = new TelaSecretaria(tecnico);
                janelaTelaTecnico.setVisible(true);
                }
            } 
            else {
                JOptionPane.showMessageDialog(this, "Erro no Login");
            }
        
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void login_enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_enter

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String senha;
            String cpf;
            String tipoUsuarioString;
            Aluno aluno = null;
            Professor professor = null;
            Tecnico tecnico = null;
            tipoUsuarioString = String.valueOf(tipoUsuario.getSelectedItem());
            senha = String.valueOf(campoSenha.getPassword());
            cpf = campoCPF.getText();
            boolean autenticado = Autenticacao.reconhecerUsuario(tipoUsuarioString, cpf, senha);
            if (autenticado) {
                this.setVisible(false);
                this.dispose();

                if (tipoUsuarioString.equals("Aluno")) {
                aluno = controller.Gerenciador.obterAluno(cpf, senha);
                TelaAluno janelaTelaAluno = new TelaAluno(aluno);
                janelaTelaAluno.setVisible(true);
            } else if (tipoUsuarioString.equals("Professor")) {
                professor = controller.Gerenciador.obterProfessorCPF(cpf, senha);
                TelaProfessor janelaTelaProfessor = new TelaProfessor(professor);
                janelaTelaProfessor.setVisible(true);
            } else {
                tecnico = controller.Gerenciador.obterTecnico(cpf, senha);
                TelaSecretaria janelaTelaTecnico = new TelaSecretaria(tecnico);
                janelaTelaTecnico.setVisible(true);
                }
            } 
            else {
                JOptionPane.showMessageDialog(this, "Erro no Login");
            }
        }

    }//GEN-LAST:event_login_enter

    private void campoCPFColocarTexto(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCPFColocarTexto
        if (campoCPF.getText().equals("")) {
            campoCPF.setText("CPF");
        }
    }//GEN-LAST:event_campoCPFColocarTexto

    private void campoCPFLimparTexto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCPFLimparTexto
        if (campoCPF.getText().equals("CPF")) {
            campoCPF.setText("");
        }

    }//GEN-LAST:event_campoCPFLimparTexto

    private void campoSenhaLimparSenha(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoSenhaLimparSenha
        campoSenha.setText("");


    }//GEN-LAST:event_campoSenhaLimparSenha

    private void campoSenhaColocarTexto(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaColocarTexto
        if ((String.valueOf(campoSenha.getPassword())).equals("")) {
            campoSenha.setText("senha");
        }
    }//GEN-LAST:event_campoSenhaColocarTexto


    private void campoSenhaLimparTab(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaLimparTab
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            campoSenha.setText("");
        }

    }//GEN-LAST:event_campoSenhaLimparTab

    private void campoSenhaLimparTabFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaLimparTabFocus
        campoSenha.setText("");

    }//GEN-LAST:event_campoSenhaLimparTabFocus

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPFActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogin;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> tipoUsuario;
    // End of variables declaration//GEN-END:variables
}
