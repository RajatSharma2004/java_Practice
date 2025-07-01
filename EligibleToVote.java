import java.util.Scanner;

public class EligibleToVote {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int age = sc.nextInt();

    EligibleToVote V = new EligibleToVote();
    if(V.Eligible(age)){
      System.out.println("Eligible to vote");
      return;
    }
    System.out.println("Not eligible");
    
  }
  
  public boolean Eligible(int age){
    if(age>=18){
      return true;
    }
    return false;
  }
}