package com.datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class ArchivoUsuarios {
    String route = "Usuarios.txt";
    File fichero = new File(route);
    FileReador reader = new FileReader(fichero,true);
    BufferedReader buffer = new BufferedReader(reader);
    
    public void create(String content, Boolean shouldAppend) {
        
    }
    
    public void read() {
        
    }

    public void update(String userToEdit, String newFname, String newLname, String newBdate) {
        
    }

    public void delete(String userToDelete) {
        
    }

    public boolean userExists(String userToSearch) {
        
    }
}
