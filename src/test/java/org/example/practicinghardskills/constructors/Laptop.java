package org.example.practicinghardskills.constructors;

public class Laptop {
    private String brand;
    private double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Ноутбук: " + brand + " ," + "Цена: " + price);
    }
}
