import java.util.*;

public class Currentbill
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Units:");
		double units=sc.nextInt();
		 double price=0.0;
		 if(units<=0&&units>=100000){
		     System.out.println("Enter Valid Input!");
		 }
		 else if(units<=50){
		     price=(units*3.50);
		     
		 } 
		 else if(units>50&&units<=150){
		     price=((50*3.50)+((units-50)*4.50));
		     
		 }
		 else if(units>150&&units<=250){
		     price=((50*3.50)+((units-150)*4.50)+((units-150)*5.20));
		     
		 }
		 else if(units>250){
		     price=((50*3.50)+((units-200)*4.50)+((units-200)*5.20)+((units-250)*6.75));
		     
		 }
		 System.out.printf("Electric Amount :%.2f",price+(price*0.20));
	}
}
    
