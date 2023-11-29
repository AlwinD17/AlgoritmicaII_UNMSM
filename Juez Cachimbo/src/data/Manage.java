package data;
import java.io.*;


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
    
    
}
