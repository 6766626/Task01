package by.iacademy.zadanie.test;

public class Task22 {
	public static void task22() {
		int a;
		int hh;
		int mm;
		int ss;
		
		
		a= 45862;
		
		hh = a/60/60;
		mm = a/60-hh*60;
		ss = a - hh*60*60 - mm*60;
		
		System.out.println("Задача 22: "+hh+"ч "+mm+"мин "+ss+" сек");
		
	}

}
