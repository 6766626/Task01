package by.iacademy.zadanie.test;

public class Task25 {
	public static void task25() {
		
		// Я точно хз как решать эту задачу. формула скопирована из паскаля из нета.
		
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double d;
		double d2;
		
		a = 1;
		b = 22;
		c = 3;
		
		d = b*b-(4*a*c);
		d2 = Math.sqrt(d);
		x1 = -b+d2/2*a;
		x2 = -b-d2/2*a;
		
		System.out.println("Задача 25: "+"x1="+x1+"; x2="+x2);
	}

}
