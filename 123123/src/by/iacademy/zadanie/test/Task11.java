package by.iacademy.zadanie.test;

public class Task11 {

	public static void task11() {
		double a;
		double b;
		double rez;
		double rez2;
		a = 1;
		b = 2;
	
		
		rez = (a*a + b*b)*(a*a + b*b);
		rez2 = Math.pow(Math.pow(a,2)+Math.pow(b,2),2);
		
		System.out.println("Задача 11  "+"вариант решения 1:" +rez + ". Вариант решения 2:"+rez2);

	}

}
