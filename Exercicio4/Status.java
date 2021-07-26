import java.util.Random;

public class Status{
  private String name;
  private int chance;
  private int turns;

  public Status(String name, int chance){
    this.name = name;
    this.chance = chance;
    this.turns = 0;
  }

  public boolean applyStatus(){
    Random generator = new Random();

    if(generator.nextInt(100) < this.chance){
      return true;
    }
    return false;
  }

  public boolean canMove(){
    if((this.name == "Sleeping") || (this.name == "Paralyzed")){
      return false;
    }
    return true;
  }

  public String getName(){
    return this.name;
  }
}