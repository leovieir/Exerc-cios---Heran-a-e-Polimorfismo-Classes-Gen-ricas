public class PessoaFisica extends Pessoa{
  private String nome;
  private long cpf;
  private String aniversario;

  public PessoaFisica(String nome, long cpf, String aniversario, String endereco){
    super(endereco);

    this.nome = nome;
    this.cpf = cpf;
    this.aniversario = aniversario;
  }

  public void imprimir(){
    System.out.println("Nome: " + this.nome + "\tCPF: " + this.cpf + "\tAniversário: " + this.aniversario + "\tEndereço: " + this.getEndereco());
  }

  public long getCpf(){
    return this.cpf;
  }
}