import javax.annotation.processing.SupportedSourceVersion;
import java.awt.*;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        long   inicio = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder(a);

        for (int i = 0; i < 10000 ; i++) {
            c = c.concat(a).concat(b).concat("\n"); //500 => 2ms, 1000 => 16ms, 10000 => 233ms
//            c += a + b + "\n"; //500 => 31ms, 1000 => 28ms, 10000 => 140ms
//            sb.append(a).append(b).append("\n"); //500 => 1ms, 1000 => 1ms, 10000 => 4ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

        System.out.println("c = " + c);

        System.out.println("sb = " + sb.toString());

    }
}
