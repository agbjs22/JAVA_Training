
import java.util.*;
public class RowcolTot
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Rows and Columns size:");
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    System.out.println("Enter Array elements:");
	    int a[][]=new int[r][c];
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            a[i][j]=sc.nextInt();
	        }
	    }
	    int rtot[]=new int[r];
	    int ctot[]=new int[c];
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	        rtot[i]=rtot[i]+a[i][j];
	    }
	    }
	    for(int j=0;j<c;j++){
	        for(int i=0;i<r;i++){
	        ctot[j]=ctot[j]+a[i][j];
	        }}
	  System.out.println("Row Sum");    
		for(int x:rtot)
		System.out.print(x+" ");
		System.out.println();
		System.out.println("Coloumn Sum");  
		for(int y:ctot)
		System.out.print(y+" ");
	}
}
