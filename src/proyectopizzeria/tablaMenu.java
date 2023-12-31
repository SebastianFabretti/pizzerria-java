/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectopizzeria;

import com.itextpdf.text.DocumentException;
import java.util.ArrayList;
import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import proyectopizzeria.persistence.PersistenceController;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTotal = new javax.swing.JTable();
        botonCancelar = new javax.swing.JButton();
        botonDescontar = new javax.swing.JButton();
        botonPagar = new javax.swing.JButton();
        labelLabelTotal = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tablaTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pizza", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaTotal);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonDescontar.setText("Descontar");
        botonDescontar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDescontarActionPerformed(evt);
            }
        });

        botonPagar.setText("Pagar");
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });

        labelLabelTotal.setText("Total:");

        labelTotal.setText("$ 0");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectopizzeria/img/logo.jpeg"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(232, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelLabelTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTotal))
                            .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonDescontar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 368, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLabelTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonDescontar)))
                        .addGap(7, 7, 7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMuzzarellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMuzzarellaActionPerformed
        // TODO add your handling code here:
        Pizza pizza = new Pizza();
        pizza.setPrecio(20);
        pizza.setNombre("Muzzarella");

        sumarPizza(pizza);

        calcularTotal();
    }//GEN-LAST:event_botonMuzzarellaActionPerformed

    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        // TODO add your handling code here:
        if (validateFactura()) {
            Factura factura = procesarFactura();
            guardarFacturaDB(factura);
            generarPDF();
            borrarPedido();
        } else {
            showMessageDialog(null, "ERROR: factura sin productos");
        }

    }//GEN-LAST:event_botonPagarActionPerformed

    private void botonNapolitanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNapolitanaActionPerformed
        // TODO add your handling code here:
        Pizza pizza = new Pizza();
        pizza.setPrecio(30);
        pizza.setNombre("Napolitana");

        sumarPizza(pizza);

        calcularTotal();
    }//GEN-LAST:event_botonNapolitanaActionPerformed

    private void botonFugazzettaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFugazzettaActionPerformed
        // TODO add your handling code here:

        Pizza pizza = new Pizza();
        pizza.setNombre("Fugazzetta");
        pizza.setPrecio(20);

        sumarPizza(pizza);

        calcularTotal();
    }//GEN-LAST:event_botonFugazzettaActionPerformed

    private void botonEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspecialActionPerformed
        // TODO add your handling code here:
        Pizza pizza = new Pizza();
        pizza.setNombre("Especial");
        pizza.setPrecio(40);

        sumarPizza(pizza);

        calcularTotal();
    }//GEN-LAST:event_botonEspecialActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        borrarPedido();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonDescontarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDescontarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();
        int selectedRow = tablaTotal.getSelectedRow();

        if (selectedRow >= 0) {
            int currentQuantity = Integer.parseInt(modelo.getValueAt(selectedRow, 2).toString());
            if (currentQuantity > 1) {
                currentQuantity--;
                modelo.setValueAt(currentQuantity, selectedRow, 2);
            } else {
                modelo.removeRow(selectedRow);
            }
        }

        calcularTotal();
    }//GEN-LAST:event_botonDescontarActionPerformed

    private void botonVeganaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVeganaActionPerformed
        // TODO add your handling code here:
        Pizza pizza = new Pizza();
        pizza.setNombre("Vegana");
        pizza.setPrecio(70);

        sumarPizza(pizza);

        calcularTotal();
    }//GEN-LAST:event_botonVeganaActionPerformed

    private void botonAnchoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnchoasActionPerformed
        // TODO add your handling code here:
        Pizza pizza = new Pizza();
        pizza.setNombre("Anchoas");
        pizza.setPrecio(50);

        sumarPizza(pizza);

        calcularTotal();
    }//GEN-LAST:event_botonAnchoasActionPerformed

    private Factura procesarFactura() {
        Factura factura = new Factura();
        int total = calcularTotal();
        Date fecha = new Date();
        ArrayList<Pizza> resumen = generarResumen();

        factura.setFecha(fecha);
        factura.setTotal(total);
        factura.setResumen(resumen.toString().replace(",", "|"));
        System.out.println(factura.getResumen());

        return factura;
    }

    private ArrayList<Pizza> generarResumen() {
        ArrayList<Pizza> resumen = new ArrayList<>();

        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();
        int rows = modelo.getRowCount();
        for (int i = 0; i < rows; i++) {
            Pizza pizza = new Pizza();
            pizza.setNombre((String) modelo.getValueAt(i, 0));
            pizza.setPrecio((int) modelo.getValueAt(i, 1));
            pizza.setCantidad((int) modelo.getValueAt(i, 2));

            resumen.add(pizza);
        }

        return resumen;
    }

    private int calcularTotal() {
        int total = 0;
        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();

        int rows = modelo.getRowCount();
        for (int i = 0; i < rows; i++) {
            total += (int) modelo.getValueAt(i, 1) * (int) modelo.getValueAt(i, 2);
        }

        labelTotal.setText("$" + total);
        return total;
    }

    private void sumarPizza(Pizza pizza) {
        boolean existe = false;

        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();

        int rows = modelo.getRowCount();
        for (int i = 0; i < rows; i++) {
            if (modelo.getValueAt(i, 0).equals(pizza.getNombre())) {
                int cantidad = (int) modelo.getValueAt(i, 2);
                cantidad++;
                modelo.setValueAt(cantidad, i, 2);
                existe = true;
                break;
            }
        }

        if (!existe) {
            modelo.addRow(new Object[]{pizza.getNombre(), pizza.getPrecio(), 1});
        }

    }

    private void borrarPedido() {
        DefaultTableModel modelo = (DefaultTableModel) tablaTotal.getModel();
        modelo.setRowCount(0);
        calcularTotal();
    }

    private void guardarFacturaDB(Factura factura) {
        PersistenceController persistController = new PersistenceController();
        try {
            persistController.addFactura(factura);
        } catch (Exception e) {
            showMessageDialog(null, "ERROR: error al cargar factura");
        }
    }

    private Factura getUltimaFactura() {
        PersistenceController persistController = new PersistenceController();
        return persistController.getUltimaFactura();
    }

    private void generarPDF() {
        Factura factura = getUltimaFactura();
        ArrayList<Pizza> pizzas = generarResumen();
        try {
            PDFCreator doc = new PDFCreator();
            doc.generarPDF(factura, pizzas);
        } catch (DocumentException ex) {
            showMessageDialog(null, "ERROR: error al crear factura");
        }
    }

    private Boolean validateFactura() {
        int rows = tablaTotal.getModel().getRowCount();
        if (rows > 0) {
            return true;
        } else {
            return false;
        }
    }

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnchoas;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonDescontar;
    private javax.swing.JButton botonEspecial;
    private javax.swing.JButton botonFugazzetta;
    private javax.swing.JButton botonMuzzarella;
    private javax.swing.JButton botonNapolitana;
    private javax.swing.JButton botonPagar;
    private javax.swing.JButton botonVegana;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAnchoas;
    private javax.swing.JLabel labelEspecial;
    private javax.swing.JLabel labelFugazzetta;
    private javax.swing.JLabel labelLabelTotal;
    private javax.swing.JLabel labelMuzzarella;
    private javax.swing.JLabel labelNapolitana;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelVegana;
    private javax.swing.JTable tablaTotal;
    // End of variables declaration//GEN-END:variables
}
