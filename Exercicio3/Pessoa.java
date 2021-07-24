public abstract class Pessoa{
  private String endereco;

  public Pessoa(String endereco){
    this.endereco = endereco;
  }

  public String getEndereco(){
    return this.endereco;
  }

  public abstract void imprimir();
}