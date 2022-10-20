package homework;

import java.util.Arrays;

public class HW7 {

    static int tcNumber = 1;

    public static void printTask() {
        System.out.println("\nTask " + tcNumber++);
    }

    public static void printSubTask(int subNumber) {
        System.out.println(subNumber + ")");
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {

            return "\tPass";
        } else {

            return "\tFail";
        }
    }

    public static void printTestResult(String value) {
        System.out.println("\t ---> \t" + value);
    }

    public static int[] printNegOdds(int start, int end, int step) {
        if (step != 0) {
            if (start < end && step > 0) {
                int j = 0;
                int l = (int) Math.round((end - start) / (double) step);
                int[] arrNegOdds = new int[l];
                for (int i = (start + 1 - Math.abs(start % 2)); i < end; i += step, j++) {
                    arrNegOdds[j] = i;
                }
                System.out.println(Arrays.toString(arrNegOdds));

                return arrNegOdds;
            } else if (start > end && step < 0) {
                int j = 0;
                int l = (int) Math.round((end - start) / (double) step);
                int[] arrNegOdds = new int[l];
                for (int i = (start - 1 + Math.abs(start % 2)); i > end; i += step, j++) {
                    arrNegOdds[j] = i;
                }
                System.out.println(Arrays.toString(arrNegOdds));

                return arrNegOdds;
            }
        }

        return new int[0];
    }

    public static void printSequence(double start, double end, double step) {
        if (step != 0) {
            double first;
            if ((start > 0 && end > 0) || (start < 0 && end < 0)) {
                first = start + step - start % step;
            } else {
                first = start - start % step;
            }
            if (start >= end && step < 0) {
                for (double i = first; i >= end; i += step) {
                    System.out.print(i + ", ");
                }
            } else if (start <= end && step > 0) {
                for (double i = first; i <= end; i += step) {
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

    public static String printRandPosEven21(int l) {
        if (l > 0) {
            int[] randomArray = new int[l];
            for (int i = 0; i < l; i++) {
                randomArray[i] = (int) (Math.random() * 7);
//                if (i == (l - 1)) {
//                    System.out.print(randomArray[i]);
//                } else {
//                    System.out.print(randomArray[i] + ", ");
//                }
            }
            System.out.println(Arrays.toString(randomArray));
        } else if (l == 0) {
            System.out.println("Длина последовательности равна нулю");
        } else {
            System.out.println("Введите положительную длину последовательности");
        }
        return "";
    }

    public static void printRandomIntNumber(int l, int minValue, int maxValue) {
        if (l > 0) {
            int[] randomArray = new int[l];
            for (int i = 0; i < l; i++) {
                randomArray[i] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
//                if (i == (l - 1)) {
//                    System.out.print(randomArray[i]);
//                } else {
//                    System.out.print(randomArray[i] + ", ");
//                }
            }
            System.out.println(Arrays.toString(randomArray));
        } else if (l == 0) {
            System.out.println("Длина последовательности равна нулю");
        } else {
            System.out.println("Введите положительную длину последовательности");
        }
    }


    public static double average22(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = sum / array.length;
        return average;
    }

    public static String verifyArray(int[] array, int number) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.print("yes ");
                counter++; // не используется, т.к. есть break
                break;
            }
            if (Math.abs(array[i] - number) == 1) {
                System.out.print("maybe ");
                counter++;
            }

            if (i == array.length - 1 && counter == 0) {
                System.out.print("no ");
            }
        }
        return "";
    }

    public static int returnDayOfTheWeek(String day) {

        switch (day.toLowerCase()) {
            case "mon":
                return 1;
            case "tue":
                return 2;
            case "wed":
                return 3;
            case "thu":
                return 4;
            case "fri":
                return 5;
            case "sat":
                return 6;
            case "sun":
                return 7;
        }

        return 0;
    }

    public static String returnNameOfDayOfTheWeek(int dayName) {

        switch (dayName) {
            case 1:
                return "Mon";
            case 2:
                return "Tue";
            case 3:
                return "Wed";
            case 4:
                return "Thu";
            case 5:
                return "Fri";
            case 6:
                return "Sat";
            case 7:
                return "Sun";
        }
        return "Error";
    }

    public static int returnMonth(String month) {

        switch (month.toLowerCase()) {
            case "jan":
                return 1;
            case "feb":
                return 2;
            case "mar":
                return 3;
            case "apr":
                return 4;
            case "may":
                return 5;
            case "jun":
                return 6;
            case "jul":
                return 7;
            case "aug":
                return 8;
            case "sep":
                return 9;
            case "oct":
                return 10;
            case "nov":
                return 11;
            case "dec":
                return 12;
        }

        return 0;
    }

    public static String returnNameOfMonth(int month) {

        switch (month) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
        }

        return "Error";
    }

    public static void main(String[] args) {

        /* Задача 1. Переписать  методы returnMonth(), returnDayOfTheWeek() с помощью оператора switch.
         */
        printTask();
        String nameOfMonth = "Sep";
        System.out.println(returnMonth(nameOfMonth));
        int month = 9;
        System.out.println(returnNameOfMonth(month));
        String nameOfDay = "Mon";
        System.out.println(returnDayOfTheWeek(nameOfDay));
        int day = 1;
        System.out.println(returnNameOfDayOfTheWeek(day));

        /* Задача 2. Написать универсальный метод для построения последовательности, которая начинается с числа start,
         * заканчивается числом end (оба включительно). Все числа в этой последовательности должны быть кратны числу
         * step. Этот метод должен высчитывать первое кратное число в диапазоне [start, end] и строить
         * последовательность (возрастающую или убывающую) от вычисленного первого кратного числа с шагом step.
         */
        printTask();
        double start = 16;
        double end = -65;
        double step = -5;
        printSequence(start, end, step);
        start = -16;
        end = 65;
        step = 5;
        printSequence(start, end, step);
        start = 16;
        end = 65;
        step = 5;
        printSequence(start, end, step);
        start = -16;
        end = -65;
        step = -5;
        printSequence(start, end, step);
        start = -16;
        end = -65;
        step = 0;
        printSequence(start, end, step);
        start = -16;
        end = -65;
        step = 5;
        printSequence(start, end, step);
        start = 16;
        end = 65;
        step = -5;
        printSequence(start, end, step);

        /* Задача 3. Создать массив catsNames[], заполнить его любыми своими значениями (не такими, как были на уроке).
         */
        printTask();
        String[] catsNames = new String[]{"Мурзик", "Гав", "Уголек", "Пушок", "Багира", "Клеопатра", "Муха", "Гарфилд"};

        /* Задача 4. В массиве catsNames[] изменить значение элемента с индексом 4 на “Рыжик”,
         * а значение элемента с индексом 1 на “Черныш”.
         */
        printTask();
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";

        /* Задача 5. Создать массив catsColors[] и заполнить его значениями (см картинку в презентации).
         */
        printTask();
        String[] catsColors = new String[]{"Grey", "Black", "Grey", "Grey", "Red", "Grey", "Red", "Grey"};

        /* Задача 6. Создать массив catsAges[] и заполнить его любыми целочисленными валидными значениями.
         */
        printTask();
        int[] catsAges = new int[]{2, 1, 5, 8, 3, 1, 10, 4};

        /* Задача 7. Создать массив isCatRed[] и заполнить его соответствующими значениями
         * (см картинку в презентации. Red = рыжий)
         */
        printTask();
        boolean[] isCatRed = new boolean[]{false, false, false, false, true, false, false, true};

        /* Задача 8. Распечатать для массивов catsNames[] и catsColors[]:
         * имя кота в коробке с номером 6
         * имена котов из коробок с четными индексами
         * имена котов из коробок, чьи индексы кратны 4
         * цвет котов из коробок с нечетными индексами
         * цвет котов из коробок, чьи индексы кратны 3, но не кратны 2
         */
        printTask();
        printSubTask(1); //имя кота в коробке с номером 6
        System.out.println(catsNames[6]);
        printSubTask(2); //имена котов из коробок с четными индексами
        for (int i = 0; i < catsNames.length; i += 2) {
            if (i == (catsNames.length - 2)) {
                System.out.print(catsNames[i]);
            } else {
                System.out.print(catsNames[i] + ", ");
            }
        }
        System.out.println();
        printSubTask(3); //имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < catsNames.length; i += 4) {
            if (i == (catsNames.length - 4)) {
                System.out.print(catsNames[i]);
            } else {
                System.out.print(catsNames[i] + ", ");
            }
        }
        System.out.println();
        printSubTask(4);//цвет котов из коробок с нечетными индексами
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 == 1) {
                if (i == (catsColors.length - 1)) {
                    System.out.print(catsColors[i]);
                } else {
                    System.out.print(catsColors[i] + ", ");
                }
            }
        }
        System.out.println();
        printSubTask(5);//цвет котов из коробок, чьи индексы кратны 3, но не кратны 2
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0 && i % 2 == 1) {
                System.out.print(catsColors[i] + " ");
            }
        }
        System.out.println();

        /* Задача 9. Распечатать “Накорми кота!” для всех серых котов
         */
        printTask();
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                System.out.println("Накорми кота!");
            }
        }

        /* Задача 10. Распечатать “Дай коту воды!” для всех котов со значениями true из массива isCatRed[]
         */
        printTask();
        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i] == true) {
                System.out.println("Дай коту воды!");
            }
        }

        /* Задача 11. Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
         */
        printTask();
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }

        /* Задача 12. Для кота в последней коробке распечатать имя, цвет, возраст
         */
        printTask();
        System.out.println(catsNames[catsNames.length - 1]);
        System.out.println(catsColors[catsColors.length - 1]);
        System.out.println(catsAges[catsAges.length - 1]);

        /* Задача 13. Распечатать имя, цвет, возраст котов в двух серединных коробках
         */
        printTask();
        System.out.println(catsNames[catsNames.length / 2] + ", "
                + catsColors[catsColors.length / 2] + ", "
                + catsAges[catsAges.length / 2]);
        System.out.println(catsNames[(catsNames.length / 2) - 1] + ", "
                + catsColors[(catsColors.length / 2) - 1] + ", "
                + catsAges[(catsAges.length / 2) - 1]);

        /* Задача 14. Распечатать имена всех котов, чей возраст больше 2 лет
         */
        printTask();
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                if (i == (catsAges.length - 1)) {
                    System.out.print(catsNames[i]);
                } else {
                    System.out.print(catsNames[i] + ", ");
                }
            }
        }
        System.out.println();

        /* Задача 15. Распечатать “Накорми … !” , где … - имя кота, а значение isCatRed == true
         */
        printTask();
        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i] == true) {
                System.out.println("Накорми " + catsNames[i] + "a!");
            }
        }

        /* Задача 16. Распечатать средний возраст котов из массива catsAges[]
         */
        printTask();
        int sumAge = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sumAge = sumAge + catsAges[i];
        }
        double ageAver = sumAge / catsAges.length;
        System.out.println(ageAver);

        /* Задача 17. Распечатать возраст самого молодого кота
         */
        printTask();
        int minAge = Math.min(catsAges[0], catsAges[1]);
        for (int i = 2; i < catsAges.length; i++) {
            if (catsAges[i] <= minAge) {
                minAge = catsAges[i];
            }
        }
        System.out.println(minAge);

        /* Задача 18. Распечатать возраст самого старого кота
         */
        printTask();
        int maxAge = Math.max(catsAges[0], catsAges[1]);
        for (int i = 2; i < catsAges.length; i++) {
            if (catsAges[i] >= maxAge) {
                maxAge = catsAges[i];
            }
        }
        System.out.println(maxAge);

        /* Задача 19. Распечатать количество серых котов и количество рыжих котов
         */
        printTask();
        int counterGrey = 0;
        int counterRed = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                counterGrey++;
            } else if (catsColors[i].equals("Red")) {
                counterRed++;
            }
        }
        System.out.println("Grey = " + counterGrey + "\nRed = " + counterRed);

        /* Задача 20. Распечатать имя кота, если кот находится в коробке с нечетным индексом
         * и его возраст не больше 2 лет
         */
        printTask();
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 1 && catsAges[i] <= 2) {
                System.out.println(catsNames[i]);
            }
        }

        /* Задача 21. Написать метод, который создает и печатает массив четных положительных чисел, значения которых
         * не больше 6. Заполняем значения и печатаем с помощью цикла for. Длина массива - l.
         */
        printTask();
        printSubTask(1);
        printRandPosEven21(3);
        printRandPosEven21(0);
        printRandPosEven21(30);
        printRandPosEven21(-1);
        // универсальный метод
        printSubTask(2);
        printRandomIntNumber(20, 0, 10);


        /* Задача 22. Написать метод, который принимает на вход массив int, и печатает  среднее значение всех
         * элементов массива. Проверить работу метода, если параметр на вход - массив catsAges
         */
        printTask();
        double expectedResult = ageAver;
        double actualResult = average22(catsAges);
        System.out.println(average22(catsAges));

        verifyEquals(expectedResult, actualResult);
        printTestResult(verifyEquals(expectedResult, actualResult));


        /* Задача 23. Создать массив всех нечетных отрицательных чисел в промежутке от (-1000 до -900).
         */
        printTask();
        printSubTask(1);
        int y = 0;
        int[] array = new int[(-900 + 1000) / 2];
        for (int i = -999; i < -900; i++) {
            if (Math.abs(i) % 2 == 1) {
                array[y] = i;
                y++;
            }
        }
        System.out.println(Arrays.toString(array));
        printSubTask(2); // решение задачи через универсальный метод
        int start1 = -1000;
        int end1 = -900;
        int step1 = 2;
        printNegOdds(start1, end1, step1);

        start1 = -100;
        end1 = 120;
        step1 = 2;
        printNegOdds(start1, end1, step1);

        /* Задача 24. Создать массив из 10 случайных положительных целых чисел в промежутке от 100 до 200 включительно.
         */
        printTask();
        printSubTask(1);
        int[] randomArray = new int[10];
        for (int i = 0; i <= 9; i++) {
            int x = (int) (Math.random() * 101 + 100);
            randomArray[i] = x;
            System.out.print(randomArray[i] + ", ");
        }
        System.out.println();
        printSubTask(2); // решение задачи через универсальный метод
        printRandomIntNumber(10, 100, 200);

        /* Задача 25. Написать метод, который принимает на вход массив int[] array и число int number.
         * Метод проверяет, содержится ли число number в массиве array. При первом нахождении числа number,
         * метод печатает “yes”. При каждом нахождении чисел на 1 больше числа number,  или на 1 меньше числа number,
         * метод печатает “maybe”. Метод печатает “no”, если не находит ни одного числа, соответствующего условиям.
         */
        printTask();
        System.out.println(verifyArray(catsAges, 4));
        System.out.println(verifyArray(catsAges, 10));
        System.out.println(verifyArray(catsAges, 15));
        System.out.println(verifyArray(catsAges, 2));
        System.out.println(verifyArray(catsAges, 11));
        System.out.println(verifyArray(catsAges, 1));

        /* Задача 26. Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 24.
         */
        printTask();
        int evenCount = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0) {
                evenCount += 1;
            }
        }
        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[randomArray.length - evenCount];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0) {
                evenNumbers[evenIndex] = randomArray[i];
                evenIndex += 1;
            } else {
                oddNumbers[oddIndex] = randomArray[i];
                oddIndex += 1;
            }
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));

        /* Задача 27. Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
         * Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
         */
        printTask();
        printSubTask(1);
        //перевела массив int в String
        String[] catsAgesToString = new String[catsAges.length];
        int catsAgesToStringIndex = 0;
        for (int i = 0; i < catsAges.length; i++) {
            catsAgesToString[catsAgesToStringIndex] = Integer.toString(catsAges[i]);
            catsAgesToStringIndex++;
        }
        //двумерный массив String
        String[][] саtArrayTwoD = new String[3][8];
        for (int i = 0; i < саtArrayTwoD.length; i++) {
            for (int j = 0; j < саtArrayTwoD[i].length; j++) {
                if (i == 0) {
                    саtArrayTwoD[i][j] = catsNames[j];
                }
                if (i == 1) {
                    саtArrayTwoD[i][j] = catsAgesToString[j];
                }
                if (i == 2) {
                    саtArrayTwoD[i][j] = catsColors[j];
                }
            }
            System.out.println(Arrays.toString(саtArrayTwoD[i]));
        }
        for (int i = 0; i < саtArrayTwoD.length; i += 2) {
            System.out.println();
            for (int j = 0; j < саtArrayTwoD[i].length; j += 2) {
                System.out.print(саtArrayTwoD[i][j] + ", ");
            }
        }
        System.out.println();

        printSubTask(2);
        //через тернарные операторы
        String[][] саtArrayTwoDTern = new String[3][8];
        for (int i = 0; i < саtArrayTwoDTern.length; i++) {
            for (int j = 0; j < саtArrayTwoDTern[i].length; j++) {
                саtArrayTwoDTern[i][j] = i == 0 ? catsNames[j]
                        : i == 1 ? String.valueOf(catsAges[j])
                        : catsColors[j];
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print(саtArrayTwoDTern[i][j] + ", ");
                }
            }
        }
        System.out.println();

        /* Задача 28. Создать двумерный массив целых случайных чисел от 1 до 10 включительно, размерность массива 4*8.
         */
        printTask();
//        int[][] randomTwoDArray = new int[4][8];
//        start1 = 1;
//        end1 = 10;
//        for(int i = 0; i < randomTwoDArray.length; i++){
//            for(int j = 0; j < randomTwoDArray[i].length; j++){
//                randomTwoDArray[i][j] = (int)(Math.random() * (end1 - start1 + 1) + start1);
//            }
//            System.out.println(Arrays.toString(randomTwoDArray[i]));
//        }
        int[][] randomTwoDArray = new int[4][8];
        start1 = 1;
        end1 = 10;
        for (int i = 0; i < randomTwoDArray.length; i++) {
            for (int j = 0; j < randomTwoDArray[i].length; j++) {
                randomTwoDArray[i][j] = (int) (Math.random() * (end1 - start1 + 1) + start1);
                System.out.print(randomTwoDArray[i][j] + "\t");
            }
            System.out.println();
        }


        /* Задача 29. Вывести сумму всех четных чисел массива из задания 28.
         */
        printTask();
        int sum = 0;
        for (int i = 0; i < randomTwoDArray.length; i++) {
            for (int j = 0; j < randomTwoDArray[i].length; j++) {
                if (randomTwoDArray[i][j] % 2 == 0) {
                    System.out.print(randomTwoDArray[i][j] + "\t");
                    sum = sum + randomTwoDArray[i][j];
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("sum = " + sum);


        /* Задача 30. Прочитать ссылку про оператор switch в документации, посмотреть видео,
         * и переписать  проверки дат из кода, который выставляла Гаяна в субботу, 8 октября (ДЗ 6, последняя задача),
         * с помощью оператора switch. В документации Oracle есть практически готовое решение + Гаяна уже все прописала,
         * только надо “допилить” код под наши нужды.
         * Написать эту проверку в отдельном методе и подключить проверку в метод printEightDaysFromDate.
         */
        printTask();
        printEightDaysFromDate("Mon", 2, 27, 2020, 10);

    }

    public static int returnDate(int date) {
        if (date < 10) {
            String number = String.format("%03d", date);

            return Integer.valueOf(number); //добавляем ноль для 1-9
        } else {
            return date;
        }
    }

    public static int daysInMonth(int month, int year) {

        int numDays;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:

                return -1;
        }

        return numDays;
    }

    public static void printEightDaysFromDate(String day, int month, int date, int year, int l) {

        if (returnDayOfTheWeek(day) == 0 ||
                returnNameOfMonth(month).equals("Error") ||
                date <= 0 ||
                date > (daysInMonth(month, year))) {

            System.out.println("Please enter correct data.");

        } else {
            int currentDay = returnDayOfTheWeek(day);
            int currentMonth = month;
            int currentDate = date;
            int currentYear = year; //использовал для метода без агумета year. Для текущего года.

// print day
            for (int i = 0; i < l; i++) {
                if (currentDay != 7) {
                    System.out.print(returnNameOfDayOfTheWeek(currentDay) + ", ");
                    currentDay++;
                } else {
                    System.out.print(returnNameOfDayOfTheWeek(currentDay) + ", ");
                    currentDay = 1;
                }
// print month + date
                if (currentDate <= daysInMonth(currentMonth, currentYear)) {
                    System.out.println(returnNameOfMonth(currentMonth) + " " + returnDate(currentDate));
                    currentDate++;
                } else {
                    if (currentMonth != 12) {
                        currentMonth++;
                    } else {
                        currentMonth = 1;
                        currentYear = year + 1;
                    }
                    currentDate = 1;
                    System.out.println(returnNameOfMonth(currentMonth) + " " + returnDate(currentDate));
                    currentDate++;
                }
            }
        }
    }


}
