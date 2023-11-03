import java.lang.ref.SoftReference;
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "admin";

        usernames[2] = "pepe";
        passwords[2] = "pepe123"; */

        String[] usernames = {"andres", "admin", " pepe"};
        String[] passwords = {"12345", "admin", "pepe123"};


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAuntenticado = false;

        for (int i = 0; i < usernames.length; i++){
            esAuntenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAuntenticado;
/*            if ( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                esAuntenticado = true;
                break;
            }*/
        }

        String mensaje = esAuntenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "Username o password incorrecto" + "\n" + "Lo siento, requiere autenticacion";
        System.out.println(mensaje);
/*        if (esAuntenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o password incorrecto");
            System.out.println("Lo siento, requiere autenticacion");
        }*/
    }
}
