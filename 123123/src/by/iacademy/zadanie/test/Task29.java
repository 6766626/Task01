package by.iacademy.zadanie.test;

public class Task29 {
	public static void task29() {
		
		double a;
		double b;
		double c;
		double ugola;
		double ugolb;
		double ugolc;
		double agr;
		double bgr;
		double cgr;
		double arad;
		double brad;
		double crad;
		
		
		a = 2;
		b = 4;
		c = 5;
		
		if ((a+b)<=c | (a+c)<=b | (c+b)<=a )
		{System.out.println("Задача 29: Неверно заданы стороны треугольника. Такого треугольника не существует!");
			}
		
		else{
			
			ugolb = (b*b+c*c-a*a)/(2*b*c);
			ugola = (a*a+b*b-c*c)/(2*a*b);
			ugolc = (a*a+c*c-b*b)/(2*a*c);
			
			agr = Math.toDegrees(Math.acos(ugola));
			bgr = Math.toDegrees(Math.acos(ugolb));
			cgr = Math.toDegrees(Math.acos(ugolc));
			
			arad = Math.toRadians(agr);
			brad = Math.toRadians(bgr);
			crad = Math.toRadians(cgr);
			
			System.out.println("Задача 29: Угол а="+arad+"рад или "+agr+"гр; "+"Угол b="+brad+"рад или "+bgr+"гр; "+"Угол c="+crad+"рад или "+cgr+"гр");
			
			
			
			
			
		}
	
	}
}

