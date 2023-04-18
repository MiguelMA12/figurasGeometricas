
import java.util.Scanner;

public class Numeros {

    private Scanner scanner = new Scanner(System.in);
    private OperacionesBasicas operaciones = new OperacionesBasicas();

    public void menu() {
        double a, b;
        System.out.println("escribe el primer numero: ");
        a = scanner.nextDouble();
        System.out.println("escribe el segundo numero: ");
        b = scanner.nextDouble();

        System.out.println("Seleccione una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        int opcion = scanner.nextInt();
        if (opcion == 1) {
            operaciones.Suma(a, b);
        } else if (opcion == 2) {
            operaciones.Resta(a, b);
        } else if (opcion == 3) {
            operaciones.Multiplicacion(a, b);
        } else if (opcion == 4) {
            operaciones.Division(a, b);
        } else {
            System.out.println("Opcion invalida");
            return;
        }
        operaciones.Resultado(a, b);
    }
}
 