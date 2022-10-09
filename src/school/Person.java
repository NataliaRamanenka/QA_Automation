package school;

public class Person {

    public static void main(String[] args){

        int yob = 1990;
        int a = 2022;
        int age = a - yob;

        System.out.println("Если человек родился в " + yob + ", то его возраст " + age + " года.");

        yob = 1985;
        int age2 = a -yob - 2;

        System.out.println("Если человек родился в " + yob + ", то его возраст 2 года назад был " + age2 + " лет.");



    }



}
