package org.ggaleano.app.hogar;

import org.ggaleano.app.jardin.Perro;
import static org.ggaleano.app.hogar.Persona.saludar ;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saluda = Persona.saludar();
    }
}
