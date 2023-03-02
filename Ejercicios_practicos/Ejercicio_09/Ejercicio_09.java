package Ejercicios_practicos.Ejercicio_09;

import Ejercicios_practicos.Ejercicio_09.Entidad.Matematica;
import Ejercicios_practicos.Ejercicio_09.Services.MatematicaService;


public class Ejercicio_09 {

    public static void main(String[] args) {

        MatematicaService sv = new MatematicaService();

        Matematica numeros = crear();
        System.out.println("Num1: " + numeros.getNumero1()+" - "+ "Num2: " + numeros.getNumero2());
        sv.devolverMayor(numeros);
        sv.calcularPotencia(numeros);
        sv.calculaRaiz(numeros);
    }

    public static Matematica crear() {
        Matematica objeto = new Matematica();
        objeto.setNumero1((float) (Math.random() * 10));
        objeto.setNumero2((float) (Math.random() * 10));
        return objeto;
    }
}
