package Ejercicios_practicos.Ejercicio_05.Services;

import Ejercicios_practicos.Ejercicio_05.Entidad.Cuenta;
import java.util.Scanner;

public class CuentaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuenta cuenta = new Cuenta();

    // METODO CREACION DE CUENTA EN OBJETO
    public void crearCuenta() {

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
    }

    // METODO INGRESO DE DINERO A LA CUENTA
    public void ingresarDinero(int dinero) {
        System.out.println("INGRESO DE EFECTIVO");
        System.out.println("Saldo actual :$" + cuenta.getSaldo_actual());
        System.out.println("Importe      :$" + dinero);
        cuenta.setSaldo_actual(cuenta.getSaldo_actual() + dinero);
        System.out.println("Saldo final  :$" + (cuenta.getSaldo_actual()));
        System.out.println("-------------------------------");
    }

    // METODO RETIRO DE DINERO A LA CUENTA
    public void retiroDinero(int dinero) {
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

    // METODO RETIRO DE DINERO EXPRESS A LA CUENTA
    public void retiroExpress() {
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

    // METODO CONSULTA DE SALDO
    public void consultarSaldo() {
        System.out.println("SALDO DISPONIBLE");
        System.out.println("Total contable :$" + cuenta.getSaldo_actual());
        System.out.println("-------------------------------");
    }

    // METODO CONSULTA DE DATOS DE LA CUENTA
    public void consultarDatos() {
        System.out.println("DATOS DE CUENTA");
        System.out.println("N° Cuenta        : " + cuenta.getNumero_cuenta());
        System.out.println("DNI              : " + cuenta.getDni());
        System.out.println("Saldo disponible : " + cuenta.getSaldo_actual());
        System.out.println("-------------------------------");
    }

}
