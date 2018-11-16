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
    return this.nombre;
  }

  public String getRut() {
    return this.rut;
  }

  public void setDeudor(boolean bool) {
    this.deudor = bool;
  }

  public boolean getDeudor() {
    return this.deudor;
  }

  public int getComision() {
    return this.comision;
  }

  public int getSaldoCreditoInicial() {
    return this.saldoCreditoInicial;
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
    // System.out.print("\nIngrese Nombre del cliente: ");
    // this.nombre = keyboard.nextLine();
    this.nombre = Input.requestInput("Ingrese Nombre del cliente: ");
    // System.out.print("\nIngrese RUT del cliente: ");
    // this.rut = keyboard.nextLine();
    this.rut = Input.requestInput("Ingrese RUT del cliente: ");
    this.deudor = false;
    this.saldoVista = 0;
    this.saldoCredito = 0;
    this.saldoCreditoInicial = 0;
    this.comision = 50;

    //Codigo constructor cliente por default
  }

}
