package homework;

public class HW5 {

    static int tcNumber = 1;

    public static void printTCNumber() {
        System.out.println("TC " + tcNumber++);
    }

    public static void printSubNumber(int subNumber) {
        System.out.print(" " + subNumber + ")");
    }

    public static void printTCLetter(String letter) {
        System.out.println(" " + letter + ")");
    }

    public static void printTestResult(String value) {
        System.out.println("\t ---> \t" + value);
    }

    //Задание 1
    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {

            return "\tPass";
        } else {

            return "\tFail";
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {

            return "\tPass";
        } else {

            return "\tFail";
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {

            return "\tPass";
        } else {

            return "\tFail";
        }
    }

    public static String returnWeekday(int dayNumber) {
        if (dayNumber > 0 && dayNumber < 8) {

            if (dayNumber == 1) {

                return "Monday";
            }
            if (dayNumber == 2) {

                return "Tuesday";
            }
            if (dayNumber == 3) {

                return "Wednesday";
            }
            if (dayNumber == 4) {

                return "Thursday";
            }
            if (dayNumber == 5) {

                return "Friday";
            }
            if (dayNumber == 6) {

                return "Saturday";
            }
            if (dayNumber == 7) {

                return "Sunday";
            }
        }

        return "ERROR";
    }

    public static double makeAverage3x(int age1, int age2, int age3) {
        if ((age1 >= 0 && age1 <= 150) && (age2 >= 0 && age2 <= 150) && (age3 >= 0 && age3 <= 150)) {
            double average = ((double) (age1 + age2 + age3) / 3);

            return average;
        }

        return Integer.MIN_VALUE;
    }

    public static double measureСatTemperature(double x1, double x2, double x3, double x4, double x5) {
        if ((x1 >= 25 && x1 <= 45) && (x2 >= 25 && x2 <= 45) && (x3 >= 25 && x3 <= 45)
                && (x4 >= 25 && x4 <= 45) && (x5 >= 25 && x5 <= 45)) {
            double tempAverage = (x1 + x2 + x3 + x4 + x5) / 5;

            return tempAverage;
        }

        return -1;
    }

    public static int paySalary(int hourNumber, double hourPrice) {
        if (hourNumber >= 0 && hourNumber <= 24 && hourPrice >= 12) {
            int salary = (int) (((double) (hourNumber) / 8) * hourPrice * 164.4);

            return salary;
        }
        return -1;
    }

    public static double payForPurchases(double price, int number) {
        if (number >= 0 && price >= 0) {
            double amountOfPurchases = (price * number);

            return amountOfPurchases;
        }
        return -1;
    }

    public static String makePayrollLine(String name, double salary) {
        int ruble = (int) salary;
        int penny = ((int) Math.round(salary * 100) - ruble * 100);
        if (name == null || name.equals("") || name.equals(" ") || salary <= 0) {

            return "";

        } else if ((Math.ceil((salary - ruble) * 1000)) == 75.0 && ruble != 0) {

            return (name + "\t\t\t" + ruble + " руб " + "0" + (penny + 1) + " коп");

        } else if (penny >= 0 && penny <= 9) {

            return (name + "\t\t\t" + ruble + " руб " + "0" + penny + " коп");

        } else if (penny == 100) {

            return (name + "\t\t\t" + (ruble + 1) + " руб " + "00 коп");

        } else {

            return (name + "\t\t\t" + ruble + " руб " + penny + " коп");
        }
    }

    public static String makePayroll(String name1, String name2, double salary1, double salary2) {
        String line1 = makePayrollLine(name1, salary1);
        String line2 = makePayrollLine(name2, salary2);

        return line1 + "\n" + line2;
    }

    public static String enterX(int x) {
        if (x < 0) {

            return "x is negative";

        } else if (x > 0) {

            return "x is positive";
        }
        return "x is zero";
    }

    public static String transferMoney(double sum) {
        int ruble = (int) sum;
        int penny = (int) Math.round((sum - ruble) * 100);

        if (sum <= 0) {

            return "Error";

        } else if ((Math.ceil((sum - ruble) * 1000)) == 75.0 && ruble != 0) {

            return (ruble + " руб " + "0" + (penny + 1) + " коп");

        } else if (penny >= 0 && penny <= 9) {

            return (ruble + " руб " + "0" + penny + " коп");

        } else if (penny == 100) {

            return ((ruble + 1) + " руб " + "00 коп");

        } else {

            return (ruble + " руб " + penny + " коп");
        }
    }
    public static String transferWeight(double weight) {
        int kg = (int) weight;
        int g = (int) Math.round((weight - kg) * 1000);

        if (weight < 0) {

            return "Error";

        } else if (g == 1000) {

            return ((kg + 1) + " кг " + "0 гр");

        } else {

            return (kg + " кг " + g + " гр");
        }
    }

    public static String check(String name, String unit, double weight, double price) {
        if (unit.equals("кг")) {

            return "" + name + "\nЦена за 1 кг\t\t" + transferMoney(price) + "\nКоличество товара\t"
                    + transferWeight(weight) + "\n__________________________________\nСумма к оплате\t\t"
                    + transferMoney((price * weight)) ;

        } else if (unit.equals("шт")) {

            return "" + name + "\nЦена за 1 шт\t\t" + transferMoney(price) + "\nКоличество товара\t" + (int)weight
                    + "\n__________________________________\nСумма к оплате\t\t"
                    + transferMoney(payForPurchases(price, (int)weight)) ;
        }
        return "Error";
    }

//    public static int countLuckyNumber (int year) {
//        if (year >= 1872 && year <= 2022) {
//            int x = (int)(Math.floor(year / 1000)
//                    + (Math.floor(year / 100) - Math.floor(year / 1000) * 10)
//                    + (Math.floor(year / 10)- Math.floor(year / 100) * 10)
//                    + (year - Math.floor(year / 10) * 10));
//            if (x > 9) {
//                int y = (int)((Math.floor(x / 10)- Math.floor(x / 100) * 10)
//                        + (x - Math.floor(x / 10) * 10));
//                if (y > 9) {
//                    int z = (int)((Math.floor(y / 10)- Math.floor(y / 100) * 10)
//                            + (y - Math.floor(y / 10) * 10));
//
//                    return z;
//
//                } else {
//
//                    return y;
//                }
//
//            } else {
//
//                return x;
//            }
//        }
//        return -1;
//    }

    public static int countLuckyNumber (int year) {
        int luckyNumber = year % 9;
        if (luckyNumber == 0) {
            return luckyNumber = 9;
        } else {
            return luckyNumber;
        }
    }

    public static String calculateMedian (int num1, int num2, int num3) {
        int num = (int)((num1 + num2 + num3) / 3);
        if ((num1 - num2) * (num3 - num1) >= 0) {
            if ((num - num1) >= 2) {
                return "Среднее значение " + num + " отличается от медианы " + num1 + " на " + (num - num1);
            } else {
                return "Среднее значение = " + num + ", медиана = " + num1;
            }
        } else if ((num2 - num3) * (num1 - num2) >= 0) {
            if ((num - num2) >= 2) {
                return "Среднее значение " + num + " отличается от медианы " + num2 + " на " + (num - num2);
            } else {
                return "Среднее значение = " + num + ", медиана = " + num2;
            }
        } else {
            if ((num - num3) >= 2) {
                return "Среднее значение " + num + " отличается от медианы " + num3 + " на " + (num - num3);
            } else {
                return "Среднее значение = " + num + ", медиана = " + num3;
            }
        }
    }

    public static String calculateMedianMath (int num1, int num2, int num3) {
            int numAver = (int)((num1 + num2 + num3) / 3);
            int max = Math.max(num1, (Math.max(num2,num3)));
            int min = Math.min(num1, (Math.min(num2,num3)));
            int mid = num1 + num2 + num3 - (max + min) ;
            if ((numAver - mid) >= 2) {

                return "Среднее значение " + numAver + " отличается от медианы " + mid + " на " + (numAver - mid);

            } else {

                return "Среднее значение = " + numAver + ", медиана = " + mid;
            }
    }

    public static String roundToBuyer (double sum){
    if (sum >= 0) {
        return (int)Math.floor(sum) + " руб 00 коп";
    } return "Error";
    }

    public static int solveExample (int a, int b, int c) {
        if (((a * b + c) * Math.pow(a, b)) < 0) {

            return -1;
        }
        double resalt = Math.sqrt((a * b + c) * Math.pow(a, b)) / Math.PI;

        return (int) Math.ceil(resalt);
    }

    public static double calculateRandomPow () {
        int pow = (int)(Math.random()*11);
        double number = Math.random();
        double result = Math.pow(number, (double)pow);

        System.out.println("Число " + number + " в степени " + pow + " = " + result);
        return result;
    }

       public static int returnRandomNumber1(){
        int number = (int)(Math.random()*99) + 1;

        return number;
    }

    public static int returnRandomNumber2() {
        int number = (int) (Math.random() * 99) - 99;

        return number;
    }

    public static void main(String[] args) {
        /* Задание 1
         * Cоздать метод verifyEquals(expectedResult, actualResult) {} так, как мы делали на уроке.
         */
        printTCNumber();

        /* Задание 2
         * Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. Протестировать метод
         */
        int dayNumber = 5;
        String expectedResultString = "Friday";

        String actualResultString = returnWeekday(dayNumber);

        verifyEquals(expectedResultString, actualResultString);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        dayNumber = 0;
        expectedResultString = "ERROR";

        actualResultString = returnWeekday(dayNumber);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        /* Задание 3
         * Написать алгоритм вычисления среднего возраста в семье из 3х человек.
         * Например,
         * age1 = 20,
         * age2 = 40,
         * age3 = 60
         * Average = 40.
         * Протестируйте алгоритм на позитивные и негативные сценарии.
         */
        int age1 = 30;
        int age2 = 30;
        int age3 = 40;
        double expectedResultDouble = 33.3333333333333335;

        double actualResultDouble = makeAverage3x(age1, age2, age3);

        verifyEquals(expectedResultDouble, actualResultDouble);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultDouble, actualResultDouble));

        age1 = -5;
        age2 = -30;
        age3 = -3;
        expectedResultDouble = Integer.MIN_VALUE;

        actualResultDouble = makeAverage3x(age1, age2, age3);

        verifyEquals(expectedResultDouble, actualResultDouble);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultDouble, actualResultDouble));

        age1 = 5;
        age2 = -7;
        age3 = 170;
        expectedResultDouble = -2147483648;

        actualResultDouble = makeAverage3x(age1, age2, age3);

        verifyEquals(expectedResultDouble, actualResultDouble);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultDouble, actualResultDouble));

        /* Задание 4
         * Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
         * k и l
         * k, l, m
         * k, l, m, n
         * Переменные должны быть типа int
         * Happy path test data:
         * if k = 3, l = 30, m = 300, n = 3000
         * expected results:
         * a) 3
         * b) 3
         * c) 3
         * Написать тесты на каждый метод.
         */
        int k = 3;
        int l = 30;
        int m = 300;
        int n = 3000;
        int expectedResultInt = 3;

        int actualResultInt = Math.min(k, l);

        verifyEquals(expectedResultInt, actualResultInt);

        printTCNumber();
        printTCLetter("a");
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        k = -3;
        l = 4;
        expectedResultInt = -3;

        actualResultInt = Math.min(k, l);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        k = 3;
        l = 30;
        m = 300;
        expectedResultInt = 3;

        actualResultInt = Math.min(Math.min(k, l), m);

        verifyEquals(expectedResultInt, actualResultInt);

        printTCLetter("b");
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        k = 3;
        l = 0;
        m = -30;
        expectedResultInt = -30;

        actualResultInt = Math.min(Math.min(k, l), m);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        k = 3;
        l = 30;
        m = 300;
        n = 3000;
        expectedResultInt = 3;

        actualResultInt = Math.min(Math.min(Math.min(k, l), m), n);

        verifyEquals(expectedResultInt, actualResultInt);

        printTCLetter("c");
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        k = 0;
        l = -30;
        m = -300;
        n = 150;
        expectedResultInt = -300;

        actualResultInt = Math.min(Math.min(Math.min(k, l), m), n);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        /* Задание 5
         * Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
         * Метод принимает и возвращает значения типа double.
         * Например, t1 = 39, t2 = 39, t3 = 39, t4 = 39, t5 = 39. TempAverage = 39
         * По статистике клиента, некоторые коты могут быть все еще живы при температурах от 25С до 45 С
         * Значения, которые не входят в эти границы считаем невалидными и выдаем ошибку.
         * В случае невалидного значения хотя бы одной из входящих температур, метод возвращает -1.
         * Протестируйте метод на позитивные и негативные сценарии.
         */
        double t1 = 39.0;
        double t2 = 39.0;
        double t3 = 39.0;
        double t4 = 39.0;
        double t5 = 39.0;
        expectedResultDouble = 39.0;

        actualResultDouble = measureСatTemperature(t1, t2, t3, t4, t5);

        verifyEquals(expectedResultDouble, actualResultDouble);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultDouble, actualResultDouble));

        t1 = 36.0;
        t2 = 34;
        t3 = 46;
        t4 = 36.9;
        t5 = 32.8;
        expectedResultDouble = -1;

        actualResultDouble = measureСatTemperature(t1, t2, t3, t4, t5);

        verifyEquals(expectedResultDouble, actualResultDouble);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultDouble, actualResultDouble));

        /* Задание 6
         * Написать метод, который принимает на вход количество часов (int) работы в день,
         * стоимость одного часа работы в десятичном числе, и возвращает заработную плату в месяц в целых единицах.
         * При невалидных значениях метод возвращает -1.
         * минимальная часовая ставка = 12,
         * среднемесячное количество человеко-часов при 40 часовой неделе = 164.4
         */
        int x = 8;
        double c = 12.0;
        expectedResultInt = 1972;

        actualResultInt = paySalary(x, c);

        verifyEquals(expectedResultInt, actualResultInt);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        x = 5;
        c = 17.5;
        expectedResultInt = 1798;

        actualResultInt = paySalary(x, c);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        x = -5;
        c = 17.5;
        expectedResultInt = -1;

        actualResultInt = paySalary(x, c);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        x = 8;
        c = 11;
        expectedResultInt = -1;

        actualResultInt = paySalary(x, c);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(4);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        /* Задание 7
         * Написать метод, который принимает на вход 2 параметра -  цену и количество товара (количество в штуках).
         * Алгоритм возвращает сумму покупки в виде десятичного числа.
         * Например, price for 1 = 25 руб 50 коп (25.5)
         * amount = 5
         * expected total = 127 руб 50 коп (127.5)
         * При невалидных значениях метод возвращает -1
         * Проверьте метод на позитивный и негативный сценарий.
         */

        double price = 25.5;
        int amount = 5;
        expectedResultDouble = 127.5;

        actualResultDouble = payForPurchases(price, amount);
        verifyEquals(expectedResultDouble, actualResultDouble);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultDouble, actualResultDouble));

        price = -25.5;
        amount = 5;
        expectedResultDouble = -1;

        actualResultDouble = payForPurchases(price, amount);
        verifyEquals(expectedResultDouble, actualResultDouble);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultDouble, actualResultDouble));

        price = 25.5;
        amount = -5;
        expectedResultDouble = -1;

        actualResultDouble = payForPurchases(price, amount);
        verifyEquals(expectedResultDouble, actualResultDouble);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultDouble, actualResultDouble));

        /* Задание 8
         * Написать метод, который принимает на вход необходимые параметры и возвращает строку ведомости выдачи
         * зарплаты сотрудникам.
         * Например: “Смирнова Мария Ивановна 70000 руб 00 коп”
         * если имя сотрудника придет в виде пустой строки или в виде null (String -  это референсный тип данных и
         * может принимать значение null),то в ведомости должна быть распечатана пустая строка "".
         * Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана,
         * как 0, то в ведомости тоже должна быть распечатана пустая строка ""
         * Протестировать метод.
         */
        String name = "Смирнова Мария Ивановна";
        double salary = 70000.00;
        expectedResultString = "Смирнова Мария Ивановна\t\t\t70000 руб 00 коп";

        actualResultString = makePayrollLine(name, salary);

        verifyEquals(expectedResultString, actualResultString);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        name = "";
        expectedResultString = "";

        actualResultString = makePayrollLine(name, salary);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        name = null;
        expectedResultString = "";

        actualResultString = makePayrollLine(name, salary);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        name = "Смирнова Мария Ивановна";
        salary = 34087.9999;
        expectedResultString = "Смирнова Мария Ивановна\t\t\t34088 руб 00 коп";

        actualResultString = makePayrollLine(name, salary);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(4);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        name = "Петрова Ольга Ивановна";
        salary = 34087.0899;
        expectedResultString = "Петрова Ольга Ивановна\t\t\t34087 руб 09 коп";

        actualResultString = makePayrollLine(name, salary);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(5);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        salary = -34087.0899;
        expectedResultString = "";

        actualResultString = makePayrollLine(name, salary);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(6);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        salary = 0;
        expectedResultString = "";

        actualResultString = makePayrollLine(name, salary);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(7);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        salary = 10.075;
        expectedResultString = "Петрова Ольга Ивановна\t\t\t10 руб 08 коп";

        actualResultString = makePayrollLine(name, salary);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(8);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        /* Задание 9
         * Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8, например:
         * Смирнова Мария Ивановна         70000 руб 00 коп
         * Серебров Иван Петрович         128059 руб 00 коп
         * Метод в задании 9 может принимать разные параметры, в зависимости от того, что вам нужно для печати ведомости.
         * Смысл этого метода - распечатать несколько строк ведомости одновременно.
         * Каждая из строк должна формироваться с помощью метода, написанного в задании 8.
         * На этот метод писать тесты не нужно, просто распечатать ведомость.
         */
        printTCNumber();
        expectedResultString = makePayroll("Смирнова Мария Ивановна", "Серебров Иван Петрович",
                70000.00, 128059.00);
        System.out.println(expectedResultString);

        /* Задание 10
         * Записать в виде метода и протестировать: дано int x
         */
        x = 8;
        expectedResultString = "x is positive";

        actualResultString = enterX(x);

        verifyEquals(expectedResultString, actualResultString);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x = 0;
        expectedResultString = "x is zero";

        actualResultString = enterX(x);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x = -6;
        expectedResultString = "x is negative";

        actualResultString = enterX(x);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        /* Задание 11
         * Написать метод, который принимает на вход десятичное число (например, 10.75), и
         * возвращает строку “10 руб 75 коп”.
         */
        double sum = 10.75;
        expectedResultString = "10 руб 75 коп";

        actualResultString = transferMoney(sum);

        verifyEquals(expectedResultString, actualResultString);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        sum = 10.075;
        expectedResultString = "10 руб 08 коп";

        actualResultString = transferMoney(sum);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        sum = 0.075;
        expectedResultString = "0 руб 08 коп";

        actualResultString = transferMoney(sum);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        sum = 0;
        expectedResultString = "Error";

        actualResultString = transferMoney(sum);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(4);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        sum = -7643.086;
        expectedResultString = "Error";

        actualResultString = transferMoney(sum);

        verifyEquals(expectedResultString, actualResultString);
        printSubNumber(5);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        /* Задание 12
         * Написать метод, который принимает на вход десятичное число (например, 10,075) и
         * возвращает строку “10 кг 75 гр”.
         */
        double weight = 10.075;
        expectedResultString = "10 кг 75 гр";

        actualResultString = transferWeight(weight);

        verifyEquals(expectedResultString, actualResultString);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        weight = - 10.075;
        expectedResultString = "Error";

        actualResultString = transferWeight(weight);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        weight = 0;
        expectedResultString = "0 кг 0 гр";

        actualResultString = transferWeight(weight);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        weight = 10.9996;
        expectedResultString = "11 кг 0 гр";

        actualResultString = transferWeight(weight);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(4);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        weight = -10.9996;
        expectedResultString = "Error";

        actualResultString = transferWeight(weight);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(5);
        printTestResult(verifyEquals(expectedResultString, actualResultString));


        /* Задание 13
         * Написать метод, который принимает на вход необходимые параметры, и печатает чек.
         * Этот метод тестировать не нужно, но необходимо использовать все раннее написанные методы
         * (в задачах из Part 1 тоже могут пригодиться некоторые методы)
         * Пример чека:
         * Яблоки
         * Цена за 1 кг            50 руб 13 коп
         * Количество товара             3 кг 400 гр
         * _______________________________________
         * Сумма к оплате        170 руб 44 коп
         * или
         * Хлеб
         * Цена за 1 шт        30 руб 50 коп
         * Количество товара    5 шт
         * _______________________________________
         * Сумма к оплате        152 руб 50 коп
         */
        name = "Яблоки";
        String unit = "кг";
        price = 50.13;
        double weightOrAmount = 3.400;

        printTCNumber();
        System.out.println(check(name, unit, weightOrAmount, price ));

        name = "Хлеб";
        unit = "шт";
        price = 30.5;
        weightOrAmount = 5;

        System.out.println(check(name, unit, weightOrAmount, price ));

        /* Задание 14
         * Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
         * Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
         * снова считается сумма всех чисел.
         * Например:
         * год рождения 1999
         * 1 + 9 + 9 + 9 = 28
         * 2 + 8 = 10
         * 1 + 0 = 1
         * Счастливое число  1
         */
        x = 1999;
        expectedResultInt = 1;

        actualResultInt = countLuckyNumber(x);

        verifyEquals(expectedResultInt, actualResultInt);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        x = 1599;
        expectedResultInt = 6;

        actualResultInt = countLuckyNumber(x);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        x = 2599;
        expectedResultInt = 7;

        actualResultInt = countLuckyNumber(x);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        x = 2009;
        expectedResultInt = 2;

        actualResultInt = countLuckyNumber(x);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(4);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        /* Задание 15
         * а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
         * Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
         * Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
         * b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
         * *Медиана - это серединное число в отсортированном наборе чисел.
         * 1, 3, 9 → медиана 3
         * 12, 13, 101 → медиана 13
         * 14, 2, 12 → медиана 12
         * ВСе параметры приходят в int, расчеты производим в int
         * Протестировать оба метода - a) и b)
         */
        int x1 = 1;
        int x2 = 3;
        int x3 = 9;
        expectedResultString = "Среднее значение = 4, медиана = 3";

        actualResultString = calculateMedian(x1,x2,x3);

        verifyEquals(expectedResultString, actualResultString);

        printTCNumber();
        printTCLetter("a");
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x1 = 12;
        x2 = 13;
        x3 = 101;
        expectedResultString = "Среднее значение 42 отличается от медианы 13 на 29";

        actualResultString = calculateMedian(x1,x2,x3);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x1 = 14;
        x2 = 2;
        x3 = 12;
        expectedResultString = "Среднее значение = 9, медиана = 12";

        actualResultString = calculateMedian(x1,x2,x3);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x1 = 5;
        x2 = 5;
        x3 = 5;
        expectedResultString = "Среднее значение = 5, медиана = 5";

        actualResultString = calculateMedian(x1,x2,x3);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(4);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x1 = 5;
        x2 = 7;
        x3 = 5;
        expectedResultString = "Среднее значение = 5, медиана = 5";

        actualResultString = calculateMedian(x1,x2,x3);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(5);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x1 = 1;
        x2 = 3;
        x3 = 9;
        expectedResultString = "Среднее значение = 4, медиана = 3";

        actualResultString = calculateMedianMath(x1,x2,x3);

        verifyEquals(expectedResultString, actualResultString);

        printTCLetter("b");
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x1 = 12;
        x2 = 13;
        x3 = 101;
        expectedResultString = "Среднее значение 42 отличается от медианы 13 на 29";

        actualResultString = calculateMedianMath(x1,x2,x3);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x1 = 14;
        x2 = 2;
        x3 = 12;
        expectedResultString = "Среднее значение = 9, медиана = 12";

        actualResultString = calculateMedianMath(x1,x2,x3);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x1 = 5;
        x2 = 5;
        x3 = 5;
        expectedResultString = "Среднее значение = 5, медиана = 5";

        actualResultString = calculateMedianMath(x1,x2,x3);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(4);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        x1 = - 5;
        x2 = 6;
        x3 = 5;
        expectedResultString = "Среднее значение = 2, медиана = 5";

        actualResultString = calculateMedianMath(x1,x2,x3);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(5);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        /* Задание 16
         * Написать метод, который использует методы класса Math, принимает на вход сумму к оплате
         * (например, 10.75) и округляет сумму в пользу покупателя. Метод возвращает новую сумму
         * к оплате в виде строки, например “10 руб 00 коп”.
         */
        sum = 10.75;
        expectedResultString = "10 руб 00 коп";

        actualResultString = roundToBuyer(sum);

        verifyEquals(expectedResultString, actualResultString);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        sum = - 10.75;
        expectedResultString = "Error";

        actualResultString = roundToBuyer(sum);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        sum = 0;
        expectedResultString = "0 руб 00 коп";

        actualResultString = roundToBuyer(sum);

        verifyEquals(expectedResultString, actualResultString);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        /* Задание 17
         * Посчитать с помощью методов класса Math
         * int a = 3
         * int b = 4
         * int c = 20
         * кв.корень((a * b + c) * a^b) / пи
         * Вернуть значение с округлением в бОльшую сторону.
         */
        int a1 = 3;
        int b1 = 4;
        int c1 = 20;
        expectedResultInt = 17;

        actualResultInt = solveExample(a1,b1,c1);

        verifyEquals(expectedResultInt, actualResultInt);

        printTCNumber();
        printSubNumber(1);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        a1 = -10;
        b1 = -1;
        c1 = 10;
        expectedResultInt = -1;

        actualResultInt = solveExample(a1,b1,c1);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(2);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        a1 = 10;
        b1 = 2;
        c1 = 5;
        expectedResultInt = 16;

        actualResultInt = solveExample(a1,b1,c1);

        verifyEquals(expectedResultInt, actualResultInt);

        printSubNumber(3);
        printTestResult(verifyEquals(expectedResultInt, actualResultInt));

        /* Задание 18
         * a) Напишите оператор Java, который присваивает 1 в x, если y больше 0
         * b) Предположим, что score — это переменная типа double. Напишите оператор Java, который увеличивает
         * оценка на 5 баллов, если оценка находится между 80 и 90
         * c) Перепишите на Java следующий оператор без использования оператора NOT (!)
         * элемент !( (i<10) | | (v>=50))
         * d) Напишите оператор Java, который печатает true, если x — нечетное и положительное число.
         * e) Напишите оператор Java, который печатает true, если и x, и y положительные числа.
         * f) Напишите оператор Java, который печатает true, если x и y имеют одинаковый знак (-/+)
         */
        printTCNumber();
        printTCLetter("a");
        int y = 6;
        if (y >= 0) {
            System.out.println(x = 1);
        } else {
            x = -1;
        }

        printTCLetter("b");
        double score = 80;
        if (score >= 80 && score <= 90) {
            System.out.println(score + 5);
        } else {
            System.out.println(score);
        }

        printTCLetter("c");
        //x == !(i<10 || v >= 50)   <==>   x == (i >=  10 && v < 50)
        int i = 9;
        int v = 60;
        boolean h = !(i < 10 || v >= 50);
        boolean h1 = (i >=  10 && v < 50);
        System.out.println(h + "\t" + h1);



        printTCLetter("d");
        x = 7;
        boolean answer;
        if (x % 2 == 1 && x > 0) {
            System.out.println(answer = true);
        } else {
            System.out.println(answer = false);
        }

        printTCLetter("e");
        x = 7;
        y = 8;
        if (x > 0  && y > 0) {
            System.out.println(answer = true);
        } else {
            System.out.println(answer = false);
        }

        printTCLetter("f");
        x = -7;
        y = 8;
        if ((x > 0  && y > 0) || (x < 0  && y < 0)) {
            System.out.println(answer = true);
        } else {
            System.out.println(answer = false);
        }

        /* Задание 19
         * Написать метод, который с помощью методов класса Math высчитывает случайно сгенерированную
         * степень сгенерированного случайного числа. Метод возвращает математически округленное целое
         * значение и выводит на экран: “Число … в степени … = …”
         * Число может быть в пределах от 0 до 1 исключительно.
         * Степень числа может быть от 0 до 10 включительно
         */
        printTCNumber();
        calculateRandomPow();
        calculateRandomPow();

        /* Задание 20
         * Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
         * Затем написать метод, который возвращает случайное число в пределах от -1 до -99 включительно
         */
        printTCNumber();
        printSubNumber(1);
        System.out.println(returnRandomNumber1());
        System.out.println(returnRandomNumber1());

        printSubNumber(2);
        System.out.println(returnRandomNumber2());
        System.out.println(returnRandomNumber2());

        /* Задание 21
         * Предположим, что были сделаны следующие заявления: целый год; логическое значениеВисокосный год;
         * Напишите фрагмент, который будет присваивать isLeapYear значение true, если год представляет собой
         * високосный год, а ложно в противном случае.
         * Примечание. Самое простое определение високосного года — это любой год, который делится на четыре.
         * Для задачи, вы можете исследовать полное определение високосного года и создать фрагмент для
         * определить правильный високосный год.
         */
        printTCNumber();
        int year = 1600;
        if (year >= 0) {
            boolean isLeapYear = false;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
                System.out.println(isLeapYear);
            } else {
                System.out.println(isLeapYear);
            }
        } else {
            System.out.println("Введите правильный год");
        }

        /* Задание 22
         * Нагуглить географические координаты пяти городов, сделать API запрос по этим координатам,
         * получить параметры погоды. Затем сделать другие API запросы по названию тех же годов.
         * Получить параметры погоды и сравнить результаты. Распечатать результаты 2х запросов по каждому городу.
         * Если результаты совпали, то напечатать Pass, если не совпали - Fail
         * 1) Париж: Широта: 48°51′12″ с.ш. Долгота: 2°20′55″ в.д. 	 Широта, долгота: 48.8534, 2.3488 В десятичном формате
         * 2) Варшава: 52°13.788′ с. ш., 21°0.708′ в. д. Широта, долгота: 52.2298, 21.0118 В десятичном формате
         * 3) Лондон  Широта: 51°30.5118′ с.ш. Долгота: 0°7.5444′ з.д.  Широта, долгота: 51.5085, -0.12574 В десятичном формате
         * 4) Берлин:	52°31.464′ с. ш., 13°24.63′ в. д. В десятичном формате	52.5244, 13.4105
         * 5) Вильнюс Широта: 54°41′20″ с.ш. Долгота: 25°16′47″ в.д.  Широта, долгота: 	54.6892, 25.2798
         */
        printTCNumber();
        printSubNumber(1); // Париж
        expectedResultString = "{\"coord\":{\"lon\":2.3488,\"lat\":48.8534},\"weather\":[{\"id\":804,\"main\":"
               + "\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":"
               + "{\"temp\":289.96,\"feels_like\":289.86,\"temp_min\":288.92,\"temp_max\":290.66,\"pressure\":1011,"
               + "\"humidity\":83},\"visibility\":10000,\"wind\":{\"speed\":5.66,\"deg\":250},\"clouds\":{\"all\":100},"
               + "\"dt\":1664618310,\"sys\":{\"type\":2,\"id\":2041230,\"country\":\"FR\",\"sunrise\":1664603381,"
               + "\"sunset\":1664645449},\"timezone\":7200,\"id\":2988507,\"name\":\"Paris\",\"cod\":200}";
        actualResultString = "{\"coord\":{\"lon\":2.3488,\"lat\":48.8534},\"weather\":[{\"id\":803,\"main\":\"Clouds\","
               + "\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":{\"temp\":292.19,"
               + "\"feels_like\":291.95,\"temp_min\":291.03,\"temp_max\":293.68,\"pressure\":1013,\"humidity\":69},"
               + "\"visibility\":10000,\"wind\":{\"speed\":7.72,\"deg\":260},\"clouds\":{\"all\":75},\"dt\":1664630362,"
               + "\"sys\":{\"type\":2,\"id\":2041230,\"country\":\"FR\",\"sunrise\":1664603381,\"sunset\":1664645449},"
               + "\"timezone\":7200,\"id\":2988507,\"name\":\"Paris\",\"cod\":200}";
        verifyEquals(expectedResultString, actualResultString);
        printTestResult(verifyEquals(expectedResultString, actualResultString));
        printSubNumber(2); // Варшава
        expectedResultString = "{\"coord\":{\"lon\":21.0118,\"lat\":52.2298},\"weather\":[{\"id\":803,\"main\":\"Clouds"
               + "\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":{\"temp\":287.8,"
               + "\"feels_like\":287.28,\"temp_min\":286.03,\"temp_max\":290.89,\"pressure\":1006,\"humidity\":75},"
               + "\"visibility\":10000,\"wind\":{\"speed\":4.12,\"deg\":140},\"clouds\":{\"all\":75},\"dt\":1664631320,"
               + "\"sys\":{\"type\":2,\"id\":2032856,\"country\":\"PL\",\"sunrise\":1664598985,\"sunset\":1664640888},"
               + "\"timezone\":7200,\"id\":756135,\"name\":\"Warsaw\",\"cod\":200}";
        actualResultString = "{\"coord\":{\"lon\":21.006,\"lat\":52.2318},\"weather\":[{\"id\":803,\"main\":\"Clouds\","
               + "\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":{\"temp\":287.87,"
               + "\"feels_like\":287.41,\"temp_min\":286.02,\"temp_max\":290.32,\"pressure\":1007,\"humidity\":77},"
               + "\"visibility\":10000,\"wind\":{\"speed\":4.12,\"deg\":140},\"clouds\":{\"all\":75},\"dt\":1664632155,"
               + "\"sys\":{\"type\":2,\"id\":2032856,\"country\":\"PL\",\"sunrise\":1664598987,\"sunset\":1664640890},"
               + "\"timezone\":7200,\"id\":756135,\"name\":\"Warsaw\",\"cod\":200}";
        verifyEquals(expectedResultString, actualResultString);
        printTestResult(verifyEquals(expectedResultString, actualResultString));
        printSubNumber(3);  // Лондон
        expectedResultString = "{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":803,\"main\":\""
               + "Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":"
               + "{\"temp\":288.94,\"feels_like\":288.59,\"temp_min\":287.42,\"temp_max\":290.37,\"pressure\":1006,"
               + "\"humidity\":77},\"visibility\":10000,\"wind\":{\"speed\":6.17,\"deg\":260},\"clouds\":{\"all\":75},"
               + "\"dt\":1664618225,\"sys\":{\"type\":2,\"id\":2075535,\"country\":\"GB\",\"sunrise\":1664604044,"
               + "\"sunset\":1664645973},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}\"";
        actualResultString = "{\"coord\":{\"lon\":-0.1278,\"lat\":51.5074},\"weather\":[{\"id\":803,\"main\":\"Clouds\","
               + "\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":{\"temp\":291.41,"
               + "\"feels_like\":290.91,\"temp_min\":290.45,\"temp_max\":292.81,\"pressure\":1008,\"humidity\":62},"
               + "\"visibility\":10000,\"wind\":{\"speed\":6.69,\"deg\":250},\"clouds\":{\"all\":75},\"dt\":1664631317,"
               + "\"sys\":{\"type\":2,\"id\":2075535,\"country\":\"GB\",\"sunrise\":1664604045,\"sunset\":1664645974},"
               + "\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";
        verifyEquals(expectedResultString, actualResultString);
        printTestResult(verifyEquals(expectedResultString, actualResultString));
        printSubNumber(4); // Берлин
        expectedResultString = "{\"coord\":{\"lon\":13.4105,\"lat\":52.5244},\"weather\":[{\"id\":803,\"main\":"
               + "\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":"
               + "{\"temp\":284.25,\"feels_like\":283.82,\"temp_min\":283.29,\"temp_max\":285.38,\"pressure\":992,"
               + "\"humidity\":92},\"visibility\":10000,\"wind\":{\"speed\":7.15,\"deg\":219,\"gust\":13.41},\"clouds\":"
               + "{\"all\":75},\"dt\":1664631730,\"sys\":{\"type\":2,\"id\":2011538,\"country\":\"DE\",\""
               + "sunrise\":1664600820,\"sunset\":1664642702},\"timezone\":7200,\"id\":2950159,\"name\":\"Berlin\",\""
               + "cod\":200}";
        actualResultString = "{\"coord\":{\"lon\":13.4113,\"lat\":52.5234},\"weather\":[{\"id\":803,\"main\":\""
               + "Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":"
               + "{\"temp\":284.25,\"feels_like\":283.82,\"temp_min\":283.29,\"temp_max\":285.38,\"pressure\":992,"
               + "\"humidity\":92},\"visibility\":10000,\"wind\":{\"speed\":7.15,\"deg\":219,\"gust\":13.41},\""
               + "clouds\":{\"all\":75},\"dt\":1664631905,\"sys\":{\"type\":2,\"id\":2011538,\"country\":\"DE\",\""
               + "sunrise\":1664600820,\"sunset\":1664642701},\"timezone\":7200,\"id\":2950159,\"name\":\"Berlin\",\""
               + "cod\":200}";
        verifyEquals(expectedResultString, actualResultString);
        printTestResult(verifyEquals(expectedResultString, actualResultString));
        printSubNumber(5); // Вильнюс
        expectedResultString = "{\"coord\":{\"lon\":25.2798,\"lat\":54.6892},\"weather\":[{\"id\":803,\"main\":"
               + "\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":"
               + "{\"temp\":285.6,\"feels_like\":284.89,\"temp_min\":284.64,\"temp_max\":286.88,\"pressure\":1010,"
               + "\"humidity\":76},\"visibility\":10000,\"wind\":{\"speed\":1.03,\"deg\":0},\"clouds\":{\"all\":75},"
               + "\"dt\":1664630297,\"sys\":{\"type\":2,\"id\":2001071,\"country\":\"LT\",\"sunrise\":1664598032,\""
               + "sunset\":1664639794},\"timezone\":10800,\"id\":593116,\"name\":\"Vilnius\",\"cod\":200}";
        actualResultString = "{\"coord\":{\"lon\":25.2797,\"lat\":54.6872},\"weather\":[{\"id\":803,\"main\":\""
               + "Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":"
               + "{\"temp\":285.08,\"feels_like\":284.31,\"temp_min\":284.64,\"temp_max\":286.88,\"pressure\":1010,\""
               + "humidity\":76},\"visibility\":10000,\"wind\":{\"speed\":1.03,\"deg\":0},\"clouds\":{\"all\":75},\""
               + "dt\":1664630842,\"sys\":{\"type\":2,\"id\":2001071,\"country\":\"LT\",\"sunrise\":1664598032,\""
               + "sunset\":1664639794},\"timezone\":10800,\"id\":593116,\"name\":\"Vilnius\",\"cod\":200}";
        verifyEquals(expectedResultString, actualResultString);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

            }
}
