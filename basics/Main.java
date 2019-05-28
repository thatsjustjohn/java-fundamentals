public class Main {
  public static void main(String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


  }

  // 
  public static String pluralize(String animal, int count) {
    if(count == 0 || count != 1){
      animal = animal + "s";
    }
    return animal;
  }
}