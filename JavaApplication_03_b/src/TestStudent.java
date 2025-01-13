/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class TestStudent {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.setProductId("P0001");
        p1.setPrice(100000);
        
        System.out.println(p1);
        p1.setName("San Pham 1");
        p1.setQuantity(-100);
        System.out.println(p1);
        
    }
}
