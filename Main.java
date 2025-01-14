import java.util.Scanner;

public class Main{
  static int top;
  static int[]arr= new int[100];

    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      
      top=size;

    for(int i =0; i<size;i++){
      arr[i]= sc.nextInt();
    }
    
    Main ar = new Main();
    ar.AddAtEnd(50);
    ar.AddAtEnd(60);
    ar.DeleteEnd();
    ar.DeleteAtMiddle(2);
    ar.DeleteFront();
    ar.LinearSearch(50);
    


  }
  public void AddAtEnd(int num){
    arr[top] = num;
    top++;
  }
  public void DeleteFront(){
    for(int i = 0;i<top-1;i++){
      System.out.print(arr[i]= arr[i+1]);
    }
    top--;
  }
  public void DeleteEnd(){
    arr[top]=0;
    top--;
  }
  public void DeleteAtMiddle(int index){
    for(int i =index;i<top;i++){
      arr[i]= arr[i+1];
    }
    top--;
  }
  public void LinearSearch(int num){
    for(int i=0; i<top;i++){
      if(arr[i]==num){
        System.out.println("Element found at index "+i);
      }
    }
  }
}