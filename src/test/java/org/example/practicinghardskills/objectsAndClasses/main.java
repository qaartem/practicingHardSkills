package org.example.practicinghardskills.objectsAndClasses;

public class main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2025);
        car.print();
        car.setYear(2026);
        car.print();

        Product product = new Product("Product", 1000);
        product.setPrice(2000);
        product.applyDiscount(50);
        product.printInfo();


        Laptop laptop = new Laptop("Laptop", 2000);
        laptop.setPrice(1000);
        laptop.printInfo();
    }
}
