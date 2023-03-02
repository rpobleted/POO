package Ejercicios_practicos.Ejercicio_12.Services;

import Ejercicios_practicos.Ejercicio_12.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo para crear objeto principal con un paramtro tipo Date.
     *
     * @return objeto
     */
    public Persona crearPersona() {

        Persona objeto = new Persona();

        System.out.println("Ingrese nombre");
        objeto.setNombre(leer.next());

        System.out.println("Ingrese fecha de nacimiento");
        System.out.print("Año  : ");
        int anio = leer.nextInt() - 1900; // Conversion al año actual ya que inicia desde 1900
        System.out.print("Mes  : ");
        int mes = leer.nextInt();
        System.out.print("Dia  : ");
        int dia = leer.nextInt();
        Date fecha = new Date(anio, mes, dia); //Se instancia otro objeto dentro del objeto.
        objeto.setFechaNacimiento(fecha);
        return objeto;
    }

    /**
     * El metodo recibe el objeto desde el main Calcular la edad en base a la
     * fecha en el objeto de origen y la fecha actual.
     *
     * @param objeto
     * @return
     */
    public int calcularEdad(Persona objeto) {
        Date fechaActual = new Date();
        System.out.println("----------------");
        System.out.print("Edad: ");
        int edad = (fechaActual.getYear()) - (objeto.getFechaNacimiento().getYear());
        System.out.println(edad);
        System.out.println("---------------");
        return edad;
    }

    /**
     * Metodo recibe como parametro el resultado del metodo anterior almacenado
     * en la variable edad y recibe un nuevo parametro int para hacer una
     * comparación y evaluar quien es mayor.
     *
     * @param edad
     * @param valor
     */
    public void menorQue(int edad) {

        System.out.print("Ingresa una nueva edad para comparar si es menor : ");
        int valor = leer.nextInt();
        if (edad > valor) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
    }

    /**
     * Metodo que recibe el objeto completo y muestra por pantalla su contenido.
     *
     * @param objeto
     */
    public void mostrarPersona(Persona objeto) {
        System.out.println("--------------------------");
        System.out.println("DATOS PERSONALES");
        System.out.println("Nombre           : " + objeto.getNombre());
        System.out.println("Fecha nacimiento : " + objeto.getFechaNacimiento().getDate() + "/" + objeto.getFechaNacimiento().getMonth() + "/" + objeto.getFechaNacimiento().getYear());
    }
}
