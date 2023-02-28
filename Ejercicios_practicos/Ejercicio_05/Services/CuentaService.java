package Ejercicios_practicos.Ejercicio_05.Services;

import Ejercicios_practicos.Ejercicio_05.Entidad.Cuenta;
import java.util.Scanner;

public class CuentaService {

    // Crear Clase Scanner para leer datos desde teclado.
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo para creación de cuenta con valores para todos los atributos.
     *
     * @return cuenta.
     */
    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        System.out.println("*** INGRESO DE NUEVA CUENTA ***");
        System.out.print("Cuenta  :");
        cuenta.setNumero_cuenta(leer.nextInt());
        System.out.print("DNI     :");
        cuenta.setDni(leer.nextLong());
        System.out.print("Saldo   :");
        cuenta.setSaldo_actual(leer.nextInt());
        System.out.print("Interés :");
        cuenta.setInteres(leer.nextInt());
        System.out.println("-------------------------------");
        return cuenta;
    }

    /**
     * Metodo de ingreso de dinero al atributo "SALDO", este se sumara al ya
     * existente. Se recibe como parametro desde el main, la variable dinero que
     * es el importe a sumar.
     *
     * @param cuenta
     * @param dinero
     */
    public void ingresarDinero(Cuenta cuenta,int dinero) {
        System.out.println("INGRESO DE EFECTIVO");
        System.out.println("Saldo actual :$" + cuenta.getSaldo_actual());
        System.out.println("Importe      :$" + dinero);
        cuenta.setSaldo_actual(cuenta.getSaldo_actual() + dinero);
        System.out.println("Saldo final  :$" + (cuenta.getSaldo_actual()));
        System.out.println("-------------------------------");
    }

    /**
     * Metodo de retiro de dinero al atributo "SALDO", este se restara al ya
     * existente. Se recibe como parametro desde el main, la variable dinero se
     * restara de Saldo.
     *
     * @param cuenta
     * @param dinero
     */
    public void retiroDinero(Cuenta cuenta,int dinero) {
        System.out.println("RETIRO DE EFECTIVO");
        System.out.println("Saldo actual :$" + cuenta.getSaldo_actual());
        System.out.println("Retiro       :$" + dinero);

        if (cuenta.getSaldo_actual() > dinero) {
            cuenta.setSaldo_actual(cuenta.getSaldo_actual() - dinero);
        } else {
            cuenta.setSaldo_actual(0);
        }
        System.out.println("Saldo final  :$" + (cuenta.getSaldo_actual()));
        System.out.println("-------------------------------");
    }

    /**
     * Metodo de retiro sin parametro y sin retorno por lo que dentro solicita
     * el monto a retirar, se valida que el monto a retirar su supere el 20% del
     * saldo. de lo contrario enviara un mensaje de error.
     * @param cuenta
     */
    public void retiroExpress(Cuenta cuenta) {
        System.out.println("Ingresa el monto de retiro express no superior a 20% :");
        int dinero = leer.nextInt();
        System.out.println("RETIRO DE EFECTIVO EXPRESS");
        System.out.println("Saldo actual :$" + cuenta.getSaldo_actual());
        System.out.println("Retiro       :$" + dinero);
        if ((cuenta.getSaldo_actual() * 0.2) >= dinero) {
            cuenta.setSaldo_actual(cuenta.getSaldo_actual() - dinero);
            ;
            System.out.println("Saldo final  :$" + (cuenta.getSaldo_actual()));
            System.out.println("-------------------------------");
        } else {
            System.out.println("No es posible retirar el monto porque supera el 20% reglamentario");
            System.out.println("-------------------------------");
        }
    }

    /**
     * Metodo sin parametros y sin retorno. Muestra el valor del atributo Saldo.
     * @param cuenta
     */
    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("SALDO DISPONIBLE");
        System.out.println("Total contable :$" + cuenta.getSaldo_actual());
        System.out.println("-------------------------------");
    }

    /**
     * Metodo sin parametros y sin retorno. Muestra todos los valores de los
     * atributo del objeto.
     * @param cuenta
     */
    public void consultarDatos(Cuenta cuenta) {
        System.out.println("DATOS DE CUENTA");
        System.out.println("N° Cuenta        : " + cuenta.getNumero_cuenta());
        System.out.println("DNI              : " + cuenta.getDni());
        System.out.println("Saldo disponible : " + cuenta.getSaldo_actual());
        System.out.println("-------------------------------");
    }

}
