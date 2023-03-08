package Ejercicios_practicos.Ejercicio_14.Services;

import Ejercicios_practicos.Ejercicio_14.Entidades.Movil;
import java.util.Scanner;

public class MovilService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Movil cargarCelular() {
        Movil objeto = new Movil();
        System.out.print("Ingresa Marca : ");
        objeto.setMarca(leer.next());
        System.out.print("Ingrese Precio : ");
        objeto.setPrecio(leer.nextDouble());
        System.out.print("Ingrese Modelo : ");
        objeto.setModelo(leer.next());
        System.out.print("Ingrese Memoria RAM : ");
        objeto.setMemoriaRam(leer.nextInt());
        System.out.print("Ingrese Almacenamiento : ");
        objeto.setAlmacenamiento(leer.nextInt());
        objeto.setCodigo(cargarCodigo());
        return objeto;
    }

    /**
     *
     * @return
     */
    public String[] cargarCodigo() {
        String[] codigo = new String[7];
        String codigo_largo;
        do {
            System.out.print("Ingresa el codigo de 7 digitos númericos : ");
            codigo_largo = leer.next();
        } while (codigo_largo.length()!=7);

        for (int i = 0; i < 7; i++) {
            codigo[i] = codigo_largo.substring(i, i + 1);
        }
        return codigo;
    }
}
