public class homework4 {
    public static void main(String[] args) {
        int ageHuman = 5; // начало задачи 1
        System.out.println("Задача №1");
        if (ageHuman >= 18) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + ", то он не достиг совершеннолетия");
        }

        int temp = 1; // начало задачи 2
        System.out.println("\nЗадача №2");
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, сиди-ка ты дома, а то простудишься");
        } else {
            System.out.println("На улице " + temp + " градусов, сходи проветрись");
        }

        int speed = 89; //начала задачи 3
        int speedLimit = 60;
        boolean speedMoreSpeedLimit = speed > speedLimit;

        System.out.println("\nЗадача №3");
        if (speedMoreSpeedLimit) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        ageHuman = 135; // начало задачи 4
        boolean manWasBorn = ageHuman >= 2;

        System.out.println("\nЗадача №4");
        if (manWasBorn) {
            if (ageHuman <= 6) {
                System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить" +
                        " в детский сад");
            } else {
                if (ageHuman > 6 && ageHuman <= 17) {
                    System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить" +
                            "ходить в школу");
                } else {
                    if (ageHuman > 17 && ageHuman <= 24) {
                        System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить" +
                                "в универ");
                    } else {
                        if (ageHuman > 24 && ageHuman < 35) { // по себе знаю :)
                            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить" +
                                    " на работу");
                        } else {
                            System.out.println("Если возраст человека равен " + ageHuman + ", то он стар, " +
                                    "чтобы куда-то ходить");
                        }
                    }
                }
            }
        } else {
            System.out.println("Человек не родился или ещё мал");
        }

        ageHuman = 13; // начало задачи 5
        boolean presenceAdult = false;

        System.out.println("\nЗадача №5");
        if (ageHuman < 5) {
            System.out.println("Если возраст ребенка равен " + ageHuman + ", то ему нельзя кататься на аттракционе");
        } else {
            if (ageHuman > 14) {
                System.out.println("Если возраст ребенка равен " + ageHuman +
                        ", то ему можно кататься на аттракционе без сопровождении взрослого");
            } else {
                if (presenceAdult) {
                    System.out.println("Если возраст ребенка равен " + ageHuman +
                            ", то ему можно кататься на аттракционе т.к. присутсвует взрослый");
                } else {
                    System.out.println("Если возраст ребенка равен " + ageHuman +
                            ", то ему нельзя кататься на аттракционе т.к. отсутвует взрослый");
                }
            }
        }

        int passengerNumbers = 10; // начало задачи 6
        int placesСoach = 102;
        int seated = 60;
        int standing = placesСoach - seated;

        System.out.println("\nЗадача №6");
        System.out.println("Количество пассажиров: " + passengerNumbers + "; всего мест в вагоне: " + placesСoach);
        if (passengerNumbers <= 0) {
            System.out.println("Вагон пуст. Cидячих мест: " + seated + "; стоячих мест: " + standing);
        } else {
            if (passengerNumbers > placesСoach) {
                System.out.println("Вагон забит: " + (passengerNumbers - placesСoach) + " оставшихся поедут " +
                        " в другом вагоне");
            } else {
                if (passengerNumbers <= seated) {
                    System.out.println("В вагоне есть места, стоячих: " + (seated - passengerNumbers) +
                            "; стоячих: " + standing);
                } else {
                    System.out.println("В вагоне есть места, стоячих: " + (seated - seated) +
                            "; стоячих: " + (placesСoach - passengerNumbers));
                }
            }
        }

        int one = 3; // начало задачи 7
        int two = 5;
        int three = 5;
        boolean variableOneEqualTwo = one == two;
        boolean variableTwoEqualThree = two == three;
        boolean variableOneEqualThree = one == three;

        System.out.println("\nЗадача №7");
        System.out.println("Переменная one со значением " + one);
        System.out.println("Переменная two со значением " + two);
        System.out.println("Переменная three со значением " + three);
        if (variableOneEqualTwo && variableTwoEqualThree) {
            System.out.println("Переменные " + one + " " + two + " " + three + " равны");
        } else {
            if (one > two) {
                if (variableOneEqualThree) {
                    System.out.println("Переменные one и three с одинаковыми значениями");
                } else {
                    if (one > three) {
                        System.out.println("Переменная one со значением " + one + " больше остальных");
                    } else {
                        System.out.println("Переменная three со значением " + three + " больше остальных");
                    }
                }
            } else {
                if(variableTwoEqualThree) {
                    System.out.println("Переменные two и three с одинаковыми значениями");
                } else {
                    if (two > three) {
                        System.out.println("Переменная two со значением " + two + " больше остальных");
                    } else {
                        System.out.println("Переменная three со значением " + three + " больше остальных");
                    }
                }
            }
        }
    }
}