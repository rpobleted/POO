package Ejercicios_extras.Ejercicio_03;

import Ejercicios_extras.Ejercicio_03.Entidades.Raices;
import Ejercicios_extras.Ejercicio_03.Servicios.RaicesService;

public class Ejercicio_03 {

    public static void main(String[] args) {
        RaicesService sv = new RaicesService();
        Raices ecuacion1 = new Raices();
       
        ecuacion1 = sv.insertarValores();
        sv.calcular(ecuacion1);
    }
   
}
