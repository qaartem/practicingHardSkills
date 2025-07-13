package org.example.practicinghradskills.constructors;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void applyDiscount(double discount) {
        if (discount < 0 || discount > 100) {
            System.out.println("Ошибка: скидка должна быть в диапазоне от 0 до 100%");
            return;
        }
        price = price - (price * discount / 100);
    }

    public void printInfo(){
        System.out.println("Товар: " + name + " ," + "Цена: " + price);
    }

}
