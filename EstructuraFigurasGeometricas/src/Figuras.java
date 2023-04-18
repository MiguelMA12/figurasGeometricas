
import javax.swing.JOptionPane;

/**
 *
 * @author ayeri
 */
public class Figuras {
    
  double area;

  
  public void AreaCirculo(double radio) {
    area = Math.PI * radio * radio;
    JOptionPane.showMessageDialog(null, "El área del círculo es: " + String.format("%.2f", area));
  }

  
  public void AreaCuadrado(double lado) {
    area = lado * lado;
    JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + String.format("%.2f", area));
  }

  
  public void AreaTriangulo(double base, double altura) {
    area = (base * altura) / 2;
    JOptionPane.showMessageDialog(null, "El área del triángulo es: " + String.format("%.2f", area));
  }

  
  public void AreaRectangulo(double base, double altura) {
    area = base * altura;
    JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + String.format("%.2f", area));
  }

  
  public void AreaEsfera(double radio) {
    area = 4 * Math.PI * radio * radio;
    JOptionPane.showMessageDialog(null, "El área de la esfera es: " + String.format("%.2f", area));
  }

  
  public void AreaCubo(double arista) {
    area = 6 * arista * arista;
    JOptionPane.showMessageDialog(null, "El área del cubo es: " + String.format("%.2f", area));
  }
}
