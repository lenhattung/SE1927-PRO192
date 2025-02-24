/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Square extends Shape {

    private int width;

    public Square() {
    }

    public Square(Point p, int width) {
        super(p);
        this.width = width;
    }

    @Override
    public double area() {
        return width * width;
    }

}
