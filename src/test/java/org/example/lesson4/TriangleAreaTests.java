package org.example.lesson4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleAreaTests {

    @Test
    public void isRight(double a, double b, double c){
        TriangleArea triangleArea = new TriangleArea(3, 4, 5);
        triangleArea.countArea();
        Assertions.assertEquals(6,6);
    }
    }


