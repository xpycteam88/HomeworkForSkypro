public class Homework10 {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameMethod = String.join(" ", lastName, firstName, middleName);
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("ФИО сотрудника - " + fullNameMethod);

        System.out.println("\nЗадача №2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("\nЗадача №3");
        String text = "Данные Ф. И. О. сотрудника — ";
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(text + fullName);

    }
}
