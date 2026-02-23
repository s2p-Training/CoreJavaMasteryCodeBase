package section15_OOP_Encapsulation_And_Abstraction;

import java.util.Random;

// Student Challenge
class Product
{
    private int itemNumber;
    private String name;
    private float price;
    private int qty;

    public Product()
    {
        itemNumber = new Random().nextInt();
    }

    public Product(int itemNumber, String name, float price, int qty)
    {
        itemNumber = itemNumber;
        name = name;
        price = price;
        qty = qty;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

public class Example11
{
    public static void main(String[] args) {

    }
}
