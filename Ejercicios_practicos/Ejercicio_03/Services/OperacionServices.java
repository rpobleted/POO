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

    /**
     * Metodo para el ingreso de 2 numeros, sin retorno
     *
     * @return
     */
    public Operacion crearOperacion() {
        Operacion objeto = new Operacion();
        System.out.println("Ingresa primer número");
        objeto.setNumero1(leer.nextInt());
        System.out.println("Ingresa segundo número");
        objeto.setNumero2(leer.nextInt());
        return objeto;
    }

    /**
     * Metodo para sumar los valores de los 2 atributos del objeto.
     *
     * @param objeto
     * @return suma.
     */
    public int sumar(Operacion objeto) {
        int suma = (objeto.getNumero1() + objeto.getNumero2());
        return suma;
    }

    /**
     * Metodo para restar los valores de los 2 atributos del objeto
     *
     * @param objeto
     * @return resta
     */
    public int resta(Operacion objeto) {
        int resta = objeto.getNumero1() - objeto.getNumero2();
        return resta;
    }

    /**
     * Metodo para multiplicar los valores de los 2 atributos del objeto. Para
     * el caso de que uno de los numeros sea cero retorna 0, sino ejecuta la
     * multiplicación normalmente.
     *
     * @param objeto
     * @return multiplicación
     */
    public int multiplicacion(Operacion objeto) {
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
     * @param objeto
     * @return division.
     */
    public float division(Operacion objeto) {
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
