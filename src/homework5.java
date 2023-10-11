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

        int clientDeviceYear = 2014; //начало задачи 2
        clientOS = 0;
        System.out.println("\nЗадача №2");
        if (clientDeviceYear >= 2015) {
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
        } else switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Под такую систему приложение отсутствует");

        }

        int year = 2100; // надачло задачи 3
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
    }
}
