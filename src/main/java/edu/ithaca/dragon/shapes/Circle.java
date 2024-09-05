package edu.ithaca.dragon.shapes;

public class Circle implements Shape{
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if (radius < 0){
            throw new IllegalArgumentException("negative number");
        }
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return 3.1415 * (this.radius * this.radius);
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius = this.radius * 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return this.radius * 2;
    }

    public String toString(){
        return " Radius = " + this.radius + " Area = " + this.calcArea() + " Longest Line = " + this.longestLineWithin();
    }
}
