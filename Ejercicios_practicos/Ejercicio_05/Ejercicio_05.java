package Ejercicios_practicos.Ejercicio_05;

import Ejercicios_practicos.Ejercicio_05.Services.CuentaService;
import java.util.Scanner;

public class Ejercicio_05 {

//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
//Las operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaService ver = new CuentaService();
        // Ingreso de datos de cuenta    
        ver.crearCuenta();
        // MENU DE OPCIONES 
        int opc;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Ingreso de dinero");
            System.out.println("2. Retiro normal de dinero");
            System.out.println("3. Retiro express de dinero (valido hasta un 20% del saldo)");
            System.out.println("4. Consultar saldo disponible");
            System.out.println("5. Consultar datos de cuenta");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción : ");
            opc = leer.nextInt();
            System.out.println("-------------------------------");
            switch (opc) {
                case 1:
                    System.out.println("Ingresa el monto a depositar :");
                    ver.ingresarDinero(leer.nextInt());
                    break;
                case 2:
                    System.out.println("Ingresa el monto a retirar :");
                    ver.retiroDinero(leer.nextInt());
                    break;
                case 3:
                    ver.retiroExpress();
                    break;
                case 4:
                    ver.consultarSaldo();
                    break;
                case 5:
                    ver.consultarDatos();
                    break;
            }
        } while (opc != 6);
        System.out.println("Saliendo ...");
    }
}
