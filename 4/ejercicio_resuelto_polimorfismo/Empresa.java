import java.util.Scanner;

public class Empresa extends Cliente {

  //Instance variables

  private boolean finesDeLucro;
  private String sector;
  private int numeroDeEmpleados;

  //Instance methods

  public void setNumeroDeEmpleados(int n) {
    this.numeroDeEmpleados = n;
  }

  public int getNumeroDeEmpleados() {
    return this.numeroDeEmpleados;

  }

  //Abstract implementations

  public void depositar(int n, String type) {
    switch (type) {
      case "vista":
        this.saldoVista = this.saldoVista + n;
        break;
      case "credito":
        this.saldoCredito = this.saldoCredito + n;
        break;
      default:
        System.out.println("Error! no se identifico el tipo de cuenta a depositar");
    }

  }

  public void retirar(int n, String type) {
    switch (type) {
      case "vista":
        this.saldoVista = this.saldoVista - n;
        break;
      case "credito":
        this.saldoCredito = this.saldoCredito - n;
        break;
      default:
        System.out.println("Error! no se identifico el tipo de cuenta a retirar");
    }
  }

  public int getSaldo(String type) {
    switch (type) {
      case "vista":
        return this.saldoVista;
      case "credito":
        return this.saldoCredito;
      default:
        return 0;
    }

  }

  public void resetCredito() {
    this.saldoCredito = this.saldoCreditoInicial;
  }

  public void resetCredito(int n) {
    this.saldoCreditoInicial = n;
    this.saldoCredito = this.saldoCreditoInicial;
  }

  public void getInfo() {
    System.out.println("El nombre de la empresa es ".concat(this.getNombre()));
    System.out.println("El rut de la empresa es ".concat(this.getRut()));

    if (!finesDeLucro) {
      System.out.println("\n\nLa empresa ".concat(this.getNombre()).concat(" no es con fines de lucro"));
    } else {
      System.out.println("\n\nLa empresa ".concat(this.getNombre()).concat(" es con fines de lucro"));
    }
    System.out.println("Su sector es ".concat(this.sector));
    if (numeroDeEmpleados < 10 ) {
      System.out.println("Y es una microempresa");
    } else if (numeroDeEmpleados < 49) {
      System.out.println("Y es una pequeña empresa");
    } else if (numeroDeEmpleados < 249) {
      System.out.println("Y es una mediana empresa");
    } else {
      System.out.println("Y es una gran empresa");
    }

    System.out.println("Con saldo credito ".concat(Integer.toString(this.saldoCredito)));
    System.out.println("Con saldo credito inicial ".concat(Integer.toString(this.saldoCreditoInicial)));
    System.out.println("Con saldo vista ".concat(Integer.toString(this.saldoVista)));

  if (this.getDeudor()) {
    System.out.println("Y es deudor");
  }

  }

  //Constructor


  public Empresa() {
    Scanner keyboard = new Scanner(System.in);

    boolean input = true;
    int deposit;
    String account = "";

    while (input) {
      System.out.print("\nIndique si su empresa es con fines de lucro (\"Si\"/\"No\"): ");
      switch (keyboard.nextLine().toLowerCase()) {
        case "si":
          this.finesDeLucro = true;
          input = false;
          break;
        case "no":
          this.finesDeLucro = false;
          input = false;
          break;
        default:
          System.out.println("Error! Indique escribiendo \"Si\" o \"No\"");
      }
    }

    System.out.print("\nIndique el sector empresarial: ");
    this.sector = keyboard.nextLine();

    this.numeroDeEmpleados = requestIntInput("Indique el numero de empleados: ");

    account = "vista";
    this.depositar(requestIntInput("Ingrese la cantidad del deposito inicial a la cuenta vista: "), account);

    account = "credito";
    this.resetCredito(requestIntInput("Ingrese la cantidad de credito inicial: "));


  }

}
