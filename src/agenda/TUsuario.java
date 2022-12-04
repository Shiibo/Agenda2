/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package agenda;

import DAO.UsuarioDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabif
 */
public class TUsuario extends javax.swing.JFrame {

    private TInicial t1;
    private TContato t2;
    private TCompromisso t3;
    private TMain t4;
    private TGrupo t5;
    private TCriarGrupo t7;
    
    public TUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextT6Telefone = new javax.swing.JTextField();
        TextT6Email = new javax.swing.JTextField();
        LabelT2DtNasc = new javax.swing.JLabel();
        TextT6Endereco = new javax.swing.JTextField();
        TextT6Senha = new javax.swing.JTextField();
        LabelT2Nome = new javax.swing.JLabel();
        BtT6Voltar = new javax.swing.JButton();
        LabelT6Usuario = new javax.swing.JLabel();
        LabelT2Telefone = new javax.swing.JLabel();
        BtT6Salvar = new javax.swing.JButton();
        LabelT2Endereco = new javax.swing.JLabel();
        LabelT2Email = new javax.swing.JLabel();
        TextT6Nome = new javax.swing.JTextField();
        LabelT2DtNasc1 = new javax.swing.JLabel();
        TextT6DtNasc = new javax.swing.JTextField();
        BtT6Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelT2DtNasc.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2DtNasc.setText("Senha");

        LabelT2Nome.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2Nome.setText("Nome");

        BtT6Voltar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT6Voltar.setText("Voltar");
        BtT6Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT6VoltarActionPerformed(evt);
            }
        });

        LabelT6Usuario.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 36)); // NOI18N
        LabelT6Usuario.setText("Usuário");

        LabelT2Telefone.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2Telefone.setText("Telefone");

        BtT6Salvar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT6Salvar.setText("Salvar");
        BtT6Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT6SalvarActionPerformed(evt);
            }
        });

        LabelT2Endereco.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2Endereco.setText("Endereco");

        LabelT2Email.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2Email.setText("E-mail");

        LabelT2DtNasc1.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2DtNasc1.setText("Data de Nascimento");

        BtT6Editar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT6Editar.setText("Editar");
        BtT6Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT6EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LabelT6Usuario)
                        .addGap(405, 405, 405)
                        .addComponent(BtT6Voltar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelT2DtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelT2Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextT6Nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addComponent(TextT6Senha, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelT2DtNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(TextT6DtNasc))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelT2Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelT2Email, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelT2Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextT6Endereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addComponent(TextT6Telefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextT6Email, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtT6Editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtT6Salvar)))
                        .addGap(278, 278, 278))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtT6Voltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(LabelT6Usuario)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelT2Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(LabelT2DtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextT6Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(TextT6Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextT6DtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelT2DtNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(LabelT2Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(LabelT2Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(LabelT2Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextT6Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(TextT6Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(TextT6Email, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtT6Salvar)
                    .addComponent(BtT6Editar))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtT6VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT6VoltarActionPerformed
        this.t1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtT6VoltarActionPerformed

    private void BtT6SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT6SalvarActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        java.sql.Date data = null;
        try {
            data = new java.sql.Date(formato.parse(this.TextT6DtNasc.getText()).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(TContato.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        Usuario u = new Usuario();
       
        //c.setId();
        u.setNome(this.TextT6Nome.getText());
        u.setSenha(this.TextT6Senha.getText());
        u.setNascimento(data);
        u.setEndereco(this.TextT6Endereco.getText());
        u.setTelefone(this.TextT6Telefone.getText());
        u.setEmail(this.TextT6Email.getText());
        
        UsuarioDAO.SaveU(u);
    }//GEN-LAST:event_BtT6SalvarActionPerformed

    private void BtT6EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT6EditarActionPerformed
        LabelT6Usuario.setText("Editar Usuario");
    }//GEN-LAST:event_BtT6EditarActionPerformed

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
            java.util.logging.Logger.getLogger(TUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TUsuario().setVisible(true);
            }
        });
    }
    
    void setTelas(TInicial t1, TContato t2, TCompromisso t3, TMain t4, TGrupo t5,  TCriarGrupo t7) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t7 = t7;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtT6Editar;
    private javax.swing.JButton BtT6Salvar;
    private javax.swing.JButton BtT6Voltar;
    private javax.swing.JLabel LabelT2DtNasc;
    private javax.swing.JLabel LabelT2DtNasc1;
    private javax.swing.JLabel LabelT2Email;
    private javax.swing.JLabel LabelT2Endereco;
    private javax.swing.JLabel LabelT2Nome;
    private javax.swing.JLabel LabelT2Telefone;
    private javax.swing.JLabel LabelT6Usuario;
    private javax.swing.JTextField TextT6DtNasc;
    private javax.swing.JTextField TextT6Email;
    private javax.swing.JTextField TextT6Endereco;
    private javax.swing.JTextField TextT6Nome;
    private javax.swing.JTextField TextT6Senha;
    private javax.swing.JTextField TextT6Telefone;
    // End of variables declaration//GEN-END:variables
}
