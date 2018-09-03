class DemoCirculo {
  public static void main(String[] args) {
    // Se crean instancias de Circulo
    Circulo C1 = new Circulo();
    Circulo C2 = new Circulo();

    System.out.println("El circulo C2 es de radio: " + C2.getRadio());
    System.out.println("El circulo C2 es de color: " + C2.getColor());
    System.out.println("El area del circulo C2 es: " + C2.getArea());

    C1.setRadio();
    System.out.println("El circulo C2 es de radio: " + C1.getRadio());
    System.out.println("El circulo C2 es de area: " + C1.getArea());
  }
}
