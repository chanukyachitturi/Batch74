package com.javaintroduction;

public class Movie {
	int MovieId;
	String MovieName;
	static String industry;
	
	Movie(int Mid,String Mname, String IndName){
		System.out.println(Mid);
		System.out.println(Mname);
		System.out.println(IndName);
	}
	

	public static void main(String[] args) {
		
		new Movie(222, "DJ","TFI");
		new Movie(222, "DJTillu","TFI");
		new Movie(222, "Devara","TFI");
//		System.out.println(m.MovieId=2828);
//		System.out.println(m.MovieName = "Peddi");
//		System.out.println(Movie.industry = "TFI");
//		
//		System.out.println(m.MovieId=28299);
//		System.out.println(m.MovieName = "GameChanger");
//		System.out.println(Movie.industry = "TFI");
		
		

	}

}
