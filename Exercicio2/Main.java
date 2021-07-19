class Main {
  public static void main(String[] args) {
    Retangulo retangulo = new Retangulo(4.0f, 3.5f);
    Quadrado quadrado = new Quadrado(5.5f);
    Circulo circulo = new Circulo(3.0f);
    Triangulo triangulo = new Triangulo(2.0f, 3.3f);

    System.out.println(retangulo.calcularArea());
    System.out.println(quadrado.calcularArea());
    System.out.println(circulo.calcularArea());
    System.out.println(triangulo.calcularArea());
  }
}