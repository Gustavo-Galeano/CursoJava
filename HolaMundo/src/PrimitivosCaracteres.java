public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        var decmal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decmal = " + decmal);
        System.out.println("decmal = caracter " + (decmal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        char espacio = '\u0020';
        char tabulador = '\t';
        char retroceso = '\b';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:"  + retornoCarro + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.Min_Value = " + Character.MIN_VALUE);
        System.out.println("Character.Max_Value = " + Character.MAX_VALUE);
    }
}
