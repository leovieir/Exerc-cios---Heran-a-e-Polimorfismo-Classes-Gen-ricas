public class Pokemon{
  private String nickname;

  private boolean gender;

  private Specie specie;

  private int level;

  private float actualXp;
  private float xpNextLevel;

  private float maxHP;
  private float actualHP;
  private float actualATK;
  private float actualDEF;
  private float actualSPATK;
  private float actualSPDEF;
  private float actualSpeed;
  private boolean fainted;

  private Move[] moves = new Move[4];

  private boolean confused = false;
  private Status status = null;

  public Pokemon(String nickname, boolean gender, Specie specie){
    this.nickname = nickname;
    this.gender = gender;
    this.specie = specie;
  }

  public Pokemon(boolean gender, Specie specie){
    this.nickname = specie.getName();
    this.gender = gender;
    this.specie = specie;
  }

  public int getLevel(){
    return this.level;
  }

  public void printMoves(){
    if(this.moves[0] != null){
      System.out.print(this.moves[0].getName());
    }

    if(this.moves[1] != null){
      System.out.print("\t" + this.moves[1].getName());
    }

    System.out.println("");

    if(this.moves[2] != null){
      System.out.print(this.moves[2].getName());
    }

    if(this.moves[3] != null){
      System.out.print("\t" + this.moves[3].getName());
    }

    System.out.println("\n");
    
  }

  public void applyStatus(Status status){
    if(status.applyStatus()){
      this.status = status;
    }
  }

  public void learnMove(int position, Move move){
    if(this.level >= move.getRequiredLevel()){
      this.moves[position] = move;

      System.out.println(this.nickname + " learned " + move.getName() + "\n");
    }
  }

  public void useMove(int position, Pokemon enemy){
    System.out.println(this.nickname + " used " + this.moves[position].getName() + "\n");

    if(this.canMove()){
      this.moves[position].activate(this, enemy);
    }
  }

  public void applyBuff(int stat, int buff){
    int newStat = (100 + buff) / 100;

    if(stat == 1){
      this.actualATK *= newStat;
    }

    if(stat == 2){
      this.actualDEF *= newStat;
    }

    if(stat == 3){
      this.actualSPATK *= newStat;
    }

    if(stat == 4){
      this.actualSPDEF *= newStat;
    }

    if(stat == 5){
      this.actualSpeed *= newStat;
    }
  }

  public void confuse(){
    this.confused = true;
  }

  public void addXp(float xp){
    this.actualXp += xp;

    if (this.actualXp >= this.xpNextLevel){
      float newXp = this.actualXp - this.xpNextLevel;

      this.levelUp();

      this.addXp(newXp);
    }
  }

  public float getActualATK(){
    return this.actualATK;
  }

  public float getActualDEF(){
    return this.actualDEF;
  }
  
  public float getActualSPATK(){
    return this.actualSPATK;
  }

  public float getActualSPDEF(){
    return this.actualSPDEF;
  }

  public void levelUp(){
    if(this.level < 100){
      float xpNextLevel = 0;

      this.level += 1;
      
      if(this.level < 50){
        xpNextLevel = this.level * this.level * this.level * (100 - this.level) / 50;
      }

      else if((this.level >= 50) && (this.level < 68)){
        xpNextLevel = this.level * this.level * this.level * (150 - this.level) / 100;
      }

      else if((this.level >= 68) && (this.level < 98)){
        xpNextLevel = this.level * this.level * this.level * ((1911 - 10 * this.level) / 3) / 500;
      }

      else if((this.level >= 98) && (this.level < 100)){
        xpNextLevel = this.level * this.level * this.level * (160 - this.level) / 100;
      }

      this.xpNextLevel = xpNextLevel;

      this.calculateStats();
    }
  }

  public void print(){
    System.out.print("Specie: " + this.specie.getName() + "\tTypes: " + this.specie.getTypes()[0].getName());
    if(this.specie.getTypes()[1] != null){
      System.out.print("/" + this.specie.getTypes()[1].getName());
    }
    System.out.print("\nLvl. " + this.level + "\tNickname: " + this.nickname + "" + "\t");

    if(this.fainted == true){
      System.out.print("  [K.O]");
    }

    if(this.status != null){
      System.out.println("Status: " + this.status.getName());
    }
    System.out.println("\nHP: " + this.actualHP + "/" + this.maxHP + "\n");
  }

  public void printStats(){
    System.out.println("ATK: " + this.actualATK);
    System.out.println("DEF: " + this.actualDEF);
    System.out.println("Sp. ATK: " + this.actualSPATK);
    System.out.println("Sp. DEF: " + this.actualSPDEF);
    System.out.println("Speed: " + this.actualSpeed);
  }

  public boolean canMove(){
    if((this.status == null) || ((this.status != null) && (this.status.canMove()))){
      return true;
    }

    return false;
  }

  public void calculateStats(){
    this.maxHP = (this.level * this.specie.getBaseHP()) / 10;
    this.actualATK = (this.level * this.specie.getBaseATK()) / 10;
    this.actualDEF = (this.level * this.specie.getBaseDEF()) / 10;
    this.actualSPATK = (this.level * this.specie.getBaseSPATK()) / 10;
    this.actualSPDEF = (this.level * this.specie.getBaseSPDEF()) / 10;
    this.actualSpeed = (this.level * this.specie.getBaseSpeed()) / 10;
    this.actualHP = this.maxHP;
  }

  public void addLevel(int levels){
    for(int i = 0; i < levels; i++){
      this.levelUp();
    }
  }

  public void takeDamage(float damage){
    this.actualHP -= damage;

    if(this.actualHP <= 0){
      this.actualHP = 0;

      this.fainted = true;

      System.out.println(this.nickname + " has fainted!\n");
    }
  }

  public void evolve(Specie specie){
    if(this.specie.evolvesTo(specie)){
      this.specie = specie;

      System.out.println(this.nickname + " has evolved to " + this.specie.getName() + "!\n");

      this.calculateStats();
    }
  }
}