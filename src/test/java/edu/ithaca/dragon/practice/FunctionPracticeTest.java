package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));
        
        //The first few tests are just making sure the function wors and using easy numbers and then testing with all the same to still make sure the tests work

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));

        // The last 3 tests are showing how the function should have an error when the input has a negative anywhere in the three numbers 
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(50, FunctionPractice.calcSalePrice(90.0, 50.0, 5.00));
        assertEquals(55.28, FunctionPractice.calcSalePrice(50, 0, 5.28));
        assertEquals(29.88, FunctionPractice.calcSalePrice(35.99, 25.0, 2.88));
        
        //These first tests are just to make sure that calcSalePrice is working correctly

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-25.0, -40.0, -10.0));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(25.0, -40.0, 10.0));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(25.0, 40.0, -10.0));
        
        //These tests are to make sure the function throws an error when a negative is put into the function
    }

    @Test
    public void isGoodDog(){
        assertEquals(true, FunctionPractice.isGoodDog(5, 50, true));
        assertEquals(false, FunctionPractice.isGoodDog(2, 0, false));
        assertEquals(false, FunctionPractice.isGoodDog(5, 20, false));

        //Checking if the function itself works properly

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(-2, -4, false));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(-2, 4, false));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(2, -4, false));

        //Checks to make sure an error is returned if the function is given a negative number
    }

    @Test
    public void findFirstLargest(){

    }
    
    @Test
    public void findLastLargest(){

    }

    @Test
    public void findFirstMostOccurencesOfLetter(){

    }
}
