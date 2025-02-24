/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class CasioFX500MS implements Calculator{

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public double sqrt(double x) {
        return Math.sqrt(x);
    }

    @Override
    public void x1() {
    }
    
}
