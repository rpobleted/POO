package Ejercicios_practicos.Ejercicio_08;

import Ejercicios_practicos.Ejercicio_08.Entidad.Cadena;
import java.util.Scanner;

public class Ejercicio_08 {

    /**
     * //Realizar una clase llamada Cadena que tenga como atributos una frase
     * (de tipo de //String) y su longitud. En el main se creará el objeto y se
     * le pedirá al usuario que ingrese //una frase que puede ser una palabra o
     * varias palabras separadas por un espacio en //blanco y a través de los
     * métodos set, se guardará la frase y la longitud de manera //automática
     * según la longitud de la frase ingresada. Deberá además implementar los
     * //siguientes métodos: //a) Método mostrarVocales(), deberá contabilizar
     * la cantidad de vocales que tiene la //frase ingresada. //b) Método
     * invertirFrase(), deberá invertir la frase ingresada y mostrarla por
     * pantalla. Por //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     * //c) Método vecesRepetido(String letra), recibirá un carácter ingresado
     * por el usuario y //contabilizar cuántas veces se repite el carácter en la
     * frase, por ejemplo: //d) Entrada: frase = "casa blanca". Salida: El
     * carácter 'a' se repite 4 veces. //e) Método compararLongitud(String
     * frase), deberá comparar la longitud de la frase que //compone la clase
     * con otra nueva frase ingresada por el usuario. //f) Método
     * unirFrases(String frase), deberá unir la frase contenida en la clase
     * Cadena //con una nueva frase ingresada por el usuario y mostrar la frase
     * resultante. //g) Método reemplazar(String letra), deberá reemplazar todas
     * las letras “a” que se //encuentren en la frase, por algún otro carácter
     * seleccionado por el usuario y mostrar //la frase resultante. //h) Método
     * contiene(String letra), deberá comprobar si la frase contiene una letra
     * que //ingresa el usuario y devuelve verdadero si la contiene y falso si
     * no.
     *
     * @param args
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena frase1 = new Cadena();

        System.out.println("Ingrese una palabra o frase");
        frase1.setFrase(leer.next()); //Constructor modificado para que calcule largo enseguida.

        // Contabilizar la cantidad de vocales de la frase.
        frase1.mostrarVocales();

        // Invertir frase.
        frase1.invertirFrase();

        // Contabilizar repeticiones de una letra ingresada por el usuario
        System.out.println("*** CANTIDAD DE VOCALES ***");
        System.out.println("Ingresa una letra para evaluar si esta repetida en la frase");
        frase1.vecesRepetido(leer.next());

        // Comparar longitud frase de a clase con una nueva frase ingresada por el usuario.
        System.out.println("*** COMPARACION DE LONGITUD ***");
        System.out.println("Ingresa una letra para evaluar si esta repetida en la frase");
        frase1.compararLongitud(leer.next());

        // Unir 2 frases
        System.out.println("*** UNIR DOS STRINGS ***");
        System.out.println("Ingresa un nueva frase para unir a la frase anterior");
        frase1.unirFrases(leer.next());

        // Reemplazar todas las letras "a" se encuentren en la frase por un caracter ingresado por el usuario.
        System.out.println("*** REEMPLAZAR ***");
        System.out.println("Ingresa una letra que reemplazara las letras 'a' ");
        frase1.reemplazar(leer.next());

        // Comprueba si la frase contiene una letra (ingresada por el usuario)
        System.out.println("*** COMPROBAR SI CONTIENE ***");
        System.out.println("Ingresa una letra para evaluar si existe en la frase ");
        frase1.contiene(leer.next());

    }

}
