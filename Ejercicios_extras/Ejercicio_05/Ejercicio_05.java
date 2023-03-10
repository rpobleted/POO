package Ejercicios_extras.Ejercicio_05;

import Ejercicios_extras.Ejercicio_05.Entidades.Meses;
import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Meses juego = new Meses();
        String mes;

        juego.activarJuego();
        //System.out.println(juego.toString());

        do {
            System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");
            mes = leer.next();

            if (juego.getMesSecreto().equalsIgnoreCase(mes)) {
                System.out.println("Ha acertado!");
            } else {
                System.out.println("No ha acertado!");
            }

        } while (!juego.getMesSecreto().equalsIgnoreCase(mes));

    }

}
