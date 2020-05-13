package by.iacademy.zadanie.test;

public class Task08 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double rez1;
		double rez2;
	
		a = 1;
		b = 2;
		c = 3;
		rez1 = (b*b)+(4*a*c);
		rez2 = (b+Math.sqrt(rez1))/(2*a)-(a*a*a*c)+(1/(b*b));

				System.out.println(rez2);
	}

}