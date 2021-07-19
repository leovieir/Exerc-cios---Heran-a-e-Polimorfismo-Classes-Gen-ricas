public abstract class Figura{

  public abstract float calcularArea();

  public static void imprimirArea(Figura figura){
    System.out.println(figura.calcularArea());
  }
}
