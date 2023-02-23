package Ejercicios_practicos.Ejercicio_04;

public class Ejercicio_04 {

    /**
     *
     */
    public static void main(String[] args) {

        Rectangulo objeto1 = new Rectangulo();
        
        // INGRESO DE DATOS Y ALMACENAR EN OBJETO
        objeto1.crearRectangulo();

        System.out.println("---------------------------------------------------------");
        
        // CALCULO DE AREA
        System.out.println("El área del rectangulo es      : " + objeto1.areaRectangulo()+"cm^2");

        // CALCULO DE PERIMETRO
        System.out.println("El perímetro del rectangulo es : " + objeto1.perimetroRectangulo()+"cm");

        // VISUALIZAR RECTANGULO
        objeto1.dibujarRectangulo();
    }

}
