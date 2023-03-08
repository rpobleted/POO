package Ejercicios_extras.Ejercicio_02.Services;

import Ejercicios_extras.Ejercicio_02.Entidades.Puntos;
import java.util.Scanner;

public class PuntosService {

    public Puntos crearPuntos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Puntos objeto = new Puntos();

        System.out.println("Ingrese las coordenadas del primer punto");
        objeto.setX1(leer.nextInt());
        objeto.setY1(leer.nextInt());

        System.out.println("Ingrese los coordenadas del segundo punto");
        objeto.setX2(leer.nextInt());
        objeto.setY2(leer.nextInt());

        return objeto;
    }

    public void calcularDistancia(Puntos objeto) {
        double A = Math.pow(objeto.getX2() - objeto.getX1(), 2);
        double B = Math.pow(objeto.getY2() - objeto.getY1(), 2);
        double distancia = Math.sqrt(A+B);
        System.out.println(String.format("%.2f",distancia));
    }
}
