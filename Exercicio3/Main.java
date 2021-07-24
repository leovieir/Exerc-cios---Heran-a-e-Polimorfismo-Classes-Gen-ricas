class Main {
  public static void main(String[] args) {
    PessoaFisica joao = new PessoaFisica("João", 12233443444L, "12/01", "Centro");
    PessoaFisica maria = new PessoaFisica("Maria", 12233443434L, "11/07", "Centro");

    PessoaJuridica empresa = new PessoaJuridica("Escritório", "123312-0001/02", 1000.0f, "Centro");
    PessoaJuridica empresa2 = new PessoaJuridica("Loja", "153312-0001/02", 1400.0f, "Centro");

    Agenda agenda = new Agenda();

    agenda.adicionarContato(joao);
    agenda.adicionarContato(maria);

    agenda.adicionarContato(empresa);
    agenda.adicionarContato(empresa2);

    agenda.buscarContato(12233443434L).imprimir();
    agenda.buscarContato("153312-0001/02").imprimir();

    
  }
}