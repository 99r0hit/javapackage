
package Rohit_TE_42;

import java.util.*;

interface ithas{
	
	void substract();
}

public class substraction implements ithas {
	
	public void substract() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		
		int a = sc.nextInt();
		
		System.out.print("\n");
		
		System.out.print("Enter Second Number : ");
		
		int b = sc.nextInt();
		
		int c = a-b;
		
		System.out.print("\n");
		
		System.out.println("Substraction of given number is " +c);
		
		
	}
	
	public static void main(String... args) {
		
		substraction add1 = new substraction();
		
		add1.substract();
		
	}

	
}
	
	


