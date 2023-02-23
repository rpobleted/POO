package Ejercicios_practicos.Ejercicio_04;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int base;
    private int altura;

    // Metodo constructor vacio para inicializar
    public Rectangulo() {
    }

    // Metodo constructor con todos los parametros
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodos GET y SET
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.println("*** INGRESO DE DATOS ***");
        System.out.print("Ingresa el valor base[cm]   : ");
        this.base = leer.nextInt();
        System.out.print("Ingresa el valor altura[cm] : ");
        this.altura = leer.nextInt();
    }

    public int areaRectangulo() {
        int area = base * altura;
        return area;
    }

    public int perimetroRectangulo() {
        int perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void dibujarRectangulo() {
        System.out.println("Visualmente el rectangulo se ve algo asi...");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

}
