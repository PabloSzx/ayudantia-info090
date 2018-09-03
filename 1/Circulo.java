import java.util.Scanner;

public class Circulo {
  private double radio = 12;
  private int color = 3;
  //
  public double getRadio() {
    return radio;
  }
  public double getArea() {
    return Math.PI * radio * radio;
  }
  public int getColor() {
    return color;
  }
  public void setRadio() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresa radio de este circulo: ");
    radio = teclado.nextDouble();
    teclado.close();
  }

}
