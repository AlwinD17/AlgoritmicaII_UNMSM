/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author USUARIO
 */
public class LeerTexto {
    public static void main(String[] args) {
        FileReader archivo;
        BufferedReader lector;
        
        try{
            archivo = new FileReader("C:\\Users\\USUARIO\\Desktop\\23_11\\HOLA.txt");
            if(archivo.ready()){
                lector = new BufferedReader(archivo);
                String cadena;
                while((cadena = lector.readLine())!= null){
                    System.out.println(cadena);
                }
            }else{
                System.out.println("El archivo no esta listo para ser leido");
            }
        } catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
    
}
