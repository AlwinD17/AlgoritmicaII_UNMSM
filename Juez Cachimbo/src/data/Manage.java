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
    

    
    public static <E> E deserializarObjeto(String direccionArchivo, Class<E> claseObjetivo) {
        E objeto = null;
        try (FileInputStream fis = new FileInputStream(direccionArchivo);
                ObjectInputStream entrada = new ObjectInputStream(fis);) {
            objeto = (E) entrada.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objeto;
    }

    
    public static boolean serializarObjeto(String direccionArchivo, Serializable objeto) {
        boolean sw = false;
        try (FileOutputStream fos = new FileOutputStream(direccionArchivo);
                ObjectOutputStream salida = new ObjectOutputStream(fos);) {
            salida.writeObject(objeto);
            sw = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sw;
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

