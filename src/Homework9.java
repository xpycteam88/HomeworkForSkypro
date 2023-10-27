import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        tasks();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] buhBook = new int[30];
        for (int i = 0; i < buhBook.length; i++) {
            buhBook[i] = random.nextInt(100_000) + 100_000;
            }
        return buhBook;
        }
    public static void tasks() {
        int[] buhBook = generateRandomArray();
        System.out.println("\nИсходный массив " + Arrays.toString(buhBook));
        // вывел для себя для визуальной проверки
        {
            int sum = 0; // начало задачи 1
            System.out.println("Задача №1");
            for (int current : buhBook) {
                sum += current;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        {
            int minCurrent = buhBook[0]; // начало задачи 2
            int maxCurrent = -1;
            System.out.println("\nЗадача №2");
            for (int current : buhBook) {
                if (current > maxCurrent) {
                    maxCurrent = current;
                }
                if (current < minCurrent) {
                    minCurrent = current;
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + minCurrent + " рублей.");
            System.out.println("Максимальная сумма трат за день составила " + maxCurrent + " рублей.");
        }
        {
            int sum = 0; // начало задачи 3
            float averageValue;
            System.out.println("\nЗадача №3");
            for (int current : buhBook) {
                sum += current;
            }
            averageValue = (float) sum / buhBook.length; //бухгалтерия же, привёл к float, уместно же?)
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
        }
        {
            System.out.println("\nЗадача №4"); // начало задачи 4
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
               System.out.print(reverseFullName[i]);
            }
        }

    }
}
