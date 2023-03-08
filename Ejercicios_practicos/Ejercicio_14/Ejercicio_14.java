package Ejercicios_practicos.Ejercicio_14;

import Ejercicios_practicos.Ejercicio_14.Entidades.Movil;
import Ejercicios_practicos.Ejercicio_14.Services.MovilService;

public class Ejercicio_14 {

    /**
     *
     * Una tienda que vende teléfonos móviles quiere tener registro de cada
     * producto que posee en un sistema computacional. Para ello, crearemos un
     * programa donde se pueda almacenar cada producto con su información. Crear
     * una entidad Movil con los atributos marca, precio, modelo, memoriaRam,
     * almacenamiento y codigo. El atributo código será un arreglo numérico de
     * dimensión 7 (siete) donde cada subíndice alojará un número
     * correspondiente al código. A continuación, se implementarán los
     * siguientes métodos:  Un constructor por defecto.  Un constructor con
     * todos los atributos como parámetro.  Métodos getters y setters de cada
     * atributo.  Método cargarCelular(): se solicita al usuario que ingrese
     * los datos necesarios para instanciar un objeto Celular y poder cargarlo
     * en nuestro programa.  Método ingresarCodigo(): este método permitirá
     * ingresar el código completo de siete números de un celular. Para ello,
     * puede utilizarse un bucle repetitivo
     *
     */
    public static void main(String[] args) {

        MovilService sv = new MovilService();
        Movil celular1 = new Movil();
        
        celular1 = sv.cargarCelular();
        System.out.println(celular1.toString());
    }
}
