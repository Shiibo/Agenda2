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

public class TVerUsuario extends javax.swing.JFrame {

    private TMain t4;
    
    public TVerUsuario() {
        initComponents();
        
        DisableEdit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelT2DtNasc1 = new javax.swing.JLabel();
        TextT9Endereco = new javax.swing.JTextField();
        TextT9DtNasc = new javax.swing.JTextField();
        TextT9Senha = new javax.swing.JTextField();
        LabelT2Nome = new javax.swing.JLabel();
        BtT9Voltar = new javax.swing.JButton();
        LabelT9Usuario = new javax.swing.JLabel();
        LabelT2Telefone = new javax.swing.JLabel();
        BtT9Salvar = new javax.swing.JButton();
        LabelT2Endereco = new javax.swing.JLabel();
        TextT9Telefone = new javax.swing.JTextField();
        LabelT2Email = new javax.swing.JLabel();
        TextT9Email = new javax.swing.JTextField();
        TextT9Nome = new javax.swing.JTextField();
        LabelT2DtNasc = new javax.swing.JLabel();
        BtT9Editar = new javax.swing.JButton();
        LabelT9ID = new javax.swing.JLabel();
        LabelT2Nome2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelT2DtNasc1.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2DtNasc1.setText("Data de Nascimento");

        LabelT2Nome.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2Nome.setText("ID");

        BtT9Voltar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT9Voltar.setText("Voltar");
        BtT9Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT9VoltarActionPerformed(evt);
            }
        });

        LabelT9Usuario.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 36)); // NOI18N
        LabelT9Usuario.setText("Visualizar Usuário");

        LabelT2Telefone.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2Telefone.setText("Telefone");

        BtT9Salvar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT9Salvar.setText("Salvar");
        BtT9Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT9SalvarActionPerformed(evt);
            }
        });

        LabelT2Endereco.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2Endereco.setText("Endereco");

        LabelT2Email.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2Email.setText("E-mail");

        LabelT2DtNasc.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2DtNasc.setText("Senha");

        BtT9Editar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT9Editar.setText("Editar");
        BtT9Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT9EditarActionPerformed(evt);
            }
        });

        LabelT9ID.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT9ID.setText("N");

        LabelT2Nome2.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT2Nome2.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtT9Editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtT9Salvar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelT2DtNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(TextT9DtNasc))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelT2DtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextT9Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(TextT9Senha)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelT2Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelT2Email, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelT2Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(128, 128, 128)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextT9Endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(TextT9Telefone)
                                        .addComponent(TextT9Email))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LabelT2Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelT9ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(LabelT9Usuario)
                        .addGap(159, 159, 159)
                        .addComponent(BtT9Voltar)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(LabelT2Nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(477, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtT9Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelT9Usuario)
                            .addComponent(LabelT2Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelT9ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(LabelT2DtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextT9Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(TextT9Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextT9DtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelT2DtNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelT2Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextT9Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(LabelT2Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextT9Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelT2Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextT9Email, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtT9Salvar)
                    .addComponent(BtT9Editar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(155, 155, 155)
                    .addComponent(LabelT2Nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(422, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtT9VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT9VoltarActionPerformed
        this.t4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtT9VoltarActionPerformed

    private void BtT9SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT9SalvarActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date data = null;
        try {
            data = new java.sql.Date(formato.parse(this.TextT9DtNasc.getText()).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(TContato.class.getName()).log(Level.SEVERE, null, ex);
        }

        UsuarioDAO usuarioDao = new UsuarioDAO();
        Usuario u = new Usuario();

        //c.setId();
        u.setNome(this.TextT9Nome.getText());
        u.setSenha(this.TextT9Senha.getText());
        u.setNascimento(data);
        u.setEndereco(this.TextT9Endereco.getText());
        u.setTelefone(this.TextT9Telefone.getText());
        u.setEmail(this.TextT9Email.getText());

        UsuarioDAO.SaveU(u);
        DisableEdit();
    }//GEN-LAST:event_BtT9SalvarActionPerformed

    private void BtT9EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT9EditarActionPerformed
        EnableEdit();
    }//GEN-LAST:event_BtT9EditarActionPerformed

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
            java.util.logging.Logger.getLogger(TVerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TVerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TVerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TVerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TVerUsuario().setVisible(true);
            }
        });
    }
    
    void setTelas (TMain t4){
        this.t4 = t4;
    }
    
    void EnableEdit(){
        this.TextT9DtNasc.setEnabled(true);
        this.TextT9Email.setEnabled(true);
        this.TextT9Endereco.setEnabled(true);
        this.TextT9Nome.setEnabled(true);
        this.TextT9Senha.setEnabled(true);
        this.TextT9Telefone.setEnabled(true);
    }

    void DisableEdit(){
        this.TextT9DtNasc.setEnabled(false);
        this.TextT9Email.setEnabled(false);
        this.TextT9Endereco.setEnabled(false);
        this.TextT9Nome.setEnabled(false);
        this.TextT9Senha.setEnabled(false);
        this.TextT9Telefone.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtT9Editar;
    private javax.swing.JButton BtT9Salvar;
    private javax.swing.JButton BtT9Voltar;
    private javax.swing.JLabel LabelT2DtNasc;
    private javax.swing.JLabel LabelT2DtNasc1;
    private javax.swing.JLabel LabelT2Email;
    private javax.swing.JLabel LabelT2Endereco;
    private javax.swing.JLabel LabelT2Nome;
    private javax.swing.JLabel LabelT2Nome2;
    private javax.swing.JLabel LabelT2Telefone;
    private javax.swing.JLabel LabelT9ID;
    private javax.swing.JLabel LabelT9Usuario;
    private javax.swing.JTextField TextT9DtNasc;
    private javax.swing.JTextField TextT9Email;
    private javax.swing.JTextField TextT9Endereco;
    private javax.swing.JTextField TextT9Nome;
    private javax.swing.JTextField TextT9Senha;
    private javax.swing.JTextField TextT9Telefone;
    // End of variables declaration//GEN-END:variables
}
