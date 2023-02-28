package Ejercicios_practicos.Ejercicio_04;

import Ejercicios_practicos.Ejercicio_04.Entidad.Rectangulo;
import Ejercicios_practicos.Ejercicio_04.Services.RectanguloService;


public class Ejercicio_04 {

    /**
     *
     */
    public static void main(String[] args) {

        // Instanciar un objeto de servicio para realizar las operaciones
        RectanguloService sv = new RectanguloService();
        
        // INGRESO DE DATOS Y ALMACENAR EN OBJETO
        Rectangulo rectangulo1 = sv.crearRectangulo();

        System.out.println("---------------------------------------------------------");
        
        // CALCULO DE AREA
        System.out.println("El área del rectangulo es      : " + sv.areaRectangulo(rectangulo1)+"cm^2");

        // CALCULO DE PERIMETRO
        System.out.println("El perímetro del rectangulo es : " + sv.perimetroRectangulo(rectangulo1)+"cm");

        // VISUALIZAR RECTANGULO
        sv.dibujarRectangulo(rectangulo1);
    }

}
