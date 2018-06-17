package battle;
public class Hero extends BaseHero implements Punchable{

  double motivation;

  Hero(String name, int motivationLevel) {
    super(name);
    this.motivation = motivationLevel;
  }

  Hero(String name){
    super(name);
  }

  @Override
  public void punch(Punchable other) {
    if (motivation >= 1) {
      other.bePunched(motivation / 1.5);
    }
  }
  @Override
  public int getMotivationLevel() {
    int level = 0;
    if(motivation < 25){
      level = 0;
    } else if (motivation > 25 && motivation < 40){
      level = 1;
    } else if(motivation > 40){
      level = 2;
    }
    return level;
  }

  @Override
  public void bePunched(double damage) {
    motivation = motivation - (damage / motivation);
  }

  public String toString(){
    int level = getMotivationLevel();
    String status = "";
    if(level == 0){
      status = super.getName() + " is not motivated anymore.";
    } else if (level == 1){
      status = super.getName() + " is motivated.";
    } else if (level == 2){
      status = super.getName() + " is well motivated.";
    }
    return status;
  }
}
