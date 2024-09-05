package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double baseIn, double heightIn){
        if (baseIn < 0 || heightIn < 0 ){
            throw new IllegalArgumentException("No negative numbers");
        }
        base = baseIn;
        height = heightIn;
    }

    public double calcArea(){
        return (base * height) / 2;
    }

    public double longestLineWithin(){
        double newNum = (base * base) + (height * height);
        return Math.sqrt(newNum);
    }

    public void doubleSize(){
        height = height * 2;
        base = base * 2;
    }
    
    public String toString(){
        return " Base = " + base + " Height = " + height + " Area = " + calcArea() + " Longest Line = " + longestLineWithin();
    }

}
