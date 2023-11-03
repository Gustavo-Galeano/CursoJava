import javax.script.ScriptContext;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "si es verdadero" : "si es false";
        System.out.println("variable = " + variable);
        
        String estado = "";
        double promedio = 5.2;

        double matematica = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematica en 2.0 y 7.0");
        matematica = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias en 2.0 y 7.0");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia en 2.0 y 7.0");
        historia = s.nextDouble();

        promedio = (matematica + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);

    }
}
