package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = input.nextInt();
        System.out.println("Введите b: ");
        int b = input.nextInt();
        System.out.println("Введите x: ");
        int x = input.nextInt();
        Y y1 = new Y(a, b, x);
        Y y2 = new Y(a, b, x);
        Y y3 = new Y(a, b, x);
        y1.calc_y1();
        y2.calc_y2();
        y3.calc_y3();
    }

}
class Y{
    double a;
    double b;
    double x;
    double y;
    public Y(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }
    public void calc_y1(){
        y = 3*x + 5;
        System.out.println("Результат первого расчета: " + y);
    }
    public void calc_y2() {
        if (a - b != 0) {
            y = (a + b) / (a - b);
            System.out.println(" Результат второго расчета: " + y);
        } else {
            System.out.println("Возможно деление на 0, возникновения не числа, пожалуйста введите a и b, отличающиеся друг от друга и от 0");
        }
    }
    public void calc_y3(){
        if (b != 0){
            y = a*x/b;
            System.out.println("Результат третьего расчета: " + factorial(y));
        }
        else {
            System.out.println("Возможно деление на 0, пожалуйста введите b, отличающееся от 0");
        }
    }
    public int factorial(double j){
        int f = 1;
        for(int i = 1; i <= j; i++){
            f *= i;
        }
        return f;
    }
}
