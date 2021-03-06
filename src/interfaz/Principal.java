/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sony
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdOperaciones};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

        txtFilas.setEditable(true);
        txtColumnas.setEditable(true);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdOperaciones = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Vani", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Recorridos De Matrices");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 300, -1));

        jPanel2.setBackground(new java.awt.Color(19, 19, 19));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. de Filas: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. de Columnas:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilasKeyTyped(evt);
            }
        });
        jPanel2.add(txtFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 50, 30));

        txtColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColumnasKeyTyped(evt);
            }
        });
        jPanel2.add(txtColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 50, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 240, 110));

        jPanel3.setBackground(new java.awt.Color(19, 19, 19));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setBackground(new java.awt.Color(0, 0, 0));
        cmdCrear.setForeground(new java.awt.Color(255, 255, 255));
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, -1));

        cmdManual.setBackground(new java.awt.Color(0, 0, 0));
        cmdManual.setForeground(new java.awt.Color(255, 255, 255));
        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, -1));

        cmdAutomatico.setBackground(new java.awt.Color(0, 0, 0));
        cmdAutomatico.setForeground(new java.awt.Color(255, 255, 255));
        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 100, -1));

        cmdOperaciones.setBackground(new java.awt.Color(0, 0, 0));
        cmdOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        cmdOperaciones.setText("Operaciones");
        cmdOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionesActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 100, -1));

        cmdLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        cmdLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 630, 80));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaInicial.setEnabled(false);
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 370, 290));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recorrido Uno", "Recorrido Dos", "Recorrido Tres", "Recorrido Cuatro", "Recorrido Cinco" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 570, 50));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/imagen1.png"))); // NOI18N
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 730, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtFilasKeyTyped

    private void txtColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtColumnasKeyTyped

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        if (txtFilas.getText().isEmpty()) {
            getToolkit().beep();
            Helper.mensaje(this, "Digite Numero de Filas", 3);
            txtFilas.requestFocusInWindow();
        } else if (txtColumnas.getText().isEmpty()) {
            getToolkit().beep();
            Helper.mensaje(this, "Digite Numero de Columnas", 3);
            txtColumnas.requestFocusInWindow();
        } else {
            int filas, columnas;
            DefaultTableModel t1;

            filas = Integer.parseInt((txtFilas).getText());
            columnas = Integer.parseInt((txtColumnas).getText());

            if (filas == 0) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Filas No puede ser cero(0)", 3);
                txtFilas.requestFocusInWindow();
                txtFilas.selectAll();
            } else if (columnas == 0) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Columnas No puede ser cero(0)", 3);
                txtColumnas.requestFocusInWindow();
                txtColumnas.selectAll();
            } else if (filas == 1) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Filas No puede ser uno(1)", 3);
                txtFilas.requestFocusInWindow();
                txtFilas.selectAll();
            } else if (columnas == 1) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Columnas No puede ser uno(1)", 3);
                txtColumnas.requestFocusInWindow();
                txtColumnas.selectAll();
            } else if (filas > 15) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Filas No puede ser mayor a 15", 3);
                txtFilas.requestFocusInWindow();
                txtFilas.selectAll();
            } else if (columnas > 15) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Columnas No puede ser mayor a 15", 3);
                txtColumnas.requestFocusInWindow();
                txtColumnas.selectAll();
            } else {
                t1 = (DefaultTableModel) tblTablaInicial.getModel();
                t1.setRowCount(filas);
                t1.setColumnCount(columnas);

                JButton botonesH[] = {cmdManual, cmdAutomatico, cmdLimpiar};
                JButton botonesD[] = {cmdCrear, cmdOperaciones};

                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
                txtFilas.setEditable(false);
                txtColumnas.setEditable(false);

            }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        int filas, columnas, n;

        int sw, res;

        columnas = tblTablaInicial.getColumnCount();
        filas = tblTablaInicial.getRowCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elemento el la posicion [" + i + "]" + "[" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);

                    } catch (NumberFormatException e) {
                        getToolkit().beep();
                        Helper.mensaje(this, "Digite un Numero Valido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "Seguro que deseas salir", "Salir", JOptionPane.YES_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = filas;
                            j = columnas;

                            Helper.porDefectoTabla(tblTablaInicial);
                        } else {
                            sw = 0;
                        }

                    }
                } while (sw == 0);

            }

        }

        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        txtFilas.setEditable(false);
        txtColumnas.setEditable(false);
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
        int filas, columnas, n;

        columnas = tblTablaInicial.getColumnCount();
        filas = tblTablaInicial.getRowCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }

        }
        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        txtFilas.setEditable(false);
        txtColumnas.setEditable(false);
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionesActionPerformed
        int op, nf, nc;
        op = cmbOperaciones.getSelectedIndex();
        nf = Integer.parseInt((txtFilas).getText());
        nc = Integer.parseInt((txtColumnas).getText());
        switch (op) {

            case 0:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else {
                    txtResultado.setText(Helper.recorridoUno(tblTablaInicial));
                }
                break;

            case 1:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else {
                    txtResultado.setText(Helper.recorridoDos(tblTablaInicial));
                }
                break;

            case 2:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else if (nc % 2 != 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de columnas debe ser par", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                }else {
                    txtResultado.setText(Helper.recorridoTres(tblTablaInicial));
                }
                break;

            case 3:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else if (nc < 3 || nf < 3) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 3 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else {
                    txtResultado.setText(Helper.recorridoCuatro(tblTablaInicial));
                }
                break;

            case 4:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                } else {
                    txtResultado.setText(Helper.recorridoCinco(tblTablaInicial));
                }
                break;
        }

        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdCrear};

        Helper.habilitarBotones(botonesH);

        Helper.deshabilitarBotones(botonesD);

        txtFilas.setEditable(false);
        txtColumnas.setEditable(false);
    }//GEN-LAST:event_cmdOperacionesActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtFilas.setText("");
        txtColumnas.setText("");
        txtResultado.setText("");
        txtFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaInicial);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdOperaciones};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

        txtFilas.setEditable(true);
        txtColumnas.setEditable(true);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperaciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
