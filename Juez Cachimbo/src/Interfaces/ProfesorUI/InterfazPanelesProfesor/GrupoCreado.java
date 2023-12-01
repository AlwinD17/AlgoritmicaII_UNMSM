/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces.ProfesorUI.InterfazPanelesProfesor;


import com.usuarios.Group;
import data.Manage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class GrupoCreado extends CrearGrupo {

    /**
     * Creates new form GrupoCreado
     */
    public GrupoCreado() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelGrupo = new javax.swing.JLabel();
        jLabelIntegrantes = new javax.swing.JLabel();
        jButtonEditarPanel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(179, 205, 205));
        setPreferredSize(new java.awt.Dimension(320, 110));

        jPanel2.setBackground(new java.awt.Color(241, 248, 255));

        jLabelCodigo.setText("Codigo");

        jLabelGrupo.setText("Grupo N");

        jLabelIntegrantes.setText("N Estudiantes");

        jButtonEditarPanel.setText("EDITAR");
        jButtonEditarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPanelActionPerformed(evt);
            }
        });

        jButton2.setText("ESTADISTICAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("VER MAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIntegrantes)
                            .addComponent(jLabelGrupo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditarPanel)
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarPanel))
                .addGap(18, 18, 18)
                .addComponent(jLabelGrupo)
                .addGap(18, 18, 18)
                .addComponent(jLabelIntegrantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private static String generarNombre() {
        String ruta = "src/data/Grupos";
        File carpeta = new File(ruta);
        File[] archivos = carpeta.listFiles();
        int numGrupos = archivos.length;
        return "grupo_" + (numGrupos+1); 
    }
    
    private void jButtonEditarPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPanelActionPerformed
        String ruta = "src/data/Grupos/";
        String rutaCompleta = ruta + generarNombre()+".bin";
        Group grupo = new Group(); 
        
        String nuevoCodigo = JOptionPane.showInputDialog("Código:");
            if (nuevoCodigo == null) {
                return;
            }
         
       String nuevoGrupo = JOptionPane.showInputDialog("Grupo:");
       if (nuevoGrupo == null) {
                return;
       }

        String nuevosIntegrantes = obtenerNumero("Integrantes:");
        if (nuevosIntegrantes == null) {
            return;
        }
        grupo.setName(nuevoGrupo);
        grupo.setId(nuevoCodigo);
        grupo.setNumestudiantes(Integer.parseInt(nuevosIntegrantes));
        
        Manage.serializarObjeto(rutaCompleta, grupo);

        // Actualizar los JLabels con los nuevos valores
        jLabelCodigo.setText("Código: " + nuevoCodigo);
        jLabelGrupo.setText("Grupo: " + nuevoGrupo);
        jLabelIntegrantes.setText("Integrantes: " + nuevosIntegrantes);
        }
    
    
            private String obtenerNumero(String mensaje) {
                while (true) {
                    try {
                        String valor = JOptionPane.showInputDialog(mensaje);
                        if (valor == null) {
                            // Se canceló la operación
                            return null;
                        }

                        // Intentar convertir el valor a un número
                        Integer.parseInt(valor);
                        return valor;  // Si la conversión fue exitosa, devolver el valor

                    } catch (NumberFormatException e) {
                        // El valor no es un número válido
                        JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
    }//GEN-LAST:event_jButtonEditarPanelActionPerformed
    




    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrame frame = new JFrame("Grupo Estadísticas");

        // Crea una instancia del JPanel
        Grupo_Estadisticas panelEstadistica = new Grupo_Estadisticas();

        // Añade el panel al JFrame
        frame.getContentPane().add(panelEstadistica);

        // Configura la operación de cierre del JFrame
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Ajusta el tamaño y hace visible el JFrame
        frame.setSize(647, 645);
        frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        frame.setVisible(true);   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFrame frame = new JFrame("Grupo Integrantes");

        // Crea una instancia del JPanel
        Grupo_VerIntegrantes panelIntegrantes = new Grupo_VerIntegrantes();

        // Añade el panel al JFrame
        frame.getContentPane().add(panelIntegrantes);

        // Configura la operación de cierre del JFrame
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Ajusta el tamaño y hace visible el JFrame
        frame.setSize(647, 645);
        frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        frame.setVisible(true);   
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEditarPanel;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelGrupo;
    private javax.swing.JLabel jLabelIntegrantes;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
        
    }
}
