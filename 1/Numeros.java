import java.util.Random;

public class Numeros {
  private int valor;
  // Asigna un número entre 0 y 50 para 'valor'
  public void setAsigna() {
    Random crear = new Random();
    valor = crear.nextInt(50);
  }

  //Retorna número asignado a 'valor'
  public int getAsigna() {
    return valor;
  }
}
