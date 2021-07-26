class Main {
  public static void main(String[] args) {
    DiaDaSemana segunda = DiaDaSemana.SEGUNDA;

    if(segunda.ehDiaUtil()){
      System.out.println("SUCESSO");
    }

    DiaDaSemana sabado = DiaDaSemana.SABADO;

    if(sabado.ehDiaUtil()){
      System.out.println("SUCESSO");
    }
  }
}