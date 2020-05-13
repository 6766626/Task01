package by.iacademy.zadanie.test;

public class Task13 {

	public static void task13() {
		
		double x1 , x2, x3, y1, y2, y3;
		double S;
		double P;
		double p;
		double ab, bc, ac;
		
		x1 = 1;
		y1 = 2;
		x2 = 15;
		y2 = 14;
		x3 = 4;
		y3 = 5;
		
		ab = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		bc = Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
		ac = Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
		P = ab+bc+ac;
		p = P/2;
		S = Math.sqrt((p*(p-ac)*(p-bc)*(p-ac)));
	System.out.println("Задача 13: Периметр = "+ P+"; Площадь = "+ S);

	}

}
