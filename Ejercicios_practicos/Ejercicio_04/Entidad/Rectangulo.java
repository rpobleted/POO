package Ejercicios_practicos.Ejercicio_04.Entidad;

import java.util.Scanner;

public class Rectangulo {
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
}
