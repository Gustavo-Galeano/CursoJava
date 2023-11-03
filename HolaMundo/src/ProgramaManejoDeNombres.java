import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre");
        String primerNombre = entrada.nextLine();
        String primerNombreR = primerNombre.toUpperCase().charAt(1) + "." + primerNombre.substring(primerNombre.length() -2);

        System.out.println("Ingrese el segundo nombre");
        String segundoNombre = entrada.nextLine();
        String segundoNombreR = "_" + segundoNombre.toUpperCase().charAt(1) + "." + segundoNombre.substring(segundoNombre.length() -2);

        System.out.println("Ingerese el tercer nombre");
        String tercerNombre = entrada.nextLine();
        String tercerNombreR = "_" + tercerNombre.toUpperCase().charAt(1) + "." + tercerNombre.substring(tercerNombre.length() -2);

        String resultado = primerNombreR + segundoNombreR + tercerNombreR;
        System.out.println(resultado);
        //Andres Maria Pepe
        // N.es_A.ia_E.pe
   }
}
