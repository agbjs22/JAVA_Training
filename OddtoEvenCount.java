import java.util.Scanner;
public class OddtoEvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddToEvenCount = 0;
        int evenToOddCount = 0;
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 == 0) {
                oddToEvenCount++;
            }
            if (arr[i] % 2 == 0 && arr[i + 1] % 2 != 0) {
                evenToOddCount++;
            }
        }
        System.out.println("The count of odd to even transitions is: " + oddToEvenCount);
        System.out.println("The count of even to odd transitions is: " + evenToOddCount);
    }
}
