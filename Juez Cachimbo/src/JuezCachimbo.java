import java.io.*;
import Interfaces.LoginUI.frmLogin;
import Interfaces.StudentUI.StudentMenu;
import Interfaz.MenuProfesores;
import com.usuarios.Student;
import com.usuarios.teacher;
import data.Manage;

public class JuezCachimbo{
    private frmLogin loginView;
    private Manage manage;
    private teacher profesor;
    private Student alumno;
    
     public JuezCachimbo() {
        this.loginView = new frmLogin();
        this.manage = new Manage();
    }
     
     public void handleLogin(String username, String password) {
        String rutaUsuario = manage.buscarUsuario(username, password);

        if (rutaUsuario != null) {
            Object usuario = manage.deserializarObjeto(rutaUsuario);

            if (usuario instanceof teacher) {
                this.profesor = (teacher) usuario;
                new MenuProfesores().setVisible(true);
            } else if (usuario instanceof Student) {
                this.alumno = (Student) usuario;
                    new StudentMenu().setVisible(true);
            } else {
                System.out.println("Error: Tipo de usuario no reconocido");
            }
        } else {
            System.out.println("Error: Usuario no encontrado");
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

