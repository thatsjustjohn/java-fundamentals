import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(1);

    clock();
  }

  // Function takes in a string and count and returns the correct version of the string pluralized.
  public static String pluralize(String item, int count) {
      return count == 1 ? item : item + 's';
  }

  // Function to flip a specific number of heads in a row
  public static void flipNHeads(int headsInARow){
    int numberOfFlips = 0;
    int numberOfHeads = 0;
    while(numberOfHeads < headsInARow){
      if(Math.random() < .5){
        System.out.println("tails");
        numberOfHeads = 0;
      }else{
        System.out.println("heads");
        numberOfHeads++;
      }
      numberOfFlips++;
    }
    System.out.printf("It took %d %s to flip %d %s in a row.\n", numberOfFlips, pluralize("flip", numberOfFlips), numberOfHeads, pluralize("head", numberOfHeads));
  }

  // Function to only print out each second when a new second happens
  public static void clock(){
    LocalDateTime previousSecond = LocalDateTime.now();
    while(true){
      LocalDateTime current = LocalDateTime.now();
      if(previousSecond.getSecond() != current.getSecond()){
        String time = current.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
        previousSecond = current;
      }
    }
  }
}