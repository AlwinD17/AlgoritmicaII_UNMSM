package com;

import Interfaces.Conexion;
import java.io.*;
import Interfaces.LoginUI.frmLogin;
import Interfaces.ProfesorUI.InterfazPanelesProfesor.Ejercicio;
import Interfaces.ProfesorUI.InterfazPanelesProfesor.Grupo;
import Interfaces.ProfesorUI.InterfazPanelesProfesor.PERFILES;
import Interfaces.ProfesorUI.InterfazProfesor.MenuProfesores;
import static Interfaces.ProfesorUI.InterfazProfesor.MenuProfesores.jPanel2;
import Interfaces.StudentUI.Exercises;
import Interfaces.StudentUI.Groups;
import Interfaces.StudentUI.Profile;
import Interfaces.StudentUI.StudentMenu;
import static Interfaces.StudentUI.StudentMenu.panelPrincipal;

import com.ejercicios.Question;
import com.ejercicios.Text;

import com.usuarios.Student;
import com.usuarios.teacher;
import data.Manage;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JuezCachimbo implements Conexion{
    private frmLogin loginView;
    private Manage manage;
    private teacher profesor;
    private Student alumno;
    private String rutaUsuario;
    private String tipo;
    private ArrayList<Text> textosActivos;

    public JuezCachimbo() {
        this.loginView = new frmLogin(this);
        textosActivos = new ArrayList<>();
        this.manage = new Manage();
    }

    public void handleLogin(String username, String password) {
    try {
        String[] datos = manage.buscarUsuario(username, password);
        if (datos != null && !"".equals(datos[0]) && !"".equals(datos[1])) {
            rutaUsuario = datos[0];
            tipo = datos[1];
            if ("teacher".equals(tipo)) {
                Object usuarioObj = Manage.deserializarObjeto(rutaUsuario,teacher.class);

                if (usuarioObj instanceof teacher) {
                    profesor = (teacher) usuarioObj;

                    // Agrega impresiones para depurar
                    System.out.println("Profesor deserializado: " + profesor);
                    System.out.println("Nombre del profesor: " + profesor.getName());

                    procesarTextos();
                    loginView.dispose();
                    new MenuProfesores(this).setVisible(true);
                    return;
                } else {
                    throw new ClassNotFoundException("Error: Objeto deserializado no es de tipo Teacher");
                }
            } else if ("student".equals(tipo)) {
                Object usuarioObj = Manage.deserializarObjeto(rutaUsuario,Student.class);

                if (usuarioObj instanceof Student) {
                    alumno = (Student) usuarioObj;

                    // Agrega impresiones para depurar
                    System.out.println("Estudiante deserializado: " + alumno);
                    System.out.println("Nombre del estudiante: " + alumno.getUserName());

                    procesarTextosStudent();
                    loginView.dispose();
                    new StudentMenu(this).setVisible(true);
                    return;
                } else {
                    throw new ClassNotFoundException("Error: Objeto deserializado no es de tipo Student");
                }
            } else {
                System.out.println("Error: Tipo de usuario no reconocido");
                JOptionPane.showMessageDialog(loginView, "Credenciales incorrectas. Por favor, inténtelo de nuevo.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(loginView, "Credenciales incorrectas. Por favor, inténtelo de nuevo.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
    } catch (ClassNotFoundException e) {
        System.out.println("Error durante el manejo del login");
        e.printStackTrace();
    }
}


    public void startApplication() {
        loginView.setVisible(true);
    }

    public static void main(String[] args) {
        JuezCachimbo main = new JuezCachimbo();
        main.startApplication();
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                if (main.alumno != null) {
                    main.manage.actualizarObjeto(main.rutaUsuario, main.alumno);
                } else if (main.profesor != null) {
                    main.manage.actualizarObjeto(main.rutaUsuario, main.profesor);
                }
                System.out.println("Actualizando información del usuario...");
            } catch (IOException e) {
                System.out.println("Error durante la actualización del objeto al cerrar el programa");
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JuezCachimbo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));}
        
        
    @Override
    public void cerrarSesionStudent() {
        try {
            if (alumno != null) {
                manage.actualizarObjeto(rutaUsuario, alumno);
            }
            loginView.setVisible(true);
        } catch (IOException e) {
            System.out.println("Error durante la actualización del alumno");
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JuezCachimbo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void cerrarSesionTeacher() {
        try {
            if (alumno != null) {
                manage.actualizarObjeto(rutaUsuario, profesor);
            }
            loginView.setVisible(true);
        } catch (IOException e) {
            System.out.println("Error durante la actualización del profesor");
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JuezCachimbo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   

    public void procesarTextosStudent(){
        String ruta = "src/data/textos";
        File carpeta = new File(ruta);
        File[] archivos = carpeta.listFiles();
        int numTextos = archivos.length;
        
        for(int i = 1; i<numTextos;i++){
            Text text = new Text();
            ArrayList<Question> questions = new ArrayList<>();
            String rutaText = ruta+"/"+Integer.toString(i)+".txt";
            String nuevaRuta = "src/data/textosActivos/"+Integer.toString(i)+".ser";
            try (BufferedReader br = new BufferedReader(new FileReader(rutaText))) {
                String line;
                String id = null;
                StringBuilder textContent = new StringBuilder();
                String questionContent = null;
                ArrayList<String> alternatives = new ArrayList<>();
                String rightAlternative = null;
                StringBuilder reasoning = new StringBuilder();
                boolean readingText = false;
                boolean readingQuestion = false;
                boolean readingAlternatives = false;
                boolean readingRightAlternative = false;
                boolean readingReasoning = false;

                while ((line = br.readLine()) != null) {
                    if (line.startsWith("ID:")) {
                        id = line.substring(3).trim();
                    } else if (line.startsWith("=====================TEXTO======================")) {
                        readingText = true;
                    } else if (line.startsWith("=====================PREGUNTA")) {
                        if (readingText) {
                            // Guardar el texto y reiniciar variables
                            text.setContent(textContent.toString().trim());
                            text.setId(id);
                            text.setQuestions(questions);
                            textContent = new StringBuilder();
                            questions = new ArrayList<>();
                            id = null;
                            readingText = false;
                        }
                        readingQuestion = true;
                    } else if (line.startsWith("=====================ALTERNATIVAS======================")) {
                        readingAlternatives = true;
                    } else if (line.startsWith("=====================ALTERNATIVA CORRECTA======================")) {
                        readingRightAlternative = true;
                        readingAlternatives = false;
                    } else if (line.startsWith("=====================RAZONAMIENTO======================")) {
                        readingReasoning = true;
                        readingRightAlternative = false;
                    } else {
                        if (readingText) {
                            textContent.append(line).append("\n");
                        } else if (readingQuestion) {
                            questionContent = line.trim();
                            readingQuestion = false;
                        } else if (readingAlternatives) {
                            alternatives.add(line.trim());
                        } else if (readingRightAlternative) {
                            rightAlternative = line.trim();
                        } else if (readingReasoning) {
                            reasoning.append(line).append("\n");
                        }
                    }
                }

                // Asegurarse de agregar la última pregunta al texto
                if (questionContent != null) {
                    Question question = new Question();
                    question.setContent(questionContent);
                    question.setAlternatives(alternatives);
                    question.setRightAlternative(rightAlternative);
                    question.setReasoning(reasoning.toString().trim());
                    questions.add(question);
                }

                // Guardar el último texto
                if (id != null) {
                    text.setContent(textContent.toString().trim());
                    text.setId(id);
                    text.setQuestions(questions);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(alumno.numReadTexts != 0){
                for(int j=0;i<alumno.numReadTexts;i++){
                    if(alumno.readTexts.get(j).equals(text.getId())){
                        textosActivos.add(text);
                        continue;
                    }
                    text=null;
                }
            }
            textosActivos.add(text);
        }
        System.out.println(textosActivos.size());
    }
    
    public void procesarTextos(){
        String ruta = "src/data/textos";
        File carpeta = new File(ruta);
        File[] archivos = carpeta.listFiles();
        int numTextos = archivos.length;
        
        for(int i = 1; i<numTextos;i++){
            Text text = new Text();
            ArrayList<Question> questions = new ArrayList<>();
            String rutaText = ruta+"/"+Integer.toString(i)+".txt";
            String nuevaRuta = "src/data/textosActivos/"+Integer.toString(i)+".ser";
            try (BufferedReader br = new BufferedReader(new FileReader(rutaText))) {
                String line;
                String id = null;
                StringBuilder textContent = new StringBuilder();
                String questionContent = null;
                ArrayList<String> alternatives = new ArrayList<>();
                String rightAlternative = null;
                StringBuilder reasoning = new StringBuilder();
                boolean readingText = false;
                boolean readingQuestion = false;
                boolean readingAlternatives = false;
                boolean readingRightAlternative = false;
                boolean readingReasoning = false;

                while ((line = br.readLine()) != null) {
                    if (line.startsWith("ID:")) {
                        id = line.substring(3).trim();
                    } else if (line.startsWith("=====================TEXTO======================")) {
                        readingText = true;
                    } else if (line.startsWith("=====================PREGUNTA")) {
                        if (readingText) {
                            // Guardar el texto y reiniciar variables
                            text.setContent(textContent.toString().trim());
                            text.setId(id);
                            text.setQuestions(questions);
                            textContent = new StringBuilder();
                            questions = new ArrayList<>();
                            id = null;
                            readingText = false;
                        }
                        readingQuestion = true;
                    } else if (line.startsWith("=====================ALTERNATIVAS======================")) {
                        readingAlternatives = true;
                    } else if (line.startsWith("=====================ALTERNATIVA CORRECTA======================")) {
                        readingRightAlternative = true;
                        readingAlternatives = false;
                    } else if (line.startsWith("=====================RAZONAMIENTO======================")) {
                        readingReasoning = true;
                        readingRightAlternative = false;
                    } else {
                        if (readingText) {
                            textContent.append(line).append("\n");
                        } else if (readingQuestion) {
                            questionContent = line.trim();
                            readingQuestion = false;
                        } else if (readingAlternatives) {
                            alternatives.add(line.trim());
                        } else if (readingRightAlternative) {
                            rightAlternative = line.trim();
                        } else if (readingReasoning) {
                            reasoning.append(line).append("\n");
                        }
                    }
                }

                // Asegurarse de agregar la última pregunta al texto
                if (questionContent != null) {
                    Question question = new Question();
                    question.setContent(questionContent);
                    question.setAlternatives(alternatives);
                    question.setRightAlternative(rightAlternative);
                    question.setReasoning(reasoning.toString().trim());
                    questions.add(question);
                }

                // Guardar el último texto
                if (id != null) {
                    text.setContent(textContent.toString().trim());
                    text.setId(id);
                    text.setQuestions(questions);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            textosActivos.add(text);
        }
        System.out.println(textosActivos.size());
    }
    
    @Override
    public void cambiarPanel(String panel) {
        switch (panel) {
            case "Profile":
                Profile profilePanel = new Profile();
                
                SwingUtilities.invokeLater(() -> {
                    profilePanel.setDatos(alumno.getUserName(),alumno.getName(),alumno.getBirthdate(),alumno.getGroupId(),alumno.getCorrectQuestions(),alumno.getIncorrectQuestions());
                    System.out.println("Setting nombre: " + alumno.getUserName());
                    mostrarPanel(profilePanel);
            });
                break;
            case "Exercises":
                mostrarPanel(new Exercises());
                SwingUtilities.invokeLater(() -> {
                   
                });
                break;
            case "Groups":
                mostrarPanel(new Groups());
                break;

        }
    }
    
    @Override
    public void cambiarPanelTeacher(String panel) {
    switch (panel) {
        case "PERFILES":
            PERFILES perfilesPanel = new PERFILES();
            
            SwingUtilities.invokeLater(() -> {
                perfilesPanel.setDatosTeacher(profesor.getUserName(), profesor.getName(), profesor.getBirthdate(), profesor.getCareer());
                System.out.println("Setting user: user");
                mostrarPanelTeacher(perfilesPanel);
            });
            break;
        case "Ejercicios":
            mostrarPanelTeacher(new Ejercicio());
            SwingUtilities.invokeLater(() -> {
                
            });
            break;
        case "Grupo":
            mostrarPanelTeacher(new Grupo());
            break;
    }
}

    private void mostrarPanelTeacher(JPanel panel) {
        panel.setSize(647, 645);
        panel.setLocation(0, 0);

        jPanel2.removeAll();
        jPanel2.add(panel, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    private void mostrarPanel(JPanel panel) {
        panel.setSize(1005, 764);
        panel.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(panel, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
}

