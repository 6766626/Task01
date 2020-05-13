package by.iacademy.zadanie.test;

public class Task32 {
	public static void task32() {
		
		int m;
		int n;
		int k;
		int p;
		int q;
		int r;
		int rk;
		int nq;
		int mp;
		
		m = 12;
		n = 00;
		k = 00;
		
		p = 25;
		q = 95;
		r = 196;
		
		rk = r+k;
		
		 do {
			 n = n+1;
			 rk = rk-60;
			 
		 }
		while ((rk)>=60);
		 
		 nq = n+q;
		 
		 do {
			 m = m+1;
			 nq = nq-60;
		 }
		while ((nq)>=60);
		 
		 mp = m+p;
		 
		 if (mp>=24){
		
			 do {
			 mp= mp-24;
		 }
			 
		 while (mp>=24);
		 }
		 
		 
		 System.out.println("Задача 32: "+mp+" Ч "+nq+" МИН "+rk+" СЕК");
	}

}
