package edu.ithaca.dragon.shapes;

import java.util.Scanner;


public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        Scanner myObj = new Scanner(System.in);

        for (int round = 0; round < 5; round++) {
            Rectangle[] rectangleList = new Rectangle[5];

            for (int i = 0; i < rectangleList.length; i++) {
                int width = 5 + 1;
                int length = 5 + 1; 
                rectangleList[i] = new Rectangle(width, length);

            }

            System.out.println("Round " + (round + 1) );
            for (int i = 0; i < rectangleList.length; i++){
                System.out.println("Rectangle " + (i+1) + rectangleList[i]);
            }
       
       
       
        }

        myObj.close();
        
    }
}
