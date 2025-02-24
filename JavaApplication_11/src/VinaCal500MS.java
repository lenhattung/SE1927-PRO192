/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class VinaCal500MS implements Calculator, ISort{

    @Override
    public double add(double a, double b) {
        return b+a;
    }

    @Override
    public double substract(double a, double b) {
        return b-a;
    }

    @Override
    public double sqrt(double x) {
        return x*x;
    }

    @Override
    public void sortAsc(double[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void x1() {
    }
    
}
