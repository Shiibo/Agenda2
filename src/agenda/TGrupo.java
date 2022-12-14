/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package agenda;

import DAO.AgendaDAO;
import static DAO.AgendaDAO.getContato;
import DAO.GrupoContatoDAO;
import DAO.GrupoDAO;
import static DAO.GrupoDAO.getGrupo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabif
 */
public class TGrupo extends javax.swing.JFrame {

    private TInicial t1;
    private TContato t2;
    private TCompromisso t3;
    private TMain t4;
    private TUsuario t6;
    private TCriarGrupo t7;
    
    DefaultTableModel modelContatos;
    DefaultTableModel modelGrupos;
    
    public TGrupo() {
        initComponents();
        
        modelGrupos = (DefaultTableModel) TableT5Grupos.getModel();
        modelContatos = (DefaultTableModel) TableT5Contatos.getModel();
        AtualizarContatos();
        AtualizarGrupos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtT5Voltar = new javax.swing.JButton();
        LabelT5Todos = new javax.swing.JLabel();
        LabelT5Grupo = new javax.swing.JLabel();
        LabelT5NovoGrupo = new javax.swing.JLabel();
        BtT5Atualizar = new javax.swing.JButton();
        textT8cont = new javax.swing.JTextField();
        BtT5Adicionar = new javax.swing.JButton();
        textT8grupo = new javax.swing.JTextField();
        LabelT5Grupo2 = new javax.swing.JLabel();
        LabelT5Grupo3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableT5Contatos = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableT5Grupos = new javax.swing.JTable();
        BtT5NovoGrupo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtT5Voltar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT5Voltar.setText("Voltar");
        BtT5Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT5VoltarActionPerformed(evt);
            }
        });

        LabelT5Todos.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT5Todos.setText("Todos os Contatos");

        LabelT5Grupo.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT5Grupo.setText("Todos os Grupos");

        LabelT5NovoGrupo.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 36)); // NOI18N
        LabelT5NovoGrupo.setText("Adicionar a Grupo");

        BtT5Atualizar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT5Atualizar.setText("Atualizar");
        BtT5Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT5AtualizarActionPerformed(evt);
            }
        });

        textT8cont.setToolTipText("Insira o nome completo do contato");

        BtT5Adicionar.setText("Adicionar ao Grupo");
        BtT5Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT5AdicionarActionPerformed(evt);
            }
        });

        textT8grupo.setToolTipText("Insira o nome completo do contato");

        LabelT5Grupo2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        LabelT5Grupo2.setText("ID Contato:");

        LabelT5Grupo3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        LabelT5Grupo3.setText("ID Grupo:");

        TableT5Contatos.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        TableT5Contatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(TableT5Contatos);

        TableT5Grupos.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        TableT5Grupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TableT5Grupos);

        BtT5NovoGrupo.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT5NovoGrupo.setText("Novo grupo");
        BtT5NovoGrupo.setActionCommand("Novo Grupo");
        BtT5NovoGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT5NovoGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LabelT5Grupo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textT8grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LabelT5Grupo2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textT8cont, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtT5Adicionar)))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(LabelT5Todos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelT5Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelT5NovoGrupo)
                        .addGap(291, 291, 291)
                        .addComponent(BtT5Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtT5NovoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtT5Voltar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtT5Voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelT5NovoGrupo)
                    .addComponent(BtT5Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelT5Todos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelT5Grupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelT5Grupo2)
                            .addComponent(textT8cont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textT8grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelT5Grupo3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtT5Adicionar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtT5NovoGrupo)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtT5VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT5VoltarActionPerformed
        this.t4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtT5VoltarActionPerformed

    private void BtT5AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT5AtualizarActionPerformed
        AtualizarContatos();
        AtualizarGrupos();
    }//GEN-LAST:event_BtT5AtualizarActionPerformed

    private void BtT5AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT5AdicionarActionPerformed
        GrupoContatoDAO grupocontatoDao = new GrupoContatoDAO();
        GrupoContato gc = new GrupoContato();
        
        //c.setId();
        gc.setIdContato(Integer.parseInt(this.textT8cont.getText()));
        gc.setIdGrupo(Integer.parseInt(this.textT8grupo.getText()));
        
        GrupoContatoDAO.Save(gc);
    }//GEN-LAST:event_BtT5AdicionarActionPerformed

    private void BtT5NovoGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT5NovoGrupoActionPerformed
        this.setVisible(false);
        this.t7.setVisible(true);
    }//GEN-LAST:event_BtT5NovoGrupoActionPerformed

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
            java.util.logging.Logger.getLogger(TGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TGrupo().setVisible(true);
            }
        });
    }
    void AtualizarContatos(){
        AgendaDAO contatoDAO = new AgendaDAO();
        List<Contato> contatos = new ArrayList<Contato>();
        contatos  = getContato();
        
        modelContatos.setRowCount(0);
        
        for (int i = 0; i < contatos.size(); i++)
        {
            modelContatos.insertRow(modelContatos.getRowCount(), new Object[]{String.valueOf(contatos.get(i).getId()), String.valueOf(contatos.get(i).getNome()), String.valueOf(contatos.get(i).getTelefone())});
        }
    }
    
    void AtualizarGrupos(){
        GrupoDAO grupoDAO = new GrupoDAO();
        List<Grupo> grupos = new ArrayList<Grupo>();
        grupos  = getGrupo();
        
        modelGrupos.setRowCount(0);
        
        for (int k = 0; k < grupos.size(); k = k+1)
        {
            modelGrupos.insertRow(modelGrupos.getRowCount(), new Object[]{String.valueOf(grupos.get(k).getId()), String.valueOf(grupos.get(k).getNome())});
        }
    }
    
    void setTelas(TInicial t1, TContato t2, TCompromisso t3, TMain t4, TUsuario t6,  TCriarGrupo t7) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t6 = t6;
        this.t7 = t7;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtT5Adicionar;
    private javax.swing.JButton BtT5Atualizar;
    private javax.swing.JButton BtT5NovoGrupo;
    private javax.swing.JButton BtT5Voltar;
    private javax.swing.JLabel LabelT5Grupo;
    private javax.swing.JLabel LabelT5Grupo2;
    private javax.swing.JLabel LabelT5Grupo3;
    private javax.swing.JLabel LabelT5NovoGrupo;
    private javax.swing.JLabel LabelT5Todos;
    private javax.swing.JTable TableT5Contatos;
    private javax.swing.JTable TableT5Grupos;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField textT8cont;
    private javax.swing.JTextField textT8grupo;
    // End of variables declaration//GEN-END:variables
}
