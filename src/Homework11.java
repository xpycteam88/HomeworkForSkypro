import java.time.LocalDate;

public class Homework11 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYears(int year) {
        boolean result = true;
        if (year < 1584) {
            return;
        }
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            printResult(year, result);
        } else {
            result = false;
            printResult(year, result);
        }
    }

    public static void printResult(int y, boolean res) {
        if (res) {
            System.out.println(y + " год - високостный год");
        } else {
            System.out.println(y + " год - невисокостный год");
        }
    }

    public static void task1() {
        int year = 1760;
        System.out.println("Задача №1");
        checkYears(year);

    }

    public static void installApps(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        boolean oldDevice = year < currentYear;
        String clientOs = os == 1 ? "Android" : "iOS";
        String versionApp = oldDevice ? "облегченную" : "";
        System.out.println("Установите " + versionApp + " версию приложения для " + clientOs + " по ссылке");
    }

    public static void task2() {
        int clientOs = 1;
        int deviceYear = 2016;
        System.out.println("\nЗадача №2");
        installApps(clientOs, deviceYear);
    }

    public static int daysForDelivery(int dist) {
        int daysForDelivery = 1;
        if (dist > 20) {
            daysForDelivery++;
        }
        if (dist > 60) {
            daysForDelivery++;
        }
        return daysForDelivery;
    }

    public static void task3() {
        System.out.println("\nЗадача №3");
        int distance = 25;
        if (distance > 100 || distance < 0) {
            System.out.println("Доставки нет");
        } else {
            daysForDelivery(distance);
            int totalDays = daysForDelivery(distance);
            System.out.println("Дней на доставку: " + totalDays);
        }
    }

}
