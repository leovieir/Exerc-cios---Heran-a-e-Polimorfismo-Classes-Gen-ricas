public enum Type{
  FIRE("Fire"),
  WATER("Water"),
  GRASS("Grass"),
  GROUND("Ground"),
  ROCK("Rock"),
  NORMAL("Normal"),
  GHOST("Ghost"),
  DRAGON("Dragon"),
  FLYING("Flying"),
  FAIRY("Fairy"),
  ELETRIC("Eletric"),
  FIGHTING("Fighting"),
  POISON("Poison"),
  STEEL("Steel"),
  DARK("Dark"),
  BUG("Bug"),
  PSYCHIC("Pshychic"),
  ICE("Ice");

  private String name;

  Type(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
}