class Main {
  public static void main(String[] args) {
    Quadrado forma1 = new Quadrado(5.0f);

    Quadrado forma2 = new Quadrado(3.2f);

    Quadrado[] array = {forma1, forma2};

    System.out.println(somarAreas(array));
  }

  public static <T extends FormaGeometrica> float somarAreas(T[] array){
    float soma = 0.0f;

    for(T elemento : array){
      soma += elemento.getArea();
    }

    return soma;
  }
}