package data;
import com.ejercicios.Question;
import com.ejercicios.Text;
import com.usuarios.Student;
import com.usuarios.Teacher;
import java.io.*;
import java.util.ArrayList;


public class Manage {
    
    public String[] buscarUsuario(String username, String password) {
        String linea = username+","+password+",";
        String ruta = "src/data/Listas/userList.txt";
        String tipo = null;
        String rutaObjeto = null;
        String[] datos = new String[3];
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                if (currentLine.startsWith(linea)) {

                    String[] partes = currentLine.split(",");

                    if (partes.length == 3) {
                        tipo = partes[2];
                        rutaObjeto = br.readLine();
                    }
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        datos[0] = rutaObjeto;
        datos[1] = tipo;
        return datos;
    }
    

    
    public Object deserializarObjeto(String rutaArchivo) throws IOException, ClassNotFoundException {
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
    
    public void serializarObjeto(Object objeto, String rutaArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            // Serializar el objeto y escribirlo en el archivo
            oos.writeObject(objeto);
            System.out.println("Objeto serializado y guardado en: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error durante la serialización");
            e.printStackTrace();
        }
    }
    
    public void actualizarObjeto(String rutaFichero, Student alumno)
            throws IOException, ClassNotFoundException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(rutaFichero))) {
            outputStream.writeObject(alumno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void actualizarObjeto(String rutaFichero, Teacher profesor)
            throws IOException, ClassNotFoundException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(rutaFichero))) {
            outputStream.writeObject(profesor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    


}

