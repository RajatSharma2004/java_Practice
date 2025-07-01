import java.util.Scanner;

public class Checkpalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check ");
    int org = sc.nextInt();
    int rev=0;
    int temp=org;

    while(temp !=0){
      int digit = temp%10;
      rev=rev*10+digit;
      temp /=10;
    }

    if(org ==rev ){
      System.out.println(org+" is palindrome");

    }
    else{
      System.out.println(org+ " not a palindrome");
    }

  }
}
