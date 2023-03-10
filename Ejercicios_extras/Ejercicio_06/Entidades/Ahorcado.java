package Ejercicios_extras.Ejercicio_06.Entidades;

import java.util.Arrays;

public class Ahorcado {
    
    private String[] palabra;
    private int encontradas;
    private int jugadasMax;

    public Ahorcado() {
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public Ahorcado(String[] palabra, int encontradas, int jugadasMax) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", encontradas=" + encontradas + ", jugadasMax=" + jugadasMax + '}';
    }
    
    
    
    
    
}
