import java.util.ArrayList;

public class Specie{
  private String name;

  private float weight;
  private float height;

  private Type type1 = null;
  private Type type2 = null;

  private ArrayList<Specie> evolutions = new ArrayList<Specie>();

  private int baseHP;
  private int baseATK;
  private int baseDEF;
  private int baseSPATK;
  private int baseSPDEF;
  private int baseSpeed;

  public Specie(String name, float weight, float height, Type type1, int baseHP, int baseATK, int baseDEF, int baseSPATK, int baseSPDEF, int baseSpeed){
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.type1 = type1;
    this.baseHP = baseHP;
    this.baseATK = baseATK;
    this.baseDEF = baseDEF;
    this.baseSPATK = baseSPATK;
    this.baseSPDEF = baseSPDEF;
    this.baseSpeed = baseSpeed;

  }

  public Specie(String name, float weight, float height, Type type1, Type type2, int baseHP, int baseATK, int baseDEF, int baseSPATK, int baseSPDEF, int baseSpeed){
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.type1 = type1;
    this.type2 = type2;
    this.baseHP = baseHP;
    this.baseATK = baseATK;
    this.baseDEF = baseDEF;
    this.baseSPATK = baseSPATK;
    this.baseSPDEF = baseSPDEF;
    this.baseSpeed = baseSpeed;

  }

  public String getName(){
    return this.name;
  }

  public int getBaseHP(){
    return this.baseHP;
  }

  public int getBaseATK(){
    return this.baseATK;
  }

  public int getBaseDEF(){
    return this.baseDEF;
  }

  public int getBaseSPATK(){
    return this.baseSPATK;
  }

  public int getBaseSPDEF(){
    return this.baseSPDEF;
  }

  public int getBaseSpeed(){
    return this.baseSpeed;
  }

  public Type[] getTypes(){
    Type [] types = {this.type1, this.type2};

    return types;
  }

  public boolean evolvesTo(Specie specie){
    if(this.evolutions.contains(specie)){
      return true;
    }

    return false;
  }

  public boolean haveEvolution(){
    if(this.evolutions.size() > 0){
      return true;
    }

    return false;
  }

  public void print(){
    System.out.print("\nName: " + this.name + "\nTypes: ");
    System.out.print(this.type1.getName());
    if(this.type2 != null){
      System.out.print("/" + this.type2.getName());
    }
    System.out.println("");
    System.out.println("Weight: " + this.weight + "\nHeight: " + this.height);
    System.out.println("HP: " + this.baseHP + "\nATK: " + this.baseATK + "\nDEF: " + this.baseDEF + "\nSp. ATK: " + this.baseSPATK + "\nSp. DEF: " + this.baseSPDEF + "\nSpeed: " + this.baseSpeed);
  }

  public void printEvolutionTree(){
    this.print();

    for(Specie evolution : this.evolutions){
      evolution.printEvolutionTree();
    }
    
  }

  public void addEvolution(Specie specie){
    this.evolutions.add(specie);
  }

}