import java.util.ArrayList;

public class Agenda{
  private ArrayList<PessoaFisica> contatosPF = new ArrayList<PessoaFisica>();
  private ArrayList<PessoaJuridica> contatosPJ = new ArrayList<PessoaJuridica>();

  public Agenda(){

  }

  public void imprimirContatos(){
    for(PessoaFisica contato : this.contatosPF){
      contato.imprimir();
    }

    for(PessoaJuridica contato : this.contatosPJ){
      contato.imprimir();
    }
  }

  public void adicionarContato(PessoaFisica contato){
    this.contatosPF.add(contato);
  }

  public void adicionarContato(PessoaJuridica contato){
    this.contatosPJ.add(contato);
  }

  public Pessoa buscarContato(long cpf){
    for(PessoaFisica contato : this.contatosPF){
      if(contato.getCpf() == cpf){
        return contato;
      }
    }

    return null;
  }

  public Pessoa buscarContato(String cnpj){
    for(PessoaJuridica contato : this.contatosPJ){
      if(contato.getCnpj() == cnpj){
        return contato;
      }
    }

    return null;
  }


}