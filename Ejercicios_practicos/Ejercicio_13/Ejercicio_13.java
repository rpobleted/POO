package Ejercicios_practicos.Ejercicio_13;

import Ejercicios_practicos.Ejercicio_13.Entidades.Curso;
import Ejercicios_practicos.Ejercicio_13.Services.CursoService;

public class Ejercicio_13 {

    public static void main(String[] args) {

        CursoService sv = new CursoService();
        Curso curso = new Curso();
        curso = sv.crearCurso();
        sv.calcularGananciaSemanal(curso);
    }
}
