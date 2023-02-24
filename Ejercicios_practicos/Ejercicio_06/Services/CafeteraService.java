package Ejercicios_practicos.Ejercicio_06.Services;

import Ejercicios_practicos.Ejercicio_06.Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraService {

    // Crear Clase Scanner para leer datos desde teclado.
    // Crear Objeto del tipo Clase.
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera objeto = new Cafetera();

    /**
     * Metodo sin parametros, sin retorno. Seteo de parametros capacidad maxima
     * de la cafetera.
     */
    public void seteoMaximo() {
        System.out.print("Definir capacidad maxima de la cafetera [ml] : ");
        objeto.setCapacidad_maxima(leer.nextInt());
        System.out.println("----------------------------------------------");
    }

    /**
     * Metodo sin parametros, sin retorno. Simula el llenado de la cafetera
     * igualando el atributo capacidad actual a capacidad maxima.
     */
    public void llenarCafetera() {
        objeto.setCapacidad_actual(objeto.getCapacidad_maxima());
        System.out.println("Cafetera llena...");
        System.out.println("----------------------------------------------");
    }

    // METODO SERVIR TAZA
    /**
     * Metodo por parametro recibido desde el main, sin retorno. Simula servir
     * cafe, solicitando la capacidad de la taza. 1) Capacidad actual = 0, envia
     * mensaje de realizar recarga 2) Capacidad actual >= taza, completa el
     * llenado de la taza. 3) Capacidad actual <taza y !=0, se llena la taza
     * solamente con el contenido que le queda a la cafetera, llevando la
     * capacidad de la cafetera a 0.
     *
     *
     * @param taza
     */
    public void servirTaza(int taza) {
        if (objeto.getCapacidad_actual() == 0) {
            objeto.setCapacidad_actual(0);
            System.out.println("La cafetera esta vacia porfavor realizar recarga");
            System.out.println("----------------------------------------------");
        }
        if (objeto.getCapacidad_actual() >= taza) {
            objeto.setCapacidad_actual(objeto.getCapacidad_actual() - taza); // SERVIR CAFE
            System.out.println("Taza completamente servida...");
            System.out.println("----------------------------------------------");
        }
        if (objeto.getCapacidad_actual() < taza && objeto.getCapacidad_actual() != 0) {
            taza = taza - objeto.getCapacidad_actual();
            System.out.println("Taza servida incompleta con " + (taza) + "ml");
            objeto.setCapacidad_actual(0);
            System.out.println("----------------------------------------------");
        }
    }

// METODO VACIAR CAFETERA
    /**
     * Metodo sin parametros, sin retorno. Simula el vaciado de la cafetera para
     * una mantención, si la capacidad de la cafetera ya es = 0, envia mensaje
     * que ya se encuentra vacia, sino lleva el valor de capacidad actual a 0.
     *
     */
    public void vaciarCafetera() {
        if (objeto.getCapacidad_actual() != 0) {
            objeto.setCapacidad_actual(0);
            System.out.println("Cafetera vacia ... favor realizar el mantenimiento");
            System.out.println("----------------------------------------------");
        } else {
            System.out.println("La cafetera ya se encuentra vacia.");
            System.out.println("----------------------------------------------");
        }
    }

    // METODO AGREGAR CAFE A LA CAFETERA
    /**
     * Metodo por parametro, sin retorno. Simula agregar una cantidad de cafe a
     * la cafetera, este valor hace incrementar el valor de capacidad actual. En
     * el caso que el valor agregado supere la capacidad maxima enviara un error
     * no acapetando la recarga.
     *
     * @param cafe
     */
    public void agregarCafe(int cafe) {
        int disponible = objeto.getCapacidad_maxima() - objeto.getCapacidad_actual();
        if (cafe <= disponible) {
            objeto.setCapacidad_actual(objeto.getCapacidad_actual() + cafe);
            System.out.println("Recarga completada - Capacidad restante disponible " + (objeto.getCapacidad_maxima() - objeto.getCapacidad_actual()) + "ml");
            System.out.println("----------------------------------------------");

        } else {
            System.out.println("La recarga excede la capacidad máxima");
            System.out.println("----------------------------------------------");
        }
    }
}
