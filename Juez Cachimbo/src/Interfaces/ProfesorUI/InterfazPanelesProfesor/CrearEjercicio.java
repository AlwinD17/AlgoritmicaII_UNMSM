


package Interfaces.ProfesorUI.InterfazPanelesProfesor;


public class CrearEjercicio extends javax.swing.JFrame {

   
    public CrearEjercicio() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLectura = new javax.swing.JButton();
        jButtonPreguntas = new javax.swing.JButton();
        jButtonRespuestas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButtonGuardarEjercicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonLectura.setText("Lectura");
        jButtonLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLecturaActionPerformed(evt);
            }
        });

        jButtonPreguntas.setText("Preguntas");
        jButtonPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreguntasActionPerformed(evt);
            }
        });

        jButtonRespuestas.setText("Respuestas ");
        jButtonRespuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRespuestasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("EJERCICIO");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jButtonGuardarEjercicio.setText("Guardar ");
        jButtonGuardarEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarEjercicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jButtonLectura)
                .addGap(176, 176, 176)
                .addComponent(jButtonPreguntas)
                .addGap(185, 185, 185)
                .addComponent(jButtonRespuestas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardarEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButtonGuardarEjercicio))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLectura)
                    .addComponent(jButtonPreguntas)
                    .addComponent(jButtonRespuestas))
                .addGap(28, 28, 28)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRespuestasActionPerformed
        Respuesta_Panel rp= new Respuesta_Panel();
        jDesktopPane1.add(rp);
        rp.setVisible(true);
        
        
    }//GEN-LAST:event_jButtonRespuestasActionPerformed

    private void jButtonLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLecturaActionPerformed
        Texto_Panel txp= new Texto_Panel();
        jDesktopPane1.add(txp);
        txp.setVisible(true);
    }//GEN-LAST:event_jButtonLecturaActionPerformed

    private void jButtonPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreguntasActionPerformed
        Pregunta_Panel pp= new Pregunta_Panel();
        jDesktopPane1.add(pp);
        pp.setVisible(true);
    }//GEN-LAST:event_jButtonPreguntasActionPerformed

    private void jButtonGuardarEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarEjercicioActionPerformed



    }//GEN-LAST:event_jButtonGuardarEjercicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardarEjercicio;
    private javax.swing.JButton jButtonLectura;
    private javax.swing.JButton jButtonPreguntas;
    private javax.swing.JButton jButtonRespuestas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
