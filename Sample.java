package mypack;

import java.util.Scanner;

class strConcat implements Runnable
{
	
	
	public void run()
	{
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("first");
		
		String fname=s.next();
		
		System.out.println("last");
		
		String lname=s.next();
		
		System.out.println("full"+(fname.concat(lname)));
		
		
		
	}
	
	
}


public class Sample {

	public static void main(String[] args) {
		
Runnable objref=new strConcat();
		
		Thread t1=new Thread(objref);
		
		t1.start();
	}

}
