
public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");


        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.4);
        System.out.println("mazda.Fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        Automovil.setColorPatente("Verde");
        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println(nissan.verDetalle());

        System.out.println();
        System.out.println(nissan2.verDetalle());

        System.out.println();
        System.out.println("Automovil = " + Automovil.getColorPatente());

        System.out.println();
        System.out.println("Velocidad maxima carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad = " + Automovil.VELOCIDAD_MAX_CIUDAD);
    }
}