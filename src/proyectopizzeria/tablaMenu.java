/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectopizzeria;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agustin
 */
public class tablaMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public tablaMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        botonMuzzarella = new javax.swing.JButton();
        botonFugazzetta = new javax.swing.JButton();
        botonEspecial = new javax.swing.JButton();
        botonVegana = new javax.swing.JButton();
        labelMuzzarella = new javax.swing.JLabel();
        labelNapolitana = new javax.swing.JLabel();
        labelFugazzetta = new javax.swing.JLabel();
        labelEspecial = new javax.swing.JLabel();
        labelVegana = new javax.swing.JLabel();
        botonNapolitana = new javax.swing.JButton();
        labelAnchoas = new javax.swing.JLabel();
        botonAnchoas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTotal = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        botonMuzzarella.setText("Muzzarella");
        botonMuzzarella.setMargin(new java.awt.Insets(5, 10, 5, 10));
        botonMuzzarella.setMaximumSize(new java.awt.Dimension(896, 800));
        botonMuzzarella.setMinimumSize(new java.awt.Dimension(896, 800));
        botonMuzzarella.setPreferredSize(new java.awt.Dimension(896, 800));
        botonMuzzarella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMuzzarellaActionPerformed(evt);
            }
        });

        botonFugazzetta.setText("Fugazzetta");
        botonFugazzetta.setMargin(new java.awt.Insets(5, 10, 5, 10));
        botonFugazzetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFugazzettaActionPerformed(evt);
            }
        });

        botonEspecial.setText("Especial");
        botonEspecial.setMargin(new java.awt.Insets(5, 10, 5, 10));
        botonEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspecialActionPerformed(evt);
            }
        });

        botonVegana.setText("Vegana");
        botonVegana.setMargin(new java.awt.Insets(5, 10, 5, 10));
        botonVegana.setPreferredSize(new java.awt.Dimension(80, 24));
        botonVegana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVeganaActionPerformed(evt);
            }
        });

        labelMuzzarella.setText("Muzzarella");

        labelNapolitana.setText("Napolitana");

        labelFugazzetta.setText("Fugazzetta");

        labelEspecial.setText("Especial");

        labelVegana.setText("Vegana");

        botonNapolitana.setText("Napolitana");
        botonNapolitana.setMargin(new java.awt.Insets(5, 10, 5, 10));
        botonNapolitana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNapolitanaActionPerformed(evt);
            }
        });

        labelAnchoas.setText("Anchoas");

        botonAnchoas.setText("Anchoas");
        botonAnchoas.setMargin(new java.awt.Insets(5, 10, 5, 10));
        botonAnchoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnchoasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAnchoas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botonMuzzarella, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(botonVegana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonNapolitana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonFugazzetta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonEspecial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMuzzarella)
                            .addComponent(labelNapolitana)
                            .addComponent(labelFugazzetta)
                            .addComponent(labelEspecial)
                            .addComponent(labelVegana)
                            .addComponent(labelAnchoas))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMuzzarella)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMuzzarella, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNapolitana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonNapolitana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFugazzetta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonFugazzetta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEspecial)
                .addGap(12, 12, 12)
                .addComponent(botonEspecial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVegana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVegana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAnchoas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAnchoas)
                .addGap(771, 771, 771))
        );

        jLabel8.setText("ACA VA UN LOGO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Total:");

        jLabel2.setText("$ 0");

        jButton6.setText("Pagar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Cancelar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        boton3.setText("Modificar");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        tablaTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pizza", "Precio", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(tablaTotal);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton3))
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Muzzarella", "$20"},
                {"Napolitana", "$30"},
                {"Fugazzetta", "$30"},
                {"Especial", "$40"},
                {"Anchoas", "$50"},
                {"Vegana", "$70"}
            },
            new String [] {
                "Pizza", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMuzzarellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMuzzarellaActionPerformed
        // TODO add your handling code here:
        int precio = 20;
        String pizza = "Muzzarella";
        boolean existe = false;

        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();

        int rows = modelo.getRowCount();
        for (int i = 0; i < rows; i++) {
            if (modelo.getValueAt(i, 0).equals(pizza)) {
                int cantidad = (int) modelo.getValueAt(i, 2);
                cantidad++;
                modelo.setValueAt(cantidad, i, 2);
                existe = true;
                break;
            }
        }

        if (!existe) {
            modelo.addRow(new Object[]{pizza, precio, 1});
        }

    }//GEN-LAST:event_botonMuzzarellaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void botonNapolitanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNapolitanaActionPerformed
        // TODO add your handling code here:
        int precio = 30;
        String pizza = "Napolitana";
        boolean existe = false;

        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();

        int rows = modelo.getRowCount();
        for (int i = 0; i < rows; i++) {
            if (modelo.getValueAt(i, 0).equals(pizza)) {
                int cantidad = (int) modelo.getValueAt(i, 2);
                cantidad++;
                modelo.setValueAt(cantidad, i, 2);
                existe = true;
                break;
            }
        }

        if (!existe) {
            modelo.addRow(new Object[]{pizza, precio, 1});
        }
    }//GEN-LAST:event_botonNapolitanaActionPerformed

    private void botonFugazzettaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFugazzettaActionPerformed
        // TODO add your handling code here:
        int precio = 20;
        String pizza = "Fugazzetta";
        boolean existe = false;

        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();

        int rows = modelo.getRowCount();
        for (int i = 0; i < rows; i++) {
            if (modelo.getValueAt(i, 0).equals(pizza)) {
                int cantidad = (int) modelo.getValueAt(i, 2);
                cantidad++;
                modelo.setValueAt(cantidad, i, 2);
                existe = true;
                break;
            }
        }

        if (!existe) {
            modelo.addRow(new Object[]{pizza, precio, 1});
        }
    }//GEN-LAST:event_botonFugazzettaActionPerformed

    private void botonEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspecialActionPerformed
        // TODO add your handling code here:
        int precio = 40;
        String pizza = "Especial";
        boolean existe = false;

        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();

        int rows = modelo.getRowCount();
        for (int i = 0; i < rows; i++) {
            if (modelo.getValueAt(i, 0).equals(pizza)) {
                int cantidad = (int) modelo.getValueAt(i, 2);
                cantidad++;
                modelo.setValueAt(cantidad, i, 2);
                existe = true;
                break;
            }
        }

        if (!existe) {
            modelo.addRow(new Object[]{pizza, precio, 1});
        }
    }//GEN-LAST:event_botonEspecialActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton3ActionPerformed

    private void botonVeganaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVeganaActionPerformed
        // TODO add your handling code here:
        int precio = 70;
        String pizza = "Vegana";
        boolean existe = false;

        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();

        int rows = modelo.getRowCount();
        for (int i = 0; i < rows; i++) {
            if (modelo.getValueAt(i, 0).equals(pizza)) {
                int cantidad = (int) modelo.getValueAt(i, 2);
                cantidad++;
                modelo.setValueAt(cantidad, i, 2);
                existe = true;
                break;
            }
        }

        if (!existe) {
            modelo.addRow(new Object[]{pizza, precio, 1});
        }
    }//GEN-LAST:event_botonVeganaActionPerformed

    private void botonAnchoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnchoasActionPerformed
        // TODO add your handling code here:
        int precio = 50;
        String pizza = "Anchoas";
        boolean existe = false;

        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();

        int rows = modelo.getRowCount();
        for (int i = 0; i < rows; i++) {
            if (modelo.getValueAt(i, 0).equals(pizza)) {
                int cantidad = (int) modelo.getValueAt(i, 2);
                cantidad++;
                modelo.setValueAt(cantidad, i, 2);
                existe = true;
                break;
            }
        }

        if (!existe) {
            modelo.addRow(new Object[]{pizza, precio, 1});
        }
    }//GEN-LAST:event_botonAnchoasActionPerformed

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
            java.util.logging.Logger.getLogger(tablaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton3;
    private javax.swing.JButton botonAnchoas;
    private javax.swing.JButton botonEspecial;
    private javax.swing.JButton botonFugazzetta;
    private javax.swing.JButton botonMuzzarella;
    private javax.swing.JButton botonNapolitana;
    private javax.swing.JButton botonVegana;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAnchoas;
    private javax.swing.JLabel labelEspecial;
    private javax.swing.JLabel labelFugazzetta;
    private javax.swing.JLabel labelMuzzarella;
    private javax.swing.JLabel labelNapolitana;
    private javax.swing.JLabel labelVegana;
    private javax.swing.JTable tablaTotal;
    // End of variables declaration//GEN-END:variables
}
