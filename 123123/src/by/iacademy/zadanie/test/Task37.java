package by.iacademy.zadanie.test;

public class Task37 {
    public static void tasK37(){

        double N;
        int x;

        // 1 условие
        N=24;
        x = 0;

        if ((N/10)<=9 && (N/10)>=-9) {
            x =1;
        }
        else {x=0;}

        if (N%2==0) {
            x=1;}
        else {
            x=0;}



        if (x == 1) {
        System.out.println("Задача 37: true");}

        else {

        if (x == 0) {
            System.out.println("Задача 37: false");
        }
        else {System.out.println("Задача 37: ошибка");}}

// 2ое условие

        int abcd = 1230;
        int a,b,c,d;
        a = abcd/1000;
        b = abcd/100- a*10;
        c = abcd/10 - a*100 - b*10;
        d = abcd - a*1000 - b*100 - c*10;

        if (a+b == c+d){
            System.out.println("Задача 37: true");
        }
        else {System.out.println("Задача 37: false");}

        // 3 задание

        int abc = 123;

        a = abc/100;
        b = abc/10-a*10;
        c = abc-a*100-b*10;

        if ((a+b+c)%2==0){
            System.out.println("Задача 37: true");
        }
        else {System.out.println("Задача 37: false");}


        // 4 часть Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= м, х= n (м<n).

        int x1 = 1;
        int y1 = 2;
        int m = -6;
        int n = 5;

        if (x1>m && x1<n){
            System.out.println("Задача 37: true");
        }
        else {System.out.println("Задача 37: false");}

    // 5 часть Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.

        abc = 123;
        a = abc/100;
        b = abc/10-a*10;
        c = abc-a*100-b*10;

        if (abc*abc == Math.pow((a+b+c),3)) {
            System.out.println("Задача 37: true");
        }
        else {System.out.println("Задача 37: false");
        }


    // 6 часть Треугольник со сторонами а,b,с является равнобедренным.
        a = 2;
        b = 3;
        c = 2;

        if ((a==b) | (a==c)) {

            System.out.println("Задача 37: true");
            if (b==c) {
                System.out.println("Задача 37: true");
            }
        }

        else {
            System.out.println("Задача 37: false");
        }


// 7 Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.

        abc = 923;
        a = abc/100;
        b = abc/10-a*10;
        c = abc-a*100-b*10;

        if ((a+b == c) | (a+c == b)) {

            System.out.println("Задача 37: true");
            if (b+c == a) {
                System.out.println("Задача 37: true");
            }
        }

        else {
            System.out.println("Задача 37: false");
        }


        //8 Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).

        N = 8;
        a = 3;

        int stepen =3;

        if(Math.pow(a,stepen) == N)
        { System.out.println("Задача 37: true");}
        else  {System.out.println("Задача 37: false");}

        //График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).
        m =4;
        n = 2;

        a = 1;
        b = 2;
        c = 3;

        if (m == a*n*n+b*n+c){
            System.out.println("Задача 37: true");
        }
        else System.out.println("Задача 37: false");



    }
}


