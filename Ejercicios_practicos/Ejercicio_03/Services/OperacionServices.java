package Ejercicios_practicos.Ejercicio_03.Services;

import Ejercicios_practicos.Ejercicio_03.Entidades.Operacion;
import java.util.Scanner;

/**
 * CLASE DE SERVICIO para acceder a los metodos (no asi a las variables) de la
 * clase Operación donde las variables son PRIVATE.
 *
 * @author rpobl
 */
public class OperacionServices {

    //Llamado al objeto scanner para habilitar ingreso de datos por teclado.
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Creación de objeto e inicializar.
    Operacion objeto = new Operacion();

    /**
     * Metodo para el ingreso de 2 numeros, sin retorno
     */
    public void crearOperacion() {
        System.out.println("Ingresa primer número");
        objeto.setNumero1(leer.nextInt());
        System.out.println("Ingresa segundo número");
        objeto.setNumero2(leer.nextInt());
    }

    /**
     * Metodo para sumar los valores de los 2 atributos del objeto.
     *
     * @return suma.
     */
    public int sumar() {
        int suma = (objeto.getNumero1() + objeto.getNumero2());
        return suma;
    }

    /**
     * Metodo para restar los valores de los 2 atributos del objeto
     *
     * @return resta
     */
    public int resta() {
        int resta = objeto.getNumero1() - objeto.getNumero2();
        return resta;
    }

    /**
     * Metodo para multiplicar los valores de los 2 atributos del objeto. Para
     * el caso de que uno de los numeros sea cero retorna 0, sino ejecuta la
     * multiplicación normalmente.
     *
     * @return multiplicación
     */
    public int multiplicacion() {
        int multiplicacion;
        if (objeto.getNumero1() != 0 && objeto.getNumero2() != 0) {
            multiplicacion = objeto.getNumero1() * objeto.getNumero2();
        } else {
            System.out.println("Error: multiplicación por cero");
            multiplicacion = 0;
        }
        return multiplicacion;
    }

    /**
     * Metodo para dividir ambos valores de los atributos. En el caso de que el
     * segundo numero sea 0, retorna mensaje de error.
     *
     * @return division.
     */
    public float division() {
        int division;
        if (objeto.getNumero2() != 0) {
            division = objeto.getNumero1() / objeto.getNumero2();
        } else {
            System.out.println("Error: no es posible dividir por 0");
            division = 0;
        }
        return division;
    }
}
