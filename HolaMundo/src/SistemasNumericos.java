import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario= "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario =0B111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHex);
        
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
