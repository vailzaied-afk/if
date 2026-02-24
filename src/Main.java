public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 5;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        int speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");

        }

        int numberOfYears = 20;
        if (numberOfYears >= 2 && numberOfYears <= 6) {
            System.out.println("Если возраст человека равен " + numberOfYears + ", то ему нужно ходить в детский сад");
        } else if (numberOfYears >= 7 && numberOfYears <= 17) {
            System.out.println("Если возраст человека равен " + numberOfYears + ", то ему нужно ходить в школу");

        } else if (numberOfYears >= 18 && numberOfYears <= 24) {
            System.out.println("Если возраст человека равен " + numberOfYears + ", то его место в университете");
        } else if (numberOfYears > 24) {
            System.out.println("Если возраст человека равен " + numberOfYears + ", то ему пора ходить на работу");
        }


        int childhood = 4;
        if (childhood < 5) {
            System.out.println("Если возраст ребенка равен " + childhood + ", то ему нельзя кататься на аттракционе");
        } else if (childhood >= 5 && childhood <= 14) {
            System.out.println("Если возраст ребенка равен " + childhood +
                    ", то ему можно кататься на аттракционе в сопровождении взрослого");

        } else if (childhood > 14) {
            System.out.println("Если возраст ребенка равен " + childhood +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int numberOfPeopleInTheCarriage = 102;
        int seats = 60;
        int standingPlaces = numberOfPeopleInTheCarriage - seats;
        int numberOfSeatedPassengers = 50;
        int numberOfPassengersStanding = 42;

        if (numberOfSeatedPassengers < seats) {
            int accessibleSeating = seats - numberOfSeatedPassengers;

            System.out.println("Доступное количество сидячих мест " + accessibleSeating + " шт.");
        }
        if (numberOfPassengersStanding < standingPlaces) {
            int accessibleStanding = standingPlaces - numberOfPassengersStanding;
            System.out.println("Доступное количество стоячих мест " + accessibleStanding + " шт.");
        } else if (numberOfPeopleInTheCarriage <= numberOfSeatedPassengers + numberOfPassengersStanding) {
            System.out.println("Вагон полностью забит");

        }

        int one = 4;
        int two = 4;
        int three = 4;
        if (one > two && one > three) {
            System.out.println(one + "больше остальных чисел");
        } else if (two > one && two > three) {
            System.out.println(two + "больше остальных чисел");
        } else if (three > two && three > one) {
            System.out.println(three + "больше остальных чисел");
        } else if (one == two || two == three || one == three) {
            System.out.println("Некоторые переменные имеют одинаковое максимальное значение. Измените переменные.");


        }


    }
}