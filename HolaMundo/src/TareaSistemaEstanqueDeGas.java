import java.util.Scanner;

public class TareaSistemaEstanqueDeGas {
    public static void main(String[] args) {

        Scanner  entrada = new Scanner(System.in);

        System.out.println("Ingrese su capacidad de gasolina actual ");
        Double litro = entrada.nextDouble();

        if(litro == 70){
            System.out.println("Estanque lleno");
        }
        if(litro >= 60 && litro < 70){
            System.out.println("Estanque casi lleno");
        }
        if(litro  >= 40 && litro < 60){
            System.out.println("Estanque 3/4");
        }
        if( litro >= 35 && litro < 40){
            System.out.println("Medio Estanque");
        }
        if (litro >= 20 && litro < 35){
            System.out.println("Suficiente");
        }
        if (litro >= 0 && litro < 20){
            System.out.println("Insuficiente");
        }

    }
}
