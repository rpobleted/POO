package Ejercicios_practicos.Ejercicio_01.Entidades;

import java.util.Scanner;

public class Libros {

    /**
     * Atributos definidos como publicos porque se esta usando la Clase Libros
     * directamente.
     */
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;

    /**
     * Constructor vacio para instanciar un objeto.
     */
    public Libros() {
    }

    /**
     * Constructor con parametros para instanciar un objeto.
     *
     * @param isbn
     * @param titulo
     * @param autor
     * @param paginas
     */
    public Libros(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * Metodo para ingreso de datos mediante teclado para llenar atributos de un
     * objeto.
     */
    public void cargarDatos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---- Ingreso de libros ----");
        System.out.print("ISBN:");
        isbn = leer.nextInt();
        System.out.print("TITULO:");
        titulo = leer.next();
        System.out.print("AUTOR:");
        autor = leer.next();
        System.out.print("PÁGINAS:");
        paginas = leer.nextInt();
    }

    /**
     * Metodo para visualizar valores de los atributos de un objeto. Metodo en
     * varias filas.
     */
    public void mostarDatos() {
        System.out.println("----  Libros Ingresado  forma 1 ----");
        System.out.println("ISBN       : " + isbn);
        System.out.println("TITULO     : " + titulo);
        System.out.println("AUTOR      : " + autor);
        System.out.println("PÁGINAS    : " + paginas);
    }

    /**
     * Metodo toString predefinido para visualizar valores de los atributos de
     * un objeto.
     *
     * @return todos los valores
     */
    @Override
    public String toString() {
        System.out.println("----  Libros Ingresado  forma 2 ----");
        return "Libros{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
}
