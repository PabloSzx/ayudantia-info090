public class DemoArregloObjetos {
  public static void main(String[] args) {
    Numeros[] nums = new Numeros[7];
    for (int i = 0; i < 7; i++) {
      nums[i] = new Numeros();
      nums[i].setAsigna();
    }
    for (int i = 0; i < 6; i++) {
      System.out.print(nums[i].getAsigna() + " - ");
    }
    System.out.println(nums[6].getAsigna());
  }
}
