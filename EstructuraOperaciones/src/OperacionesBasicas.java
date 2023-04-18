import java.util.Scanner;

public class OperacionesBasicas {
    
    private double resultado;

    public void Suma(double a, double b) {
        resultado = a + b;
    }

    public void Resta(double a, double b) {
        resultado = a - b;
    }

    public void Multiplicacion(double a, double b) {
        resultado = a * b;
    }

    public void Division(double a, double b) {
        resultado = a / b;
    }

    public void Resultado(double a, double b) {
        System.out.printf("El resultado es: %5.5f", resultado);
    }
}