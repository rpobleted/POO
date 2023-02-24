package Ejercicios_practicos.Ejercicio_02.Entidades;

import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /**
     * Variable publica radio.
     */
    public int radio;

    /**
     * Metodo vacio para instanciar un objeto.
     */
    public Circunferencia() {
    }

    /**
     * Metodo a traves de parametros para instanciar un objeto.
     *
     * @param radio
     */
    public Circunferencia(int radio) {
        this.radio = radio;
    }

    /**
     * Metodo get para rescatar el valor del atributo atributo.
     *
     * @return radio;
     */
    public int getRadio() {
        return radio;
    }

    /**
     * Metodo set para escribir o sobrescribir el atributo radio con el
     * parametro recibido.
     *
     * @param radio
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * Metodo que solicita el un valor y lo almacena en el atributo radio.
     */
    public void crearCircunferencia() {
        System.out.print("Ingresa el radio de la circunferencia [CM]: ");
        this.radio = leer.nextInt();
    }

    //d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2). La funcion retorna valor.
    public void area() {
        double area = Math.PI * Math.pow(getRadio(), 2);
        System.out.println("Area : " + area + "[cm^2]");
    }

    //d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2). La funcion retorna valor.
    public void perimetro() {
        double perimetro = 2 * Math.PI * getRadio();
        System.out.println("Perimetro : " + perimetro + "[cm]");
    }
}
