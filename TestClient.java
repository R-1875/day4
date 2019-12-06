package com.slk.parallel;



class Hii implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi");
			
			try{Thread.currentThread().sleep(1000);}
			catch(Exception e){
				
			}
	}

}

}

class Helloo implements Runnable
{

	@Override
	public void run() {
		
	
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			
			try{Thread.currentThread().sleep(1000);}
			catch(Exception e){
				
			}
		
	}

}

}


public class TestClient {

	public static void main(String[] args) throws Exception{
		
		
		Thread t1=new Thread(new Hii());
		Thread t2=new Thread(new Helloo());

		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		
		System.out.println("bye");
		//Hi obj1=new Hi();
		//Hello obj2=new Hello();
		
		//obj1.start();
		
		//try{Thread.currentThread().sleep(10);}
		//catch(Exception e){}
		
		//obj2.start();

	}

}
