
package Rohit_TE_42;

import java.util.*;

interface itis{
	
	void add();
}

public class addition implements itis {
	
	public void add() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		
		int a = sc.nextInt();
		
		System.out.print("\n");
		
		System.out.print("Enter Second Number : ");
		
		int b = sc.nextInt();
		
		int c = a+b;
		
		System.out.print("\n");
		
		System.out.println("Addition of given number is " +c);
		
		
	}
	
	public static void main(String... args) {
		
		addition add1 = new addition();
		
		add1.add();
		
	}

	
}
	
	


