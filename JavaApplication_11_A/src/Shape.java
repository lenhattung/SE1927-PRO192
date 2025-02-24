/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public abstract class Shape {
    protected Point p;

    

    public Shape() {
    }
    
    public Shape(Point p) {
        this.p = p;
    }
    public abstract double area();
}
