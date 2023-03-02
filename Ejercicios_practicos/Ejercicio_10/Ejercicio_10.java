package Ejercicios_practicos.Ejercicio_10;

import java.util.Arrays;

public class Ejercicio_10 {

    public static void main(String[] args) {

        double arregloA[] = new double[50];
        double arregloB[] = new double[20];

        llenarArreglo(arregloA);
        mostrarArreglo(arregloA);
        operacionArreglo(arregloA, arregloB);
    }

    /**
     * Llena con valores aleatorios el vector enviado.
     * @param arreglo
     */
    public static void llenarArreglo(double arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * (9 - 1);
        }
    }

    /**
     * Recorrer arreglo y mostrar contenido de manera horizontal
     *
     * @param arreglo
     */
    public static void mostrarArreglo(double arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(String.format("%.1f", arreglo[i]) + " ");
        }
        System.out.println("");
    }

    /**
     * Ordena de mayor a mayor el vector 1. copia los elementos del vector 1 al
     * vector 2 mantengo los 10 primeros. Registro 0,5 en las posiciones 11 a
     * 20.
     *
     * @param arreglo1
     * @param arreglo2
     */
    public static void operacionArreglo(double arreglo1[], double arreglo2[]) {
        Arrays.sort(arreglo1);
        arreglo2 = Arrays.copyOfRange(arreglo1, 0, 20);
        Arrays.fill(arreglo2, 10, 20, 0.5);
        mostrarArreglo(arreglo2);
    }
}
