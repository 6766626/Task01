package by.iacademy.zadanie.test;

public class Task16 {
	public static void task16() {
		int a;
		int b;
		int c;
		int d;
		int rez;
		int abcd = 1234;
		
		
		a = abcd/1000;
		b = (abcd - a*1000)/100;
		c = (abcd - a*1000 - b*100)/10;
		d = abcd - a*1000 - b*100 - c*10;
		rez = a*b*c*d;
		System.out.println("Задача 16: "+rez);
	}

}
