package Ejercicios_practicos.Ejercicio_04;

import Ejercicios_practicos.Ejercicio_04.Services.RectanguloService;


public class Ejercicio_04 {

    /**
     *
     */
    public static void main(String[] args) {

        RectanguloService ver = new RectanguloService();
        
        // INGRESO DE DATOS Y ALMACENAR EN OBJETO
        ver.crearRectangulo();

        System.out.println("---------------------------------------------------------");
        
        // CALCULO DE AREA
        System.out.println("El área del rectangulo es      : " + ver.areaRectangulo()+"cm^2");

        // CALCULO DE PERIMETRO
        System.out.println("El perímetro del rectangulo es : " + ver.perimetroRectangulo()+"cm");

        // VISUALIZAR RECTANGULO
        ver.dibujarRectangulo();
    }

}
