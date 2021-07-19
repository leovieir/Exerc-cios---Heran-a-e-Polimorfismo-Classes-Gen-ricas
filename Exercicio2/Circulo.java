public class Circulo extends Figura{
  private float raio;

  public Circulo(float raio){
    this.raio = raio;
  }

  public float calcularArea(){
    float area = this.raio * this.raio * 3.14f;

    return area;
  }
}