package org.example.practicinghradskills;

import org.example.practicinghradskills.constructors.*;
import org.example.practicinghradskills.fourthSetOfTasks.Planet;
import org.example.practicinghradskills.thirdSetOfTasks.*;
import org.openqa.selenium.json.JsonOutput;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Сложение: " + MathOperations.add(1, 2));
        System.out.println("разность: " + MathOperations.subtract(1, 2));
        System.out.println("произведение: " + MathOperations.multiply(1, 2));
        System.out.println("деления: " + MathOperations.divide(10, 2));
        System.out.println("большее из двух чисел: " + MathOperations.findMax(10, 2));
        System.out.println("разницы между двумя числами: " + MathOperations.difference(10, 2));
        System.out.println("возвращает площадь квадрата: " + MathOperations.squareArea(10));
        System.out.println("возвращает периметр квадрата: " + MathOperations.squarePerimeter(10));
        System.out.println("перевода секунд в минуты: " + MathOperations.convertSecondsToMinutes(100));
        System.out.println("вычисления средней скорости: " + MathOperations.averageSpeed(150, 100));
        System.out.println("нахождения гипотенузы: " + MathOperations.findHypotenuse(150, 100));
        System.out.println("вычисления длины окружности: " + MathOperations.circleCircumference(150));
        System.out.println("вычисления процентов: " + MathOperations.calculatePercentage(100, 10));
        System.out.println("перевода градусов Цельсия в Фаренгейты: " + MathOperations.celsiusToFahrenheit(100));
        System.out.println("переводит температуру из Фаренгейтов в Цельсии: " + MathOperations.fahrenheitToCelsius(212));

        Car car = new Car("Toyota", 2015);
        car.print();

        Rectangle rectangle = new Rectangle(15, 10);
        rectangle.setWidth(16);
        System.out.println("Area: " + rectangle.calculateArea());

        Book book = new Book("Гарри Поттер", "Автор");
        book.printInfo();
        book.setAuthor("Джоан Роулинг");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Owner", 0);
        bankAccount.printBalance();
        bankAccount.deposit(100);
        bankAccount.withdraw(101);
        System.out.println("Баланс: " + bankAccount.printBalance());

        Point point = new Point(10, 5);
        point.setX(6);
        point.print();

        StudentGroup studentGroup = new StudentGroup("QA", 10);
        studentGroup.setStudentCount(25);
        studentGroup.printInfo();

        Circle circle = new Circle(5);
        circle.setRadius(6);
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("длину круга: " + circle.calculateCircumference());

        Teacher teacher = new Teacher("Анна Ивановна", "Физра");
        teacher.setSubject("Математика");
        teacher.printInfo();

        Product product = new Product("Хлеб", 10.0);
        product.setPrice(100.0);
        product.applyDiscount(50);
        product.printInfo();

        Laptop laptop = new Laptop("Lenovo", 10000);
        laptop.setPrice(70000);
        laptop.printInfo();

        Company employee1 = new Company(1, "Tom");
        Company employee2 = new Company(2, "Bob");
        System.out.println("Before: " + Company.getCompanyName());
        Company.setCompanyName("New Company");
        System.out.println("After: " + Company.getCompanyName());
        Company.printCompanyName();

        System.out.println(MathConstants.calculateArea(6));
        System.out.println(MathConstants.calculateCircumference(6));
        System.out.println(MathConstants.calculateArea(10));
        System.out.println(MathConstants.calculateCircumference(10));

        Library library = new Library();
        library.setBookTitle("TitleChanged");
        System.out.println("Title Changed: " + library.getBookTitle());
        library.setYear(2020);
        System.out.println("Year Changed: " + library.getYear());
        library.setAuthor("Author");
        System.out.println("Author Changed: " + library.getAuthor());
        library.setYear(2020);
        System.out.println("Year Changed: " + library.getYear());
        library.setCategory("IT");
        System.out.println("Category Changed: " + library.getCategory());

        University student1 = new University(1, "Tom");
        University student2 = new University(2, "Bob");
        University student3 = new University(3, "Alex");
        University.changeUniversityName("New University");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        GameSettings game1 = new GameSettings("Name", 1);
        GameSettings game2 = new GameSettings("Name2", 2);
        GameSettings.setMaxPlayers(2);
        game1.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

        Person person1 = new Person("1", "name", "last");
        Person person2 = new Person("2", "Tom", "Bob");
        person1.setLastName("changedLastname1");
        person2.setLastName("changedLastname2");
        person1.printPersonInfo();
        person2.printPersonInfo();

//        1. Задачи на if-else
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Число: ");
        int number = scanner.nextInt();
        if(number > 0){
            System.out.println("Число положительное");
        } else if (number < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }

//        Создайте программу, которая принимает два числа и выводит наибольшее из них.
        System.out.println("Введите Числa: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("наибольшее из них: " + Math.max(number1, number2));

        System.out.println("Введите Число от 1-5: ");
        int grade = scanner.nextInt();
        if (grade == 5){
            System.out.println("Отлично");
        } else if (grade == 4){
            System.out.println("Хорошо");
        } else if (grade == 3){
            System.out.println("Удовлетворительно");
        } else if (grade == 2 || grade == 1){
            System.out.println("Неудовлетворительно");
        }

        System.out.println("Введите Число от 1-7: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Doesn't exist");
        }

        System.out.println("Введите планету: ");
        String planet = scanner.next().toUpperCase();
        Planet planet1 = Planet.valueOf(planet);
        System.out.println("Порядковый номер: " + planet1.getNumber());
        System.out.println("Масса относительно Земли: " + + planet1.getMass());


        System.out.println("Введите число: ");
        double num = scanner.nextDouble();
        System.out.println("Введите знак: ");
        char operator = scanner.next().charAt(0);
        System.out.println("Введите число: ");
        double num2 = scanner.nextDouble();
        switch (operator){
            case '+':
                System.out.println("Результат: " + (num + num2));
                break;
            case '-':
                System.out.println("Результат: " + (num - num2));
                break;
            case '*':
                System.out.println("Результат: " + (num * num2));
                break;
            case '/':
                System.out.println("Результат: " + (num / num2));
                break;
                default:
                    System.out.println("Doesn't exist");
        }

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Введите число: ");
        int num4 = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= num4; i ++){
            sum += i;
        }
        System.out.println("Сумма чисел: " + sum);

        System.out.println("Введите число: ");
        int num5 = scanner.nextInt();
        int result = 0;
        for(int i = 1; i <= 10; i ++){
            result = i * num5;
            System.out.println(num5 + " * " + i + " = " + result);
        }

        System.out.println("Введите число: ");
        int factorial = scanner.nextInt();
        int result12 = 1;
        int i = 1;
        while(i <= factorial){
            result12 = result12 * i;
            i++;
        }
        System.out.println("Факториал: "+ result12);

        System.out.println("Введите число: ");
        int number0 = scanner.nextInt();
        int a = 2;
        while(a <= number0){
            System.out.println("все чётные числа от 1: " + a + " ");
            a = a + 2;
        }

        System.out.println("Введите число: ");
        int positiveNumber = scanner.nextInt();
//        int a = 0;
        while(positiveNumber > 0){
            System.out.println("обратный отсчёт: " + positiveNumber + " ");
            positiveNumber--;
        }
        int doWhileNumber2;
        do{
            System.out.println("Введите положительное число: ");
            doWhileNumber2 = scanner.nextInt();
        } while (doWhileNumber2 <= 0);

    String password1 = "password";
    String tryPassword;
    do {
        System.out.println("Введите password: ");
        tryPassword = scanner.nextLine();
    } while (!tryPassword.equals(password1));
        int ii = 0;
        do {
            ii = ii + 1;
            System.out.println("Numbers: " + ii);
        } while (ii < 10);

        System.out.println("Введите числа: ");
        int num12 = scanner.nextInt();
        int num13 = scanner.nextInt();
//        int sum = 0;
        System.out.println(num12 + num13);
        while (true) {
            if (num12 < 0 || num13 < 0) {
                System.out.println("отрицательное число");
                break;
            }
        }


        for(int i2 = 1; i2 <= 20; i2++) {
            if(i2 % 3 == 0){
                continue;
            }
            System.out.print(i2 + " ");
            }

        int count = 0;
        for(int i3 = 1; ; i3++) {
            if(i3 % 2 == 0 && i3 % 5 == 0){
                System.out.print(i3 + " ");
                count++;
            }
            if(count == 10)
                break;
        }



    }
}
