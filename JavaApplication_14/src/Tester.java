
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.add(20);
        myList.add(20);
        myList.add(20);
        myList.add(20);

        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList);
        myList.remove(new Integer(10));
        System.out.println(myList);
        for (Integer integer : myList) {
            System.out.println(integer);
        }
        System.out.println("====");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
