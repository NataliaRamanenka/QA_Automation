package school;

public class Student extends Person{
    public static void main(String[] args){

        int age1 = 10;
        int class1 = 5;
        String firstName1 = "Вова";
        String lastName1 = "Сидоров";

        System.out.println("*************************************************");

        System.out.println(
                "First name: \t"
                        + firstName1
                        + ",\n"
                        +"Last name: \t\t"
                        + lastName1
                        + ", \n"
                        +"Age:\t\t\t"
                        + age1
                        + ", \n"
                        +"Class: \t\t\t"
                        + class1
        );

        System.out.println("*************************************************");

        int age2 = 14;
        int class2 = 9;
        String firstName2 = "Маша";
        String lastName2 = "Семенова";

        System.out.println("*************************************************");

        System.out.println(
                "First name: \t"
                        + firstName2
                        + ",\n"
                        +"Last name: \t\t"
                        + lastName2
                        + ", \n"
                        +"Age: \t\t\t"
                        + age2 + ", \n"
                        +"Class: \t\t\t"
                        + class2
        );

        System.out.println("*************************************************");

    }



}
