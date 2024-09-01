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

    }

    @Test
    public void doubleSizeTest(){

    }
}
