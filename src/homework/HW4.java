package homework;

public class HW4 {

    static int n = 2;
    static String linetask = "**********************************************************************************\n";
    static String linetable = " ___________________________________________________________________________________________________________ ";

    public static void task() {
        System.out.println("******************************\t\tЗадание №  " + ++n + "\t******************************");
    }

    public static void checkTask(int x) {
        if (x > 10) {
            System.out.println("Если х равно " + x + ", то x больше 10");
        } else if (x < 0) {
            System.out.println("Если х равно " + x + ", то x - отрицательное число");
        } else if (x == 5) {
            System.out.println("Если х равно " + x + ", то разность x и 5 равна 0");
        } else {
            System.out.println("Если х равно " + x + ", то число x меньше 11, больше или равно 0, но не равно 5");
        }
    }

    public static void checkParity(int y) {
        if (y % 2 == 0) {
            System.out.println(y * 2);
        } else {
            System.out.println(y * y);
        }
    }

    public static void temperature(double temp) {
        System.out.print("C° = " + temp + "\u2103\t\t");
        System.out.println("F° = " + ((temp * 9 / 5) + 32) + "\u2109");
    }

    public static void klmDivision(int k, int l, int m) {
        if (l != 0) {
            System.out.println("Результат деления k на l = " + (k / l) + ", а остаток от деления  = " + (k % l));
        } else {
            System.out.println("деление на ноль не возможно");
        }
        if (m != 0) {
            System.out.println("Результат деления k на m = " + (k / m) + ", а остаток от деления  = " + (k % m));
            System.out.println("Результат деления l на m = " + (l / m) + ", а остаток от деления  = " + (l % m));
        } else {
            System.out.println("деление на ноль не возможно");
        }
        if (k != 0) {
            System.out.println("Результат деления m на k = " + (m / k) + ", а остаток от деления  = " + (m % k));
        } else {
            System.out.println("деление на ноль не возможно");
        }
    }

    public static void klm(int parameter1, int parameter2, String varName1, String varName2){
        System.out.println("Результат деления " + varName1 + " на " + varName2 + " = " +  (parameter1 / parameter2)
                + ", а остаток от деления  = " + (parameter1 % parameter2));
    }

    static double distance;
    static double time;
    static double speed = distance / time;

    public static void speedAverage(double distance, double time) {
        speed = (distance / time) * 60;
        System.out.println("Distance = " + distance + "\ntime = " + time);
    }

    public static void apples(int apples) {
        if (apples == 1 || ((apples % 10) == 1 && ((apples != 11) || (apples % 100 != 11) || (apples % 1000 != 11)))) {
            System.out.print(" яблоко");
        } else if ((apples >= 2 && apples <= 4) || (apples % 10 >= 2 && apples % 10 <= 4)
                && !((apples >= 12 && apples <= 14) || (apples % 100 >= 12 && apples % 100 <= 14)
                || (apples % 1000 >= 12 && apples % 1000 <= 14))) {
            System.out.print(" яблока");
        } else {
            System.out.print(" яблок");
        }
    }

    public static void student(int student) {
        if (student == 1 || ((student % 10 >= 1 && student % 10 <= 4) && !(student >= 2 && student <= 14))) {
            System.out.print(" ученика");
        } else {
            System.out.print(" учеников");
        }
    }

    public static void applesForStudent(int apples, int student) {
        if (apples / student == 1 || ((apples / student % 10) == 1 && ((apples / student != 11)
                || (apples / student % 100 != 11) || (apples / student % 1000 != 11)))) {
            System.out.print(" яблоку");
        } else if ((apples / student >= 2 && apples / student <= 4)
                || (apples / student % 10 >= 2 && apples / student % 10 <= 4)
                && !((apples / student >= 12 && apples / student <= 14)
                || (apples / student % 100 >= 12 && apples / student % 100 <= 14)
                || (apples / student % 1000 >= 12 && apples / student % 1000 <= 14))) {
            System.out.print(" яблока");
        } else {
            System.out.print(" яблок");
        }
    }

    public static void applesForTeacher(int apples, int student) {
        if (apples % student == 1 || ((apples % student % 10) == 1 && ((apples % student != 11)
                || (apples % student % 100 != 11) || (apples % student % 1000 != 11)))) {
            System.out.print(" яблоко");
        } else if ((apples % student >= 2 && apples % student <= 4)
                || (apples % student % 10 >= 2 && apples % student % 10 <= 4)
                && !((apples % student >= 12 && apples % student <= 14)
                || (apples % student % 100 >= 12 && apples % student % 100 <= 14)
                || (apples % student % 1000 >= 12 && apples % student % 1000 <= 14))) {
            System.out.print(" яблока");
        } else {
            System.out.print(" яблок");
        }
    }

    public static void table(double w, double ww) {
        System.out.println(linetable);
        System.out.println("| float w = " + (float) (w) + "\t\t\t| float ww = " + (float) (ww)
                + "\t\t\t| double w = " + w + "\t\t\t| double ww = " + ww + "\t\t|");
        System.out.println(linetable);
        System.out.println("| floatSum = " + ((float) (w) + (float) (ww))
                + "\t\t\t\t\t\t\t\t\t\t| doubleSum = " + (w + ww) + "\t\t\t\t\t\t\t\t\t|");
        System.out.println(linetable);
        System.out.println("| floatSub = " + ((float) (w) - (float) (ww))
                + "\t\t\t\t\t\t\t\t\t| doubleSub = " + (w - ww) + "\t\t\t\t\t\t\t\t\t|");
        System.out.println(linetable);
        System.out.println("| floatProduct = " + ((float) (w) * (float) (ww))
                + "\t\t\t\t\t\t\t\t\t| doubleProduct = " + (w * ww) + "\t\t\t\t\t\t\t\t|");
        System.out.println(linetable);
        System.out.println("| floatQuotient = " + ((float) (w) / (float) (ww))
                + "\t\t\t\t\t\t\t\t| doubleQuotient = " + (w / ww) + "\t\t\t\t|");
        System.out.println(linetable);
        System.out.println("| floatRemainder = " + ((float) (w) % (float) (ww))
                + "\t\t\t\t\t\t\t| doubleRemainder = " + (w % ww) + "\t\t\t\t\t\t\t\t|");
        System.out.println(linetable);
    }

    private static void digitNumber(int numb) {
        if (numb >= -32768 && numb <= 32767) {
            if (numb / 10 == 0) {
                System.out.println(numb + " is a one-digit number");
            } else if (numb / 100 == 0) {
                System.out.println(numb + " is a two-digit number");
            } else if (numb / 1000 == 0) {
                System.out.println(numb + " is a three-digit number");
            } else if (numb / 10000 == 0) {
                System.out.println(numb + " is a four-digit number");
            } else if (numb / 100000 == 0) {
                System.out.println(numb + " is a five-digit number");
            }
        } else {
            System.out.println("Введите число типа short");
        }
    }

    public static void main(String[] args) {

        task();
        /* №3
         * Записать в виде кода следующие логические выражения:
         * 1) (2 = 2) И (7 = 7);
         * 2) Не(15 < 3);
         * 3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
         * 4) Не("Сосна" = "Дуб");
         * 5) (Не(15 < 3)) И (10 > 20);
         * 6) ("Глаза даны, чтобы see") И ("Под третьим этажом находится второй этаж");
         * 7) (6/2 = 3) ИЛИ (7*5 = 20)
         */
        System.out.println("(2 = 2) И (7 = 7) " + ((2 == 2) && (7 == 7)));
        System.out.println("Не(15 < 3) " + (!(15 < 3)));
        System.out.println(("(Сосна = Дуб) ИЛИ (Вишня = Клён) " + (("Cосна".equals("Дуб")) || ("Вишня".equals("Клён")))));
        System.out.println("Не(Сосна = Дуб) " + (!("Cосна".equals("Дуб"))));
        System.out.println("(Не(15 < 3)) И (10 > 20) " + ((!(15 < 3)) && (10 > 20)));
        String eyes = "Глаза даны";
        String see = "чтобы видеть";
        eyes = see;
        System.out.println("(Глаза даны, чтобы видеть) И (Под третьим этажом находится второй этаж) "
                + ((eyes.equals(see)) && ((3 - 1) == 2)));
        System.out.println("(6/2 = 3) ИЛИ (7*5 = 20) " + ((6 / 2 == 3) || (7 * 5 == 20)));
        System.out.println(linetask);

        task();
        /* №4
         * Записать в виде кода следующие выражения:
         * а) Света младше Андрея и Наташи
         * б) На полке стоят учебники, а на столе лежат справочники.
         * в) БОльшая часть детей — девочки. Остальные - мальчики.
         */
//        int ageS;
//        int ageA;
//        int ageN;
//        (ageS < ageA) && (ageS < ageN);
//        ("На полке".equals("учебники") && "Hа столе".equals("справочники"))
//        int girl;
//        int boy;
//        int amountOfChildren = girl + boy;
//        (girl > boy) && ((amountOfChildren - girl) < (amountOfChildren - boy))
//        System.out.println(linetask);

        task();
        /* №5
         * “Водительские права можно получить, только когда исполнится 16 лет.”
         */
        int возраст = 7;
        if (возраст >= 16) {
            System.out.println("Если тебе " + возраст + ", водительские права можно получить.");
        } else {
            System.out.println("Если тебе " + возраст + ", водительские права получить нельзя.");
        }

        System.out.println(linetask);

        task();
        /* №6
         * ”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
         */
//        String Едет = "едет в автобусе";
//        String читает = "читает книгу";
//        String Смотрит = "смотрит в окно";
//        "Петя" + (!(Едет) && читает) || !Смотрит);
//        System.out.println(linetask);
//
        task();
        /* №7
         * Записать выражения в виде условий if-else:
         * “Если с другом ты, это хорошо, а когда наоборот - плохо”
         */
        String with = "с другом";

        if (with == "с другом") {
            System.out.println("Если с другом ты, это хорошо");
        } else {
            System.out.println("а когда наоборот - плохо");
        }
        System.out.println(linetask);

        task();
        /* №8
         * Проверить число x, которое может принимать значения 10, 12, -3, 5 и 0.
         * Если x больше 10, то вывести на печать “x больше 10”.
         * Если x меньше нуля, то вывести на печать “x - отрицательное число”
         * Если x = 5, то вывести на печать “Разность x и 5 равна 0”
         * Иначе вывести на печать “Число x меньше 11, больше или равно 0, но не равно 5”.
         * Проверить, соответствует ли последнее утверждение всем предыдущим утверждениям.
         */
        checkTask(10);
        checkTask(12);
        checkTask(-3);
        checkTask(5);
        checkTask(0);
        System.out.println(linetask);

        task();
        /* №9
         * Проверьте число на четность. Если число четное, удвойте это число,
         * иначе возведите число в квадрат. Выведите результат работы алгоритма на печать.
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */
        checkParity(5);
        checkParity(0);
        checkParity(-4);
        checkParity(8);
        System.out.println(linetask);

        task();
        /* №10
         * Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         * a) Голосовать можно с 18 лет
         * b) Машину можно водить с 16 лет
         * c) В школу можно идти с 5 лет
         * Выведите результат работы алгоритма на печать.
         */
        int age = 7;
        System.out.println("Если тебе " + age);
        if (age >= 0 && age <= 150) {
            if ((age >= 5) && (age <= 18)) {
                System.out.println("Можно идти в школу");
            } else {
                System.out.println("Нельзя идти в школу");
            }
            if (age >= 16) {
                System.out.println("Можно водить машину");
            } else {
                System.out.println("Нельзя водить машину");
            }
            if (age >= 18) {
                System.out.println("Можно голосовать");
            } else {
                System.out.println("Нельзя голосовать");
            }
        } else {
            System.out.println("Возраст введен некорректно");
        }
        System.out.println(linetask);

        task();
        /* №11
         * Напишите алгоритм программы, которая проверяет оценку ученика и
         * выполняет следующие действия:
         * 5 - выдать похвальную грамоту и перевести в следующий класс
         * 4 - перевести в следующий класс
         * 3 - дать задание на лето и перевести в следующий класс
         * 2 - вызвать родителей и оставить в текущем классе на второй год.
         * Выведите результат работы алгоритма на печать.
         */
        int mark = -4;
        System.out.println("Оценка: " + mark);
        if (mark > 1 && mark < 6) {
            if (mark == 5) {
                System.out.println("Выдать похвальную грамоту и перевести в следующий класс");
            } else if (mark == 4) {
                System.out.println("Перевести в следующий класс");
            } else if (mark == 3) {
                System.out.println("Дать задание на лето и перевести в следующий класс");
            } else if (mark == 2) {
                System.out.println("Вызвать родителей и оставить в текущем классе на второй год");
            }
        } else {
            System.out.println("неверная оценка, введите 2,3,4 или 5");
        }

        System.out.println(linetask);
        System.out.println(linetask);

        task();
        /* №12
         * Напишите метод, который примет на вход температуру в Цельсиях,
         * и распечатает результат температуры в Цельсиях и в Фаренгейтах.
         */
        temperature(14.6);
        temperature(14);
        temperature(9.0);
        System.out.println(linetask);

        task();
        /* №13
         * Напишите алгоритм программы, которая проверяет 2 числа.
         * Программа складывает числа, которые делятся на 3 без остатка, и вычитает числа,
         * которые делятся на 5 без остатка. ПРограмма выводит на печать результат вычислений.
         * Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число отрицательное,
         * программа умножает результат действия на (-1). ПРограмма выводит на печать результат вычислений.
         * Если числа не прошли ни одну проверку, программа выводит на печать ошибку
         * о невозможности произвести действия.
         */
        int e = 38;
        int g = 67;
        if (((e % 3 == 0) && (g % 3 == 0)) || ((e % 5 == 0) && (g % 5 == 0)) || ((e % 2 == 0) && (g % 2 == 0))) {
            if ((e % 3 == 0) && (g % 3 == 0)) {
                System.out.println(e + g);
            }
            if ((e % 5 == 0) && (g % 5 == 0)) {
                System.out.println(e - g);
            }
            if (((e % 2 == 0) && (g % 2 == 0)) && ((e >= 0) && (g >= 0))) {
                System.out.println(e * g);
            }
            if (((e % 2 == 0) && (g % 2 == 0)) && ((e < 0) || (g < 0))) {
                System.out.println(e * g * (-1));
            }
        } else {
            System.out.println("Error");
        }
        System.out.println(linetask);

        task();
        /* №14
         * Распечатать следующие выражения, используя метод и параметры k, l, m:
         * Результат деления k на l = …, а остаток от деления  = …
         * Результат деления k на m = …, а остаток от деления  = …
         * Результат деления l на m = …, а остаток от деления  = …
         * Результат деления m на k = …, а остаток от деления  = …
         */
//        klmDivision(5, 0, -4);
        int k = 50;
        int l = 24;
        int m = 15;
        klm(k,l,"k","l");
        klm(k,m,"k","m");
        klm(l,m,"l","m");
        klm(m,k,"m","k");
        System.out.println(linetask);
        System.out.println(linetask);

        task();
        /* №15
         * Решить задачу: В клетке находятся фазаны и кролики.
         * Известно, что у них 35 голов и 94 ноги. Узнайте число фазанов и число кроликов.
         * Проверить работу вашего алгоритма тестом.
         */
        int headF = 23;
        int headK = 12;
        int legsF = 2;
        int legsK = 4;
        int expectedResultF = 23;
        int actualResultF = 35 - headK;
        //headK * legsK + (35 - headK) * legsF = 94 -> headK * legsK - headK * legsF + 35 * legsF = 94 ->
        //headK * (legsK - legsF) + 35 * legsF = 94 -> headK = (94 - 35 * legsF) / (legsK - legsF)
        int expectedResultK = 12;
        int actualResultK = (94 - 35 * legsF) / (legsK - legsF);
        if ((expectedResultF == actualResultF) && (expectedResultK == actualResultK)) {
            System.out.println("Количество фазанов = " + headF + "\tи количество кроликов = " + headK);
        } else {
            System.out.println("Fail");
        }
        System.out.println(linetask);

        task();
        /* №16
         * Написать метод, который рассчитывает среднюю скорость движения (speedAverage) транспортного средства или
         * живого существа с разными параметрами distance и  time. Протестировать метод.
         * Тестовые данные:
         * distance        time\
         * 12            20 min
         * 150        2,5 hours
         * 300        1¾ hours
         */
        double expResult1 = 36;
        double expResult2 = 60.0;
        double expResult3 = 171.428571;
        speedAverage(12, 20);
        double actResult1 = speed;
        if (actResult1 == expResult1) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        speedAverage(150, 150);
        if (speed == expResult2) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        speedAverage(300, 105);
        if ((int) speed == (int) expResult3) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        System.out.println(linetask);

        task();
        /* №17:
         * (Создать переменные apple и student и присвоить им значения 40 и 6 соотетственно.
         * Распечатать выражение, где вместо … - результаты математических вычислений:
         * Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a),
         * и … яблок(а) останется учителю.)
         * (Распечатать выражение из задания со значениями 100 и 21 соответственно.)
         * Написать метод так, чтобы правильные склонения слов (н-р, яблок, яблоко или яблока;
         * ученики - учеников…) печатались автоматически в зависимости от значений параметров.
         * Распечатать выражение с параметрами:
         * apple = 42, 55, 1
         * student = 42, 5, 2
         */
        int apple = 42;
        int student = 42;
        System.out.print("Если " + apple);
        apples(42);
        System.out.print(" поделить на " + student);
        student(42);
        System.out.print(", то каждый ученик получит по " + (apple / student));
        applesForStudent(42, 42);
        System.out.print(",и " + (apple % student));
        applesForTeacher(42, 42);
        System.out.println(" останется учителю.");
        System.out.println(linetask);

        task();
        /* №18
         * Распечатать таблицу из HW3,  задание 11 с помощью методов и параметров
         * (значения f, ff, d, dd могут быть любыми). Обратите внимание на то, что левая
         * часть таблицы у вас почти такая же, как правая часть таблицы.
         */
        table(10, 7.8);
        System.out.println(linetask);

        task();
        /* №19
         * Напишите алгоритм программы, которая проверяет число типа short на количество
         * разрядов, и выводит результат проверки.
         * ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
         * Выведите результат проверки на печать.
         */
        digitNumber(12345);
        System.out.println(linetask);

        task();
        /* №20
         * На сайте https://openweathermap.org/ зарегистрироваться и получить ключ (key).
         * Найти в документации пример запроса с параметрами “Название города”
         * (а не с географическими координатами). Сформировать и отправить запрос на
         * сервер (manually). В полученном ответе найти географические координаты для
         * следующих городов:
         * London
         * Paris
         * Rome
         */
        System.out.println("London lon:-0.1257; lat:51.5085");
        System.out.println("Paris lon:2.3488; lat:48.8534");
        System.out.println("Rome lon:-85.1647; lat:34.257");
        System.out.println(linetask);


    }
}
