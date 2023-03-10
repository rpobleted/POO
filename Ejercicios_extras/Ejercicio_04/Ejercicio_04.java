package Ejercicios_extras.Ejercicio_04;

import Ejercicios_extras.Ejercicio_04.Entidades.Nif;
import Ejercicios_extras.Ejercicio_04.Servicios.NifServicio;

public class Ejercicio_04 {

    public static void main(String[] args) {

        NifServicio sv = new NifServicio();
        Nif identidad = sv.crearNif();
        sv.mostrar(identidad);

    }
}
