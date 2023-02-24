package Ejercicios_practicos.Ejercicio_03.Entidades;

import java.util.Scanner;

/**
 * CLASE directame con los atributos para definir objetos.
 *
 * @author rpobl
 */
public class Operacion {

    // Habilitar ingreso de valores por teclado.
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Definición de atributos.
    private int numero1;
    private int numero2;

    // a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // b) Metodo constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }

    // c) Métodos get y set.
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
