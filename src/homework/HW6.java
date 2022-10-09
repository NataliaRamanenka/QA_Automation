package homework;

public class HW6 {

    static int tcNumber = 1;

    public static void printTask() {
        System.out.println("\nTask " + tcNumber++);
    }
    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {

            return "\tPass";
        } else {

            return "\tFail";
        }
    }

    public static void printTestResult(String value) {
        System.out.println("\t ---> \t" + value);
    }

    public static void printDoubleNumber (double start, double end, double step) {
        if ((start > end && step < 0) || (start < end && step > 0)) {
            for (double i = start; i <= end; i = i + step) {
                System.out.print(i + ", ");
            }
        } else {
            System.out.print("Внимание!Зацикливание!");
        }
        System.out.println();
    }

    public static void printAlphabet(char n, char m) {
        if ((((int) n >= 65 && (int) n <= 90) || ((int) n >= 97 && (int) n <= 122))
                && (((int) m >= 65 && (int) m <= 90) || ((int) m >= 97 && (int) m <= 122)) && ((int) m != (int) n)) {
            if (m > n) {
                for (char i = n; i <= m; i++) {
                    System.out.print(i + ", ");
                }
                System.out.println();
            } else {
                for (char i = n; i >= m; i--) {
                    System.out.print(i + ", ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Введите разные английские буквы");
        }
    }

    public static void printSequenceOfEveNumbers (int length) {
        if (length > 1) {
            int x = (length - 1) * 2;
            for (int i = 0; i <= x; i = i + 2) {
                System.out.print(i + ", ");
            }
            System.out.println();
        } else if (length == 1) {
            System.out.println("0");
        } else {
            System.out.println("Введите положительную длину последовательности");
        }
    }

    public static void raiseTwoToAPower (int power) {
        if (power > 0) {
            for (int i = 1; i <= power; i++) {
                System.out.print((int) Math.pow(2, i) + ", ");
            }
            System.out.println();
        } else {
            for (int i = 1; i >= power; i--){
                System.out.print(Math.pow(2,i) + ", ");
            }
            System.out.println();
        }
    }

    public static String generateAbsoluteValues (int n){
        String s = "0";
        for (int i = 1; i <= n; i++) {
            s = s + ", " + i +  ", -" + i;
        }

        return s;
    }

    public static void generateNumb18(double n, double m, int l){
        if (l > 0) {
            for (double i = 1; i <= l; i++) {
                System.out.print((int)(Math.random()* (m - n + 1) + n) + ", ");
            }
            System.out.println();
        } else {
            System.out.println("неверная длина интервала");
        }
    }

    public static void generateNumbAdd(double n, double m, int l){
        double x = (m - n) / (l - 1);
        if ((n < m) && l > 1) {
            for (double i = n; i <= m; i = i + x) {
                System.out.print(i + ", ");
            }
            System.out.println();
        } else if ((n > m) && l > 1) {
            for (double i = n; i >= m; i = i + x) {
                System.out.print(i + ", ");
            }
            System.out.println();
        } else {
            System.out.println("Зацикливание");
        }
    }

    public static void generateLine (int start, int step, int length){
        if ((length >= 1) && step != 0) {
            int x ;
            int y;
            if (start % 2 == 1) {
                x = start;
            } else {
                x = start + 1;
            }
            if (step % 2 == 0) {
                y = step;
            } else {
                y = 2 * step;
            }
            for (int i = x; i <= (x + (length - 1) * y); i = i + y) {
                System.out.print(i + ", ");
            }
            System.out.println();
        } else if (length == 0){
            System.out.println("");
        } else if (length < 0){
            System.out.println("Недопустимая длина числовой линии");
        }else {
            System.out.println("Зацикливание");
        }
    }

    public static void calculateEquation19(int n, int l){
        if ((2 * n - 1) == 0) {
            System.out.println("0");
        } else {
            for (int i = n; l > 0; i++, l--){
                if (i == 0) {
                    System.out.println("0");
                } else {
                    double y = (double) (Math.round((Math.pow(i, 2) + 1) / (2 * i - 1) * 100)) / 100;
                    System.out.println("y" + i + "=" + y);
                }
            }
        }
    }

    public static void calculateEquation20(int n){
        if (n <= 0) {
            System.out.println("0");
        } else {
            for (int i = 1; i <= n; i++){
                if (i == 1) {
                    System.out.println("y" + i + "= 1");
                } else if (i == 2) {
                    System.out.println("y" + i + "= 2");
                } else {
                    System.out.println("y" + i + "=" );
                }
            }
        }
    }


    public static void generatePositivePrimeNumbers (int n){
        for (int i = 2; i <= n; i++){
            if ((i % 2 == 0 && i != 2)
                    || (i % 3 == 0 && i != 3)
                    || (i % 5 == 0 && i != 5)
                    || (i % 7 == 0 && i != 7)
                    || (i % 9 == 0 && i != 9)){
                System.out.print("");
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
    static String nameOfMonth;
    static String nameOfDay;
    public static String printDayMonth(String day, int month, int date1, int date2) {

        for (int i = date1; i <= date2; i++) {

            if (month == 1) {
                nameOfMonth = "Jan";
            } else if(month == 2) {
                nameOfMonth = "Feb";
            } else if(month == 3) {
                nameOfMonth = "Mar";
            }else if(month == 4) {
                nameOfMonth = "Apr";
            }else if(month == 5) {
                nameOfMonth = "May";
            }else if(month == 6) {
                nameOfMonth = "Jun";
            }else if(month == 7) {
                nameOfMonth = "Jul";
            }else if(month == 8) {
                nameOfMonth = "Aug";
            }else if(month == 9) {
                nameOfMonth = "Sep";
            }else if(month == 10) {
                nameOfMonth = "Oct";
            }else if(month == 11) {
                nameOfMonth = "Nov";
            }else if(month == 12) {
                nameOfMonth = "Dec";
            } else {
                System.out.println("Неправильный месяц");
            }

                System.out.println(nameOfDay + "," + nameOfMonth + " 0" + i);
        }

        return "";
    }

//         * Sun, Oct 02
//            * Mon, Oct 03
//            * Tue, Oct 04
//            * Wed, Oct 05
//            * Thu, Oct 06
//            * Fri, Oct 07
//            * Sat, Oct 08
//            * Sun, Oct 09

    public static void main(String[] args) {
        /* Задание 1
         * Распечатать последовательность чисел от 0 до 9 включительно.
         */
        printTask();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        /* Задание 2
         * Распечатать последовательность чисел от 10 исключительно до 0 включительно.
         */
        printTask();
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println();

        /* Задание 3
         * Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
         */
        printTask();
        for (int i = 50; i < 55; i = i + 2) {
            System.out.print(i + ", ");
        }
        System.out.println();

        /* Задание 4
         * Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
         */
        printTask();
        for (int i = 329; i >= 300; i = i - 7) {
            System.out.print(i + ", ");
        }
        System.out.println();

        /* Задание 5
         * Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
         */
        printTask();
        for (double i = 12; i <= 13; i = i + 0.1) {
            System.out.print(i + ", ");
        }
        System.out.println();

        /* Задание 6
         * Распечатать последовательность четных чисел от 215 до 237 включительно
         */
        printTask();
        for (int i = 216; i <= 237; i = i + 2) {
            System.out.print(i + ", ");
        }
        System.out.println();

        /* Задание 7
         * Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
         */
        printTask();
//        for (int i = 14; i < 14; i = i + 7){             !!!!!!!!зацикливание!!!!!!
//            System.out.print(i + ", ");
//        }
        System.out.println("!!!!!!зацикливание!!!!!!");

        /* Задание 8
         * Распечатать последовательность которая начинается с минимального значения типа данных short и
         * заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
         */
        printTask();
        for (int i = -30002; i < 32767; i = i + 15001) {
            System.out.print(i + ", ");
        }
        System.out.println();

        /* Задание 9
         * Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
         * должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
         * А ноль необходимо распечатать словом ZERO.
         * \033[0m 	вернуться к начальному стилю
         * \033[31m <your text goes here> \033[0m 	красный текст
         * \033[34m <your text goes here> \033[0m 	синий текст
         * \033[37m <your text goes here> \033[0m 	белый текст
         */
        printTask();
        for (int i = -10; i <= 34; i++) {
            if (i == 0) {
                System.out.print("ZERO, ");
            } else if (i % 11 == 0) {
                System.out.print("\033[31m" + i + ", " + "\033[0m");
            } else if (i % 12 == 0) {
                System.out.println("\033[34m" + i + ", " + "\033[0m");
            } else {
                System.out.print(i + ", " + "\033[0m");
            }
        }
        System.out.println();

    /* Задание 10
     * Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность
     * десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.
     */
    printTask();
       printDoubleNumber(1.6,5,0.5);
       printDoubleNumber(-8,8,-1);

    /* Задание 11
     * Написать метод, который принимает на вход параметры n и m типа char, и выводит на печать последовательность
     * букв английского алфавита в промежутке между значениями n и m включительно.
     */
        printTask();
        printAlphabet('f','w');
        printAlphabet('z','f');
        printAlphabet('л', 's' );

    /* Задание 12
     * Написать метод, который принимает параметр l и печатает  последовательность четных чисел от нуля.
     * Длина последовательности = l .
     */
        printTask();
        printSequenceOfEveNumbers(7);
        printSequenceOfEveNumbers(1);
        printSequenceOfEveNumbers(0);
        printSequenceOfEveNumbers(-3);

    /* Задание 13
     * Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
     */
        printTask();
        raiseTwoToAPower(2);
        raiseTwoToAPower(0);
        raiseTwoToAPower(-2);

    /* Задание 14
     * Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
     */
        printTask();
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <=9; j++) {
                if (i == 1) {
                    System.out.print(j);
                } else if (i == 2) {
                    System.out.print(j);
                    System.out.print(j);
                } else if (i == 3) {
                    System.out.print(j);
                    System.out.print(j);
                    System.out.print(j);
                } else {
                    System.out.print(j);
                    System.out.print(j);
                    System.out.print(j);
                    System.out.print(j);
                }
            }
        }
        System.out.println();

    /* Задание 15
     * Написать метод, который генерирует  последовательность чисел:
     * 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
     * Метод формирует строку из сгенерированных значений, и выводит результат единожды на печать.
     * ПРотестировать этот метод.
     */

        String expectedResult = "0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5";

        String actualResult = generateAbsoluteValues(5);

        verifyEquals(expectedResult, actualResult);

        printTask();
        printTestResult(verifyEquals(expectedResult, actualResult));

        System.out.println(actualResult);

    /* Задание 16
     * Распечатать последовательность чисел: 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
     */
        printTask();
        int n = 25;
        for (int i = 0; i <= n; i++) {
            if ((i % 3 == 0 && i % 5 == 0) || (i % 3 == 0) || (i % 5 == 0)){
                System.out.print(i + ", ");
            } else {
                System.out.print("");
            }
        }
        System.out.println();

    /* Задание 17
     * Написать метод, который принимает параметры n, m, l, и печатает последовательность нечетных чисел
     * начиная с числа n, с шагом m, длина последовательности l.
     */
        printTask();
        generateLine(1,7,3);
        generateLine(-6,4,4);
        generateLine(0,6,3);
        generateLine(2,4,1);
        generateLine(2,4,0);
        generateLine(2,4,-3);
        generateLine(2,0,1);

    /* Задание
     * Написать метод, который принимает на вход параметры n, m, l и генерирует последовательность
     * чисел в промежутке от n до m  включительно. Длина последовательности - l. Вывести результат на печать
     */
        System.out.println("\nзадача с придуманным условием");
        generateNumbAdd(2,4,6);
        generateNumbAdd(2.8,4.3,6);
        generateNumbAdd(2.8,4.3,1);
        generateNumbAdd(2.8,4.3,0);
        generateNumbAdd(2.8,4.3,-1);

    /* Задание 18
     * Написать метод, который принимает на вход параметры n, m, l и генерирует последовательность случайных
     * целых чисел в промежутке от n до m  включительно. Длина последовательности - l. Вывести результат на печать
     */
        printTask();
        generateNumb18(2,4,6);
        generateNumb18(2,4,-1);
        generateNumb18(-3,8,20);

    /* Задание 19
     * Сгенерируйте и распечатайте последовательность чисел, где для каждого положительного или отрицательного
     * значения n выводится на печать значение, рассчитанное по формуле:
     * Для n = 0 и невалидных ситуаций  выводится значение 0
     */
        printTask();
        calculateEquation19(2,2);
        System.out.println("----");
        calculateEquation19(-1, 7);



    /* Задание 20
     * Написать метод, который принимает параметры , n, и печатает последовательность чисел по формуле
     * Длина последовательности l.
     */
        printTask();

    /* Задание 21
     * Сгенерируйте последовательность целых положительных  двузначных чисел,
     * в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
     */
        printTask();
        for (int i = 10; i < 100; i++){
            if (((i - 10 * (int)Math.floor(i / 10)) - (int)(i / 10)) <= 3){
                System.out.print(i + ", ");
            } else {
                System.out.print("");
            }
        }
        System.out.println();

    /* Задание 22
     * Написать метод, который вычислит значение функции:
     */
        printTask();

    /* Задание 23 /Задание 21
     * Написать метод, который генерирует последовательность простых положительных чисел и
     * выводит последовательность на печать
     */
        printTask();
        generatePositivePrimeNumbers(9);
        generatePositivePrimeNumbers(99);
        generatePositivePrimeNumbers(150);


        /* Задание 24 / Задание 22
     * Написать метод, который принимает на вход параметры day = “Sun”, month = 10, date = 2, и
     * выводит на печать  последовательность:
     * Sun, Oct 02
     * Mon, Oct 03
     * Tue, Oct 04
     * Wed, Oct 05
     * Thu, Oct 06
     * Fri, Oct 07
     * Sat, Oct 08
     * Sun, Oct 09
     */
        printTask();
        System.out.println(printDayMonth("Sun",10,2,9));

}

}
