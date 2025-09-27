import java.util.*;
public class Swapping{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter elements to swap:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int temp=a;
    a=b;
    b=temp;
    System.out.println("Elements after swapping:");
    System.out.println(a+" "+b);
  }
}
