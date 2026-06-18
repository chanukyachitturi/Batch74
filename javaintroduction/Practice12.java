package com.javaintroduction;

public class Practice12 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized");
	}
	
	public void method1() {
		Practice12 p12 = new Practice12();
	}

	public static void main(String[] args) {

		Practice12 obj1 = new Practice12();
		Practice12 obj2 = new Practice12();
		Practice12 obj3 = new Practice12();
		Practice12 obj4 = new Practice12();

//		obj1 = null;                     --  nullifying object1.
//		obj2 = null;                     --  nullifying object2.
//		System.gc(); 


		// Reassigning the object.
		
//		obj1 = obj2;
//		obj2 = obj3;
//		obj3 = obj4;
//		
//		System.gc(); 

		
		// object inside the method.
		
		
		obj4.method1();
		System.gc(); 

		
		
		
		
	}
}