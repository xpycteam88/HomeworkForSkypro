public class Homework7 {
    public static void main(String[] args) {
        {
            int money = 15_000; // начало задачи 1
            int total = 0;
            int month = 0;
            System.out.println("Задача №1");
            while (total < 2_459_000) {
                total = total + total / 100;
                total = total + money;
                month++;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }

        int a = 1; // начало задачи 2
        System.out.println("\nЗадача №2");
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (a = a - 1; a >= 1; a--) {
            System.out.print(a + " ");
        }

        int population = 12_000_000; // начало задачи 3
        int fertility = 17;
        int mortality = 8;
        int populationInYear;
        System.out.println("\nЗадача №3");
        for (int year = 1; year <= 10; year++) {
            /*
            как-бы на будущее, разве не является хорошим тоном
            выносить длинное значение в отдельную переменную?
            понятное дело, что можно обойтись без 2 строчек кода - объявления
            переменной и присваивания ниже значения перемнной, но хочется вырабатывать привычку с нуля
             */
            populationInYear = population * (fertility - mortality) / 1000;
            population = population + populationInYear;
            System.out.println("Год " + year + ", численность составляет " + population + " человек");
        }
        {
            int deposit = 15_000; // начало задачи 4
            int percent = 7;
            int month = 1;
            System.out.println("\nЗадача №4");
            while (deposit < 12_000_000) {
                deposit = deposit + (deposit * percent / 100);
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
                month++;
            }
        }
        {
            int deposit = 15_000; // начало задачи 5
            int percent = 7;
            int month = 1;
            System.out.println("\nЗадача №5");
            while (deposit < 12_000_000) {
                deposit = deposit + (deposit * percent / 100);
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна "
                            + deposit + " рублей");
                }
                month++;
            }
        }
        {
            int deposit = 15_000; // начало задачи 6
            int percent = 7;
            int monthsInNineYears = 9 * 12;
            System.out.println("\nЗадача №6");
            for (int month = 1; month <= monthsInNineYears; month++) {
                deposit = deposit + (deposit * percent / 100);
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна "
                            + deposit + " рублей");
                }
            }
        }
        {
            int fridayFirst = 3; // начало задачи 7
            System.out.println("\nЗадача №7");
            for (int m = 1; m <= 31; m++) {
                if (m == fridayFirst) {
                    System.out.println("Сегодня пятница " + m + "-е число. Необходимо подготовить" +
                            " отчёт");
                    fridayFirst += 7;

                }
            }

        }
        {
            int yearNow = 2023; // начало задачи 8
            int yearBackTo200 = yearNow - 200;
            int yearForwardT0100 = yearNow + 100;
            System.out.println("\nЗадача №8");
            while (yearBackTo200 <= yearForwardT0100) {
                if (yearBackTo200 % 79 == 0) {
                    System.out.println(yearBackTo200);
                }
                yearBackTo200++;
            }
        }


    }
}
