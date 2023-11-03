public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.toCharArray());
        
        char[] arreglo =  trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i =0; i < largo; i++){
            System.out.println(arreglo[i]);
        }
        System.out.println();
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for (int i = 0; i < l; i++){
            System.out.println("arreglo2 = " + arreglo2[i]);
        }

        String archivo = "alguna.imagen.xlsx";
        String[] archivoArr = archivo.split("\\.");
        l = archivoArr.length;
        for (int i = 0; i < l; i++){
            System.out.println(archivoArr[i]);
        }
        System.out.println("extencion = " + archivoArr[l -1 ]);
    }
}