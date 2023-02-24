package Ejercicios_practicos.Ejercicio_06.Entidad;

public class Cafetera {

    // Definición de atributos.
    private int capacidad_maxima;
    private int capacidad_actual;

    // Metodo constructor vacio.
    public Cafetera() {
    }

    // Metodo contructor por parametros.
    public Cafetera(int capacidad_maxima, int capacidad_actual) {
        this.capacidad_maxima = capacidad_maxima;
        this.capacidad_actual = capacidad_actual;
    }

    // Metodos get y set para todos los atributos.
    public int getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public int getCapacidad_actual() {
        return capacidad_actual;
    }

    public void setCapacidad_actual(int capacidad_actual) {
        this.capacidad_actual = capacidad_actual;
    }

}
