package com.slk.concurrency;


import java.util.Scanner;



class FactorialThread extends Thread
{
	public void run()
	{
		
		System.out.println("enter number b/w 1 and 10");
		
		//try {
			Scanner s= new Scanner(System.in);
		
		int num=s.nextInt();
		
		
		
		System.out.println(factorial(num));
		}
		
		//finally {
	       // in.close();}
	    //
		
	//}
	
	
	public int factorial(int n)
	{
		if (n==0||(n==1))
			return 1;
		else
			return (n* factorial(n-1));
	}

}

public class ThreadSample {

	public static void main(String[] args) {
		
		
		Thread t= new FactorialThread();
		t.start();
		

	}
}



