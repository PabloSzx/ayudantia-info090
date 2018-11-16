import java.util.Scanner;

public class Estudiante extends Persona {

  //Instance variables

  private int semestreActual;
  private int semestreMaximo;

  //Instance methods

  public void setSemestreActual(int n) {
    this.semestreActual = n;
  }

  public int getSemestreActual() {
    return this.semestreActual;
  }

  public int getSemestreMaximo() {
    return this.semestreMaximo;
  }

  //Constructor
  public Estudiante(int actual, int maximo) {
    super(actual, maximo);
  }
}
