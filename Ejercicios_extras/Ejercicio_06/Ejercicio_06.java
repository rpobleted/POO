package Ejercicios_extras.Ejercicio_06;

import Ejercicios_extras.Ejercicio_06.Entidades.Ahorcado;
import Ejercicios_extras.Ejercicio_06.Services.AhorcadoService;
import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AhorcadoService sv = new AhorcadoService();
        Ahorcado juego = new Ahorcado();

        juego = sv.crearJuego();

        do {
            System.out.print("Ingrese una letra :");
            String letra = leer.next();
            System.out.println("Longitud de la palabra: " + sv.longitud(juego));

            sv.buscar(juego, letra);
            sv.encontradas(juego, letra);
            sv.intentos(juego);
        } while (juego.getJugadasMax() != 0 && juego.getEncontradas() != sv.longitud(juego));

        if (juego.getEncontradas() == sv.longitud(juego)) {
            System.out.println("Palabra encontrada");
        }

        if (juego.getJugadasMax() == 0) {
            System.out.println("Excediste la cantidad de intentos");
        }

    }

}
