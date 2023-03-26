package BankInfo;

import java.util.*;
public class BankingPage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        AccountInfo accountInfo = new AccountInfo();
        PersonalInfo personalInfo = new PersonalInfo();
        String choice = "";
        boolean proceed = true;
        String firstName = "";
        String lastName = "";
        int birthMonth;
        int birthDay;
        int birthYear;



        System.out.println("Welcome to National Bank of Jaylen!");
        System.out.println("If you would like to register please enter R. Otherwise if you would like to quit press Q.");

//        try {
//            choice = scanner.nextLine();
//
//        }catch (InputMismatchException e){
//            System.out.println(e);
//        }
        do {
            choice = scanner.next();
            choice = choice.toUpperCase();
            if (!choice.equals("R") && !choice.equals("Q")) {
                System.out.println("Please enter a R to register or Q to quit.");
            }
        }while (!choice.equals("R") && !choice.equals("Q"));

        if (choice.equals("R")){
            System.out.println("Thank you for choosing National Bank of Jaylen. We appreciate your business.");
            System.out.println("Since you have proceeded to register with our great bank we need to get information to a set up " +
                    "your profile.");
            proceed = true;
        }else if(choice.equals("Q")){
            System.out.println("Press Q once more if you are sure you would not like to register otherwise press R to proceed.");

            do {
                choice = scanner.next();
                choice = choice.toUpperCase();
                if (!choice.equals("R") && !choice.equals("Q") ) {
                    System.out.println("Please enter a R to register or Q to quit.");
                }
            }while (!choice.equals("R") && !choice.equals("Q"));

            if (choice.equals("R")){
                System.out.println("Thank you for choosing National Bank of Jaylen. We appreciate your business.");
                System.out.println("Since you have proceeded to register with our great bank we need to get information to a set up " +
                        "your profile.");
                proceed = true;
            }else if (choice.equals("Q")){
                System.out.println("Have a wonderful day!");
                proceed = false;
            }
        }

        if(proceed == true){
            System.out.println("What is your first name?");
            firstName = scanner.next();
            System.out.println("What is your last name?");
            lastName = scanner.next();

            personalInfo.setName(firstName, lastName);

            System.out.println("Welcome " + personalInfo.fullName);

            System.out.println("What is your birth month");
            try {
                birthDay = Integer.parseInt(scanner.next());
            }catch (NumberFormatException nfe){
                System.out.println("You enter something other than a valid birth month");
            }

            System.out.println("What is your birth day");
            birthMonth = Integer.parseInt(scanner.next());
            System.out.println("What is your birth year");
            birthYear = Integer.parseInt(scanner.next());



        }


    }
}
