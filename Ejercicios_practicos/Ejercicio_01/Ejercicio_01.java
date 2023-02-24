package Ejercicios_practicos.Ejercicio_01;

import Ejercicios_practicos.Ejercicio_01.Entidades.Libros;

public class Ejercicio_01 {

    /**
     * Crear una clase llamada Libro que contenga los siguientes atributos:
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los
     * atributos pasados por parámetro y un constructor vacío.
     *
     * Crear un método para cargar un libro pidiendo los datos al usuario y
     * luego informar mediante otro método el número de ISBN, el título, el
     * autor del libro y el numero de páginas.
     */
    public static void main(String[] args) {

        /**
         * Instanciar e inicializar el objeto "Libro1" con los atributos de la
         * clase Libro.
         */
        Libros libro = new Libros();

        /**
         * Llamado al metodo de ingreso de datos
         */
        libro.cargarDatos();

        /**
         * Llamado al metodo de visualización de datos Forma 1
         */
        libro.mostarDatos();

        /**
         * Llamado al metodo de visualización de datos Forma 2
         */
        System.out.println(libro.toString());
    }
}
