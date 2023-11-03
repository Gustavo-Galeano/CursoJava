public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 0.00000000015f; //1.5E-10
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde a byte a " + Float.BYTES);
        System.out.println("tipo float corresponde a bites a " + Float.SIZE);
        System.out.println("valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde a byte a " + Double.BYTES);
        System.out.println("tipo double corresponde a bites a " + Double.SIZE);
        System.out.println("valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double: " + Double.MIN_VALUE);
        
        float varFlotante = 3.1426F;
        System.out.println("varFlotante = " + varFlotante);
    }
}
