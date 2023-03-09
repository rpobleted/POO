package Ejercicios_extras.Ejercicio_03.Servicios;

import Ejercicios_extras.Ejercicio_03.Entidades.Raices;
import java.util.Scanner;

public class RaicesService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices insertarValores() {
        Raices objeto = new Raices();
        System.out.print("Ingrese valor de a : ");
        objeto.setA(leer.nextInt());
        System.out.print("Ingrese valor de b : ");
        objeto.setB(leer.nextInt());
        System.out.print("Ingrese valor de c : ");
        objeto.setC(leer.nextInt());
        return objeto;
    }

    public double getDiscriminante(Raices objeto) {
        // (b^2)-4*a*c
        double discriminante = Math.pow(objeto.getB(), 2) - (4 * objeto.getA() * objeto.getC());
        return discriminante;
    }

    public boolean tieneRaices(double valor) {
        return valor > 0;
    }

    public void obtenerRaices(Raices objeto) {
        // (-b±√((b^2)-(4*a*c)))/(2*a)
        double resultado1 = (-objeto.getB() + Math.sqrt((Math.pow(objeto.getB(), 2)) - (4 * objeto.getA() * objeto.getC())) )/ (2 * objeto.getA());
        double resultado2 = (-objeto.getB() - Math.sqrt((Math.pow(objeto.getB(), 2)) - (4 * objeto.getA() * objeto.getC())) )/ (2 * objeto.getA());
        System.out.println("Las 2 posibles soluciones son: " + resultado1 + " y " + resultado2);
    }

    public boolean tieneRaiz(double valor) {
        return valor == 0;
    }

    public void obtenerRaiz(Raices objeto) {
        // (-b±√((b^2)-(4*a*c)))/(2*a)
        double resultado1 = -objeto.getB() + Math.sqrt((Math.pow(objeto.getB(), 2)) - (4 * objeto.getA() * objeto.getC())) / (2 * objeto.getA());
        System.out.println("Las posibles solucion es: " + resultado1);
    }

    public void calcular(Raices objeto) {
        double discriminante = getDiscriminante(objeto);
        if (tieneRaices(discriminante)) {
            obtenerRaices(objeto);
        }
        if (tieneRaiz(discriminante)) {
            obtenerRaiz(objeto);
        }
        if (discriminante<0) {
            System.out.println("Las raices son imaginarias, no es posible resolver.");
        }
    }
}
