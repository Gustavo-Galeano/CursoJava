package org.ggaleano.ejemplo;

import org.ggaleano.pooherencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("========= Creando la instancia de la clase alumno =========");
        Alumno alumno = new Alumno("Gustavo", "Galeano", 13, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("alumnog@gmail.com");

        System.out.println("========= Creando la instancia de la clase internacional =========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("alumnoIntP@gmail.com");

        System.out.println("========= Creando la instancia de la clase profesor =========");
        Profesor profesor = new Profesor("Luci", "Martinez", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("profesorL@gmail.com");

        System.out.println("========= =========");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo los datos del tipo Persona: ");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if (persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo  Alumno: ");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matematica" + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia" + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota castellano" + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo  AlumnoInternacional: ");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
        }
        if (persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura" + ((Profesor) persona).getAsignatura());
        }

        System.out.println("========= =========");
    }

}
