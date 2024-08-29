package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    

    public void calcAreaTest(){
        Rectangle rectangleTest = new Rectangle(4,2);
        assertEquals(8, rectangleTest.calcArea(), .0001);

        Rectangle rectangleTest2 = new Rectangle(2.5,1.5);
        assertEquals(3.75, rectangleTest2.calcArea(), .0001);

        Rectangle rectangleTest3 = new Rectangle(5,1.5);
        assertEquals(7.5, rectangleTest3.calcArea(), .0001);
    }


    public void longestLineWithinTest(){
        Rectangle rectangleTest1 = new Rectangle(4,3);
        assertEquals(5, rectangleTest1.longestLineWithin(), .0001);

        Rectangle rectangleTest2 = new Rectangle(.4,.3);
        assertEquals(.5, rectangleTest2.longestLineWithin(), .0001);

        Rectangle rectangleTest3 = new Rectangle(6,7);
        assertEquals(9.2195, rectangleTest3.longestLineWithin(), .0001);
    }

    public void doubleSizeTest(){
        Rectangle rectangleTest1 = new Rectangle(4,3);
        
    }
}
