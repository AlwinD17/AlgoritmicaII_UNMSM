package data;
import java.io.*;


public class Manage {
    public String buscarUsuario(String username, String password) {
        
        return null;
    }

    public Object deserializarObjeto(String rutaArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            // Deserializar el objeto y retornarlo
            return ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error durante la deserialización");
            e.printStackTrace();
        }

        return null;
    }
}
