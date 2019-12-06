package mypack;




class Number
{
	public void show()
	{
		System.out.println("show method id presernt");
	}
	
}

class EvenNums extends Number implements Runnable
{
	////
	public void run()
	{
		
		for(int i=50;i<=60;i+=2)
		{
			System.out.println(i);
		}
		
		
	}
}



public class ThreadClient {

	public static void main(String[] args) {
		
		
		Runnable objref=new EvenNums();
		
		Thread t1=new Thread(objref);
		
		t1.start();
		
		

	}

}
