public class Retangulo extends FormaGeometrica{
  public Retangulo(float lado1, float lado2){
    this.calcularArea(lado1, lado2);
    this.calcularPedimetro(lado1, lado2);
  }
  
  public void calcularArea(float lado1, float lado2){
    this.setArea(lado1 * lado2);
  }

  public void calcularPedimetro(float lado1, float lado2){
    this.setPerimetro(2 * (lado1 * lado2));
  }
}