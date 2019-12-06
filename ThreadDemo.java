package com.slk.concurrency;



class MyThread extends Thread
{
	
	int[] arr={4,11,6,3,9};
	
	
	
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			arr[i]=arr[i]*2;
		}
		
		
		for(int val: arr)
		{
			System.out.println(val);
		}
		
		
	}
	
}
	
	

public class ThreadDemo {

	public static void main(String[] args) {
		
Thread t1=new MyThread();
t1.start();
		
	}


}


