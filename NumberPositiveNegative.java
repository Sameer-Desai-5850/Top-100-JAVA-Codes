import java.util.*;
class Main{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		if(num>0){
			System.out.println("Positive");
		}
		else if( num<0){
			System.out.println(" Negative");
			
		}
		else{
			System.out.println("zero");
		}
		//using ternary oprator
		System.out.println((num>0)? "positive" : "negatine");
	}
	
}