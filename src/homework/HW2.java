package homework;

//        String task = "Задание №";
//        int count = 1;
//        System.out.println(task + count);

import java.sql.SQLOutput;

public class HW2 {

    public static void main(String[] args){

        int number = 3;
        String task = "Задание №";
        String line = "_______________________";

        System.out.println(task + ++number);
        /*4. Создать целочисленные переменные x, y, z и присвоить им любые значения (на ваше усмотрение)
         * a) Вывести значения переменных в столбик;
         * b) Вывести значения переменных в строку;
         * c) Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
         */
        int x1 = 10;
        int y1 = 3;
        int z = 17;
        System.out.println("a) "+ "\t" + x1 + "\n" + "\t" + y1 +"\n" + "\t" + z);
        System.out.println("b) "+ "\t" + x1 + " " + y1 +" " + z);
        System.out.println("c) "+ "\t" +"x = "+ x1 + ", " + "y = " + y1 +", " + "z = " + z);
        System.out.println(line);

        System.out.println(task + ++number);
        /*5. Используя конкатенацию, вывести в строку через запятую значения переменных из задания 4
         */
        System.out.println(x1 + ", " + y1 +", " + z);
        System.out.println(line);

        System.out.println(task + ++number);
        /*6. Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
         *Sum of x and y = …
         *x * z = …
         *Разность переменных y и z = …
         */
        int sumXY = x1 + y1;
        int multiXZ = x1 * z;
        int subYZ = y1 - z;
        System.out.println("Sum of x and y = " + sumXY);
        System.out.println("x * z = " + multiXZ);
        System.out.println("Разность переменных y и z = " + subYZ);
        System.out.println(line);

        System.out.println(task + ++number);
        /*7. Создать переменные apple и student и присвоить им значения 40 и 6 соотетственно.
         *Распечатать выражение, где вместо … - результаты математических вычислений:
         *Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a),
         *и … яблок(а) останется учителю.
         */
        int apple = 40;
        int student = 6;
        int divAple = apple / student;
        int остатокdivAple = apple % student;
        System.out.println("Если "+ apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + divAple
                + " яблок(a),и " + остатокdivAple + " яблок(а) останется учителю.");
        System.out.println(line);

        System.out.println(task + ++number);
        /*8. Распечатать выражение из задания 7 со значениями 100 и 21 соответственно.
         */
        apple = 100;
        student = 21;
        divAple = apple / student;
        остатокdivAple = apple % student;
        System.out.println("Если "+ apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + divAple
                + " яблок(a),и " + остатокdivAple + " яблок(а) останется учителю.");
        System.out.println(line);

        System.out.println(task + ++number);
        /*В школьную столовую привезли 6 кг лимонов, яблок на 24 кг больше, а груш на 12 кг меньше,
         *чем яблок. Сколько килограммов фруктов привезли в школьную столовую?
         */
        int lemon = 6;
        apple = lemon + 24;
        int pear = apple - 12;
        System.out.println((lemon + apple + pear) + " килограммов фруктов привезли в школьную столовую.");
        System.out.println(line);

        System.out.println(task + ++number);
        /* У сороконожки заболели ножки:
         * 8 ноют, 5 гудят,
         * 7 хромают, 2 болят.
         * Помоги сороконожке
         * Посчитать здоровые ножки.
         * Ответ: …
         */
        int legs = 40;
        int ноют = 8;
        int гудят = 5;
        int хромают = 7;
        int болят = 2;
        System.out.println("Ответ: " + (legs - ноют - гудят - хромают - болят));
        System.out.println(line);

        System.out.println(task + ++number);
        /* Рассчитать с помощью математических операторов и вывести на печать задачи и ответы:
         * Во сколько раз 35 больше, чем 7?
         * Во сколько раз 8 меньше, чем 48?
         * На сколько 54 больше, чем 6?
         */
        int a = 35;
        int b = 7;
        int c = 8;
        int d = 48;
        int e = 54;
        int f = 6;
        System.out.println("35 больше, чем 7 в " + (a / b) + " раз.");
        System.out.println("8 меньше, чем 48 в " + (d / c) + " раз.");
        System.out.println("54 больше, чем 6 на " + (e - f) + ".");
        System.out.println(line);

        System.out.println(task + ++number);
        /* Объяснить:
         * a. почему число 48 кратно 8.
         * b. что оба числа - четные.
         * c. что числа 47 и 49 - нечетные.
         * d. только одно из всех чисел кратно 7
         */
        int к48 = 48;
        int к8 = 8;
        int н47 = 47;
        int н49= 49;
        int к7 = 7;
        System.out.println("а. Число 48 кратно 8, потому что остаток от деления равен " + (к48 % к8) + ".");
        System.out.println("b. Число 48 четное, потому что остаток от деления на 2 равен " + (к48 % 2) + ".");
        System.out.println("   Число 8 четное, потому что остаток от деления на 2 равен " + (к8 % 2) + ".");
        System.out.println("с. Число 47 нечетное, потому что остаток от деления на 2 равен " + (н47 % 2) + ".");
        System.out.println("   Число 49 нечетное, потому что остаток от деления на 2 равен " + (н49 % 2) + ".");
        System.out.println("d. Только одно из всех чисел кратно 7, потому что только одно из них делится на 7 без остатка."
                + "\n" + "\t 48 % 7 = " + (к48 % 7) + ";"
                + "\n" + "\t 8 % 7 = " + (к8 % 7) + ";"
                + "\n" + "\t 47 % 7 = " + (н47 % 7) + ";"
                + "\n" + "\t 49 % 7 = " + (н49 % 7) + ".");
        System.out.println(line);

        System.out.println(task + ++number);
        /*Распечатать таблицу
         */
//        int k = 5;
//        int l = 8;
//        int m = 19;
//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.println("|\t\t|\t+10\t|\t-5\t|\t*100\t|\t/2\t|\t%2\t|\t^2\t|\t++\t|\t--\t|");
//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.println("|k = 5\t|\t" + (k + 10) + "\t|\t" + (k - 5) + "\t|\t" + (k * 100) + "\t\t|\t" + (k / 2)
//                + "\t|\t" + (k % 2) + "\t|\t"+ (k * k++) + "\t|\t"+ (k--) + "\t|\t"+ (--k) + "\t|");
//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.println("|l = 8\t|\t" + (l + 10) + "\t|\t" + (l - 5) + "\t|\t" + (l * 100) + "\t\t|\t" + (l / 2)
//                + "\t|\t" + (l % 2) + "\t|\t"+ (l * l++) + "\t|\t"+ (l--) + "\t|\t"+ (--l) + "\t|");
//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.println("|m = 19\t|\t" + (m + 10) + "\t|\t" + (m - 5) + "\t|\t" + (m * 100) + "\t|\t" + (m / 2)
//                + "\t|\t" + (m % 2) + "\t|\t"+ (m * m++) + "\t|\t"+ (m--) + "\t|\t"+ (--m) + "\t|");
//        System.out.println(line);

//        int k = 5;
//        int oldK = k;
//        int l = 8;
//        int oldL = l;
//        int m = 19;
//        int oldM = m;
//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.println("|\t\t|\t+10\t|\t-5\t|\t*100\t|\t/2\t|\t%2\t|\t^2\t|\t++\t|\t--\t|");
//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.print("|k = " + k + "\t|\t" + (k + 10) + "\t|\t" + (k - 5) + "\t|\t" + (k * 100) + "\t\t|\t" + (k / 2)
//                + "\t|\t" + (k % 2) + "\t|\t"+ (k * k++) + "\t|\t"+ k);
//        k = oldK--;
//        System.out.println("\t|\t" + oldK + "\t|");
//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.print("|l = 8\t|\t" + (l + 10) + "\t|\t" + (l - 5) + "\t|\t" + (l * 100) + "\t\t|\t" + (l / 2)
//                + "\t|\t" + (l % 2) + "\t|\t"+ (l * l++) + "\t|\t"+ (l));
//        l = oldL--;
//        System.out.println("\t|\t"+ oldL + "\t|");
//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.print("|m = 19\t|\t" + (m + 10) + "\t|\t" + (m - 5) + "\t|\t" + (m * 100) + "\t|\t" + (m / 2)
//                + "\t|\t" + (m % 2) + "\t|\t"+ (m * m++) + "\t|\t"+ (m));
//        m = oldM--;
//        System.out.println("\t|\t"+ oldM + "\t|");
//        System.out.println(line);

        int k = 5;
        int l = 8;
        int m = 19;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("| \t\t|\t+10\t|\t-5\t|\t*100\t|\t/2\t|\t%2\t|\t^2\t|\t++\t|\t--\t|");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("| k = " + k + "\t|\t" + (k + 10) + "\t|\t" + (k - 5) + "\t|\t" + (k * 100) + "\t\t|\t" + (k / 2)
                + "\t|\t" + (k % 2) + "\t|\t"+ (k * k++) + "\t|\t"+ (k--));
        k--;
        System.out.println("\t|\t" + k + "\t|");
        System.out.println("-----------------------------------------------------------------------------");
        k = l;
        System.out.print("| l = " + k + "\t|\t" + (k + 10) + "\t|\t" + (k - 5) + "\t|\t" + (k * 100) + "\t\t|\t" + (k / 2)
                + "\t|\t" + (k % 2) + "\t|\t"+ (k * k++) + "\t|\t"+ (k--));
        k--;
        System.out.println("\t|\t" + k + "\t|");
        System.out.println("-----------------------------------------------------------------------------");
        k = m;
        System.out.print("| m = " + k + "|\t" + (k + 10) + "\t|\t" + (k - 5) + "\t|\t" + (k * 100) + "\t|\t" + (k / 2)
                + "\t|\t" + (k % 2) + "\t|\t"+ (k * k++) + "\t|\t"+ (k--));
        k--;
        System.out.println("\t|\t" + k + "\t|");
        System.out.println(line);

        System.out.println(task + ++number);
        /* Вычислить результат:
         * xⁿ ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y))
         * если x = 7, y = 18, n = 3
         * Распечатать результат в следующем виде:
         * If
         * x = 7
         * y = 18
         * n = 3
         * then
         * xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = xⁿ (5x + 7y) / (8x + 10y) * (x + y) / (3x - y) =
         */
        int x = 7;
        int y = 18;
        int n = 3;
        System.out.println("If \nx = 7\ny = 18\nn = 3\nthen\n");
        System.out.println("xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = "
                + (x * x * x) * (5 * x + 7 * y) * (x + y) / (8 * x + 10 * y) / (3 * x - y));
//        System.out.println("xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = "
//                + (x * x * x) * (5 * x + 7 * y) / (8 * x + 10 * y) * (x + y) / (3 * x - y));
        System.out.println(line);

        System.out.println(task + ++number);
        /* Записать условие задачи в виде формулы и вычислить ответ:
         * В мастерской за 5 дней сшили 15 костюмов, поровну за каждый день.
         * За сколько дней при той же ежедневной средней выработке сошьют 69 костюмов.
         */
        int day1 = 5;
        int suit1 = 15;
        int suit2 = 69;
        int speed = suit1 / day1;
        System.out.println("69 костюмов сошьют за " + (suit2 / speed) + " дней.");
        System.out.println(line);

        System.out.println(task + ++number);
        /* Декларировать и инициализировать переменные a, b, c.
         * Распечатать выражение и результаты вычислений:
         * Сумма чисел a, b, c++ и sumABC-- = …, а разность b++ и  sumCBA = …
         */
        int a1 = 5;
        int b1 = 10;
        int c1 = 15;
        System.out.println("Сумма чисел a, b, c++ равна " + (a1 + b1 + c1++));
        c1 = 15;
        int sumA1B1C1 = a1 + b1 + c1--;
        System.out.println("SumABC-- равна " + (sumA1B1C1));
        c1 = 15;
        int sumC1B1A1 = c1 + b1 + a1;
        System.out.println("Разность b++ и  sumCBA равна " + (b1++ - (sumC1B1A1)));
        System.out.println(line);

        System.out.println(task + ++number);
        /*Вычислить выражения, если x = 4:
         * (x + 3)^2
         */
        int x2 = x;
        System.out.println("(x + 3)^2 = " + ((x2 + 3) * (x2 + 3)));
        System.out.println(line);

        System.out.println(task + ++number);
        /*Вычислить выражения, если x = 7; y = 18; a1 = 5; b1 = 10; c1 = 15;
         * (3+4x)/5-(10(y-5)(a1+b1+c1)/x+9(4/x+(9+x)/y)
         */
        int answer;
        answer = (3 + 4 * x) / 5 - 10 * (y - 5) * (a1 + b1 + c1) / x + 9 * (4 / x + (9 + x) / y);
        System.out.println("(3+4x)\t10(y-5)(a+b+c)\t   4   9+x ");
        System.out.println("───── - ────────────── + 9(─ + ───) = " + answer);
        System.out.println("  5\t\t\t  x\t\t\t   x\ty");
        System.out.println(line);

        System.out.println(task + ++number);
        /*Вычислить выражения, если x = 4; y = 18; a1 = 2; b1 = 6; c1 = 1; d1 = 4
         */
        int d1 = 4;
        System.out.println((5 * x + 7 * y)/(8 * x + 10 * y));
//      double answer2;
//      answer2 = (((5 * x + 7 * y)/(8 * x + 10 * y))/((3 * x - y)/(x + y)))/(a1 + b1 + c1 / d1 + (a1 + b1) / (c1 + d1) + a1 * b1);
        System.out.println("\t 5x + 7y\t  3x-y");
        System.out.println("\t ─────── : ──── ");
        System.out.println("\t 8x +10y\t   x+y");
        System.out.println("──────────────────────── = ");
        System.out.println("\t\tc\t  a + b");
        System.out.println("a + b + ── + ────── + ab");
        System.out.println("\t\td\t  c + d");
        System.out.println(line);

        System.out.println(task + ++number);
        /*Ввести в программу формулу конвертации температур C° -> F°.
         *Найти на сайте https://openweathermap.org/ температуру в любом городе, и проверьте, соответствует ли
         *температура в С и F вашим расчетным значениям (использовать только int).
         */
        String town = "Minsk, Belarus ";
        String Today = "Fri, Sep 16: ";
        String Slash = "/";
        int DayTemperatureC = 17;
        int NightTemperatureC = 10;
        System.out.println(town+"\n"+ Today + DayTemperatureC + "\u00b0C" + Slash + NightTemperatureC + "\u00b0C");
        System.out.println(town+"\n"+ Today + (DayTemperatureC + 32) + "\u00b0F" + Slash
                + (NightTemperatureC + 32) + "\u00b0F");
        System.out.println(line);

    };

}
