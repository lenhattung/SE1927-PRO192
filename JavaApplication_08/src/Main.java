
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tungi
 */
public class Main {

    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a:");
            a = sc.nextInt();
            System.out.println("Input b:");
            b = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            System.out.println(a + "+" + b + "=" + (a + b));
        }
        
    }
}
