package by.iacademy.zadanie.test;

public class Task28 {
	public static void task28() {
		
		double rad;
		double sec;
		double min;
		double h;
		int grad;
		
		rad = 3.14;
		
		h = 180/Math.PI*rad;
		
		
		grad= (int)h;
		min = (int)((h-grad)*60);
		sec = (int)((h - grad - min/60)*60*60);
		
		System.out.println("Задача 28: "+rad+"радианов="+grad+"градусов"+min+"минут"+sec+"секунд");
	}

}
