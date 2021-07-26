import java.util.Random;

public class Move{
  private String name;
  private Type type;
  private int requiredLevel;
  private int power;
  private int accuracy = 0;
  private boolean confuse;
  private Status status;
  private int buff = 0;
  private int stat;
  private int pp;
  private String moveType;

  public Move(String moveType, String name, Type type, int requiredLevel, int power, int accuracy, boolean confuse, Status status, int buff, int stat, int pp){
    this.moveType = moveType;
    this.name = name;
    this.type = type;
    this.requiredLevel = requiredLevel;
    this.power = power;
    this.accuracy = accuracy;
    this.confuse = confuse;
    this.status = status;
    this.buff = buff;
    this.stat = stat;
    this.pp = pp;
  }

  public Move(String moveType, String name, Type type, int requiredLevel, int accuracy, boolean confuse, Status status, int buff, int stat, int pp){
    this.moveType = moveType;
    this.name = name;
    this.type = type;
    this.requiredLevel = requiredLevel;
    this.accuracy = accuracy;
    this.confuse = confuse;
    this.status = status;
    this.buff = buff;
    this.stat = stat;
    this.pp = pp;
  }

  public Move(String moveType, String name, Type type, int requiredLevel, boolean confuse, Status status, int buff, int stat, int pp){
    this.moveType = moveType;
    this.name = name;
    this.type = type;
    this.requiredLevel = requiredLevel;
    this.confuse = confuse;
    this.status = status;
    this.buff = buff;
    this.stat = stat;
    this.pp = pp;
  }

  public Move(String moveType, String name, Type type, int requiredLevel, int power, int accuracy, boolean confuse, Status status, int pp){
    this.moveType = moveType;
    this.moveType = moveType;
    this.name = name;
    this.type = type;
    this.requiredLevel = requiredLevel;
    this.power = power;
    this.accuracy = accuracy;
    this.confuse = confuse;
    this.status = status;
    this.pp = pp;
  }

  public Move(String moveType,String name, Type type, int requiredLevel, int accuracy, boolean confuse, Status status, int pp){
    this.moveType = moveType;
    this.name = name;
    this.type = type;
    this.requiredLevel = requiredLevel;
    this.accuracy = accuracy;
    this.confuse = confuse;
    this.status = status;
    this.pp = pp;
  }

  public Move(String moveType, String name, Type type, int requiredLevel, boolean confuse, Status status, int pp){
    this.moveType = moveType;
    this.name = name;
    this.type = type;
    this.requiredLevel = requiredLevel;
    this.confuse = confuse;
    this.status = status;
    this.pp = pp;
  }

  public int getRequiredLevel(){
    return this.requiredLevel;
  }

  public String getName(){
    return this.name;
  }

  public void damagePhysycal(Pokemon user, Pokemon enemy){
    float damage = ((((2 * user.getLevel()) / 5) + 2) * this.power * (user.getActualATK() / enemy.getActualDEF()) / 50) + 2;

    enemy.takeDamage(damage);
  }

  public void damageSpecial(Pokemon user, Pokemon enemy){
    float damage = ((((2 * user.getLevel()) / 5) + 2) * this.power * (user.getActualSPATK() / enemy.getActualSPDEF()) / 50) + 2;

    enemy.takeDamage(damage);
  }

  public void activate(Pokemon user, Pokemon enemy){
    Random generator = new Random();

    if((this.accuracy == 0) || (generator.nextInt(100) < this.accuracy)){
      if(this.moveType == "Physical"){
        this.damagePhysycal(user, enemy);
      }

      if(this.moveType == "Special"){
        this.damageSpecial(user, enemy);
      }

      if(this.confuse == true){
        enemy.confuse();
      }

      if((this.status != null)  && (this.status.applyStatus())){
        enemy.applyStatus(status);
      }

      if(this.buff != 0){
        if(this.buff > 0){
          user.applyBuff(this.stat, this.buff);
        }

        else{
          enemy.applyBuff(this.stat, this.buff);
        }
      }
    }
  }
}