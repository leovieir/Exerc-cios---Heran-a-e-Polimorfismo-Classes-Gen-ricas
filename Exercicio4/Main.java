class Main {
  public static void main(String[] args) {
    Type fire = new Type("Fire");
    Type flying = new Type("Flying");
    Type water = new Type("Water");

    Specie charmander = new Specie("Charmander", 8.5f, 0.6f, fire, 39, 52, 43, 60, 50, 65);
    Specie charmeleon = new Specie("Charmeleon", 19f, 1.1f, fire, 58, 64, 58, 80, 65, 80);
    Specie charizard = new Specie("Charizard", 90.5f, 1.7f, fire, flying, 78, 84, 78, 109, 85, 100);

    charmander.addEvolution(charmeleon);
    charmeleon.addEvolution(charizard);

    //charmander.printEvolutionTree();

    Specie squirtle = new Specie("Squirtle", 9.0f, 0.5f, water, 44, 48, 65, 50, 64, 43);
    Specie wartortle = new Specie("Wartortle", 22.5f, 1.0f, water, 59, 63, 80, 65, 80, 58);
    Specie blastoise = new Specie("Blastoise", 85.5f, 1.6f, water, 79, 83, 100, 85, 105, 78);

    squirtle.addEvolution(wartortle);
    wartortle.addEvolution(blastoise);

    //squirtle.printEvolutionTree();

    Status burning10 = new Status("Burning", 10);

    Move ember = new Move("Special", "Ember", fire, 5, 40, 100, false, burning10, 25);

    Pokemon poke1 = new Pokemon("Brasa", true, charmander);
    Pokemon poke2 = new Pokemon(true, squirtle);

    poke1.addLevel(100);
    poke2.addLevel(5);

    poke1.evolve(charmeleon);
    poke1.evolve(charizard);

    poke1.learnMove(0, ember);

    poke1.print();
    poke2.print();

    poke1.printMoves();

    poke1.useMove(0, poke2);
    poke2.print();

  }
}