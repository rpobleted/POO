package Ejercicios_practicos.Ejercicio_01;

public class Ejercicio_01 {

    /**
     * Crear una clase llamada Libro que contenga los siguientes atributos:
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los
     * atributos pasados por parámetro y un constructor vacío.
     *
     * Crear un método para cargar un libro pidiendo los datos al usuario y
     * luego informar mediante otro método el número de ISBN, el título, el
     * autor del libro y el numero de páginas.
     *
     * @param args
     */
    public static void main(String[] args) {
        Libros libro1 = new Libros(); // Abstraer o inicializar el objeto "Libro1" con los atributos de la clase Libro.

        System.out.println("---- Ingreso de libros ----");
        libro1.cargarDatos(); // Cargar datos en objeto libro1 de acuerdo a la clase Libro
        System.out.println("----  Libro Ingresado ----");
        libro1.mostarDatos(); // Mostrar los datos guardados en objeto libro1
    }
}
