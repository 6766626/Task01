package by.iacademy.zadanie.test;

public class Task38 {
    public static void task38(){

        int rez1;
        int rez2;
        int rez3;

        int x = 0;
        int y = 0;

        // решение а
        if ( (x >= -4) & (x <= 4)) {
            if ((y >= 0) & (y <= 4)) {
                System.out.println("Задача 38: a = true");
            }

        else {
                System.out.println("Задача 38: a = false");

            }
        }


        // решение б

        rez1 = 0;
        rez2 = 0;
        if ( x >= -2 & x <= 2) {
            if (y >= 0 & y <= 4) {
                rez1 = 1;
            }
        }

            if (x >= -4 & x <= 4) {
                if (y <= 0 & y >= -3){
                    rez2 = 1;
            }
        }
        if (rez1==1 | rez2==1) {
            System.out.println("Задача 38: b = true");
        }
        else
            System.out.println("Задача 38: b = false");



        // решение c

        rez3 = 0;
       if ( (x*x + y*y )<= 16) {
           if ((x>=0 & x<=4) & (y>=0 & y<=4)) {
               rez3 = 1;
           }
        }
       else
       {
           rez3 = 0;}



        if ( (x*x + y*y )<= 25) {
            if ((x>=0 & x<=5) & (y<=0 & y>=-5)) {
                rez3 = 1;
            }
        }
        else
        {
            rez3 = 0;}

        if (rez3 == 1|| rez3 == 2) {
            System.out.println("Задача 38: c = true");
        }
        else {System.out.println("Задача 38: c = falce");}




    }
}
