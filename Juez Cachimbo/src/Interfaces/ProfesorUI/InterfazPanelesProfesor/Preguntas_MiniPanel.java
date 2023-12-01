/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package Interfaces.ProfesorUI.InterfazPanelesProfesor;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author USUARIO
 */
public class Preguntas_MiniPanel extends javax.swing.JPanel {

    /** Creates new form Preguntas_MiniPanel */
    public Preguntas_MiniPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jRadioPregunta1 = new javax.swing.JRadioButton();
        jRadioPregunta2 = new javax.swing.JRadioButton();
        jRadioPregunta3 = new javax.swing.JRadioButton();
        jRadioPregunta4 = new javax.swing.JRadioButton();

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");

        jRadioPregunta1.setText("jRadioButton1");

        jRadioPregunta2.setText("jRadioButton2");

        jRadioPregunta3.setText("jRadioButton3");

        jRadioPregunta4.setText("jRadioButton4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton1)
                        .addGap(58, 58, 58)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioPregunta2)
                                .addComponent(jRadioPregunta1))
                            .addComponent(jRadioPregunta3)
                            .addComponent(jRadioPregunta4))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jRadioPregunta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioPregunta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioPregunta3)
                .addGap(18, 18, 18)
                .addComponent(jRadioPregunta4)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    modificarPregunta(jRadioPregunta1, "Pregunta 1");
    modificarPregunta(jRadioPregunta2, "Pregunta 2");
    modificarPregunta(jRadioPregunta3, "Pregunta 3");
    modificarPregunta(jRadioPregunta4, "Pregunta 4");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void modificarPregunta(JRadioButton radioButton, String pregunta) {
    String nuevoValor = JOptionPane.showInputDialog(pregunta + ":");
    if (nuevoValor != null) {
        // Si el usuario no ha cancelado, actualiza el texto del botón
        radioButton.setText(nuevoValor);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JRadioButton jRadioPregunta1;
    private javax.swing.JRadioButton jRadioPregunta2;
    private javax.swing.JRadioButton jRadioPregunta3;
    private javax.swing.JRadioButton jRadioPregunta4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
