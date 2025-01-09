
import java.util.Scanner;

public class Ex02e {

    public static void main(String[] args) {
       // ax^2 + bx + c = 0
       double a,b,c;
       double delta, x1, x2;
       
       // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a:");
        a = sc.nextDouble();
        System.out.println("Nhap vao so b:");
        b = sc.nextDouble();
        System.out.println("Nhap vao so c:");
        c = sc.nextDouble();
       
       // Tính delta
       delta = b*b - 4*a*c;
       
       // Kiểm tra
       if (delta<0){
           System.out.println("Phuong trinh vo nghiem!");
       }else if (delta==0){
           x1=x2= (-b/(2*a));
           System.out.println("Phuong trinh co nghiem kep x1=x2=" +x1);
       }else{
           x1 = (-b-Math.sqrt(delta))/(2*a);
           x2 = (-b+Math.sqrt(delta))/(2*a);
           System.out.println("Phuong trinh co 2 nghiem phan biet: ");
           System.out.println("x1="+x1);
           System.out.println("x2="+x2);
       }
    }
}
