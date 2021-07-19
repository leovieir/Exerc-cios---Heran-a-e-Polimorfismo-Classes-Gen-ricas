class Main {
  public static void main(String[] args) {
    Pessoa marcos = new Pessoa("Marcos", 65);
    Pessoa rosa = new Pessoa("Rosa", 65);

    Pessoa joao = new Pessoa("João", 70);
    Pessoa maria = new Pessoa("Maria", 70);

    Pessoa pedro = new Pessoa("Pedro", 30, marcos, rosa);
    Pessoa julia = new Pessoa("Júlia", 30, joao, maria);

    Pessoa enzo = new Pessoa("Enzo", 5, pedro, julia);
    Pessoa valentina = new Pessoa("Velentina", 3);

    Pessoa aurelio = new Pessoa("Aurelio", 1, enzo, valentina);

    aurelio.imprimirAncestrais(0);
  }
}