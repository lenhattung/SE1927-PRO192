
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Test {
    public static void main(String[] args) {
        ElectronicProduct e = new ElectronicProduct("LT01", "LG Gram 2in1-2023", "LG", 34000000, "2 years", "220V", "1000w");
        System.out.println(e);
        System.out.println(e.getPrice());
        
        CeramicProduct cp = new CeramicProduct("CS01", "Chen su Minh Long", "Minh Long", 25000, "Chen su");
        System.out.println(cp.getType());
        System.out.println(cp.getName());
        
        FoodProduct fp = new FoodProduct("HH", "Mi tom HAO HAO", "Acecook", 4000, new Date(125, 0, 10), new Date(125, 5, 10));
        System.out.println(fp);    
        
        Product p = new Product();
        Product p2 = new ElectronicProduct();
        Product p3 = new CeramicProduct();
        Product p4 = new FoodProduct();
    }
}
