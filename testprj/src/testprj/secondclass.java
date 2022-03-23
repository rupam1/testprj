package testprj;

import java.util.Scanner;

public class secondclass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream 
		 
		System.out.print("Enter day number- ");  
		int day= sc.nextInt();
		sc.close();
		
		switch(day) {
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("tuesday");
			break;	
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thrusday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
		
		default:
			System.out.println("Please put a valid input between 1 to 7");
			
			   

	}

}
}
