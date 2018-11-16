import java.util.Scanner;


public class Input {
  public static String requestInput(String request) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("\n".concat(request));
    return keyboard.nextLine().trim();
  }

  public static int requestIntInput(String request) {
    Scanner keyboard = new Scanner(System.in);
    int ret = 0;
    boolean input = true;
    while (input) {
      System.out.print("\n".concat(request));
      try {
        ret = Integer.parseInt(keyboard.nextLine().trim());
        input = false;
      } catch (Exception e) {
        System.out.println("Error, no se identificó el numero, debe ingresar una cantidad entera!");
      }
    }

    return ret;
  }
}
