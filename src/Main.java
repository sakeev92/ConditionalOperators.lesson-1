        public class Main {
            public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
                task5();
                task6();
                task7();
            }

            public static void task1() {
                System.out.println("Задача 1");
                int age = 19;
                if (age >= 18) {
                    System.out.println(" Он совершеннолетний");
                } else {
                    System.out.println(" Он не достиг совершеннолетия, нужно немного подождать»");
                }
            }


            public static void task2() {
                System.out.println("Задача 2");
                int temperature = 4;
                if (temperature < 5) {
                    System.out.println("На улице холодно, нужно надеть шапку");
                }

                if (temperature > 5) {
                    System.out.println("Сегодня тепло, можно идти без шапки");
                }
            }

            public static void task3() {
                System.out.println("Задача 3");
                int speed = 50;
                if (speed > 60) {
                    System.out.println("Скорость превышена придется заплатить штраф");
                } else {
                    System.out.println("Превышения скорости нет то можно ездить спокойно");
                }
            }

            public static void task4() {
                System.out.println("Задача 4");
                int age = 5;
                boolean kindergarten = age >= 2 && age <=6;
                if (kindergarten){
                    System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");}
                boolean scoll = age >= 7 && age <=18;
                if (scoll){
                    System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");}
                boolean university = age >= 18 && age <=24;
                if (university){
                    System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");}
                boolean work = age >= 24;
                if (work){
                    System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");}

            }
            public static void task5() {
                System.out.println("Задача 5");
                int age = 4;
                if (age < 5) {
                    System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе"); }
                if (age >=5 && age < 14) {
                    System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься на аттракционе в сопровождении взрослого");  }
                if (age >14 ) {
                    System.out.println("Если возраст ребенка равен " + age + " , то ему нужно кататься на аттракционе без сопровождения взрослого"); }
                }
            public static void task6() {
                System.out.println("Задача 6");
                int people = 1;
                int oneCar = 102;
                int seating = 60;
                int standing = oneCar - seating;
                if (people <= seating) {
                    System.out.println("В вагоне поезда осталось " + (seating - people) + " сидячих мест и 42 стоячих мест");
                } else if (people <= seating || people <= oneCar) {

                    System.out.println("В вагоне поезда закончились сидячие места и осталось " + (oneCar - people) + " стоячих мест");
                } else {
                    System.out.println("В вагоне  закончились места");
                }}

                public static void task7() {
                    System.out.println("Задача 7");
                    int one = -10;
                    int two = -5;
                    int three = -1;
                    if (one > two && one > three){
                        System.out.println("Большее число " + one + "");}
                    else if (two > one && two > three) {
                        System.out.println("Большее число " + two + "");}
                    else {
                        System.out.println("Большее число " + three + "");}


                        }
                    }





























