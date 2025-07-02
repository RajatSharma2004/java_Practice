import java.util.*;


public class ArrayTraversal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
     System.out.println("Enter array elements ");
    int[] arr = new int[n];
    for(int i =0;i<n;i++){
      System.out.print("Enter "+(i+1)+" Element");
      arr[i] = sc.nextInt();
      System.out.println();
    }
    ArrayTraversal AT = new ArrayTraversal();
    

    System.out.println("The total is "+AT.sumArray(arr));

     System.out.println("The average is "+AT.average(arr));

     AT.display(arr);
    
  }
  public int sumArray(int[] arr){
    int n = arr.length;
    int res =0;
    for(int i =0;i<n;i++){
      res += arr[i];
    }
    return res;

  }

  public float average(int[] arr){
    int n = arr.length;
    int res =0;
    for(int i =0;i<n;i++){
      res +=arr[i];
    }
    
    return (float)res/n;
  }

  public void display(int[] arr){
    int n = arr.length;
    System.out.println(null);
    for(int i =0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
  
}
