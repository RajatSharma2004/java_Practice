import java.util.Scanner;

public class CkeckPrime {
  public static void main(String[] args) {
    System.out.println("Enter number to check");
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    if(num==0 || num==1){
        System.out.println(num +" is not prime ");
        return;
      }
    for(int i =2;i<=num/2;i++){
      
      if(num%i==0){
         System.out.println(num+" is not prime");

         return;       
      }
    }
    System.out.println(num +" is prime");

  }
  
}
