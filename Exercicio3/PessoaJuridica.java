public class PessoaJuridica extends Pessoa{
  private String razaoSocial;
  private String cnpj;
  private float faturamento;

  public PessoaJuridica(String razaoSocial, String cnpj, float faturamento, String endereco){
    super(endereco);

    this.razaoSocial = razaoSocial;
    this.cnpj = cnpj;
    this.faturamento = faturamento;
  }

  public void imprimir(){
    System.out.println("Razão Social: " + this.razaoSocial + "\tCNPJ: " + this.cnpj + "\tFaturamento: " + this.faturamento + "\tEndereço: " + this.getEndereco());
  }

  public String getCnpj(){
    return this.cnpj;
  }
}