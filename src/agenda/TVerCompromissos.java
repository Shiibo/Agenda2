/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package agenda;

import java.util.ArrayList;
import agenda.Compromisso;
import DAO.AgendaDAO;
import static DAO.AgendaDAO.getContato;
import DAO.CompromissoDAO;
import static DAO.CompromissoDAO.getCompromissoContato;
import static DAO.CompromissoDAO.getCompromissos;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabif
 */
public class TVerCompromissos extends javax.swing.JFrame {

    private TMain t4;
    public static  ArrayList<agenda.Compromisso> bd = new ArrayList<agenda.Compromisso>();
    public static int cont = 0;
    DefaultTableModel modelContatos;
    
    public TVerCompromissos() {
        initComponents();
        
        modelContatos = (DefaultTableModel) TableT11Contatos.getModel();
        bd = (ArrayList<Compromisso>) getCompromissos();
        
        AttCompromisso();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        TableT11Contatos = new javax.swing.JTable();
        BtT11AddPart = new javax.swing.JButton();
        LabelT3Participantes = new javax.swing.JLabel();
        LabelT11TodosCompromisso = new javax.swing.JLabel();
        LabelT3DtFinal = new javax.swing.JLabel();
        LabelT3Titulo = new javax.swing.JLabel();
        TextT11Titulo = new javax.swing.JTextField();
        LabelT3Descricao = new javax.swing.JLabel();
        TextT11DtFinal = new javax.swing.JTextField();
        LabelT3DtInicial = new javax.swing.JLabel();
        TextT11Dtinicial = new javax.swing.JTextField();
        LabelT3Local = new javax.swing.JLabel();
        TextT11Local = new javax.swing.JTextField();
        TexT11IdComp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaT11Descricao = new javax.swing.JTextArea();
        TextT11IdCont = new javax.swing.JTextField();
        LabelT3Participantes2 = new javax.swing.JLabel();
        BtT11Voltar = new javax.swing.JButton();
        LabelT3Participantes3 = new javax.swing.JLabel();
        BtT11Salvar = new javax.swing.JButton();
        BtT11Editar = new javax.swing.JButton();
        BtT11Anterior = new javax.swing.JButton();
        BtT11Proximo = new javax.swing.JButton();
        BtT11RemoverPart = new javax.swing.JButton();
        BtT11Apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableT11Contatos.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        TableT11Contatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
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
        TableT11Contatos.setEnabled(false);
        jScrollPane6.setViewportView(TableT11Contatos);

        BtT11AddPart.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT11AddPart.setText("Adicionar participante");
        BtT11AddPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT11AddPartActionPerformed(evt);
            }
        });

        LabelT3Participantes.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT3Participantes.setText("Participantes");

        LabelT11TodosCompromisso.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 36)); // NOI18N
        LabelT11TodosCompromisso.setText("Todos os Compromissos");

        LabelT3DtFinal.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT3DtFinal.setText("Data e hora final");

        LabelT3Titulo.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT3Titulo.setText("T??tulo");

        TextT11Titulo.setEnabled(false);

        LabelT3Descricao.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT3Descricao.setText("Descric??o");
        LabelT3Descricao.setToolTipText("");

        TextT11DtFinal.setEnabled(false);

        LabelT3DtInicial.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT3DtInicial.setText("Data e hora inicial");

        TextT11Dtinicial.setEnabled(false);

        LabelT3Local.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT3Local.setText("Local");

        TextT11Local.setEnabled(false);

        TexT11IdComp.setEnabled(false);
        TexT11IdComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexT11IdCompActionPerformed(evt);
            }
        });

        jScrollPane1.setEnabled(false);

        AreaT11Descricao.setColumns(20);
        AreaT11Descricao.setRows(5);
        AreaT11Descricao.setEnabled(false);
        jScrollPane1.setViewportView(AreaT11Descricao);

        TextT11IdCont.setEnabled(false);

        LabelT3Participantes2.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT3Participantes2.setText("Id do contato");

        BtT11Voltar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT11Voltar.setText("Voltar");
        BtT11Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT11VoltarActionPerformed(evt);
            }
        });

        LabelT3Participantes3.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        LabelT3Participantes3.setText("Id do compromisso");

        BtT11Salvar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT11Salvar.setText("Salvar");
        BtT11Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT11SalvarActionPerformed(evt);
            }
        });

        BtT11Editar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT11Editar.setText("Editar");
        BtT11Editar.setToolTipText("");
        BtT11Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT11EditarActionPerformed(evt);
            }
        });

        BtT11Anterior.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT11Anterior.setText("Anterior");
        BtT11Anterior.setToolTipText("");
        BtT11Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT11AnteriorActionPerformed(evt);
            }
        });

        BtT11Proximo.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT11Proximo.setText("Proximo");
        BtT11Proximo.setToolTipText("");
        BtT11Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT11ProximoActionPerformed(evt);
            }
        });

        BtT11RemoverPart.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT11RemoverPart.setText("Remover participante");
        BtT11RemoverPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT11RemoverPartActionPerformed(evt);
            }
        });

        BtT11Apagar.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        BtT11Apagar.setText("Apagar");
        BtT11Apagar.setToolTipText("");
        BtT11Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtT11ApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(LabelT11TodosCompromisso)
                .addGap(217, 217, 217)
                .addComponent(BtT11Voltar)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelT3Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelT3Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelT3DtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelT3DtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelT3Local, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtT11Editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtT11Apagar)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextT11Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextT11Local, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextT11Dtinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextT11DtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtT11Anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtT11Proximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtT11Salvar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(TexT11IdComp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(TextT11IdCont, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtT11AddPart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtT11RemoverPart))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(LabelT3Participantes3)
                                .addGap(18, 18, 18)
                                .addComponent(LabelT3Participantes2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelT3Participantes, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtT11Voltar)
                    .addComponent(LabelT11TodosCompromisso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelT3Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(LabelT3DtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelT3DtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LabelT3Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LabelT3Local, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextT11Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelT3Participantes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextT11Dtinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextT11DtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelT3Participantes2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelT3Participantes3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextT11IdCont, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TexT11IdComp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextT11Local, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtT11Salvar)
                    .addComponent(BtT11Editar)
                    .addComponent(BtT11Proximo)
                    .addComponent(BtT11AddPart)
                    .addComponent(BtT11RemoverPart)
                    .addComponent(BtT11Anterior)
                    .addComponent(BtT11Apagar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtT11AddPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT11AddPartActionPerformed
        AgendaDAO agendaDao = new AgendaDAO();
        AgendaDAO.AddPart((Integer.parseInt(this.TexT11IdComp.getText())), (Integer.parseInt(this.TextT11IdCont.getText())));
        AtualizaTabela();
    }//GEN-LAST:event_BtT11AddPartActionPerformed

    private void TexT11IdCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexT11IdCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexT11IdCompActionPerformed

    private void BtT11VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT11VoltarActionPerformed
        this.t4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtT11VoltarActionPerformed

    private void BtT11SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT11SalvarActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        java.sql.Timestamp data1 = null, data2 = null;

        try {
            data1 = new java.sql.Timestamp(formato.parse(this.TextT11Dtinicial.getText()).getTime());
            data2 = new java.sql.Timestamp(formato.parse(this.TextT11DtFinal.getText()).getTime());
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(TCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        AgendaDAO agendaDao = new AgendaDAO();
        Compromisso c = new Compromisso();

        this.bd.get(cont).setTitulo(this.TextT11Titulo.getText());
        this.bd.get(cont).setDescricao(this.AreaT11Descricao.getText());
        this.bd.get(cont).setHorainicio(data1);
        this.bd.get(cont).setHorafim(data2);
        this.bd.get(cont).setLocal(this.TextT11Local.getText());
        
        c.setTitulo(this.TextT11Titulo.getText());
        c.setDescricao(this.AreaT11Descricao.getText());
        c.setHorainicio(data1);
        c.setHorafim(data2);
        c.setLocal(this.TextT11Local.getText());

        String a = this.TextT11Titulo.getText();
        String b = this.AreaT11Descricao.getText();

            if (CompromissoDAO.MesmoComp(this.TexT11IdComp.getText(), this.TextT11Dtinicial.getText(), this.TextT11DtFinal.getText())){
                CompromissoDAO.Update(c,(Integer.parseInt(this.TexT11IdComp.getText())));
                DisableEdit();
            } 
        else {
            JOptionPane.showMessageDialog(null, "N??o ?? poss??vel criar o compromisso, j?? existe um compromisso neste hor??rio.");
        }

        this.TexT11IdComp.setText(String.valueOf(AgendaDAO.GetIdComp(a, b)));
        
    }//GEN-LAST:event_BtT11SalvarActionPerformed

    private void BtT11EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT11EditarActionPerformed
        EnableEdit();
    }//GEN-LAST:event_BtT11EditarActionPerformed

    private void BtT11AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT11AnteriorActionPerformed
        if (cont < 1) {
        cont = bd.size()-1;
        } else {
        cont--;
        }
        DisableEdit();
        AttCompromisso();
    }//GEN-LAST:event_BtT11AnteriorActionPerformed

    private void BtT11ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT11ProximoActionPerformed
        if (cont > bd.size()-2){
        cont = 0;
        } else {
        cont++;
        }
        DisableEdit();
        AttCompromisso();   
    }//GEN-LAST:event_BtT11ProximoActionPerformed

    private void BtT11RemoverPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT11RemoverPartActionPerformed
        CompromissoDAO.RemovePart((Integer.parseInt(this.TexT11IdComp.getText())), (Integer.parseInt(this.TextT11IdCont.getText())));
        AtualizaTabela();
    }//GEN-LAST:event_BtT11RemoverPartActionPerformed

    private void BtT11ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtT11ApagarActionPerformed
        String a = this.TextT11Titulo.getText();
        int resposta = JOptionPane.showConfirmDialog( null,"Confirma a exclus??o de "+a+"?", "Exclus??o de Compromisso",JOptionPane.YES_NO_OPTION);
        
        if(resposta == 0){
            CompromissoDAO.DeleteCC(Integer.parseInt(this.TexT11IdComp.getText()));
            CompromissoDAO.DeleteC(Integer.parseInt(this.TexT11IdComp.getText()));
        
            bd = (ArrayList<Compromisso>) getCompromissos();
            AttCompromisso();
        }  
    }//GEN-LAST:event_BtT11ApagarActionPerformed

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
            java.util.logging.Logger.getLogger(TVerCompromissos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TVerCompromissos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TVerCompromissos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TVerCompromissos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TVerCompromissos().setVisible(true);
            }
        });
    }
    
    void setTelas (TMain t4){
        this.t4 = t4;
    }
    
    /*private String nome;
    private Date nascimento;
    private String endereco;
    private String telefone;
    private String email;*/
    public void AttCompromisso() {
        this.TexT11IdComp.setText(String.valueOf(this.bd.get(cont).getId()));
        this.TextT11Titulo.setText(this.bd.get(cont).getTitulo());
        this.AreaT11Descricao.setText(this.bd.get(cont).getDescricao());
        this.TextT11Dtinicial.setText(String.valueOf(this.bd.get(cont).getHorainicio()));
        this.TextT11DtFinal.setText(String.valueOf(this.bd.get(cont).getHorafim()));
        this.TextT11Local.setText(this.bd.get(cont).getLocal());
        
        AtualizaTabela();
    }
    
    void AtualizaTabela(){
        AgendaDAO contatoDAO = new AgendaDAO();
        List<Contato> contatos = new ArrayList<Contato>();
        contatos  = getCompromissoContato(this.bd.get(cont).getId());
        
        modelContatos.setRowCount(0);
        
        for (int i = 0; i < contatos.size(); i++)
        {
            modelContatos.insertRow(modelContatos.getRowCount(), new Object[]{String.valueOf(contatos.get(i).getId()), String.valueOf(contatos.get(i).getNome()), String.valueOf(contatos.get(i).getTelefone())});
        }
    }
    
    void EnableEdit(){
        this.TextT11DtFinal.setEnabled(true);
        this.TextT11Dtinicial.setEnabled(true);
        this.TextT11IdCont.setEnabled(true);
        this.TextT11Local.setEnabled(true);
        this.TextT11Titulo.setEnabled(true);
        this.AreaT11Descricao.setEnabled(true);
    }

    void DisableEdit(){
        this.TextT11DtFinal.setEnabled(false);
        this.TextT11Dtinicial.setEnabled(false);
        this.TextT11IdCont.setEnabled(false);
        this.TextT11Local.setEnabled(false);
        this.TextT11Titulo.setEnabled(false);
        this.AreaT11Descricao.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaT11Descricao;
    private javax.swing.JButton BtT11AddPart;
    private javax.swing.JButton BtT11Anterior;
    private javax.swing.JButton BtT11Apagar;
    private javax.swing.JButton BtT11Editar;
    private javax.swing.JButton BtT11Proximo;
    private javax.swing.JButton BtT11RemoverPart;
    private javax.swing.JButton BtT11Salvar;
    private javax.swing.JButton BtT11Voltar;
    private javax.swing.JLabel LabelT11TodosCompromisso;
    private javax.swing.JLabel LabelT3Descricao;
    private javax.swing.JLabel LabelT3DtFinal;
    private javax.swing.JLabel LabelT3DtInicial;
    private javax.swing.JLabel LabelT3Local;
    private javax.swing.JLabel LabelT3Participantes;
    private javax.swing.JLabel LabelT3Participantes2;
    private javax.swing.JLabel LabelT3Participantes3;
    private javax.swing.JLabel LabelT3Titulo;
    private javax.swing.JTable TableT11Contatos;
    private javax.swing.JTextField TexT11IdComp;
    private javax.swing.JTextField TextT11DtFinal;
    private javax.swing.JTextField TextT11Dtinicial;
    private javax.swing.JTextField TextT11IdCont;
    private javax.swing.JTextField TextT11Local;
    private javax.swing.JTextField TextT11Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
