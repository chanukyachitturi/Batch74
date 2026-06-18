//package com.javaintroduction;

//public class StaticMethod {
//	static StaticMethod st = new StaticMethod();
//	public static void method1()
//	{
//		System.out.println("method1 executed successfully");
//		method2();
//	}
//	public static void method2()
//	{
//		System.out.println("method2 executed successfully");
//		method3();
//	}
//	public static void method3()
//	{
//		System.out.println("method3 executed successfully");
//		StaticMethod st1 = new StaticMethod();
//		st1.method4();
//	}
//	void method4()
//	{
//		System.out.println("method4 executed successfully");
//		StaticMethod st2 = new StaticMethod();
//		st2.method5();
//	}
//	void method5()
//	{
//		System.out.println("method5 executed successfully");
//
//		StaticMethod st3 = new StaticMethod();
//		st3.method6();
//	}
//	void method6()
//	{
//		System.out.println("method6 executed successfully");
//
//	}
//	
//	public static void main(String[] args) { 
//		method1();
//	}
//
//}


//snippet 1//


//package com.javaintroduction;
//
//public class StaticMethod {
//	void main() {
//		int[] a = {10,20,30};
//		int[]b = a;
//		b[1] = 99;
//		System.out.println(a[1]);
//	}
////}



//snippet 2//


//package com.javaintroduction;
//public class StaticMethod {
//	void main() {
//		String s = "java";
//		String s1 = new String("java".intern());
//		System.out.println(s==s1);
//	}
//}



//snippet 3//


//package com.javaintroduction;
//public class StaticMethod {
//	void main() {
//		Integer c= 128;
//		Integer d= 128;
//		Integer a= -127;
//		Integer b= -127;
//		System.out.println(c == d);
//		System.out.println(a == b);
//
//
//	}
//}

