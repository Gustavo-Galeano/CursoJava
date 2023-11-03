package org.ggaleano.ejemplo;

import org.ggaleano.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        System.out.println("========= Creando la instancia del objeto alumno =========");
        alumno.setNombre("Gustavo");
        alumno.setApellido("Galeano");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        System.out.println("========= Creando la instancia del objeto alumno internacional =========");
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);


        Profesor profesor = new Profesor();
        System.out.println("========= Creando la instancia del objeto profesor =========");
        profesor.setNombre("Luci");
        profesor.setApellido("Martinez");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());

        System.out.println();

        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

        System.out.println();

        System.out.println(alumnoInt.getNombre()
                 + " " + alumnoInt.getApellido()
                 + " " + alumnoInt.getInstitucion()
                 + " " + alumnoInt.getPais());

        System.out.println();

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
