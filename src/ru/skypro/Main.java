package ru.skypro;

public class Main {

    public static void main(String[] args) {
        {
            //Задание №1, 2
            System.out.println("Задание №1,2");
            int clientOS = 0;
            int clientDeviceYear = 2015;

            if ((clientOS == 1) && (clientDeviceYear >= 2015)) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if ((clientOS == 1) && (clientDeviceYear < 2015)) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if ((clientOS == 0) && (clientDeviceYear >= 2015)) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if ((clientOS == 0) && (clientDeviceYear < 2015)) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            System.out.println("_____");

            //Задание №3
            System.out.println("Задание №3");
            int year = 2021;

            if ((year % 4 == 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
            System.out.println("_____");

            //Задание №4
            System.out.println("Задание №4");
            int deliveryDistance = 21;
            int deliveryInterval = 40;
            int nearestInterval = 20;
            int deliveryDays = 1;

            if (deliveryDistance > nearestInterval) {
                deliveryDays = ((deliveryDistance - nearestInterval) / deliveryInterval) + 2;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
            System.out.println("_____");

            //Задание №5
            System.out.println("Задание №5");
            int monthNumber = 3;

            switch (monthNumber) {
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
                default:
                    System.out.println("Такого времени года не существует");
            }
        }
    }
}
