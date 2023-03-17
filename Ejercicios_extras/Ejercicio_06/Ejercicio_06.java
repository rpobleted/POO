package Ejercicios_extras.Ejercicio_06;

import Ejercicios_extras.Ejercicio_06.Entidades.Ahorcado;
import Ejercicios_extras.Ejercicio_06.Services.AhorcadoService;

public class Ejercicio_06 {

    public static void main(String[] args) {

        AhorcadoService sv = new AhorcadoService();
        Ahorcado juego = new Ahorcado();
        sv.juego(juego);
    }
}
