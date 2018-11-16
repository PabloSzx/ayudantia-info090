import java.util.Scanner;

public class Persona extends Cliente {

  //Instance variables

  private boolean cuentaVista;
  private boolean cuentaCredito;

  //Instance methods

  public void habilitarCuenta(String type) {
    //Codigo
  }

  public void deshabilitarCuenta(String type) {
    //Codigo
  }

  public boolean checkCuenta(String type) {
    //Codigo
  }

  //Abstract implementations

  public void depositar(int n, String type) {
    //Codigo
  }

  public void retirar(int n, String type) {
    //Codigo
  }

  public int getSaldo(String type) {
    //Codigo
  }

  public void resetCredito() {
    //Codigo
  }

  public void resetCredito(int n) {
    //Codigo
  }

  public void getInfo() {
    //Codigo
  }

  //Constructors

  public Persona() {
    //Codigo Constructor
  }

  public Persona(int actual, int maximo) {
    //Codigo Constructor para Estudiante
  }
}
