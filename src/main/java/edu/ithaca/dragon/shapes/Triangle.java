package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double baseIn, double heightIn){
        base = baseIn;
        height = heightIn;
    }

    public double calcArea(){
        return (base * height) / 2;
    }

    public double longestLineWithin(){
        return height;
    }

    public void doubleSize(){
        height = height * 2;
        base = base * 2;
    }
    
}
