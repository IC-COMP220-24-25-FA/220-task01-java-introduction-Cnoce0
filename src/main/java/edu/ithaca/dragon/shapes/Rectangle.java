package edu.ithaca.dragon.shapes;

public class Rectangle  implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        if (length < 0 || width < 0){
            throw new IllegalArgumentException("No negative numbers");
        }
        this.length = length;
        this.width = width;

    }

    public double calcArea(){
       return this.length * this.width;
    }

    public void doubleSize(){
        this.length = this.length * 2;
        this.width = this.width * 2;
    }

    public double longestLineWithin(){
        double num = this.length * this.length;
        double num2 = this.width * this.width;
        double num3 = num + num2;
        return Math.sqrt(num3);
    
        
    }

    public String toString(){
        return " Width = " + this.width + " Height = " + this.length + " Area = " + this.calcArea() + " Longest Line within = " + this.longestLineWithin();
    }
    
}
