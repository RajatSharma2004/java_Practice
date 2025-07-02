import java.util.Scanner;

public class MoveZerosToEnd {
  public static void main(String[] args) {
    MoveZerosToEnd M = new MoveZerosToEnd();
    int[] arr= MoveZerosToEnd.takeInput();
    int res[]= M.move(arr);
    M.display(res);
  }
  public  static int[] takeInput(){
   
    System.out.println("Enter size of array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter array elements");
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    return arr;
}

public int[] move(int[] arr){
  int[] res = new int[arr.length];
  int j =0;
  for(int i=0;i<arr.length;i++){
    if(arr[i]!=0){
      res[j]=arr[i];
      j++;
    }

  }
  while(j<arr.length){
    res[j]=0;
    j++;
  }
  return res ;
}
 public void display(int[] arr){
    int n = arr.length;
    System.out.println("Array is ");
    for(int i =0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}