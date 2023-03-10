package Ejercicios_extras.Ejercicio_06.Services;

import Ejercicios_extras.Ejercicio_06.Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.println("*** SETEO GENERAL JUEGO ***");
        System.out.print("Ingresa una palabra: ");
        String palabra = leer.next();
        String vector[] = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        System.out.print("Ingresa la cantidad de jugadas máximas: ");
        int jugadasMax = leer.nextInt();
        int encontradas = 0;
        Ahorcado objeto = new Ahorcado(vector, encontradas, jugadasMax);
        System.out.println(objeto.toString());
        System.out.println("--------------------------");
        return objeto;
    }

    public int longitud(Ahorcado objeto) {
        return objeto.getPalabra().length;
    }

    public boolean buscar(Ahorcado objeto, String letra) {
        if (Arrays.asList(objeto.getPalabra()).contains(letra) == true) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
            return true;
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
            objeto.setJugadasMax(objeto.getJugadasMax() - 1);
            return false;
        }
    }

    public void encontradas(Ahorcado objeto, String letra) {
        String vector[] = objeto.getPalabra();
        int encontradas = 0;

        for (int i = 0; i < (longitud(objeto)); i++) {
            if (vector[i].equals(letra)) {
                encontradas++;
                objeto.setEncontradas(objeto.getEncontradas() + 1);
            }
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + objeto.getEncontradas() + "," + (longitud(objeto) - objeto.getEncontradas()) + ")");
    }

    public void intentos(Ahorcado objeto) {
        System.out.println("Número de oportunidades restantes: " + objeto.getJugadasMax());
        System.out.println("--------------------------");
    }
}
