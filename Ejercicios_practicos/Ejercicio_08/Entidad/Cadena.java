package Ejercicios_practicos.Ejercicio_08.Entidad;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public Cadena setFrase(String frase) {
        Cadena objeto = new Cadena();
        this.frase = frase;
        longitud = frase.length(); //Modificación de constructor por defecto para hacer el calculo de largo.
        return objeto;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * Metodo sin parametros, sin retorno. Bucle que recorre la frase completa
     * caracter a caracter, evaluando si es una vocal, de encontrarlas la suma a
     * un acumulador que se mostrara al finalizar el metodo.
     *
     */
    public void mostrarVocales() {
        int total_vocales = 0;
        for (int j = 0; j < longitud; j++) {
            char vocal = frase.charAt(j);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                total_vocales++;
            }
        }
        System.out.println("*** CANTIDAD DE VOCALES ***");
        System.out.println("Total   :" + total_vocales);
    }

    /**
     * Metodo sin parametros, sin retorno. Bucle para recorrer la frase, extraer
     * caracter a caracter y almacenarlo en una variable String vacia (el bucle
     * corre alreves para poder dejar de manera invertida la frase).
     */
    public void invertirFrase() {
        String frase_invertida = "";
        for (int i = (longitud - 1); i >= 0; i--) {
            frase_invertida += frase.charAt(i);
        }
        System.out.println("*** FRASE INVERTIDA ***");
        System.out.println("Entrada   : " + frase);
        System.out.println("Salida    : " + frase_invertida);
    }

    /**
     * <frase>.charAt(i) // i = posición de caracter en la frase
     * String.valueOf(<'caracter'>) pasa el valor de caracter a String y luego
     * permite comparar 2 String (no se puede comparar un char con un string).
     * Este metodo permite contabilizar cuantas veces esta repetido un caracter
     * seleccionado por el usuario en la frase.
     *
     * @param letra
     */
    public void vecesRepetido(String letra) {
        int repeticiones = 0;
        for (int j = 0; j < longitud; j++) {
            char vocal = frase.charAt(j);
            if (String.valueOf(vocal).equals(letra)) { //String.valueof() -> convertir caracter a String para evaluar.
                repeticiones++;
            }
        }
        System.out.println("Total   :" + repeticiones);
    }

    /**
     * Metodo por parametro, sin retorno. Comparar la longitud de 2 frases.
     *
     * @param frase2
     */
    public void compararLongitud(String frase2) {
        int longitud2 = frase2.length();
        if (longitud == longitud2) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases tienen distinta longitud");
        }
    }

    /**
     * Metodo por parametro, sin retorno.
     * <string1>.contac(<string2>)
     *
     * @param frase2
     */
    public void unirFrases(String frase2) {
        frase2 = frase.concat(frase2);
        System.out.println(frase2);
    }

    /**
     * Metodo por parametro, sin retorno. creamos una frase3 que contenga la
     * operación <frase>.replace("caracter antiguo","caracter nuevo"). Mostrar
     * por pantalla la nueva frase.
     *
     * @param letra
     */
    public void reemplazar(String letra) {
        String frase3 = frase.replace("a", letra);
        System.out.println(frase3);
    }

    /**
     * Metodo por parametro, sin retorno.
     * <String>.contains("String") // retorna un valor verdadero si encuentra y
     * falso si no la encuentra.
     *
     * @param letra
     */
    public void contiene(String letra) {
        if (frase.contains(letra)) {
            System.out.println("Contiene la letra");
        } else {
            System.out.println("No contiene la letra");
        }
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
}
