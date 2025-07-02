import java.util.Scanner;

public class ReverseArrayElements {
  public static void main(String[] args) {

    ReverseArrayElements R  = new ReverseArrayElements();
    int arr[]=R.takeInput();
    int res []=R.reverseArray(arr);
    R.display(res);


    
  }

  public int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int[] reverseArray(int [] arr){
      for(int i =0;i<arr.length/2;i++){
        int temp = arr[i];
        arr[i] = arr[(arr.length-1)-i];
        arr[(arr.length-1)-i]= temp;

      }
      return arr;
    }
    public void display(int[] arr){
    int n = arr.length;
    System.out.println("Array is ");
    for(int i =0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
  
}
