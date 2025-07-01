import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Random R = new Random();
    int num = R.nextInt(100);
    System.out.println("Enter a number ");
    
    int guess = sc.nextInt();

    while(guess!=num){
    if(guess<num){
      System.out.println("Guessed low");
      System.out.println("Enter another choice ");
      guess = sc.nextInt();
    }
    else{
      System.out.println("Gussed high");
      System.out.println("Enter another choice ");
      guess = sc.nextInt();
    }
  }
  System.out.println("You have guessed correctly number is "+num);




  }
  
}
