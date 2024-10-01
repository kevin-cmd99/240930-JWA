/*
    The base Java library has the data for the Scanner class: this import statement tells Java
    where to find this data when executing our application
 */
import java.util.Scanner;

public class Looping {

    /*
        Anytime you need code to repeat itself you can create a loop that will repeat
        however many times you tell it to. You do need to make sure you create some
        exit condition so you don't accidentally make an infinite loop
     */

    public static void main(String[] args) {
        /*
            A for loop statement has three parts:
            control variable initialization
            conditional statement
            control variable increment

            For loops are useful when you know how many times you want to loop your code
         */
        for(int x = 0; x <= 10; x++){
            System.out.println(x);
        }
        String[] names = {"Shawn", "Gus", "Jules", "Lassy"};
        for(int index = 0; index < names.length; index++){
            System.out.println("Hello " + names[index]);
        }

        /*
            If you know you need to iterate through an array and perform the same action
            on each element you can use the following enhanced for loop syntax

            String name is the reference used for each element in a loop iteration
            : is the operator used to signify we are using an enhanced for loop
            names the array we want to loop through
         */
        for(String name : names){
            // for each loop, the reference variable name will point to a new element in the array
            System.out.println("Hello " + name);
        }

        /*
            Anytime you need to loop your code but there is not a good way of gauging how
            many times the loop needs to iterate a while loop is a good candidate to control
            the loop
         */

        // this scanner object will take in user input from the terminal
        Scanner userInput = new Scanner(System.in);

        boolean repeatProcess = true;
        while(repeatProcess){
            System.out.println("What would you like to do:");
            System.out.println("1. end loop");
            System.out.println("anything else to continue loop");
            String userChoice = userInput.nextLine();
            switch (userChoice){
                case "1":
                    System.out.println("Goodbye");
                    repeatProcess = false;
                    break;
                default:
                    System.out.println("Loop is continuing");
            }
        }
        // it is good practice to always close a scanner when you are done with it
        userInput.close();

        /*
            In a do while loop the code execution happens first, and then the conditional check
            is made, so you will get at least one iteration of your loop
         */
        do{
            System.out.println("This will trigger at least one time");
        } while(false);

    }

}
