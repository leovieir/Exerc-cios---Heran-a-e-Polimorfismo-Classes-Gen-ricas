public class Retangulo extends Figura{
  private float altura;
  private float largura;

  public Retangulo(float altura, float largura){
    this.altura = altura;
    this.largura = largura;
  }

  public float calcularArea(){
    float area = this.altura * this.largura;

    return area;
  }
}