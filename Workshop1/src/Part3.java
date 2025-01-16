
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
public class Part3 {

    public static void main(String[] args) {
        String[] list = new String[10];
        Scanner sc;
        int n = 2;
        for (int i = 0; i < n; i++) {
            sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            list[i] = sc.nextLine();
        }

        /* --------------- */
//        for (int i = 0; i < 10; i++) {
//            System.out.println(list[i].toUpperCase()); // chuyen thanh chu hoa
//            System.out.println(list[i].toLowerCase()); // chuyen thanh chu thuong
//            System.out.println("----");
//        }
//        String s = "nguyen XUAN son";
//        String[] names = s.split(" ");
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[0].substring(0,1));
//        System.out.println(names[0].substring(1));

        for (int i = 0; i < n; i++) {
            String names[] = list[i].split(" ");
            for(int j=0; j<names.length; j++){
                String t = names[j];
                names[j] = t.substring(0, 1).toUpperCase()+t.substring(1).toLowerCase();
            }
            list[i] = String.join(" ", names);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);
        }
    }
}
