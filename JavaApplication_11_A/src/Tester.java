/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Tester {
    public static void main(String[] args) {
        Shape s1 = new Square(new Point(1, 1), 15);
        
        Shape s2 = new Circle(new Point(1, 1), 100);
        
        Shape s3 = new Shape() {
            @Override
            public double area() {
                return 0;
            }
        };
    }
}