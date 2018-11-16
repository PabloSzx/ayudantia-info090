import java.util.Scanner;

public class Banco {

  public static Persona buscarPersona(Persona[] Personas, int cPer, String nombre) {
    int i = 0;
    boolean found = false;
    while (i < cPer) {
      if (Personas[i].getNombre().equalsIgnoreCase(nombre)) {
        found = true;
        break;
      } else {
        i++;
      }
    }
    if (found) {
      return Personas[i];
    } else {
      System.out.println("Persona no encontrada.");
      return null;
    }
  }

  public static Empresa buscarEmpresa(Empresa[] Empresas, int cEmp, String nombre) {
    int i = 0;
    boolean found = false;
    while (i < cEmp) {
      if (Empresas[i].getNombre().equalsIgnoreCase(nombre)) {
        found = true;
        break;
      } else {
        i++;
      }
    }
    if (found) {
      return Empresas[i];
    } else {
      System.out.println("Empresa no encontrada.");
      return null;
    }
  }

  public static Estudiante buscarEstudiante(Estudiante[] Estudiantes, int cEst, String nombre) {
    int i = 0;
    boolean found = false;
    while (i < cEst) {
      if (Estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
        found = true;
        break;
      } else {
        i++;
      }
    }
    if (found) {
      return Estudiantes[i];
    } else {
      System.out.println("\nEstudiante no encontrado.");
      return null;
    }
  }

  public static void main(String[] args) {
    int n = Input.requestIntInput("Ingrese la capacidad de clientes de tipo Persona: ");
    int m = Input.requestIntInput("Ingrese la capacidad de clientes de tipo Empresa: ");
    int p = Input.requestIntInput("Ingrese la capacidad de clientes de tipo Estudiante: ");
    int cPer = 0, cEmp = 0, cEst = 0, i = 0;
    boolean found, bank = true;
    String nombre, type, input;
    Persona[] Personas = new Persona[n];
    Empresa[] Empresas = new Empresa[m];
    Estudiante[] Estudiantes = new Estudiante[p];

    System.out.println("\n\n--Bienvenido a la interfaz de comandos del Banco--");
    while (bank) {
      System.out.println("\n\n------------\n0.- Crear nuevo cliente Persona");
      System.out.println("1.- Crear nuevo cliente Empresa");
      System.out.println("2.- Crear nuevo cliente Estudiante");
      System.out.println("3.- Pedir datos de cliente");
      System.out.println("4.- Depositar dinero");
      System.out.println("5.- Retirar dinero (o Realizar compra)");
      System.out.println("6.- Informacion de todos los clientes");
      System.out.println("99.- Salir de la interfaz de comandos");

      // input = Input.requestInput("Ingrese el numero segun el comando que desea realizar: ");
      // switch (Integer.parseInt(input.trim())) {
      switch (Input.requestIntInput("Ingrese el numero segun el comando que desea realizar: ")) {
        case 0:
          Personas[cPer] = new Persona();
          cPer++;
          break;
        case 1:
          Empresas[cEmp] = new Empresa();
          cEmp++;
          break;
        case 2:
          // Estudiantes[cEst] = new Estudiante(Integer.parseInt(Input.requestInput("Ingrese semestre actual del estudiante: ")),Integer.parseInt(Input.requestInput("Ingrese semestre maximo esperado del estudiante: ")));
          Estudiantes[cEst] = new Estudiante(Input.requestIntInput("Ingrese semestre actual del estudiante: "), Input.requestIntInput("Ingrese semestre maximo esperado del estudiante: "));
          cEst++;
          break;
        case 3:
          nombre = Input.requestInput("Ingrese el nombre del cliente que desea información: ").trim();
          type = Input.requestInput("Ingrese el tipo de cliente que es ".concat(nombre).concat(": ")).trim();
          switch (type.toLowerCase()) {
            case "persona":
              if (buscarPersona(Personas, cPer, nombre) != null) {
                buscarPersona(Personas, cPer, nombre).getInfo();
              }
              break;
            case "empresa":
              if (buscarEmpresa(Empresas, cEmp, nombre) != null) {
                buscarEmpresa(Empresas, cEmp, nombre).getInfo();
              }
              break;
            case "estudiante":
              if (buscarEstudiante(Estudiantes, cEst, nombre) != null) {
                buscarEstudiante(Estudiantes, cEst, nombre).getInfo();
              }
              break;
            default:
              System.out.println("Tipo de cliente no reconocido!");
          }
          break;
        case 4:
          nombre = Input.requestInput("Ingrese el nombre del cliente que desea depositar: ").trim();
          type = Input.requestInput("Ingrese el tipo de cliente que es ".concat(nombre).concat(" (\"persona\",\"empresa\" o \"estudiante\"): ")).trim();
          switch (type.toLowerCase()) {
            case "persona":
              if (buscarPersona(Personas, cPer, nombre) != null) {
                Persona Pers = buscarPersona(Personas, cPer, nombre);
                if (Pers.checkCuenta("vista") && Pers.checkCuenta("credito")) {
                  // Pers.depositar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea depositar: ")),Input.requestInput("Ingrese a cual cuenta desea depositar(\"vista\" o \"credito\"): ").toLowerCase());
                  Pers.depositar(Input.requestIntInput("Ingrese la cantidad que desea depositar: "), Input.requestInput("Ingrese a cual cuenta desea depositar(\"Vista\" o \"Credito\"): ").toLowerCase());
                } else if (Pers.checkCuenta("vista")) {
                  // Pers.depositar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea depositar: ")),"vista");
                  Pers.depositar(Input.requestIntInput("Ingrese la cantidad que desea depositar: "), "vista");
                } else if (Pers.checkCuenta("credito")) {
                  // Pers.depositar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea depositar: ")),"credito");
                  Pers.depositar(Input.requestIntInput("Ingrese la cantidad que desea depositar"), "credito");
                }
              }
              break;
            case "empresa":
              if (buscarEmpresa(Empresas, cEmp, nombre) != null) {
                Empresa Empr = buscarEmpresa(Empresas, cEmp, nombre);
                // Empr.depositar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea depositar: ")),Input.requestInput("Ingrese a cual cuenta desea depositar(\"vista\" o \"credito\"): ").toLowerCase());
                Empr.depositar(Input.requestIntInput("Ingrese la cantidad que desea depositar: "), Input.requestInput("Ingrese a cual cuenta desea depositar(\"Vista\" o \"Credito\"): ").toLowerCase());
              }
              break;
            case "Estudiante":
              if (buscarEstudiante(Estudiantes, cEst, nombre) != null) {
                Estudiante Estu = buscarEstudiante(Estudiantes, cEst, nombre);
                if (Estu.checkCuenta("vista") && Estu.checkCuenta("credito")) {
                  // Estu.depositar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea depositar: ")),Input.requestInput("Ingrese a cual cuenta desea retirar(\"Vista\" o \"Credito\"): ").toLowerCase());
                  Estu.depositar(Input.requestIntInput("Ingrese la cantidad que desea depositar: "), Input.requestInput("Ingrese a cual cuenta desea retirar(\"Vista\" o \"Credito\"): "));
                } else if (Estu.checkCuenta("vista")) {
                  // Estu.depositar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea depositar: ")),"vista");
                  Estu.depositar(Input.requestIntInput("Ingrese la cantidad que desea depositar: "), "vista");
                } else if (Estu.checkCuenta("credito")) {
                  // Estu.depositar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea depositar: ")),"credito");
                  Estu.depositar(Input.requestIntInput("Ingrese la cantidad que desea depositar"), "credito");
                }
              }
              break;

          }
          break;
        case 5:
          nombre = Input.requestInput("Ingrese el nombre del cliente que desea retirarle dinero: ").trim();
          type = Input.requestInput("Ingrese el tipo de cliente que es ".concat(nombre).concat(" (\"persona\",\"empresa\" o \"estudiante\"): ")).trim();
          switch (type.toLowerCase()) {
            case "persona":
              if (buscarPersona(Personas, cPer, nombre) != null) {
                Persona Pers = buscarPersona(Personas, cPer, nombre);
                if (Pers.checkCuenta("vista") && Pers.checkCuenta("credito")) {
                  // Pers.retirar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea retirar: ")),Input.requestInput("Ingrese a cual cuenta desea retirar(\"vista\" o \"credito\"): ").toLowerCase());
                  Pers.retirar(Input.requestIntInput("Ingrese la cantidad que desea retirar: "), Input.requestInput("Ingrese a cual cuenta desea retirar(\"Vista\" o \"Credito\"): "));
                } else if (Pers.checkCuenta("vista")) {
                  // Pers.retirar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea retirar: ")),"vista");
                  Pers.retirar(Input.requestIntInput("Ingrese la cantidad que desea retirar: "),"vista");
                } else if (Pers.checkCuenta("credito")) {
                  // Pers.retirar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea retirar: ")),"credito");
                  Pers.retirar(Input.requestIntInput("Ingrese la cantidad que desea retirar: "),"credito");
                }
              }
              break;
            case "empresa":
              if (buscarEmpresa(Empresas, cEmp, nombre) != null) {
                Empresa Empr = buscarEmpresa(Empresas, cEmp, nombre);
                // Empr.retirar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea retirar: ")),Input.requestInput("Ingrese a cual cuenta desea retirar(\"vista\" o \"credito\"): ").toLowerCase());
                Empr.retirar(Input.requestIntInput("Ingrese la cantidad que desea retirar: "),Input.requestInput("Ingrese a cual cuenta desea retirar(\"vista\" o \"credito\"): ").toLowerCase());
              }
              break;
            case "estudiante":
              if (buscarEstudiante(Estudiantes, cEst, nombre) != null) {
                Estudiante Estu = buscarEstudiante(Estudiantes, cEst, nombre);
                if (Estu.checkCuenta("vista") && Estu.checkCuenta("credito")) {
                  // Estu.retirar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea retirar: ")),Input.requestInput("Ingrese a cual cuenta desea retirar(\"vista\" o \"credito\"): ").toLowerCase());
                  Estu.retirar(Input.requestIntInput("Ingrese la cantidad que desea retirar: "),Input.requestInput("Ingrese a cual cuenta desea retirar(\"vista\" o \"credito\"): ").toLowerCase());
                } else if (Estu.checkCuenta("vista")) {
                  // Estu.retirar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea retirar: ")),"vista");
                  Estu.retirar(Input.requestIntInput("Ingrese la cantidad que desea retirar: "),"vista");
                } else if (Estu.checkCuenta("credito")) {
                  // Estu.retirar(Integer.parseInt(Input.requestInput("Ingrese la cantidad que desea retirar: ")),"credito");
                  Estu.retirar(Input.requestIntInput("Ingrese la cantidad que desea retirar: "),"credito");
                }
              }
              break;
          }
          break;
        case 6:
          if (cPer == 0 && cEmp == 0 && cEst == 0) {
            System.out.println("El banco no tiene clientes");
          } else {
            for (int j = 0; j < cPer; j++) {
              Personas[j].getInfo();
            }
            for (int j = 0; j < cEmp; j++) {
              Empresas[j].getInfo();
            }
            for (int j = 0; j < cEst; j++) {
              Estudiantes[j].getInfo();
            }
          }
          break;
        case 99:
          bank = false;
          break;
        default:
          System.out.println("Comando no reconocido!");
      }
    }

  }

}
