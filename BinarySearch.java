import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array : ");
      int size = sc.nextInt();
      int arr[]= new int[size];
      System.out.println("Enter array : ");
      for(int i =0; i<size;i++){
        arr[i]= sc.nextInt();
      }
      System.out.println("Enter number to search for : ");
      int num = sc.nextInt();

      int uBound=size-1;
     int lBound=0;
     

      while (true) { 
       
        if(lBound>uBound){
          System.out.println("Element not found ");
          break;
        }
        int mid = (uBound+lBound)/2;
        
       
        if(arr[mid]== num){
          System.out.println("Element Found at index : "+mid);
          break;
        }
        else if(arr[mid]>num){
          uBound=mid-1;

        }
        else if(arr[mid]<num){
          lBound=mid+1;
        }

          
      }

  }
  
}
