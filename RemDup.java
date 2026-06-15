import java.util.Scanner;
public class RemDup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n;arr[i] = sc.nextInt(),i++);
        System.out.println("\nThe array after removing duplicates is: ");
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
