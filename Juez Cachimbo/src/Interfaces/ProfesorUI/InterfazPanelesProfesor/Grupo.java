/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces.ProfesorUI.InterfazPanelesProfesor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class Grupo extends javax.swing.JPanel{
    private List<JPanel> Paneles; 
    private int indice;
    /**
     * Creates new form Grupo
     */
    public Grupo() {
        initComponents();
        Paneles= new ArrayList<>();
        indice=0;
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
        jButtonCrearGrupo = new javax.swing.JButton();
        jTextFieldBuscarGrupo = new javax.swing.JTextField();
        jScrollPaneGrupodePaneles = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButtonBuscarTXT = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1080, 720));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(241, 248, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));

        jButtonCrearGrupo.setText("+ Crear Grupo ");
        jButtonCrearGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearGrupoActionPerformed(evt);
            }
        });

        jTextFieldBuscarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarGrupoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(241, 248, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel2.setLayout(new java.awt.GridLayout(3, 0));
        jScrollPaneGrupodePaneles.setViewportView(jPanel2);

        jButtonBuscarTXT.setText("Buscar");
        jButtonBuscarTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonBuscarTXT)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButtonCrearGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPaneGrupodePaneles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCrearGrupo)
                    .addComponent(jButtonBuscarTXT))
                .addGap(50, 50, 50)
                .addComponent(jScrollPaneGrupodePaneles, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearGrupoActionPerformed
 
        GrupoCreado crearGrupoPanel= new GrupoCreado();
        jPanel2.add(crearGrupoPanel);
        Paneles.add(crearGrupoPanel);
        indice++;
        jPanel2.updateUI();
         JOptionPane.showMessageDialog(this, "¡Grupo creado exitosamente!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
       
    }//GEN-LAST:event_jButtonCrearGrupoActionPerformed

    private void jTextFieldBuscarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarGrupoActionPerformed

    private void jButtonBuscarTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTXTActionPerformed
        // Obtener la palabra a buscar desde el JTextField
        String palabraABuscar = jTextFieldBuscarGrupo.getText();
        // Llamamos a la función para buscar la palabra en el paquete
        // Verificar si la palabra a buscar no está vacía o compuesta solo por espacios en blanco
        if (palabraABuscar.trim().isEmpty()) {
            // Mostrar un mensaje de error si la palabra está vacía
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una palabra para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Llamamos a la función para buscar la palabra en el paquete
            buscarPalabraEnPaquete(palabraABuscar, "data.textos");
        }
    }//GEN-LAST:event_jButtonBuscarTXTActionPerformed

    
     private void buscarPalabraEnPaquete(String palabra, String paquete) {
        try {
            // Obtener el ClassLoader y la URL del paquete
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String rutaPaquete = paquete.replace('.', '/');
            Enumeration<URL> resources = classLoader.getResources(rutaPaquete);

            // Recorrer las URLs y buscar en cada archivo
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                System.out.println("Buscando en: " + url.getFile());

                // Realizar la búsqueda en el archivo
                try {
                    buscarPalabraEnArchivo(url, palabra);
                } catch (IOException e) {
                    // Manejar la excepción específica del archivo
                    System.err.println("Error al buscar en el archivo " + url.getFile());
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            // Manejar la excepción del paquete
            e.printStackTrace();
        }
    }
 
        private void buscarPalabraEnArchivo(URL url, String palabra) throws IOException {
            try (InputStream inputStream = url.openStream();
                 InputStreamReader isr = new InputStreamReader(inputStream);
                 BufferedReader reader = new BufferedReader(isr)) {

                String linea;
                while ((linea = reader.readLine()) != null) {
                    // Puedes ajustar la lógica según tus necesidades específicas
                    if (linea.contains(palabra)) {
                         String mensajeEncontrado = "Palabra encontrada en: " + url.getFile();
                        System.out.println(mensajeEncontrado);
                        JOptionPane.showMessageDialog(null, mensajeEncontrado, "Palabra Encontrada", JOptionPane.INFORMATION_MESSAGE);

                        System.out.println("Palabra encontrada en: " + url.getFile());
                        // Puedes realizar acciones adicionales si se encuentra la palabra
                    }
                }

            } catch (IOException e) {
                // Vuelve a lanzar la excepción para que pueda ser manejada en el nivel superior
                throw new IOException("Error al leer el archivo " + url.getFile(), e);
            }
        }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarTXT;
    private javax.swing.JButton jButtonCrearGrupo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneGrupodePaneles;
    private javax.swing.JTextField jTextFieldBuscarGrupo;
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
