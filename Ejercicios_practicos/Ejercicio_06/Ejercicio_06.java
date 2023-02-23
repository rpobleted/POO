package Ejercicios_practicos.Ejercicio_06;

import Ejercicios_practicos.Ejercicio_06.Services.CafeteraService;
import java.util.Scanner;

public class Ejercicio_06 {

//   Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//  (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
//   cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
//a) Constructor predeterminado o vacío
//b) Constructor con la capacidad máxima y la cantidad actual
//c) Métodos getters y setters.
//d) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//   máxima.
//e) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//   tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//   cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//   método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//   cuanto quedó la taza.
//f) Método vaciarCafetera(): pone la cantidad de café actual en cero.
//g) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
// recibe y se añade a la cafetera la cantidad de café indicada.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int taza;
        int opc;
        CafeteraService ver = new CafeteraService();

        ver.seteoMaximo();

        // DEFINIR CAPACIDAD MAXIMA DE LA CAFETERA
        do {
            System.out.println("* * * * * * * * MENU CAFETERA * * * * * * * *");
            System.out.println("1. Llenar cafetera al máximo");
            System.out.println("2. Servir taza de café");
            System.out.println("3. Vaciar cafetera para mantenimiento");
            System.out.println("4. Agregar una cantidad especifica de café");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción : ");
            opc = leer.nextInt();
            System.out.println("----------------------------------------------");

            switch (opc) {
                case 1:
                    ver.llenarCafetera();
                    break;

                case 2:
                    System.out.print("Ingrese la capacidad de la taza en [ml] : ");
                    ver.servirTaza(leer.nextInt());
                    break;

                case 3:
                    ver.vaciarCafetera();
                    break;

                case 4:
                    System.out.print("Ingrese el total de la recarga en [ml] : ");
                    ver.agregarCafe(leer.nextInt());
                    break;

            }
        } while (opc!=5);
        System.out.println("Saliendo ...");
    }
}
