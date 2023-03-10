package Ejercicios_extras.Ejercicio_04.Servicios;

import Ejercicios_extras.Ejercicio_04.Entidades.Nif;
import java.util.Scanner;

public class NifServicio {

    public Nif crearNif() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Nif objeto = new Nif();
        System.out.println("Ingrese el DNI a registrar : ");
        objeto.setDNI(leer.nextLong());
        int posicion = (int) ((objeto.getDNI()) % 23);
        objeto.setLetra(buscarLetra(posicion));
        return objeto;
    }
    
    public void mostrar(Nif objeto){
        System.out.println("EL DNI INCLUIDO DIGITO VERIFICADOR ES:");
        System.out.println(objeto.getDNI()+"-"+objeto.getLetra());
    }

    public static char buscarLetra(int posicion) {
        char vector[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return vector[posicion];
    }

}
