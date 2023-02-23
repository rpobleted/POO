package Ejercicios_practicos.Ejercicio_01;

import java.util.Scanner;

public class Libros {

    // CLASE ESCANNER PARA PODER HABILITAR INGRESO DE DATOS VIA TECLADO AL LLAMAR A LAS PROCEDIMIENTOS Y/ FUNCIONES DE ESTA CLASE
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // DEFINICION DE TIPO DE ATRIBUTOS PARA ABSTRAER OBJETOS
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;

    // CONSTRUCTOR VACIO PARA ABSTRAER Y DARLE FORMA AL OBJETO (COMPLETA CON DATOS VACIOS)
    public Libros() {
    }
    
    // CONSTRUCTOR CON PARAMETROS PARA HACER INGRESO DIRECTAMENTE LOS VALORES DESDE EL MAIN 
    public Libros(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // PROCEDIMIENTO DE INGRESO DE DATOS PARA COMPLETAR ATRIBUTOS PARA UN OBJETO SEÑALADO EN EL MAIN
    public void cargarDatos() {
        System.out.print("ISBN:");
        isbn = leer.nextInt();
        System.out.print("TITULO:");
        titulo = leer.next();
        System.out.print("AUTOR:");
        autor = leer.next();
        System.out.print("PÁGINAS:");
        paginas = leer.nextInt();
    }
    // PROCEDIMIENTO DE VISUALIZACION DE ATRIBUTOS CONTENIDOS EN  EL OBJETO SEÑALADO EN EL MAIN
    public void mostarDatos() {
        System.out.println("ISBN       : " + isbn);
        System.out.println("TITULO     : " + titulo);
        System.out.println("AUTOR      : " + autor);
        System.out.println("PÁGINAS    : " + paginas);
    }
}
