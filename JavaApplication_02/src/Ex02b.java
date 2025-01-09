/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Ex02b {
    public static void main(String[] args){
       // Arithmetic
       int a = 5;
       int b = 2;
       System.out.println(a +"+" + b +"="+a+b);
       System.out.println(a +"+" + b +"="+(a+b));
       System.out.println(a +"%" + b +"="+a%b);
       System.out.println(a/b);
       // Unary
       int c = -a;
       System.out.println(c);
       
       // 
       int x = 5;
       int y = 5;
       System.out.println(x++);
       System.out.println(++x);
       System.out.println(--x);
       System.out.println(x--);
       
       //
       x = 5;
       y = 7;
       System.out.println(x++ + ++y);
       
       // 
       System.out.println("=====");
       x = 15; 
       System.out.println(x);
       x = x>>1;
       System.out.println(x);
       x = x<<1;
       System.out.println(x);
    }
}
