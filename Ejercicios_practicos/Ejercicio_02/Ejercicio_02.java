package Ejercicios_practicos.Ejercicio_02;

import Ejercicios_practicos.Ejercicio_02.Entidades.Circunferencia;

public class Ejercicio_02 {
    //Declarar una clase llamada Circunferencia que tenga como atributo privado
    //el radio de tipo real. A continuación, se deben crear los siguientes métodos:
    //a) Método constructor que inicialice el radio pasado como parámetro.
    //b) Métodos get y set para el atributo radio de la clase Circunferencia. 
    //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto. 
    //d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2).
    //e)Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi * radio).

    public static void main(String[] args) {
        Circunferencia objeto = new Circunferencia();

        /**
         * Ingreso de radio para definir una circunferencia.
         */
        objeto.crearCircunferencia();

        /**
         * Calculo de área.
         */
        objeto.area();

        /**
         * Calculo de perimetro.
         */
        objeto.perimetro();
    }

}
