import java.util.*;

public class MaximumElementInArray {
  public static void main(String[] args) {
    MaximumElementInArray M = new MaximumElementInArray();
    
    int []arr=M.takeInput();
    int max = M.maximumElement(arr);
    int max2 =M.secondLargest(arr);
    int max3 = M.thirdLargest(arr);
    M.display(max, max2, max3);

  }

  public  int[] takeInput(){
   
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
  public int maximumElement(int[] arr){
    int max=0;
    for(int i =0;i<arr.length;i++){
      if(arr[i]>max){
        max= arr[i];
      }
    }
    return max;
  }

  public int secondLargest(int[]arr){
    int max=0;
    int max2=0;
    for(int i =0;i<arr.length;i++){
      if(arr[i]>max){
        max2=max;
        max= arr[i];
      }
      else if (arr[i]>max2 && arr[i]<max){
        max2 = arr[i];
      }
      }

      return max2;     

  }

  public int thirdLargest(int[]arr){

    int max,max2,max3=0;
    max=0;
    max2=0;

    for(int i =0;i<arr.length;i++){
      if(arr[i]>max){
       max3 = max2;
        max2=max;
        max= arr[i];
      }
      else if (arr[i]>max2 && arr[i]<max){
        max3 =max2;
        max2 = arr[i];
      }
      else if(arr[i]>max3 && arr[i]<max2){
        max3 = arr[i];
      }
      }

      return max3;
  }

  public void display(int a,int b,int c){
    System.out.println("Maximum number is "+a);
    System.out.println("Second largest number is "+b);
    System.out.println("Third largest element is "+c);
  }
  
}
