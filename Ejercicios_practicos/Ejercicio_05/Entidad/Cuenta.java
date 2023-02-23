package Ejercicios_practicos.Ejercicio_05.Entidad;

public class Cuenta {
    private int numero_cuenta;
    private long dni;
    private int saldo_actual;
    private int interes;

    // CONSTRUCTOR VACIO
    public Cuenta() {
    }

    // CONSTRUCTOR POR MEDIO DE PARAMETROS
    public Cuenta(int numero_cuenta, long dni, int saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.dni = dni;
        this.saldo_actual = saldo_actual;
    }

    // METODOS GET Y SET
    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(int saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

}
