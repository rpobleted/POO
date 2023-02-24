package Ejercicios_practicos.Ejercicio_07;

import Ejercicios_practicos.Ejercicio_07.Services.PersonaService;
import java.util.Scanner;

public class Ejercicio_07 {
//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
//atributo, puede hacerlo. Los métodos que se implementarán son

//a) Un constructor por defecto.
//b) Un constructor con todos los atributos como parámetro.
//c) Métodos getters y setters de cada atributo.
//d) Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
//e) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
//significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
//persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
//f)Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
    public static void main(String[] args) {

        // Crear un objeto del tipo scanner para poder recibir parametros desde el teclado.
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // Solicitud de cantidad de objetos ("pacientes") que deseamos crear.
        System.out.println("Ingrese la cantidad de pacientes");
        int n = leer.nextInt();

        // Creamos un objeto del tipo vector con los atributos de la Clase Persona
        PersonaService vector[] = new PersonaService[n];

        // Creamos 2 vectores que nos ayudaran a almacenar los retornos de los resultados de IMC y EDADES.
        int imc[] = new int[n];
        boolean edades[] = new boolean[n];

        // Implementamos un bucle for para que de n vueltas de acuerdo a la cantidad de objetos (pacientes) que debemos crear.
        for (int i = 0; i < n; i++) {
            System.out.println("Ingreso Paciente N°" + (i + 1));
            vector[i] = new PersonaService();
            vector[i].crearPersona();
            imc[i] = vector[i].calcularImc();
            edades[i] = vector[i].esMayorDeEdad();
        }

        // Implementamos un procedimiento (por parametros, sin retorno) dentro del mismo main.
        estadisticas(imc, edades, n);
    }

    /**
     * Procedimiento por parametros, sin retorno. Este clasificara en 3 niveles
     * el IMC (bajo peso, peso ideal y sobre peso) y en 2 las edades (mayor de
     * edad y menor de edad) a traves de contadores que iran incrementando a
     * medida que la condiciones se vayan cumpliendo. Los resultados son
     * mostrados por pantalla con sus respectivos porcentajes.
     *
     */
    public static void estadisticas(int[] imc, boolean[] edades, int n) {
        int i;
        float bajo_peso = 0;
        float peso_ideal = 0;
        float sobre_peso = 0;
        float mayores = 0;
        float menores = 0;
        for (i = 0; i < n; i++) {
            if (imc[i] == (-1)) {
                bajo_peso++;
            }
            if (imc[i] == (0)) {
                peso_ideal++;
            }
            if (imc[i] == (1)) {
                sobre_peso++;
            }
            if (edades[i] == false) {
                menores++;
            } else {
                mayores++;
            }
        }
        System.out.println("-----------------------------");
        System.out.println("*** Estadisticas ***");
        System.out.println("-----------------------------");
        System.out.println("De acuerdo al peso:");
        System.out.println("Bajo peso  : " + bajo_peso + " -> " + (bajo_peso / n) * 100 + "%");
        System.out.println("Bajo ideal : " + peso_ideal + " -> " + (peso_ideal / n) * 100 + "%");
        System.out.println("Sobre peso : " + sobre_peso + " -> " + (sobre_peso / n) * 100 + "%");
        System.out.println("-----------------------------");
        System.out.println("De acuerdo a mayoria de edad:");
        System.out.println("Menores    :" + menores + " -> " + (menores / n) * 100 + "%");
        System.out.println("Mayores    :" + mayores + " -> " + (mayores / n) * 100 + "%");
    }
}
