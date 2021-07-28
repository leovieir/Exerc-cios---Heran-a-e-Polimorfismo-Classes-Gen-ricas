class Main {
  public static void main(String[] args) {
    
    Specie charmander = new Specie("Charmander", 8.5f, 0.6f, Type.FIRE, 39, 52, 43, 60, 50, 65);
    Specie charmeleon = new Specie("Charmeleon", 19f, 1.1f, Type.FIRE, 58, 64, 58, 80, 65, 80);
    Specie charizard = new Specie("Charizard", 90.5f, 1.7f, Type.FIRE, Type.FLYING, 78, 84, 78, 109, 85, 100);

    charmander.addEvolution(charmeleon);
    charmeleon.addEvolution(charizard);

    //charmander.printEvolutionTree();

    Specie squirtle = new Specie("Squirtle", 9.0f, 0.5f, Type.WATER, 44, 48, 65, 50, 64, 43);
    Specie wartortle = new Specie("Wartortle", 22.5f, 1.0f, Type.WATER, 59, 63, 80, 65, 80, 58);
    Specie blastoise = new Specie("Blastoise", 85.5f, 1.6f, Type.WATER, 79, 83, 100, 85, 105, 78);

    squirtle.addEvolution(wartortle);
    wartortle.addEvolution(blastoise);

    //squirtle.printEvolutionTree();

    Status burning10 = new Status("Burning", 10);

    Move ember = new Move(Move.MoveType.SPECIAL, "Ember", Type.FIRE, 5, 40, 100, false, burning10, 25);

    Pokemon poke1 = new Pokemon("Brasa", true, charmander);
    Pokemon poke2 = new Pokemon(true, squirtle);

    poke1.addLevel(100);
    poke2.addLevel(5);

    poke1.evolve(charmeleon);
    poke1.evolve(charizard);

    poke1.learnMove(0, ember);
    poke1.learnMove(1, ember);
    poke1.learnMove(2, ember);
    poke1.learnMove(3, ember);
    poke1.printMoves();

    poke1.print();
    poke2.print();

    poke1.useMove(0, poke2);
    poke2.print();

  }
}