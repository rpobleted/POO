package Ejercicios_practicos.Ejercicio_03;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
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

    // d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public void crearOperacion() {

        System.out.println("Ingresa primer número");
        this.numero1 = leer.nextInt();
        System.out.println("Ingresa segundo número");
        this.numero2 = leer.nextInt();

    }

    // e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int sumar() {
        int suma = numero1 + numero2;
        return suma;
    }

    // f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public int resta() {
        int resta = numero1 - numero2;
        return resta;
    }
    
    // g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    //fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    //Si no, se hace la multiplicación y se devuelve el resultado al main
    public int multiplicacion() {
        int multiplicacion;
        if (numero1 != 0 && numero2 != 0) {
            multiplicacion = numero1 * numero2;
        } else {
            System.out.println("Error: multiplicación por cero");
            multiplicacion = 0;
        }
        return multiplicacion;
    }
    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    //una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    //informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    public float division() {
        int division;
        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            System.out.println("Error: no es posible dividir por 0");
            division=0;
        }
        return division;
    }

}
