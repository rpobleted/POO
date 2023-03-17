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
        if (Arrays.asList(objeto.getPalabra()).contains(letra)) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
            return true;
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");

            return false;
        }
    }

    public void encontradas(Ahorcado objeto, String letra) {
        String vector[] = objeto.getPalabra();
        String vectorCompleto[] = new String[objeto.getPalabra().length];

        if (Arrays.asList(objeto.getPalabra()).contains(letra)) {
            for (int i = 0; i < (longitud(objeto)); i++) {
                if (vector[i].equals(letra)) {
                    vectorCompleto[i] = vector[i];
                    System.out.println(vectorCompleto[0] + vectorCompleto[1] + vectorCompleto[2] + vectorCompleto[3]);
                    objeto.setEncontradas(objeto.getEncontradas() + 1);
                }
            }
        } else {
            objeto.setJugadasMax(objeto.getJugadasMax() - 1);
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + objeto.getEncontradas() + "," + (longitud(objeto) - objeto.getEncontradas()) + ")");
    }

    public void intentos(Ahorcado objeto) {
        System.out.println("Número de oportunidades restantes: " + objeto.getJugadasMax());
        System.out.println("--------------------------");
    }

    public void juego(Ahorcado objeto) {
        objeto = crearJuego();
        do {
            System.out.print("Ingrese una letra :");
            String letra = leer.next();
            System.out.println("Longitud de la palabra: " + longitud(objeto));
            buscar(objeto, letra);
            encontradas(objeto, letra);
            intentos(objeto);

            if (objeto.getEncontradas() == longitud(objeto)) {
                System.out.println("Palabra encontrada");
            }
            if (objeto.getJugadasMax() == 0) {
                System.out.println("Excediste la cantidad de intentos");
            }
        } while (objeto.getJugadasMax() != 0 && objeto.getEncontradas() != longitud(objeto));
    }

    private int contarElementos(String[] vectorCompleto) {
        int contador = 0;

        for (int i = 0; i < vectorCompleto.length; i++) {
            if (!"".equals(vectorCompleto[i])) {
                contador++;
            }
        }
        return contador;
    }
}
