import java.io.*;
import Interfaces.LoginUI.frmLogin;
import Interfaces.StudentUI.StudentMenu;
import com.usuarios.Student;
import com.usuarios.teacher;

public class JuezCachimbo{
    private frmLogin loginView;
    private User userManager;
    private teacher profesor;
    private Student alumno;
    
     public JuezCachimbo() {
        this.loginView = new frmLogin(this);
        this.userManager = new UserManager();
    }
     
     public void handleLogin(String username, String password) {
        String rutaUsuario = userManager.buscarUsuario(username, password);

        if (rutaUsuario != null) {
            Object usuario = userManager.deserializarObjeto(rutaUsuario);

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
    
     public static void main(String[] args) {
         public static void main(String[] args) {
            JuezCa main = new Main();
            main.startApplication();
    }
        
         
    }
}

