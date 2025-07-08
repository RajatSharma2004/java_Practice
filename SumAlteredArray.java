import java.util.Scanner;

public class SumAlteredArray {
  static final int MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[]arr= new long [n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();

    }
    int q = sc.nextInt();
    for(int i =0;i<q;i++){
     int l = sc.nextInt(); 
            int r = sc.nextInt(); 
            long x = sc.nextLong();
            long y = sc.nextLong();

            for (int j = l; j <= r; j++) {
                arr[j] = (x + (j - l) * y) % MOD;


    }
  }
  long sum =0;
  for(long val :arr){
    sum= (sum+val)%MOD;
  }
  System.out.println(sum);
}
}