package Ejercicios_practicos.Ejercicio_06.Services;

import Ejercicios_practicos.Ejercicio_06.Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera objeto = new Cafetera();

    public CafeteraService() {
    }

    // SETEAR CAPACIDAD MAXIMA
    public void seteoMaximo() {
        System.out.print("Definir capacidad maxima de la cafetera [ml] : ");
        objeto.setCapacidad_maxima(leer.nextInt());
        System.out.println("----------------------------------------------");
    }

    // METODO LLENAR CAFETERA A SU CAPACIDAD MÁXIMA
    public void llenarCafetera() {
        objeto.setCapacidad_actual(objeto.getCapacidad_maxima());
        System.out.println("Cafetera llena...");
        System.out.println("----------------------------------------------");
    }

    // METODO SERVIR TAZA
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
