
import javax.swing.JOptionPane;

public class Datos {

    Figuras fig = new Figuras();
    int opcion = 0;

    public void menu() {
        double radio, lado, base, altura, arista;
    opcion=Integer.parseInt(JOptionPane.showInputDialog(
            "elija que figura desea sacar el area:\n. 1.Circulo\n. 2.Cuadrado\n. 3.Triangulo\n. 4.Rectangulo\n. 5.Esfera\n. 6.Cubo\n"
    ));
    
        
    

        if (opcion == 1) {
            radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del círculo: "));
            fig.AreaCirculo(radio);

        } else if (opcion == 2) {
            lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el lado del cuadrado: "));
            fig.AreaCuadrado(lado);
        } else if (opcion == 3) {
            base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del triángulo: "));
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del triángulo: "));
            fig.AreaTriangulo(base, altura);
        } else if (opcion == 4) {
            base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del rectángulo: "));
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del rectángulo: "));
            fig.AreaRectangulo(base, altura);
        } else if (opcion == 5) {
            radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de la esfera: "));
            fig.AreaEsfera(radio);

        } else if (opcion == 6) {
            arista = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la arista del cubo: "));
            fig.AreaCubo(arista);
        }
        else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion valida.");
        }

    }
}
