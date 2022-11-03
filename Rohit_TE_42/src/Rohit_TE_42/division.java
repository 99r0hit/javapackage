
package Rohit_TE_42;

import java.util.*;

interface ithasq{
	
	void divide();
}

public class division implements ithasq {
	
	public void divide() {
		// TODO Auto-generated method stub
	try	{	Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		
		int a = sc.nextInt();
		
		System.out.print("\n");
		
		System.out.print("Enter Second Number : ");
		
		int b = sc.nextInt();
		
		int c = a/b;
		
		System.out.print("\n");
		
		System.out.println("Division of given numbers is " +c);
		}
	catch (Exception e) {
		
		System.out.println(e);
	}
		
		
	}
	
	public static void main(String... args) {
		
		division add1 = new division();
		
		add1.divide();
		
	}

	
}
	
	


