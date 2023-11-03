package org.ggaleano.app.jardin;

import org.ggaleano.app.hogar.*;
import static org.ggaleano.app.hogar.Persona.*;

public class EjemploPaquetes  {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Gustavo");
        p.setApellido("Galeano");
        p.setColorPelo(ColorPelo.CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";
        
        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
        
    }
}
