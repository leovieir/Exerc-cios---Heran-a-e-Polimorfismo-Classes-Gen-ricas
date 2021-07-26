public enum DiaDaSemana{
  DOMINGO("domingo"),
  SEGUNDA("segunda"),
  TERCA("terça"),
  QUARTA("quarta"),
  QUINTA("quinta"),
  SEXTA("sexta"),
  SABADO("sábado");

  private String nome;

  DiaDaSemana(String nome){
    this.nome = nome;
  }

  public boolean ehDiaUtil(){
    if((this.ordinal() > 0) && (this.ordinal() < 6)){
      return true;
    }

    return false;
  }
}