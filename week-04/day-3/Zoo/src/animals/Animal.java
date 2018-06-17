package animals;
public abstract class Animal {

  String name;
  int age;
  String gender;
  int cutenessLevel;
  String food;

  public Animal(String name){
    this.name = name;
  }

  public abstract String getName();

  public abstract String breed();  //public vagy protected??
}


