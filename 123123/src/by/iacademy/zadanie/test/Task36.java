package by.iacademy.zadanie.test;

public class Task36 {
	public static void task36() {
		int abcd;
		int a,b,c,d;
		double x1,x2,xx;
		xx = 1;
		x1 = 1;
		x2 = 1;
		
		abcd = 1234;
		
		a = abcd/1000;
		b = abcd/100- a*10;
		c = abcd/10 - a*100 - b*10;
		d = abcd - a*1000 - b*100 - c*10;
		
		
		if(a%2==1) {
			x1 = x1*a;
		}
		else {
			x2 = x2*a;
		}

		if(b%2==1) {
			x1 = x1*b;
		}
		else {
			x2 = x2*b;
		}
		if(c%2==1) {
			x1 = x1*c;
		}
		else {
			x2 = x2*c;
		}

		if(d%2==1) {
			x1 = x1*d;
		}
		else {
			x2 = x2*d;
		}

		xx = x2/x1;
		System.out.println("Задача 36: `Нечетных` ="+x1+ "; Четных="+x2 + "; Частное ="+xx);

		
	}

}
