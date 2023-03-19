import java.util.*;
public class BankingPage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to National Bank of Jaylen!");
        System.out.println("If you would like to register please enter R. Otherwise if you would like to quit press Q.");
        String choice = "";
        boolean proceed;

//        try {
//            choice = scanner.nextLine();
//
//        }catch (InputMismatchException e){
//            System.out.println(e);
//        }
        do {
            choice = scanner.next();
            choice = choice.toUpperCase();
            if (!choice.equals("R") || !choice.equals("Q")) {
                System.out.println("Please enter a R to register or Q to quit.");
            }
        }while (!choice.equals("R") && !choice.equals("Q"));

        if (choice.equals("R")){
            System.out.println("Thank you for choosing National Bank of Jaylen. We appreciate your business.");
            System.out.println("Since you have proceeded to register with our great bank we need to get information to a set up " +
                    "your profile.");
            proceed = true;
        }else if(choice.equals("Q")){
            System.out.println("Press q once more if you are sure you would not like to register otherwise press r to proceed.");

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
            }else if (choice.equals("Q")){
                System.out.println("Have a wonderful day!");
            }
        }


    }
}
