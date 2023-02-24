package Ejercicios_practicos.Ejercicio_07.Services;

import Ejercicios_practicos.Ejercicio_07.Entidad.Persona;
import java.util.Scanner;

public class PersonaService {

    // Creación de un objeto del tipo Clase Scanner, que permitira el ingreso de datos por teclado. 
    // Creación de un objeto del tipo Clase Persona.
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona objeto = new Persona();

    /**
     * Metodo sin parametros, sin retorno Este permite el ingreso manual del
     * usuario de todos los atributos de objeto. Contempla un validador para el
     * atributo sexo para 3 opciones del tipo char.
     *
     */
    public Persona crearPersona() {
        char letra;
        System.out.println("**** INGRESO DE FICHA PERSONAL ****");
        System.out.print("Nombre y apellido : ");
        objeto.setNombre(leer.next());
        System.out.print("Edad [años]       : ");
        objeto.setEdad(leer.nextInt());
        do {
            System.out.print("Sexo [h-m-o]      : ");
            letra = leer.next().charAt(0); 
            if (Character.compare(letra, 'h') == 0 || Character.compare(letra, 'm') == 0 || Character.compare(letra, 'o') == 0) {
                objeto.setSexo(letra);
                break;
            } else {
                System.out.println("Ingreso incorrecto. Vuelva a intentar");
            }
        } while (true);
        System.out.print("Peso [Kg]         : ");
        objeto.setPeso(leer.nextFloat());
        System.out.print("Altura [mts]      : ");
        objeto.setAltura(leer.nextFloat());
        return objeto;
    }

    /**
     * Metodo sin parametros, sin retorno. Este realiza el calculo y
     * clasificación del IMC de cada objeto (Paciente), usa 3 niveles de
     * clasificación
     *
     * @return respuesta.(tipo entero)
     */
    public int calcularImc() {
        int respuesta = 0;
        float imc;
        imc = objeto.getPeso() / (objeto.getAltura() * objeto.getAltura());
        if (imc < 20) {
            respuesta = -1; //Bajo peso.
        }
        if (imc >= 20 && imc <= 25) {
            respuesta = 0; // Peso ideal.
        }
        if (imc > 25) {
            respuesta = 1; // Sobre peso.
        }
        return respuesta;
    }

    /**
     * Metodo sin parametos, sin retirno. Este realiza calculo y clasificación
     * de la edad del objeto (Paciente), para saber si es mayor o menor de edad.
     *
     * @return respuesta.(tipo logica)
     */
    public boolean esMayorDeEdad() {
        boolean respuesta = false;
        if (objeto.getEdad() >= 18) { //Condición mayor = 18 años.
            respuesta = true; // Mayor de edad.
        } else {
            respuesta = false; // Menor de edad.
        }
        return respuesta;
    }
}
