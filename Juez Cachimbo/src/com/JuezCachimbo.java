package com;

import java.io.*;
import Interfaces.LoginUI.frmLogin;
import Interfaces.ProfesorUI.InterfazProfesor.MenuProfesores;
import Interfaces.StudentUI.StudentMenu;

import com.usuarios.Student;
import com.usuarios.Teacher;
import data.Manage;

public class JuezCachimbo{
    private frmLogin loginView;
    private Manage manage;
    private Teacher profesor;
    private Student alumno;
    
     public JuezCachimbo() {
        this.loginView = new frmLogin(this);
        this.manage = new Manage();
    }
     
     public void handleLogin(String username, String password) {
        try {
        String[] datos = manage.buscarUsuario(username, password);
        if (datos != null) {
            String rutaUsuario = datos[0];
            String tipo = datos[1];

            if ("teacher".equals(tipo)) {
                Object usuarioObj = manage.deserializarObjeto(rutaUsuario);

                if (usuarioObj instanceof Teacher) {
                    Teacher usuario = (Teacher) usuarioObj;
                    new MenuProfesores().setVisible(true);
                } else {
                    throw new ClassNotFoundException("Error: Objeto deserializado no es de tipo Teacher");
                }
            } else if ("student".equals(tipo)) {
                Object usuarioObj = manage.deserializarObjeto(rutaUsuario);

                if (usuarioObj instanceof Student) {
                    Student usuario = (Student) usuarioObj;
                    new StudentMenu().setVisible(true);
                } else {
                    throw new ClassNotFoundException("Error: Objeto deserializado no es de tipo Student");
                }
            } else {
                System.out.println("Error: Tipo de usuario no reconocido");
            }
        } else {
            System.out.println("Error: Datos de usuario no encontrados");
        }
    } catch (IOException | ClassNotFoundException e) {
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
    }   
}

