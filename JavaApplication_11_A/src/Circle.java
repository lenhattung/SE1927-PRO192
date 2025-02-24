/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Circle extends Shape{
    private int radius;

    public Circle() {
    }

    public Circle(Point p, int radius) {
        super(p);
        this.radius = radius;
    }
    
    
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
    
}
