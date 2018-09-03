import java.util.Scanner;

public class Personas {
  private String Nombre;
  private boolean paga;
  public void setPago(int num) {
    if (num < 10) {
      paga = false;
    } else {
      paga = true;
    }
  }
  public boolean getPago() {
    return paga;
  }
  public void setNombre() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresa tu nombre: ");
    Nombre = teclado.nextLine();
  }
  public String getNombre() {
    return Nombre;
  }
}
