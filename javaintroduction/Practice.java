// 12-06-2026 (Lab Task)

//package com.javaintroduction;
//
//public class Practice {
//	static int count = 0;
//	{
//		count = count+1;
//	}

	// Using constructor
//	Practice() {
//		count++;
//	}
//
//	public static void main(String[] args) {
//		
//		new Practice();
//		new Practice();
//		new Practice();
//		new Practice();
//		new Practice();
//
//		System.out.println("Number of times : " + count);
//
//	}
//
//}


//package com.javaintroduction;
//public class Practice{
//	public static void main(String[] args) {
//		Class.forName("com.javaintroduction.Practice".getClassLoader());
//	}
//}
//

package com.javaintroduction;

public class Practice {
    public static void main(String[] args) throws ClassNotFoundException {
        // Correct syntax to supply a ClassLoader
        Class<?> c = Class.forName(
            "com.javaintroduction.Practice", 
            true, 
            Practice.class.getClassLoader()
        );
        System.out.println(c);
    }
}
