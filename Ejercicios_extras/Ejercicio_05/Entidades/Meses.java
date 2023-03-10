package Ejercicios_extras.Ejercicio_05.Entidades;

import java.util.Arrays;

public class Meses {
    private String meses[];
    private String mesSecreto;

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "Meses{" + "meses=" + Arrays.toString(meses) + ", mesSecreto=" + mesSecreto + '}';
    }
    
    public Meses activarJuego() {
        Meses juego = new Meses();
        String mesesDelAno[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        this.meses = mesesDelAno;
        int posicion = (int) (Math.random() * 11);
        this.mesSecreto = mesesDelAno[posicion];
        return juego;
    }
}
