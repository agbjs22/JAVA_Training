import java.util.Scanner;
public class RevArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n;arr[i] = sc.nextInt(),i++);
        System.out.println("\nThe reversed array is: ");
        for (int i = n - 1; i >= 0;System.out.print(arr[i] + " "),i--);
    }
}
