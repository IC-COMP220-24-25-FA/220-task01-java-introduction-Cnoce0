package edu.ithaca.dragon.shapes;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;







public class ShapeMain {
    
   
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        List<Shape> shapeList = new ArrayList<>();
        int maxNum = 3 ; 
        int minNum = 1;
        int x = 0 ;

        while(x < 10){
            int num = (int)Math.floor(Math.random() * (maxNum - minNum + 1) + minNum);

            if(num == 1){
                shapeList.add(new Triangle(Math.random() * (50 - 1),Math.random() * (50-1) ));
                x++;
            }

            if(num == 2){
                shapeList.add(new Rectangle(Math.random() * (50-1), Math.random()* (50-1)));
                x++;

            }

            if(num == 3){
                shapeList.add(new Circle(Math.random()*(50-1)));
                x++;
            }



        }

        for(Shape aShape:shapeList){
            System.out.println(aShape);
            System.out.println("_________________________________________________");
        }
        
        for(Shape aShape:shapeList){
            aShape.doubleSize();
        }

        for(Shape aShape:shapeList){
            System.out.println(aShape);
            System.out.println("_________________________________________________");
        }


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Scanner myObj = new Scanner(System.in);
        
        
        List<Rectangle> rectangleList = new ArrayList<Rectangle>();
        rectangleList.add(new Rectangle(4,5));
        rectangleList.add(new Rectangle(10,5));
        rectangleList.add(new Rectangle(15,4));
        rectangleList.add(new Rectangle(6,5));
        rectangleList.add(new Rectangle(13,6));
        for (int i=0; i < 5; i++){
            System.out.println(rectangleList.get(i));
        }
        System.out.println("Choose one Rectangle to double: ");
        
        
        //rectangleList.get(userChoice);

        

        myObj.close();
        
    }
}
