package patterns;

import java.util.Scanner;

public class Triangle1 {
  public static void main(String[] args) {
    System.out.println("Enter the size ");
    Scanner sc= new Scanner(System.in);

    int x = sc.nextInt();

  
  for(int i =0 ;i<x ;i++){
    for(int j =0;j<x-i;j++){
      System.out.print(" ");
    }

    for(int k =0;k<i;k++){
      System.out.print("*");
    }
  System.out.println();
}


}
}
