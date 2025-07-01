import java.util.Scanner;

public class Checkarmstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check ");
    int num = sc.nextInt();
    int res=0;
    int pow = String.valueOf(num).length();

    int temp =num;

    while(temp!=0){
      int digit = temp%10;
      res += (int)Math.pow(digit,pow);
      temp /=10;
          }

    if(num==res){
      System.out.println(num+" is armstrong ");

    }
    else{
      System.out.println(num+" is not  armstrong ");
    }



  }
  
}
