import java.util.*;
public class Main
{
	public static void ArrayPat(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter row and col size of the array:");
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    System.out.println("Enter Array Elements:");
	    int a[][]=new int[r][c];
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            a[i][j]=sc.nextInt();
	        }
	    }
	    int sum=0;
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            if(i==0||j==0||i==r-1||j==c-1){
	                sum=sum+a[i][j];
	            }
	        }
	    }
		System.out.println("The sum of the all edge elements:"+sum);
	}
}
