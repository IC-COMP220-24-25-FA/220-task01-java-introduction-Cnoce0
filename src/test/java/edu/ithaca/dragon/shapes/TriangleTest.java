package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    
    @Test
    public void calacAreaTest(){
        Triangle triangletest1 = new Triangle(4,5);
        assertEquals(10, triangletest1.calcArea(), .0001);

        Triangle triangletest2 = new Triangle(9,5);
        assertEquals(22.5, triangletest2.calcArea(), .0001);

        Triangle triangletest3 = new Triangle(.5,.5);
        assertEquals(.125, triangletest3.calcArea(), .0001);
    }

    @Test
    public void longestLineWithinTest(){
        Triangle triangletest1 = new Triangle(4,3);
        assertEquals(5, triangletest1.longestLineWithin(), .0001);

        Triangle triangletest2 = new Triangle(4,10);
        assertEquals(10, triangletest2.longestLineWithin(), .0001);

        Triangle triangletest3 = new Triangle(4,20);
        assertEquals(20, triangletest3.longestLineWithin(), .0001);

    }

    @Test
    public void doubleSizeTest(){
        Triangle triangletest1 = new Triangle(4,5);
        triangletest1.doubleSize();
        System.out.println(triangletest1);
    }
}
