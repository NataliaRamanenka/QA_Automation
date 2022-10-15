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

    public static void printSequence(double start, double end, double step) {
        if (step != 0) {
            if (start >= end && step < 0) {
                for (double i = start; i >= end; i += step) {
                    System.out.print(i + ", ");
                }
            } else if (start <= end && step > 0){
                for (double i = start; i <= end; i += step) {
                    System.out.print(i + ", ");
                }
            } else {
                System.out.print("Введите корректный шаг");
            }
        } else {
            System.out.print("Внимание!Зацикливание!");
        }
        System.out.println();
    }

    public static void printAlphabet(char n, char m) {
        if ((n >= 65 && n <= 90 && m >= 65 && m <= 90) || (n >= 97 && n <= 122 && m >= 97 && m <= 122)) {
            if (m >= n) {
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
        }
    }

//    public static void printSequenceOfEveNumbers (int length) {
//        if (length > 1) {
//            int x = (length - 1) * 2;
//            for (int i = 0; i <= x; i = i + 2) {
//                System.out.print(i + ", ");
//            }
//            System.out.println();
//        } else if (length == 1) {
//            System.out.println("0");
//        } else {
//            System.out.println("Введите положительную длину последовательности");
//        }
//    }

//    public static void printSequenceOfEveNumbers (int length) {
//        if (length > 0) {
//            for (int i = 0; length > 0; i += 2) {
//                System.out.print(i + ", ");
//                length--;
//            }
//            System.out.println();
//        } else {
//            System.out.println("Введите положительную длину последовательности");
//        }
//    }

    public static void printSequenceOfEveNumbers (int length) {
        if (length > 0) {
            for (int i = 0; length > 0; i += 2, length--) {
                System.out.print(i + ", ");
            }
            System.out.println();
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
        String s = "0, ";
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                s = s + i + ", -" + i + ", ";
            } else {
                s = s + i + ", -" + i;
            }
        }

        return s;
    }

    public static void generateNumb18(double n, double m, int l){
        if (l > 0) {
                for (double i = 1; i <= l; i++) {
                    if (i == l) {
                        System.out.print((int) (Math.random() * (m - n + 1) + n));
                    } else {
                        System.out.print((int) (Math.random() * (m - n + 1) + n) + ", ");
                    }
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

//    public static void generateLine(int start, int step, int length) {
//        if ((length >= 1) && step != 0) {
//            int x;
//            int y;
//            if (start % 2 == 1) {
//                x = start;
//            } else {
//                x = start + 1;
//            }
//            if (step % 2 == 0) {
//                y = step;
//            } else {
//                y = 2 * step;
//            }
//            for (int i = x; i <= (x + (length - 1) * y); i = i + y) {
//                System.out.print(i + ", ");
//            }
//            System.out.println();
//        } else if (length == 0) {
//            System.out.println("");
//        } else if (length < 0) {
//            System.out.println("Недопустимая длина числовой линии");
//        } else {
//            System.out.println("Зацикливание");
//        }
//    }
    public static void generateLine(int start, int step, int length) {
        int counter = 1;
        if (length > 0 && step != 0) {
            if(start % 2 != 0 && step % 2 != 0) {
                for (int i = start; counter <= length; i += step){
                    if (i % 2 != 0){
                        if (counter == length){
                            System.out.print(i);
                        } else {
                            System.out.print(i + ", ");
                        }
                        counter++;
                    }
                }
                System.out.println();
            } else {
                System.out.println("Все числа положительные");
            }
        } else if (length == 0) {
            System.out.println("Длина последовательности 0");
        } else if (length < 0) {
            System.out.println("Недопустимая длина числовой линии");
        } else {
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

//    public static void calculateEquation20(int n, int l){
//        int y1 = 1;
//        int y2 = 2;
//        int yn = 0;
//        if (n <= 0) {
//            System.out.println("0");
//        } else {
//            for (int i = 1; i < (n + l); i++){
//                yn = 2 * y2 + y1;
//                if (i >= n){
//                    System.out.println("y" + i + " = " + y1);
//                }
//                y1 = y2;
//                y2 = yn;
//            }
//        }
//    }

    public static void calculateEquation20(int n, int l){
        int y1 = 1;
        int y2 = 2;
        int yn = 0;
        if (n <= 0) {
            System.out.println("0");
        } else {
            for (int i = 1; l > 0; i++){
                yn = 2 * y2 + y1;
                if (i >= n){
                    System.out.println("y" + i + " = " + y1);
                    l--;
                }
                y1 = y2;
                y2 = yn;
            }
        }
    }
    public static void calculateEquation22(double x){
        if (x > 1.5) {
            System.out.println("y = " + (2.5 * Math.pow(x,3) + 6 * Math.pow(x,2) - 30));
        } else if (x < 0 ) {
            System.out.println("y = " + x);
        } else {
            System.out.println("y = " + (x +1));
        }
    }

//    public static void generatePositivePrimeNumbers (int n){
//        for (int i = 2; i <= n; i++){
//            if ((i % 2 == 0 && i != 2)
//                    || (i % 3 == 0 && i != 3)
//                    || (i % 5 == 0 && i != 5)
//                    || (i % 7 == 0 && i != 7)
//                    || (i % 9 == 0 && i != 9)){
//                System.out.print("");
//            } else {
//                System.out.print(i + ", ");
//            }
//        }
//        System.out.println();
//    }

    public static void generatePositivePrimeNumbers (int n) {
        for (int i = 2; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
    public static String returnMonth(int number) {
        if (number > 0 && number < 13) {
            if (number == 1) {

                return "Jan";
            } else if (number == 2) {

                return "Feb";
            } else if (number == 3) {

                return "Mar";
            } else if (number == 4) {

                return "Apr";
            } else if (number == 5) {

                return "May";
            } else if (number == 6) {

                return "Jun";
            } else if (number == 7) {

                return "Jul";
            } else if (number == 8) {

                return "Aug";
            } else if (number == 9) {

                return "Sep";
            } else if (number == 10) {

                return "Oct";
            } else if (number == 11) {

                return "Nov";
            } else if (number == 12) {

                return "Dec";
            }
        }

        return "Error";
    }

    public static String returnDayOfTheWeek(int number) {
        if (number > 0 && number < 8) {
            if (number == 1) {

                return "Mon";
            } else if (number == 2) {

                return "Tue";
            } else if (number == 3) {

                return "Wed";
            } else if (number == 4) {

                return "Thu";
            } else if (number == 5) {

                return "Fri";
            } else if (number == 6) {

                return "Sat";
            } else {

                return "Sun";
            }
        }

        return "Error";
    }

    public static int returnDayOfTheWeek(String day) {
        if (day.equals("Mon")) {
            return 1;
        } else if (day.equals("Tue")) {
            return 2;
        } else if (day.equals("Wed")) {
            return 3;
        } else if (day.equals("Thu")) {
            return 4;
        } else if (day.equals("Fri")) {
            return 5;
        } else if (day.equals("Sat")) {
            return 6;
        } else if (day.equals("Sun")) {
            return 7;
        }

        return 0;
    }

    public static int returnDate(int date) {
        if (date < 10) {
            String number = String.format("%03d", date);;

            return Integer.valueOf(number);
        } else {
            return date;
        }
    }


    public static void printEightDaysFromDate(String day, int month, int date) {
        int l = 8;
        if (returnDayOfTheWeek(day) == 0 || returnMonth(month).equals("Error") || month <= 0 || date <= 0) {
            System.out.println("Please enter correct data.");
        } else if (month <= 7 && month % 2 == 1 && date > 31) {
            System.out.println("Please enter correct date.");
        } else if (month >= 8 && month <= 12 && month % 2 == 0 && date > 31) {
            System.out.println("Please enter correct date.");
        } else if ((month == 4 || month == 6 ||  month == 9 || month == 11) && date > 30) {
            System.out.println("Please enter correct date.");
        }
        else if (month == 2 && date > 28) {
            System.out.println("Please enter correct date.");
        } else {
            for (int i = returnDayOfTheWeek(day); i <= 7 && l > 0; i++, date++, l--) {
                if (i != 7) {
                    if ((month <= 7 && month % 2 != 0 && returnDate(date) >= 32)
                            || ((month == 9 || month == 11) && returnDate(date) >= 31)
                            || ((month == 4 || month == 6) && returnDate(date) >= 31)
                            || (month >= 8 && month <= 12 && month % 2 == 0 && returnDate(date) >= 32)
                            || (month == 2 && returnDate(date) >= 29)) {
                        date = 1;
                        month +=1;
                    }

                    System.out.println(returnDayOfTheWeek(i) + ", " + returnMonth(month) + " " + returnDate(date));
                } else {
                    System.out.println(returnDayOfTheWeek(i) + ", " + returnMonth(month) + " " + returnDate(date));
                    i = 0;
                }
            }
        }
    }

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
// нерациональный вариант
//        for (int i = 326; i > 300; i++) {
//            if (i % 7 == 0) {
//                System.out.println(i);
//            }
//        }
// рациональный, но монуальный вариант
//        for (int i = 329; i > 300; i = i - 7) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();
        int start = 327 - 1;
        int end = 300 +1;
        int first = start - start % 7;
        for (int i = first; i >= end; i -= 7) {
            System.out.print(i + ", ");
        }
        System.out.println();

        /* Задание 5
         * Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
         */
        printTask();
         for (double i = 12; i <= 13; i = i + 0.1) {
            i = Math.round(i * 100) / 100.0;
            System.out.print(i + ", ");
        }
        System.out.println();
        for (double i = 12; i <= 13; i = i + 0.1) {
            i = Math.ceil(i * 100) / 100;
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
        // более универсальный метод
        start = 215;
        end = 237;
        first = start + start % 2;
        for (int i = first; i <= end; i += 2) {
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
        start = 7 + 1;
        end = 14 - 1;
        int step = 7;
        first = start + step - start % step;
        if (first < end) {
            for (int i = first; i <= end; i += step) {
                System.out.print(i + ", ");
            }
        } else {
            System.out.println("!!!!!!зацикливание!!!!!!");
        }

        /* Задание 8
         * Распечатать последовательность которая начинается с минимального значения типа данных short и
         * заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
         */
        printTask();
        start = Short.MIN_VALUE;
        end = Short.MAX_VALUE;
        step = 15001;
        first = start - (start % step);
        if (first >= start) {
            for (int i = first; i < end; i += step) {
                System.out.print(i + ", ");
            }
        } else {
            first = start + (step- start % step);
            for (int i = first; i < end; i += step) {
                System.out.print(i + ", ");
            }
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
                System.out.print("\033[34m" + i + ", " + "\033[0m");
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
       printSequence(1.6,5,0.5);
       printSequence(-8,8,-1);
       printSequence(8,-8,-1);

    /* Задание 11
     * Написать метод, который принимает на вход параметры n и m типа char, и выводит на печать последовательность
     * букв английского алфавита в промежутке между значениями n и m включительно.
     */
        printTask();
        printAlphabet('f','w');
        printAlphabet('z','f');
        printAlphabet('л', 's' );
        printAlphabet('D', 'd' );

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
                if ((i % 3 == 0) || (i % 5 == 0)) {
                    if (i == n) {
                        System.out.print(i);
                    } else {
                        System.out.print(i + ", ");
                    }
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
        generateNumb18(3,-8,10);

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
     * Написать метод, который принимает параметры l, n, и печатает последовательность чисел по формуле
     * Длина последовательности l.
     */
        printTask();
        calculateEquation20(5,3);

    /* Задание 21
     * Сгенерируйте последовательность целых положительных  двузначных чисел,
     * в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
     */
        printTask();
        for (int i = 10; i < 100; i++){
            if (Math.abs((i / 10) - (i % 10)) <= 3) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

    /* Задание 22
     * Написать метод, который вычислит значение функции:
     */
        printTask();
        calculateEquation22(6);
        calculateEquation22(0);
        calculateEquation22(-3);

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
        printEightDaysFromDate("Sun", 10, 2);

}

}
