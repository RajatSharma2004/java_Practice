import java.util.Scanner;
 class TempratureConvertor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter temp in celsius ");
    float c = sc.nextFloat();
    float f = (c*9/5)+32;
    System.out.println("Temprature is "+f+" farenheit");
  }
  
}
