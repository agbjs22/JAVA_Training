import java.util.Scanner;
public class SearchTarget{
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter the element to search: ");
    int target = sc.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] == target) {
            count++;
        }
    }
        System.out.println((count > 0)?"The element " + target + " is present in the array and it occurs " + count + " times.":"The element " + target + " is not present in the array.");
  }
}
