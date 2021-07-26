public class Circulo extends FormaGeometrica{
  public Circulo(float raio){
    this.calcularArea(raio);
    this.calcularPerimetro(raio);
  }
  
  public void calcularArea(float raio){
    this.setArea((float)Math.PI * raio * raio);
  }

  public void calcularPerimetro(float raio){
    this.setPerimetro((float)Math.PI * raio * 2);
  }
}