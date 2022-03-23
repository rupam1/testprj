package testprj;

import java.util.Scanner;

public class firstclass {

	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();
		sc.close();
		// TODO Auto-generated method stub
		if (a>b ) {
		System.out.println("hi");
		}
		else
		{
			System.out.println("bye");
		}
	}

}
