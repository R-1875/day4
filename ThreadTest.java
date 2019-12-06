package com.slk.concurrency;


class OurThread extends Thread
{
	
	
	int[] newarr={50,100};
	
	
	public void run()
	{
		int temp=newarr[0];
		newarr[0]=newarr[1];
		newarr[1]=temp;
		
		for(int val : newarr)
		{
			System.out.println(val + " ");
		}
		
	}
	
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		Thread t= new OurThread();
		t.start();
		
		

	}

}
