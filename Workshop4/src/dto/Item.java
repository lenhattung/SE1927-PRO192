/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class Item {

    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        int value = -1;
        do {
            System.out.println("Input value (value>0):");
            value = sc.nextInt();
        } while (value<=0);
        
        String creator = "";
        do {
            System.out.println("Input creator (not empty):");
            sc = new Scanner(System.in);
            creator = sc.nextLine();
        } while (creator.isEmpty());
        
        
        this.value = value;
        this.creator = creator;
    }

    public void output() {
        System.out.println("Value: "+ this.getValue());
        System.out.println("Creator: "+ this.getCreator());
    }
}
