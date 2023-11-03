import javax.swing.*;

public class TareaNombreMasLargo {
    public static void main(String[] args) {

        String p1 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de su familiar");
        String p2 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de su familiar");
        String p3 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de su familiar");

        String resultado = (p1.split(" ")[0].length() < p2.split(" ")[0].length()) ? p2 : p1;

        resultado = (p3.split(" ")[0].length() < resultado.split(" ")[0].length()) ? resultado : p3;

        System.out.println("El nombre mas largo es de: " + resultado);
    }
}