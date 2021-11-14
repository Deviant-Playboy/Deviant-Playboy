package ru.mirea.prac3;

public class Square extends Rectangle{

    protected double side; // нет в условии

    public Square(){
        this.color = "Green";
        this.filled = false;
        this.length = 0;
    }

    public Square(double side){
        this.color = "Green";
        this.filled = false;
        this.length = side;
    }

    public Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.length = side;
    }

    public double getSide(){
        return length;
    }

    public void setSide(double side){ this.length = side;}

    @Override
    public void setWidth(double side){ this.length = side;}

    @Override
    public void setLength(double side){ this.length = side;}

    @Override
    public String toString(){
        return "Shape: square, side: " + this.length + ", color: " + this.color + ", filled: " + this.filled;
    }
}
