public class ConditionalStatements {

    /*
        Conditional statements allow us to control the flow of an application using logical
        statements facilitated by logical operators
     */

    public static void main(String[] args) {
        /*
            if you need to determine between two or more paths of execution you can use if/else.
            You provide the if statement with a boolean value: if the boolean is true the if code
            block will execute, otherwise the else block will execute
         */
        boolean isMorning = false;
        if(isMorning){
            System.out.println("Hello world!");
        } else {
            System.out.println("See you later world!");
        }

        int x = 6;
        // here we are checking if x is even: % is the modulus operator, it returns the remainder of a division operation
        // == is the equality operator, it checks if primitive values are the same, if objects have the same memory address
        if(x % 2 == 0){
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        // you are not required to include an else statement
        String name = "Lassy";
        // the length method returns the number of characters in the string
        if(name.length() > 4){
            // an if statement can be used to execute a bit of code before continuing with the main code exection
            System.out.println("Your name has a lot of letters");
        }
        System.out.println("Your name is " + name);

        int y = 0;
        if(y > 0){
            System.out.println("y is positive");
        } else if (y < 0){
            System.out.println("y is negative");
        } else {
            System.out.println("y is 0");
        }


        System.out.println("Hello! Please choose an option");
        System.out.println("1. Login");
        System.out.println("2. Register an Account");
        System.out.println("3. Contact Support");
        System.out.println("4. Exit");
        int choice = 2;
        System.out.println("User choice: " + 2);
        /*
            Anytime you have a select number of options that can be chosen you can use a switch
            statement to facilitate the actions taken based on the input

            You do need to be careful with switch statements: if you don't inlcude breaks in your
            cases then your code will cascade down the list of cases based of which one matches.
            For instance, if case 2 matches and there are no breaks, then the code for case 2, 3,
            4, and default, will all execute
         */
        switch(choice){
            case 1:
                System.out.println("Login chosen");
                break;
            case 2:
                System.out.println("Registration chosen");
                break;
            case 3:
                System.out.println("Customer Support chosen");
                break;
            case 4:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("invalid choice, please try again");
                break;
        }

    }

}
