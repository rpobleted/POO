package Ejercicios_practicos.Ejercicio_04.Services;

import Ejercicios_practicos.Ejercicio_04.Entidad.Rectangulo;
import java.util.Scanner;

/**
 * Clase servicio para Rectangulo
 *
 * @author rpobl
 */
public class RectanguloService {

    // Crear Clase Scanner para leer datos desde teclado.
    // Crear Objeto del tipo clase Rectangulo.
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metododo que solicita los valores para almacenar en los atributos del
     * objeto.
     *
     * @return objeto.
     */
    public Rectangulo crearRectangulo() {
        Rectangulo objeto = new Rectangulo();
        System.out.println("*** INGRESO DE DATOS ***");
        System.out.print("Ingresa el valor base[cm]   : ");
        objeto.setBase(leer.nextInt());
        System.out.print("Ingresa el valor altura[cm] : ");
        objeto.setAltura(leer.nextInt());
        return objeto;
    }

    /**
     * Metodo que calcula el area del rectangulo de acuerdo a los atributos, el
     * resultado retornara al main para ser visualizado por pantalla.
     *
     * @return area.
     */
    public int areaRectangulo(Rectangulo objeto) {
        int area = objeto.getBase() * objeto.getAltura();
        return area;
    }

    /**
     * Metodo que calcula el perimetro del rectangulo de acuerdo a los
     * atributos, el resultado retornara al main para ser visualizado por
     * pantalla.
     *
     * @return perimetro.
     */
    public int perimetroRectangulo (Rectangulo objeto) {
        int perimetro = (objeto.getBase() + objeto.getAltura()) * 2;
        return perimetro;
    }

    /**
     * Metodo sin retorno, que dibuja por pantalla un rectangulo de acuerdo a
     * los atributos del objeto en cuanto a altura y base con *.
     */
    public void dibujarRectangulo(Rectangulo objeto) {
        System.out.println("Visualmente el rectangulo se ve algo asi...");
        for (int i = 0; i < objeto.getAltura(); i++) {
            for (int j = 0; j < objeto.getBase(); j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
