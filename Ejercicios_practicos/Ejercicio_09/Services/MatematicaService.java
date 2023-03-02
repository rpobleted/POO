package Ejercicios_practicos.Ejercicio_09.Services;

import Ejercicios_practicos.Ejercicio_09.Entidad.Matematica;
import static java.lang.Math.max;

public class MatematicaService {

    public void devolverMayor(Matematica objeto) {
        double valor = max(objeto.getNumero1(), objeto.getNumero2());
        System.out.println("El numero mayor es " + valor);
    }

    public void calcularPotencia(Matematica objeto) {
        double num1 = Math.round(objeto.getNumero1());
        double num2 = Math.round(objeto.getNumero2());
        double valor = Math.pow(Math.max(num1,num2),Math.min(num1,num2));
        System.out.println("La potencia del numero mayor elevado al numero menor es " + valor);
    }

    public void calculaRaiz(Matematica objeto){
        double valor = (double) Math.abs(Math.max(objeto.getNumero1(),objeto.getNumero2()));
        valor = Math.sqrt(valor);
        System.out.println("La raiz cuadrada del numero mayor :" + valor);
    }
    
}
