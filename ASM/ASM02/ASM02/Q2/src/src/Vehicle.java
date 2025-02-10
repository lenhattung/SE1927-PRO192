/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Vehicle {

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Vehicle() {
    }

    public Vehicle(String id, String name, double price, int quantity) {
        //this.id = id;
        setId(id);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.length() != 7 || !id.startsWith("V")) {
            this.id = "V000000";
            return;
        }

        for (int i = 1; i < 7; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                this.id = "V000000";
                return;
            }
        }

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
