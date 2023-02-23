package Ejercicios_practicos.Ejercicio_02;

public class Ejercicio_02 {
    //Declarar una clase llamada Circunferencia que tenga como atributo privado
    //el radio de tipo real. A continuación, se deben crear los siguientes métodos:
    //a) Método constructor que inicialice el radio pasado como parámetro.
    //b) Métodos get y set para el atributo radio de la clase Circunferencia. 
    //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto. 
    //d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2).
    //e)Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi * radio).

    public static void main(String[] args) {
        Circunferencia objeto1 = new Circunferencia();

        // INGRESO DE VALOR DE RADIO
        objeto1.crearCircunferencia();

        // CALCULO DE AREA
        System.out.println("Area : " + objeto1.area()+ "[cm^2]");
        
        
        // CALCULO DE PERIMETRO   
        System.out.println("Perimetro : " + objeto1.perimetro() + "[cm]");
    }

}
