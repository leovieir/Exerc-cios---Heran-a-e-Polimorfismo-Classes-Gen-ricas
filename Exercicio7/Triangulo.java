public class Triangulo extends FormaGeometrica{
  public Triangulo(float lado1, float lado2, float lado3){
    this.calcularArea(lado1, lado2, lado3);
    this.calcularPerimetro(lado1, lado2, lado3);
  }

  public void calcularArea(float lado1, float lado2, float lado3){
    float s = (lado1 + lado2 + lado3) / 2;

    float area = (float)Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

    this.setArea(area);
  }

  public void calcularPerimetro(float lado1, float lado2, float lado3){
    this.setPerimetro(lado1 + lado2 + lado3);  
  }
}