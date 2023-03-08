package Ejercicios_extras.Ejercicio_02;

import Ejercicios_extras.Ejercicio_02.Entidades.Puntos;
import Ejercicios_extras.Ejercicio_02.Services.PuntosService;

public class Ejercicio_02 {

    /**
     * Definir una clase llamada Puntos que contendrá las coordenadas de dos
     * puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
     * Generar un objeto puntos usando un método crearPuntos() que le pide al
     * usuario los dos números y los ingresa en los atributos del objeto.
     * Después, a través de otro método calcular y devolver la distancia que
     * existe entre los dos puntos que existen en la clase Puntos. Para conocer
     * como calcular la distancia entre dos puntos consulte el siguiente link:
     */
    public static void main(String[] args) {

        PuntosService sv = new PuntosService();
        Puntos recta1 = new Puntos();
       
        recta1=sv.crearPuntos();
        sv.calcularDistancia(recta1);
    }
}
