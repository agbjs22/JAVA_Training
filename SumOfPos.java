import java.util.Scanner;
public class SumOfPos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
             if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.print("The sum of the positive elements in the array is: " + sum);
    }
}
