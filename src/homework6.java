public class homework6 {
    public static void main(String[] args) {
        System.out.println("Задача №1"); // начало задачи 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадача №2"); // начало задачи 2
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }

        System.out.println("\nЗадача №3"); // начало задачи 3
        for (int g = 2; g <= 17; g = g + 2) {
            System.out.print(g + " ");
        }

        System.out.println("\nЗадача №4"); // начало задачи 4
        for (int k = 10; k >= -10; k--) {
            System.out.print(k + " ");
        }

        int year = 1904;
        System.out.println("\nЗадача №5"); // начало задачи 5
        for (; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println("\nЗадача №6"); // начало задачи 6
        for (int w = 7; w < 99; w = w + 7) {
            System.out.print(w + " ");
        }

        System.out.println("\nЗадача №7"); // начало задачи 7
        for (int r = 1; r <= 512; r = r * 2) {
            System.out.print(r + " ");
        }

        {
            int money = 29000; // начало задачи 8
            int total = 0;
            System.out.println("\nЗадача №8");
            for (int s = 1; s <= 12; s++) {
                total = total + money;
                System.out.println("Месяц " + s + ", сумма накоплений равна " + total + " рублей");
            }
        }

        {
            int money = 29000; // начало задачи 9
            int total = 0;
            System.out.println("\nЗадача №9");
            for (int s = 1; s <= 12; s++) {
                total = total + total / 100;
                total = total + money;
                System.out.println("Месяц " + s + ", сумма накоплений равна " + total + " рублей");
            }
        }

        int table = 2; // начало задачи 10
        System.out.println("\nЗадача №10");
        for (int z = 1; z <= 10; z++) {
            System.out.println(table + "*" + z + "=" + (table * z));
        }

    }
}
