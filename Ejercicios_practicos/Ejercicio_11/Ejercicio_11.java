    package Ejercicios_practicos.Ejercicio_11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una fecha hacia el pasado");

        System.out.println("Ingrese el dia AAAA");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes MM");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año DD");
        int dia = leer.nextInt();

        Date fecha1 = new Date((anio - 1900), (mes - 1), dia);
        System.out.println(fecha1.toString());

        System.out.println("Fecha actual");
        Date fecha2 = new Date();
        System.out.println(fecha2.toString());
        
        System.out.println("Cuantos años de diferencia");
        System.out.println(fecha2.getYear()- fecha1.getYear());
    }
}
