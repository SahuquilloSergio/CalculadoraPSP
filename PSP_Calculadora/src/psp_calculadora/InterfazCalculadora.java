/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_calculadora;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author serxa
 */
public class InterfazCalculadora extends javax.swing.JFrame {

    MetodosCliente MC = new MetodosCliente();
    /**
     * Creates new form InterfazCalculadora
     */
    public InterfazCalculadora() {
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

        jTextField1 = new javax.swing.JTextField();
        labelCalculadora = new javax.swing.JLabel();
        textoResultado = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonC = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonSum = new javax.swing.JButton();
        botonRes = new javax.swing.JButton();
        botonMul = new javax.swing.JButton();
        botonDiv = new javax.swing.JButton();
        botonEncender = new javax.swing.JButton();
        port = new javax.swing.JTextField();
        botonLimpiar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCalculadora.setText("Calculadora");

        textoResultado.setEditable(false);
        textoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoResultadoActionPerformed(evt);
            }
        });

        boton1.setText("1");
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
        });

        boton2.setText("2");
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2MouseClicked(evt);
            }
        });

        boton3.setText("3");
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton3MouseClicked(evt);
            }
        });

        boton4.setText("4");
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton4MouseClicked(evt);
            }
        });

        boton5.setText("5");
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton5MouseClicked(evt);
            }
        });

        boton6.setText("6");
        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton6MouseClicked(evt);
            }
        });

        boton7.setText("7");
        boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton7MouseClicked(evt);
            }
        });

        boton8.setText("8");
        boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton8MouseClicked(evt);
            }
        });

        boton9.setText("9");
        boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton9MouseClicked(evt);
            }
        });

        boton0.setText("0");
        boton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton0MouseClicked(evt);
            }
        });

        botonC.setText("C");
        botonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCMouseClicked(evt);
            }
        });

        botonIgual.setText("=");
        botonIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIgualMouseClicked(evt);
            }
        });

        botonSum.setText("+");
        botonSum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSumMouseClicked(evt);
            }
        });

        botonRes.setText("-");
        botonRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonResMouseClicked(evt);
            }
        });

        botonMul.setText("X");
        botonMul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMulMouseClicked(evt);
            }
        });

        botonDiv.setText("/");
        botonDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDivMouseClicked(evt);
            }
        });

        botonEncender.setText("Encender");
        botonEncender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEncenderMouseClicked(evt);
            }
        });
        botonEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEncenderActionPerformed(evt);
            }
        });

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boton0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton4)
                                .addGap(18, 18, 18)
                                .addComponent(boton5)
                                .addGap(18, 18, 18)
                                .addComponent(boton6)
                                .addGap(18, 18, 18)
                                .addComponent(botonMul))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton7)
                                .addGap(18, 18, 18)
                                .addComponent(boton8)
                                .addGap(18, 18, 18)
                                .addComponent(boton9)
                                .addGap(18, 18, 18)
                                .addComponent(botonDiv)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textoResultado)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEncender)
                            .addComponent(botonLimpiar))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(labelCalculadora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelCalculadora)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEncender, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton7)
                    .addComponent(boton8)
                    .addComponent(boton9)
                    .addComponent(botonDiv))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton4)
                    .addComponent(boton5)
                    .addComponent(boton6)
                    .addComponent(botonMul))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1)
                    .addComponent(boton2)
                    .addComponent(boton3)
                    .addComponent(botonRes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton0)
                    .addComponent(botonC)
                    .addComponent(botonIgual)
                    .addComponent(botonSum))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton0MouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = cadena + 0;
        textoResultado.setText(cadena);
    }//GEN-LAST:event_boton0MouseClicked

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = cadena + 1;
        textoResultado.setText(cadena);
        System.out.println(cadena);
    }//GEN-LAST:event_boton1MouseClicked

    private void boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = cadena + 2;
        textoResultado.setText(cadena);
    }//GEN-LAST:event_boton2MouseClicked

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = cadena + 3;
        textoResultado.setText(cadena);
    }//GEN-LAST:event_boton3MouseClicked

    private void boton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = cadena + 4;
        textoResultado.setText(cadena);
    }//GEN-LAST:event_boton4MouseClicked

    private void boton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = cadena + 5;
        textoResultado.setText(cadena);
    }//GEN-LAST:event_boton5MouseClicked

    private void boton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = cadena + 6;
        textoResultado.setText(cadena);
    }//GEN-LAST:event_boton6MouseClicked

    private void boton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = cadena + 7;
        textoResultado.setText(cadena);
    }//GEN-LAST:event_boton7MouseClicked

    private void boton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8MouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = cadena + 8;
        textoResultado.setText(cadena);
    }//GEN-LAST:event_boton8MouseClicked

    private void boton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9MouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = cadena + 9;
        textoResultado.setText(cadena);
    }//GEN-LAST:event_boton9MouseClicked

    private void botonCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCMouseClicked
        // Añade el numero al text, recojo el numero y se lo mando al servidor
        cadena = " ";
        textoResultado.setText(cadena);
    }//GEN-LAST:event_botonCMouseClicked

    private void botonIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIgualMouseClicked
        // Añade el simbolo al text, recojo el simbolo y se lo mando al servidor
        // ENVIA LA CADENA AL SERVIDOR
        cadena = cadena + " ";
        System.out.println("Cadena en la Interfaz: "+cadena);
        MC.enviarMensaje(cadena,textoResultado);
        //nuevaOperacion = true;
        
    }//GEN-LAST:event_botonIgualMouseClicked

    private void botonSumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSumMouseClicked
        // Añade el simbolo al text, recojo el simbolo y se lo mando al servidor
        cadena = cadena + " + ";
        textoResultado.setText(cadena);
        System.out.println(cadena);
    }//GEN-LAST:event_botonSumMouseClicked

    private void botonResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonResMouseClicked
        // Añade el simbolo al text, recojo el simbolo y se lo mando al servidor
        cadena = cadena + " - ";
        textoResultado.setText(cadena);
    }//GEN-LAST:event_botonResMouseClicked

    private void botonMulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMulMouseClicked
        // Añade el simbolo al text, recojo el simbolo y se lo mando al servidor
        cadena = cadena + " * ";
        textoResultado.setText(cadena);
    }//GEN-LAST:event_botonMulMouseClicked

    private void botonDivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDivMouseClicked
        // Añade el simbolo al text, recojo el simbolo y se lo mando al servidor
        cadena = cadena + " / ";
        textoResultado.setText(cadena);
    }//GEN-LAST:event_botonDivMouseClicked

    private void botonEncenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEncenderMouseClicked
       try {
            MC.crearConexion(port, botonEncender, textoResultado);
            boton0.setEnabled(true);
            boton1.setEnabled(true);
            boton2.setEnabled(true);
            boton3.setEnabled(true);
            boton4.setEnabled(true);
            boton5.setEnabled(true);
            boton6.setEnabled(true);
            boton7.setEnabled(true);
            boton8.setEnabled(true);
            boton9.setEnabled(true);
            botonSum.setEnabled(true);
            botonRes.setEnabled(true);
            botonMul.setEnabled(true);
            botonDiv.setEnabled(true);
            botonIgual.setEnabled(true);
        } catch (IOException ex) {
            Logger.getLogger(InterfazCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonEncenderMouseClicked

    private void botonEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEncenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEncenderActionPerformed

    private void botonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMouseClicked
        cadena = "";
    }//GEN-LAST:event_botonLimpiarMouseClicked

    private void textoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoResultadoActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonDiv;
    private javax.swing.JButton botonEncender;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonMul;
    private javax.swing.JButton botonRes;
    private javax.swing.JButton botonSum;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelCalculadora;
    private javax.swing.JTextField port;
    private javax.swing.JTextField textoResultado;
    // End of variables declaration//GEN-END:variables
String cadena = "";

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public InterfazCalculadora(JButton BotonServerON, JButton boton0, JButton boton1, JButton boton2, JButton boton3, JButton boton4, JButton boton5, JButton boton6, JButton boton7, JButton boton8, JButton boton9, JButton botonComa, JButton botonDiv, JButton botonIgual, JButton botonMul, JButton botonRes, JButton botonSum, JLabel labelCalculadora, JTextField textoResultado) throws HeadlessException {
        this.botonEncender = BotonServerON;
        this.boton0 = boton0;
        this.boton1 = boton1;
        this.boton2 = boton2;
        this.boton3 = boton3;
        this.boton4 = boton4;
        this.boton5 = boton5;
        this.boton6 = boton6;
        this.boton7 = boton7;
        this.boton8 = boton8;
        this.boton9 = boton9;
        this.botonC = botonComa;
        this.botonDiv = botonDiv;
        this.botonIgual = botonIgual;
        this.botonMul = botonMul;
        this.botonRes = botonRes;
        this.botonSum = botonSum;
        this.labelCalculadora = labelCalculadora;
        this.textoResultado = textoResultado;
    }



}
