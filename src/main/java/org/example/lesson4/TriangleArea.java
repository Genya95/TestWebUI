package org.example.lesson4;

public class TriangleArea {
    double a;
    double b;
    double c;

     public TriangleArea(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void countArea(){
        double p = (a+b+c)/2;
         System.out.println("Полупериметр треугольника равен " +p);
       double S = p*(p-a)*(p-b)*(p-c);
        System.out.printf("Площадь треугольника со сторонами: a = " + a + ", b = " + b + ", c = " + c + " равна " + Math.sqrt(S));
    }
    public static void main(String [] args){
          TriangleArea triangleArea = new TriangleArea(3,4,5);
          triangleArea.countArea();
    }

}
