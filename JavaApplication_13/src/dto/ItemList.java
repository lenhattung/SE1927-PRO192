/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author tungi
 */
public class ItemList {

    private Item[] list;
    private int numberOfItems;
    private int MAX = 100;

    public ItemList() {
        this.list = new Item[MAX];
        numberOfItems = 0;
    }

    public boolean addItem(Item item) {
        if (item == null || numberOfItems >= MAX) {
            return false;
        }
        list[numberOfItems] = item;
        numberOfItems++;
        return true;
    }

    public void displayAll() {
        if (numberOfItems == 0) {
            System.out.println("The list is empty!");
        } else {
            for (int i = 0; i < numberOfItems; i++) {
                System.out.println(list[i]);
            }
        }
    }

    public Item findItem(String creator) {
        for (int i = 0; i < numberOfItems; i++) {
            if (list[i].getCreator().equals(creator)) {
                return list[i];
            }
        }
        return null;
    }

    public int findItemIndex(String creator) {
        for (int i = 0; i < numberOfItems; i++) {
            if (list[i].getCreator().equals(creator)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateItem(int index) {
        if (index >= 0 && index < numberOfItems) {
            list[index].input();
            return true;
        }
        return false;
    }

    public boolean removeItem(int index) {
        if (index >= 0 && index < numberOfItems) {
            for (int j = index; j < numberOfItems; j++) {
                list[j] = list[j + 1];
            }
            numberOfItems--;
            return true;
        }
        return false;
    }

    //this method prints out all items that belong to the given type in the list.
    public void displayItemsByType(String type) {
        for (int i = 0; i < numberOfItems; i++) {
            if (type.equals("Vase")) {
                if (list[i] instanceof Vase) {
                    System.out.println(list[i]);
                }
            } else if (type.equals("Statue")) {
                if (list[i] instanceof Statue) {
                    System.out.println(list[i]);
                }
            } else {
                if (list[i] instanceof Painting) {
                    System.out.println(list[i]);
                }
            }
        }
    }

    //this method sorts items in ascending order based on their values.
    public void sortItems() {
        for (int i = 0; i < numberOfItems - 1; i++) {
            for (int j = i + 1; j < numberOfItems; j++) {
                if (list[i].getValue() > list[j].getValue()) {
                    Item tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

}
