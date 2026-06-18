//package com.javaintroduction;

//public class practice1 {
//	static practice1 t = new practice1();
//	public static void method1() {
//		method2();
//		System.out.println("method1 called");
//	}
//
//	public static void method2() {
//		System.out.println("method2 called");
//		t.method3();
//		
//		
//	}
//	public void method3() {
//		System.out.println("method3 called");
//		method1();
//		
//	}
//	public void method4() {
//		System.out.println("method4 called");
//		
//
//	}
//
//	public static void main(String[] args) {
//		method1();
//	}
//
//}

//



// problem when instance object is created.

//package com.javaintroduction;
//
//public class practice1{
//	practice1 p= new practice1();
//	public static void method1() {
//		method2();
//		System.out.println("method1 called");
//	}
//	public static void method2() {
//		practice1 p2 = new practice1();
//		p2.method3();
//		System.out.println("method2 called");
//	}
//	public void method3() {
//		method4();
//		System.out.println("method3 called");
//
//	}
//	public void method4() {
//		System.out.println("method4 called");
//	}
//	public static void main(String[] args) {
//		System.out.println("main method started");
//		method1();
//	}
//}



//output :
//stack overflow











