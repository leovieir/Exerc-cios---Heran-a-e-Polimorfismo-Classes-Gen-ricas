public class Pessoa{
  private String nome;
  private int idade;
  private Pessoa pai;
  private Pessoa mae;

  public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae){
    this.nome = nome;
    this.idade = idade;
    this.pai = pai;
    this.mae = mae;
  }

  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  public void imprimirAncestrais(int geracao){
    if ((this.pai != null) && (this.mae != null)){
      for(int i = 0; i < geracao; i ++){
        System.out.print(" ");
      }
      System.out.println("Mãe: " + this.mae.nome + " Idade: " + this.mae.idade);
      this.mae.imprimirAncestrais(geracao + 1);
      for(int i = 0; i < geracao; i ++){
        System.out.print(" ");
      }
      System.out.println("Pai: " + this.pai.nome + " Idade: " + this.mae.idade);

      this.pai.imprimirAncestrais(geracao + 1);
    }
  }
}