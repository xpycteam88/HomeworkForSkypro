public class homework5 {
    public static void main(String[] args) {

        int clientOS = 1; // начало задачи 1
        System.out.println("Задача №1");
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Под такую систему приложение отсутствует");
        }

        int clientDeviceYear = 2015; //начало задачи 2
        clientOS = 1;
        System.out.println("\nЗадача №2");
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Под такую систему приложение отсутствует");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Под такую систему приложение отсутствует");
            }
        }

        int year = 2100; // начало задачи 3
        int yearAliquot4 = year % 4;
        int yearAliquot100 = year % 100;
        int yearAliquot400 = year % 400;
        System.out.println("\nЗадача №3");
        if (year >= 1584) {
            if (yearAliquot400 == 0 || (yearAliquot4 == 0 && yearAliquot100 != 0)) {
                System.out.println(year + " год високостный");
            } else {
                System.out.println(year + " год не високостный");
            }
        } else {
            System.out.println("Год должен быть больше, чем 1584 (в котором был введен високосный год)");
        }

        int deliveryDistance = 61; // начало задачи 4
        int deliveryDays = 1;
        System.out.println("\nЗадача №4");
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryDays += 1;
            } else if (deliveryDistance > 60) {
                deliveryDays += 2;
            }
            System.out.println("На доставку потребуется дней: " + deliveryDays);
        }

        int monthNumber = 3; // начало задачи 5
        System.out.println("\nЗадача №5");
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц относится к зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц относится к весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц относится к лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц относится к осени");
                break;
            default:
                System.out.println(monthNumber + " - такого месяца не существует");
        }

    }
}
