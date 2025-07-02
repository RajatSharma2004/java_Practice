import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyUniqueElementsArray {

    public static void main(String[] args) {
        OnlyUniqueElementsArray E = new OnlyUniqueElementsArray();
        int[] arr = E.takeInput();
        int[] res = E.uniqueElements(arr);

        System.out.println("Unique elements are:");
        for (int num : res) {
            System.out.print(num + " ");
        }
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

    public int[] uniqueElements(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                list.add(arr[i]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
