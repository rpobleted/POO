package Ejercicios_practicos.Ejercicio_13.Services;

import Ejercicios_practicos.Ejercicio_13.Entidades.Curso;
import java.util.Scanner;

public class CursoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String[] cargarAlumnos() {
        System.out.println("*** Ingreso de alumnos ***");
        String[] arreglo = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno #" + (i + 1));
            arreglo[i] = leer.next();
        }
        return arreglo;
    }

    public Curso crearCurso() {
        Curso objeto = new Curso();
        System.out.println("**** CARGA DE CURSOS ****");
        System.out.print("Ingrese nombre del curso :");
        objeto.setNombreCurso(leer.next());
        System.out.print("Cantidad de horas por día :");
        objeto.setCantidadDeHorasPorDia(leer.nextInt());
        System.out.print("Cantidad de dias por semana :");
        objeto.setCantidadDiasPorSemana(leer.nextInt());
        System.out.print("Turno AM o PM :");
        boolean salir = true;
        do {
            String validador = leer.next();
            if (validador.equalsIgnoreCase("AM") || validador.equalsIgnoreCase("PM")) {
                objeto.setTurno(validador);
                salir = false;
            } else {
                System.out.println("Ingreso invalido, vuelva a intentar");
            }
        } while (salir);
        System.out.print("Precio por hora trabajada :");
        objeto.setPrecioPorHora(leer.nextDouble());
        objeto.setAlumnos(cargarAlumnos());
        return objeto;
    }

    public void calcularGananciaSemanal(Curso curso) {
        double valor;
        valor = curso.getCantidadDeHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getPrecioPorHora() * curso.getAlumnos().length;
        System.out.println("Las ganacias semanales son : $" + valor);
    }
}
