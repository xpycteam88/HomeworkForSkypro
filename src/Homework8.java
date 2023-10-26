import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
        int[] integerNumbers = new int[3]; // начало задачи 1
        integerNumbers[0] = 1;
        integerNumbers[1] = 2;
        integerNumbers[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        boolean[] logicalValues = {true, true, false};

        System.out.println("\nЗадача №2");  // начало задачи 2
        for (int i = 0; i < integerNumbers.length; i++) {
            if (i == integerNumbers.length - 1) {
                System.out.println(integerNumbers[i]);
                break;
            }
            System.out.print(integerNumbers[i] + ", ");
        }
        for (int i = 0; i < fractionalNumbers.length; i++) {
            if (i == fractionalNumbers.length - 1) {
                System.out.println(fractionalNumbers[i]);
                break;
            }
            System.out.print(fractionalNumbers[i] + ", ");
        }
        for (int i = 0; i < logicalValues.length; i++) {
            if (i == logicalValues.length - 1) {
                System.out.println(logicalValues[i]);
                break;
            }
            System.out.print(logicalValues[i] + ", ");
        }

        System.out.println("\nЗадача №3"); // начало задачи 3
        for (int i = integerNumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(integerNumbers[i]);
                break;
            }
            System.out.print(integerNumbers[i] + ", ");
        }
        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(fractionalNumbers[i]);
                break;
            }
            System.out.print(fractionalNumbers[i] + ", ");
        }
        for (int i = logicalValues.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(logicalValues[i]);
                break;
            }
            System.out.print(logicalValues[i] + ", ");
        }

        System.out.println("\nЗадача №4"); // начало задачи 4
        int [] randomNumbers = {1, 4, 5, 8, 11, 12, 17, 22, 31, 45, 47, 56};
        // отошёл от задания, использовал не первоначальный массив,
        // а рандомный для наглядности работы для себя
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] % 2 != 0) {
                randomNumbers[i] = randomNumbers[i] + 1;
            }
        }
        System.out.print(Arrays.toString(randomNumbers));

    }
}
