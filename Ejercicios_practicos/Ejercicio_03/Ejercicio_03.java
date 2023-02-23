package Ejercicios_practicos.Ejercicio_03;

public class Ejercicio_03 {

    // Crear una clase llamada Operacion que tenga como atributos privados
    //numero1 y numero2. A continuación, se deben crear los siguientes métodos:
    //
    //a) Método constructor con todos los atributos pasados por parámetro.
    //b) Metodo constructor sin los atributos pasados por parámetro. 
    //c) Métodos get y set. 
    //d) Método para crearOperacion(): que le pide al usuario los
    //dos números y los guarda en los atributos del objeto. 
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main 
    //g) Método multiplicar(): primero valida que no se haga una
    //multiplicación por cero, si fuera a multiplicar por cero, el método
    //devuelve 0 y se le informa al usuario el error. Si no, se hace la
    //multiplicación y se devuelve el resultado al main 
    //h) Método dividir():primero valida que no se haga una división por cero, si fuera a pasar una
    //división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve
    //el resultado al main.
    public static void main(String[] args) {

        Operacion objeto1 = new Operacion();

        // Ingreso de números y almacenado en objeto
        objeto1.crearOperacion();

        //Calculo SUMA
        System.out.println("La suma de los número es : " + objeto1.sumar());

        //Calculo RESTA
        System.out.println("La resta de los número es : " + objeto1.resta());
       
        //Calculo MULTIPLICACION
        System.out.println("La multiplicación de los número es : " + objeto1.multiplicacion());
        
        //Calculo DIVISION
        System.out.println("La división de los número es : " + objeto1.division());
        
    }

}
