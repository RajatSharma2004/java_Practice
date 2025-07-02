import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        MergeTwoSortedArrays M = new MergeTwoSortedArrays();
        int[] arr1 = M.takeInput("first");
        int[] arr2 = M.takeInput("second");
        int[] merged = M.merge(arr1, arr2);
        M.display(merged);
    }

    public int[] takeInput(String which) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of " + which + " sorted array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of " + which + " sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            result[k++] = arr1[i++];
        }

        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
