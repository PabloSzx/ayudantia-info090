import java.util.Scanner;

public abstract class Cliente {

  //Instance variables

  private String nombre;
  private String rut;
  private boolean deudor;
  protected int saldoVista;
  protected int saldoCredito;
  protected int saldoCreditoInicial;
  private int comision;

  //Instance methods

  public String getNombre() {
    //Codigo
  }

  public void setDeudor(boolean bool) {
    //Codigo
  }

  public boolean getDeudor() {
    //Codigo
  }

  public int getComision() {
    //Codigo
  }

  public int getSaldoCreditoInicial() {
    //Codigo
  }

  //Abstract methods

  public abstract void depositar(int n, String type);

  public abstract void retirar(int n, String type);

  public abstract int getSaldo(String type);

  public abstract void resetCredito();

  public abstract void resetCredito(int n);

  public abstract void getInfo();

  //Constructor

  public Cliente() {
    
    //Codigo constructor cliente por default
  }

}
