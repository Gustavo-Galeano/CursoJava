import java.util.Scanner;

public class TareaOrdernarNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int n1 = s.nextInt();

        System.out.println("Ingrese el segundo numero");
        int n2 = s.nextInt();

        /*
        if(n1 > n2){
            System.out.println("el orden es: " + n1 + " y " + n2);
        }else {
            System.out.println("el orden es: " + n2 + " y " + n1);
        }
        */

        String resultado = (n1 > n2) ? n1 + " y " + n2: n2 + n2 + " y " + n1;

        System.out.println("El orden d mayor a menor es = " + resultado);
    }
}
