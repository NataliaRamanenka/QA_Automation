package school;

public class Teacher extends Person{

    public static void main(String[] args) {

//               System.out.println("First name:Мария, " +
//               "Middle name:Ивановна, " +
//               "last name:Петрова");

//        System.out.println("First name:Мария, ");
//        System.out.println("Middle name:Ивановна, ");
//        System.out.println("last name:Петрова");

//        System.out.println(
//                "First name:Мария, \n" +
//                "Middle name:Ивановна, \n" +
//                "last name:Петрова \n" +
//                "Age: 35 y.o. \n" +
//                "Subject: Russian Literatura"
//                );

//create object
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int age = 35;

        String firstName = "Мария";
        String middleName = "Ивановна";
        String lastName = "Петрова";
        String subject = "Russian Literatura";

        System.out.println(
                "First name: \t "
                        + firstName
                        + ", \n"
                        + "Middle name: \t "
                        + middleName
                        + ", \n"
                        + "last name: \t\t "
                        + lastName
                        + " \n"
                        + "Age: \t\t\t "
                        + age + " y.o. \n"
                        + "Subject: \t\t "
                        + subject
        );
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    int age2 = 55;

    String firstName2 = "Иван";
    String middleName2 = "Петрович";
    String lastName2 = "Серебряков";
    String subject2 = "Математика";

        System.out.println(
                "First name: \t "
                + firstName2
                + ", \n"
                + "Middle name: \t "
                + middleName2
                + ", \n"
                + "last name: \t\t "
                + lastName2
                +" \n"
                + "Age: \t\t\t "
                + age2 + " y.o. \n"
                + "Subject: \t\t "
                + subject2
        );

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


    }
}
