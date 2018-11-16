public class Persona extends Cliente {

  //Instance variables

  private boolean cuentaVista;
  private boolean cuentaCredito;

  //Instance methods

  public void habilitarCuenta(String type) {
    switch (type) {
      case "vista":
        this.cuentaVista = true;
        break;
      case "credito":
        this.cuentaCredito = true;
        break;
    }
  }

  public void deshabilitarCuenta(String type) {
    switch (type) {
      case "vista":
        this.cuentaVista = false;
        break;
      case "credito":
        this.cuentaCredito = false;
        break;
    }
  }

  public boolean checkCuenta(String type) {
    switch (type) {
      case "vista":
        return this.cuentaVista;
      case "credito":
        return this.cuentaCredito;
      default:
        return false;
    }
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
        System.out.println("Error! no se identifico el tipo de cuenta a depositar");

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
    System.out.println("\n\nEl nombre del cliente es ".concat(this.getNombre()));
    System.out.println("El rut del cliente es ".concat(this.getRut()));
    if (this.checkCuenta("credito")) {
      System.out.println("El cliente tiene cuenta de Credito");
      System.out.println("Con saldo ".concat(Integer.toString(this.saldoCredito)));
      System.out.println("Con saldo inicial ".concat(Integer.toString(this.saldoCreditoInicial)));

    }
    if (this.checkCuenta("vista")) {
      System.out.println("El cliente tiene cuenta Vista");
      System.out.println("Con saldo ".concat(Integer.toString(this.saldoVista)));
    }
    if (this.getDeudor()) {
      System.out.println("Y es deudor");
    }
  }

  //Constructores

  public Persona() {
    boolean input = true;
    int deposit;
    String account = "";
    while (input) {
      try {
        account = Input.requestInput("Ingrese con que tipo de cuenta desea ingresar la persona al banco (\"Vista\" o \"Credito\"): ").toLowerCase();
        switch (account) {
          case "vista":
            this.habilitarCuenta("vista");
            input = false;
            break;
          case "credito":
            this.habilitarCuenta("credito");
            input = false;
            break;
          default:
            System.out.println("Error, No se identificó el tipo de cuenta, debe ingresar un tipo!");
        }
      } catch (Exception e) {
        System.out.println("Error, No se identificó el tipo de cuenta, debe ingresar un tipo!");
      }
    }

    if (account.equalsIgnoreCase("vista")) {
      this.depositar(Input.requestIntInput("Ingrese la cantidad del deposito inicial: "), account);
    } else {
      this.resetCredito(Input.requestIntInput("Ingrese la cantidad del credito inicial: "));
    }

  }

  public Persona(int actual, int maximo) {
    //Codigo Constructor para Estudiante
    boolean input = true;
    int deposit;
    String account = "";

    if (actual >= (maximo - 2)) {
      while (input) {
          account = Input.requestInput("Ingrese que cuenta desea ingresar (\"Vista\" o \"Credito\"): ").toLowerCase();
          switch (account) {
            case "vista":
              this.habilitarCuenta("vista");
              input = false;
              break;
            case "credito":
              this.habilitarCuenta("credito");
              input = false;
              break;
            default:
              System.out.println("Error, No se identificó el tipo de cuenta, debe ingresar un tipo!");
          }
        }

      if (account.equalsIgnoreCase("vista")) {
        this.depositar(Input.requestIntInput("Ingrese la cantidad del deposito inicial: "), account);
      } else {
        this.resetCredito(Input.requestIntInput("Ingrese la cantidad del credito inicial: "));
      }

    } else {
      account = "vista";
      this.depositar(Input.requestIntInput("Ingrese la cantidad del deposito inicial: "), account);
    }
  }
}
