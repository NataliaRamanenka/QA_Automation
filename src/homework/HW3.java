package homework;

import java.awt.geom.Arc2D;

public class HW3 {

    public static void main (String[] args) {

        int number = 1;
        String task = "Task ";
        String line = "***********************************************************************************************";
        String lineTab = "_________________________________________________________________________";

        System.out.println(task + ++number);
        /* Задача 2
         * Создать переменные a и b типа byte,
         * присвоить им значения из допустимого диапазона.
         */
        byte a = 127;
        byte b = -128;
        System.out.println("a = " + a + "\nb = " + b);
        System.out.println(line);

         System.out.println(task + ++number);
        /* Задача 3
         * Создать переменные s и t типа short,
         * присвоить им значения с разницей 60000.
         */
        short s = - 30000;
        short t = (short) (s + 60000);
        System.out.println("s = " + s + "\nt = " + t);
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 4
         * Создать переменную i типа int и присвоить ей минимально возможное
         * значение этого типа. Затем присвоить максимально возможное значение
         * этого типа. Распечатать оба значения в виде таблицы.
         */
        int i;
//      iMin = -2147483648;
        i = Integer.MIN_VALUE;
        System.out.println(lineTab);
        System.out.println("|\t\t\t int min \t\t\t\t|\t\t\t"
                + i + "\t\t\t\t|");
        System.out.println(lineTab);

//      iMax = 2147483647;
        i = Integer.MAX_VALUE;

        System.out.println("|\t\t\t int max \t\t\t\t|\t\t\t "
                + i + "\t\t\t\t|");
        System.out.println(lineTab);
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 5
         * Создать переменную phoneNumber и присвоить ей значение номера телефона
         * с кодом страны и города (можно ненастоящий номер телефона, например,
         * 18009998877)
         */
//      long phoneNumber = 375259316646L;
        String phoneNumber = "375259316646";
        System.out.println(phoneNumber);
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 6
         * Создать переменную f типа float и присвоить ей значение 100.101101.
         * Создать переменную d типа double и присвоить ей значение 100.101101.
         * Распечатать результат в виде таблицы.
         */
        float f = 100.101101F;
        double d = 100.101101;

        System.out.println(lineTab);
        System.out.println("|\t\t\t float f \t\t\t\t|\t\t\t"
                + f + "\t\t\t\t|");
        System.out.println(lineTab);
        System.out.println("|\t\t\t double d \t\t\t\t|\t\t\t"
                + d + "\t\t\t\t|");
        System.out.println(lineTab);
        System.out.println(line);

        {
            System.out.println(task + ++number);
            /* Задача 7
             * a) Создать переменную типа Double с именем dd  и инициализировать её
             * результатом суммы чисел 10.09999 и 20.099999.
             * b) Создать переменную типа Float с именем ff  и инициализировать её
             * результатом суммы чисел 10.09999 и 20.099999.
             * Распечатать результаты.
             */
            Double dd = new Double(10.09999 + 20.099999);
            Float ff = new Float(10.09999F + 20.099999F);
            System.out.println(dd);
            System.out.println(ff);
            System.out.println(line);
        }

        System.out.println(task + ++number);
        /* Задача 8
         * Создать переменную float ff и присвоить ей значение выражения 10 / 3.
         * Создать переменную double dd и присвоить ей значение выражения 10 / 3.
         */
        Double dd = new Double(10 / 3);
        Float ff = new Float( 10.0 / 3F);
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 9
         * Создать переменные типа Float:
         * floatSum: сумма
         * floatSub: разность
         * floatProduct: произведение
         * floatQuotient: частное числа (деление)
         * floatRemainder: остаток от деления
         * и  присвоить им значения, вычисленные с помощью переменных f и ff.
         */
        Float floatSum  = new Float(f + ff);
        Float floatSub  = new Float(f - ff);
        Float floatProduct  = new Float(f * ff);
        Float floatQuotient  = new Float(f / ff);
        Float floatRemainder = new Float(f % ff);
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 10
         * Создать переменные типа double:
         * doubleSum
         * doubleSub
         * doubleProduct
         * doubleQuotient
         * doubleRemainder
         * и  присвоить им значения, вычисленные с помощью переменных d и dd.
         */
        double doubleSum = d + dd;
        double doubleSub = d - dd;
        double doubleProduct = d * dd;
        double doubleQuotient = d / dd;
        double doubleRemainder = d % dd;
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 11
         * Распечатать результаты вычислений заданий 8 - 10 в виде таблицы
         */
        System.out.println(lineTab);
        System.out.println("|f = " + f + "\t |ff = " + ff
                + "| d = " + d + "\t| dd = " + dd + "\t\t\t|");
        System.out.println(lineTab);
        System.out.println("|floatSum = " + floatSum
                + "\t\t\t|doubleSum = " + doubleSum + "\t\t\t\t\t|");
        System.out.println("|floatSub = " + floatSub
                + "\t\t\t|doubleSub = " + doubleSub + "\t\t\t\t\t|");
        System.out.println("|floatProduct = " + floatProduct
                + "\t\t|doubleProduct = " + doubleProduct + "\t\t\t\t|");
        System.out.println("|floatQuotient=" + floatQuotient
                + "\t\t|doubleQuotient = " + doubleQuotient + "\t|");
        System.out.println("|floatRemainder=" + floatRemainder
                + "\t\t|doubleRemainder = " + doubleRemainder + "\t|");
        System.out.println(lineTab);
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 12
         * Распечатать слова HELLO JAVA точками (чтобы получился рисунок точками)
         */
        String point = ".";
        String tabPointTab = "  " + point + "  \t" ;
        String pointTab = point + "\t \t";
        String tabPoint = "\t" + point + "\t";
        String lineLetter = point + point + point + point + point + "\t";
        String doublePoint = point + "\t"+ point + "\t";
        System.out.println(doublePoint + lineLetter + pointTab + pointTab + lineLetter
                + "\t\t" + tabPoint + tabPointTab + doublePoint + tabPointTab);
        System.out.println(doublePoint + pointTab + pointTab + pointTab + doublePoint
                + "\t\t" + tabPoint + doublePoint + doublePoint + doublePoint);
        System.out.println(lineLetter + lineLetter + pointTab + pointTab + doublePoint
                + "\t\t" + tabPoint + lineLetter + doublePoint + lineLetter);
        System.out.println(doublePoint + pointTab + pointTab + pointTab + doublePoint
                + "\t\t" + doublePoint + doublePoint + doublePoint + doublePoint);
        System.out.println(doublePoint + lineLetter + lineLetter + lineLetter + lineLetter
                + "\t\t" + lineLetter + doublePoint + tabPointTab + doublePoint);
            System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 13
         * Создать переменные подходящего ссылочного типа данных
         * (выбирать минимально достаточный диапазон значений):
         * t1 = 0;
         * t2 = 150;
         * t3 = -120;
         * t4 = - 505.505;
         * t5 = 100100;
         * t6 = 100010001000;
         * t7 = 2.66666666666666;
         * t8 = - 1000000.001;
         * t9 = 1010;
         * Распечатать значения всех переменных.
         */
        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Float t8 = - 1000000.001F;
        Short t9 = 1010;
        System.out.println("Byte t1 = " + t1);
        System.out.println("Short t2 = " + t2);
        System.out.println("Byte t3 = " + t3);
        System.out.println("Float t4 = " + t4);
        System.out.println("Integer t5 = " + t5);
        System.out.println("Long t6 = " + t6);
        System.out.println("Double t7 = " + t7);
        System.out.println("Float t8 = " + t8);
        System.out.println("Short t9 = " + t9);
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 14
         * С помощью полей классов ссылочного типа распечатать таблицу:
         * Type | Size in bits |min |max
         * byte
         * short
         * int
         * long
         * float
         * double
         */
        byte sizeByte = Byte.SIZE;
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        short sizeShort = Short.SIZE;
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        int sizeInt = Integer.SIZE;
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long sizeLong = Long.SIZE;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        float sizeFloat = Float.SIZE;
//        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double sizeDouble = Double.SIZE;
//        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println(lineTab);
        System.out.println("| Type |Size in bits|\t\t\tmin\t\t\t\t|\t\t\tmax\t\t\t|");
        System.out.println(lineTab);
        System.out.println("| byte |\t" + sizeByte + "\t\t|\t\t\t" + minByte + "\t\t\t|\t\t\t" + maxByte + "\t\t\t|");
        System.out.println(lineTab);
        System.out.println("| short|\t" + sizeShort + "\t\t|\t\t\t" + minShort + "\t\t\t|\t\t\t" + maxShort + "\t\t|");
        System.out.println(lineTab);
        System.out.println("| int  |\t" + sizeInt + "\t\t|\t\t" + minInt + "\t\t\t|\t\t" + maxInt + "\t\t|");
        System.out.println(lineTab);
        System.out.println("| long |\t" + sizeLong + "\t\t|\t" + minLong + "\t|\t" + maxLong + "\t|");
        System.out.println(lineTab);
        System.out.println("| float|\t" + sizeFloat + "\t|\t" + (maxFloat * (-1)) + "\t\t\t|\t" + maxFloat + "\t\t|");
        System.out.println(lineTab);
        System.out.println("|double|\t" + sizeDouble + "\t|\t" + (maxDouble * (-1)) + "\t| " + maxDouble + "|");
        System.out.println(lineTab);
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 15
         * Создать 2 переменные референсного типа Integer - num1 и num2,
         * присвоить им одинаковые значения, сравнить 2 переменные друг с другом
         * с помощью метода .equals(). Вывести результат сравнения на печать
         * в виде выражения:
         * “Если num1 равно  num2, то результат сравнения методом .equals() = …”
         * Присвоить переменным разные значения, сравнить,
         * и вывести результат на печать:
         * “Если num1 не равно num2, то результат сравнения методом .equals() = …”
         */
        Integer null1 = new Integer(6);
        Integer null2 = new Integer(6);
        System.out.println("Если num1 равно num2, то результат сравнения методом .equals() = …"
        + null1.equals(null2));
        null2 = 7;
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equals() = …"
        +null1.equals(null2));
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 16
         * Создать 2 переменные примитивного типа int - number1 and number2.
         * Инициализаровать их
         * а) одинаковыми значениями
         * b) number1 < number2
         * c) number1 > number2
         * сравнить их подходящим методом класса Integer
         * посмотрите, какой метод подойдет - не equals() !),
         * и вывести результаты сравнения на печать в виде выражений:
         * “Если number1 = number2, то результат сравнения методом … = …”
         * “Если number1 < number2, то результат сравнения методом … = …”
         * “Если number1 > number2, то результат сравнения методом … = …”
         */
        int number1 = 15;
        int number2 = 15;
        System.out.println("a) Если number1 = number2, то результат сравнения методом compare = "
                + Integer.compare(number1, number2));
        number1 = 10;
                System.out.println("b) Если number1 < number2, то результат сравнения методом compare = "
                + Integer.compare(number1, number2));
        number2 = 8;
        System.out.println("c) Если number1 > number2, то результат сравнения методом compare = "
                + Integer.compare(number1, number2));
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 17
         * Создать переменную типа Float, присвоить ей значение 234.9999,
         * распечатать значение переменной в int
         */
        Float fl = 234.9999F;
//      System.out.println(((int) fl)); не работает
        System.out.println(fl.intValue());
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 18
         * С помощью метода sum() класса Double посчитать сумму двух переменных типа double.
         */
        System.out.println("d = " + d + "\ndd = " + dd + "\nSumOfDouble = "
                + Double.sum(t7, dd));
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 19
         * С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.
         */
        System.out.println("t4 = " + t4 + "\nt8 = " + t8 + "\nSumOfFloat = "
                + Integer.sum(t4.intValue(),t8.intValue()));
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 20
         * Создать 2 переменные типа Short:
         * short1 = 12000
         * short2 = 12300
         * Распечатать фразу:“12000 - 12300 = -300”
         * где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
         * Присвоить переменной short1 значение 12500, вывести фразу:
         * “12500 - 12300 = 200”
         * где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */
        Short short1 = 12000;
        Short short2 = 12300;
//      System.out.println("12000 - 12300 = " + Short.compare(short1,short2));
//      System.out.println("12000 - 12300 = " + short1.compareTo(short2));
        System.out.println("12000 - 12300 = " + Short.compareUnsigned(short1,short2));
        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compareUnsigned(short1,short2));
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 21
         * Создать переменные:
         * String str1 = "123.56";
         * String str2 = "123.55";
         * Double doub1 = 123.56;
         * Double doub2 = 123.55;
         * Распечатать результат doub1 - doub2
         * Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
         * Сравнить полученные результаты doub1 - doub2 и str1 - str2
         */
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        System.out.println("doub1 - doub2 = " + (doub1 - doub2));
        System.out.println("str1 - str2 = " + (Double.valueOf(str1) - Double.valueOf(str2)));
//      1) System.out.println("str1 - str2 = " + (Double.parseDouble(str1) - Double.parseDouble(str2)));
//      более безопасный метод
//      2) Double string1 = new Double(str1);
//         Double string2 = new Double(str2);
//         System.out.println("str1 - str2 = " + (string1 - string2));
        System.out.println("Compere = " + Double.compare((doub1 - doub2), (Double.valueOf(str1) - Double.valueOf(str2))));
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 22
         * Создать переменную подходящего типа данных для хранения результатов измерения
         * температуры тела кота (значения температуры в Цельсиях). Присвоить этой
         * переменной сначала максимальное значение, затем минимальное значение.
         * Посчитать и распечатать среднее значение. Распечатать результат среднего
         * значения температуры тела кота.
         */
        float catTemp = 39.5F;
        float forAverege = catTemp / 2;
        catTemp = 28.8F;
        float Averege = forAverege + catTemp / 2;
        System.out.println("Среднее значения температуры тела кота = " + Averege + "C");
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 23
         * Создать переменную n типа Number, присвоить ей максимально возможное значение.
         * Присвоить n значение 10, затем присвоить n значение 10.999999999
         * Распечатать результаты в виде выражения:
         * “Переменная n может принимать значения:
         *  n =  …
         *  n =  …
         *  n =  …
         *  Это возможно, потому что …”
         */
        Number n = Double.MAX_VALUE;
        System.out.println("Переменная n может принимать значения:\n" + "n = " + n);
        n = 10;
        System.out.println("n = " + n);
        n = 10.999999999;
        System.out.println("n = " + n);
        System.out.println("Это возможно, потому что абстрактный класс Number - "
                + "это суперкласс для всех численных классов Java: Byte, Double, "
                + "Float, Integer, Long и Short.");
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 24
         * Создать переменную Integer numberInteger = 100.
         * Доказать, что numberInteger имеет тип Integer,
         * а numberInteger.toString() имеет тип String.
         */
        Integer numberInteger = new Integer (100);
        Object numberIntegerToString = numberInteger.toString(numberInteger);
        System.out.println("а)\tEcли к переменной типа Integer прибавить единицу, "
                + "то она увеличится на 1: " + (numberInteger + 1));
        System.out.println("\tEcли к переменной типа String прибавить единицу, "
                + "то программа произведет конкатенацию: " + (numberInteger.toString() + 1));
        System.out.println("b)\t" + numberInteger);
        System.out.println("\t" + numberInteger.getClass());
        System.out.println("\t" + numberIntegerToString);
        System.out.println("\t" + numberIntegerToString.getClass());
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 25
         * Вывести на экран следующие выражения, используя для печати только переменные:
         * “50 kilogram = … lbs,  50 lb = … kg”,
         * где значения должны быть вычислены по формулам
         * “100 meters = … miles,  100 miles = … meters”,
         * где значения должны быть вычислены по формулам
         */
        int weight = 50;
        int distance = 100;
        float toKilogram = 0.453592F;
        float toLb = 2.20462F;
        double toMile = 0.000621371;
        double toMeter = 1609.3435021075907;
        System.out.println("50 kilogram = " + (weight * toLb) + " lbs,  50 lb = "
                + (weight * toKilogram) + " kg");
        System.out.println("100 meters = " + (distance * toMile) + " miles,  100 miles = "
                + (distance * toMeter) + " meters");
        System.out.println(line);

        System.out.println(task + ++number);
        /* Задача 26
         * На сайте погоды https://openweathermap.org/ найти в документации и
         * распечатать, какие коды соответствуют следующим состояниям погоды:
         * … - thunderstorm with heavy rain
         * … - overcast clouds: 85-100%
         * … - Shower sleet
         */
//       https://openweathermap.org/weather-conditions#Weather-Condition-Codes-2
        System.out.println("202 \tThunderstorm \tthunderstorm with heavy rain \t11d");
        System.out.println("804 \tClouds \tovercast clouds: 85-100% \t04d\t04n");
        System.out.println("613 \tSnow \tShower sleet \t13d ");
        System.out.println(line);

    };
}
