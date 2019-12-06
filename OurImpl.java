package pp3;

import pp2.Derived;

public class OurImpl implements Derived {

	@Override
	public void fun1() {
		
		System.out.println("base interface fun1 implemented");
		
	}

	@Override
	public void fun2() {
		
		System.out.println("derived interface fun2 implemented");
		
	}
	
	

}
