public class Triangulo extends Figura{
  private float altura;
  private float largura;

  public Triangulo(float altura, float largura){
    this.altura = altura;
    this. largura = largura;
  }

  public float calcularArea(){
    float area = (this.altura * this.largura) / 2;

    return area;
  }
}