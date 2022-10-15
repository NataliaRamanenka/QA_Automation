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

    public static String randomArray21(int l) {
        if (l > 0) {
            int[] randomArray = new int[l];
            for (int i = 0; i < l; i++) {
                randomArray[i] = (int) (Math.random() * 7);
                if (i == (l - 1)) {
                    System.out.print(randomArray[i]);
                } else {
                    System.out.print(randomArray[i] + ", ");
                }
            }
            System.out.println();
        } else if (l == 0) {
            System.out.println("Длина последовательности равна нулю");
        } else {
            System.out.println("Введите положительную длину последовательности");
        }
        return "";
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

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.print("yes ");
                break;
            }
            if (Math.abs(array[i] - number) == 1) {
                System.out.print("maybe ");
            }

            if (array[i] != number && Math.abs(array[i] - number) != 1) {
                //   System.out.print("no ");
                continue;
            }
        }
        return "";
    }


    public static void main(String[] args) {

        /* Задача 1. Переписать  методы returnMonth(), returnDayOfTheWeek() с помощью оператора switch.
         */
        printTask();
        String monthName;
        int month = 8;
        switch (month) {
            case 1:
                monthName = "Jan";
                break;
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "Mar";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "Jul";
                break;
            case 8:
                monthName = "Aug";
                break;
            case 9:
                monthName = "Sep";
                break;
            case 10:
                monthName = "Oct";
                break;
            case 11:
                monthName = "Nov";
                break;
            case 12:
                monthName = "Dec";
                break;
            default:
                monthName = "Error";
                break;
        }

        String dayName;
        int day = 6;
        switch (day) {
            case 1:
                dayName = "Mon";
                break;
            case 2:
                dayName = "Tue";
                break;
            case 3:
                dayName = "Wed";
                break;
            case 4:
                dayName = "Thu";
                break;
            case 5:
                dayName = "Fri";
                break;
            case 6:
                dayName = "Sat";
                break;
            case 7:
                dayName = "Sun";
                break;
            default:
                dayName = "Error";
                break;
        }

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
        randomArray21(3);
        randomArray21(0);
        randomArray21(30);
        randomArray21(-1);

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
        int y = 0;
        int[] array = new int[(-900 + 1000) / 2];
        for (int i = -999; i < -900; i++) {
            if (Math.abs(i) % 2 == 1) {
                array[y] = i;
                y++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);


        /* Задача 24. Создать массив из 10 случайных положительных целых чисел в промежутке от 100 до 200 включительно.
         */
        printTask();
        int[] randomArray = new int[10];

        for (int i = 0; i <= 9; i++) {
            int x = (int) (Math.random() * 101 + 100);
            randomArray[i] = x;
            System.out.print(randomArray[i] + ", ");

        }
        System.out.println();

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
        //numbers array from task 24 int evenCount = 0; for (int i = 0; i < numbers.length; i++) { if (numbers[i] % 2 == 0) { evenCount += 1; } } int[] evenNumbers = new int[evenCount]; int[] oddNumbers = new int[numbers.length - evenCount]; int evenIndex = 0; int oddIndex = 0; for (int i = 0; i < numbers.length; i++) { if (numbers[i] % 2 == 0) { evenNumbers[evenIndex] = numbers[i]; evenIndex += 1; } else { oddNumbers[oddIndex] = numbers[i]; oddIndex += 1; } } System.out.println(Arrays.toString(numbers)); System.out.println(Arrays.toString(evenNumbers)); System.out.println(Arrays.toString(oddNumbers));

        /* Задача 27. Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
         * Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
         */

        /* Задача 28. Создать двумерный массив целых случайных чисел от 1 до 10 включительно, размерность массива 4*8.
         */

        /* Задача 29. Вывести сумму всех четных чисел массива из задания 28.
         */

        /* Задача 30. Прочитать ссылку про оператор switch в документации, посмотреть видео,
         * и переписать  проверки дат из кода, который выставляла Гаяна в субботу, 8 октября (ДЗ 6, последняя задача),
         * с помощью оператора switch. В документации Oracle есть практически готовое решение + Гаяна уже все прописала,
         * только надо “допилить” код под наши нужды.
         * Написать эту проверку в отдельном методе и подключить проверку в метод printEightDaysFromDate.
         */


    }

}
