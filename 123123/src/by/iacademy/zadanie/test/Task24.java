package by.iacademy.zadanie.test;

public class Task24 {
	public static void task24() {
		
		double a;
		double b;
		double ugol;
		double h;
		double S;
		
		
		 a = 12;
		 b = 10;
		 ugol = 70;
		
		h = ((a-b)/2)*Math.tan(ugol);
		S = ((a+b)*h)/2;
		
		System.out.println("Задача 24: "+S);
	}

}
