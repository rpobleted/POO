package Ejercicios_practicos.Ejercicio_02;

import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int radio;

    // Método vacio para iniciarlizar el objeto.
    public Circunferencia() {
    }
    
    //a) Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(int radio) {
        this.radio = radio;
    }
    
    // b) Método get para el atributo radio de la clase Circunferencia.
    public int getRadio() {
        return radio;
    }
    // b) Método set para el atributo radio de la clase Circunferencia.
    public void setRadio(int radio) {
        this.radio = radio;
    }
    // c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo de objeto.
    public void crearCircunferencia(){
        System.out.print("Ingresa el radio de la circunferencia [CM]: ");
        this.radio=leer.nextInt();
    }
    
    //d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2). La funcion retorna valor.
    public double area(){
        double area = Math.PI * Math.pow(getRadio(), 2);
        return area;
    }
    
      //d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2). La funcion retorna valor.
    public double perimetro(){
        double perimetro=2*Math.PI*getRadio();
        return perimetro;
    }
    
}
