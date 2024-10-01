import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        // This reads input from the terminal
        // the scanner initialized in the try block will auto close when the code block is finished
        try (Scanner scanner = new Scanner(System.in)) {
            // Step 1: setup the game board
            String[][] inputs = new String[3][3];
            /*
                The code above is the same as the code below
                String[][] inputs = {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                };
            */
            for(String[] row : inputs){
                for(int index = 0; index < row.length; index++){
                    row[index] = " ";
                }
            }

            System.out.println("|" + inputs[0][0] + "|" + inputs[0][1] + "|" + inputs[0][2] + "|");
            System.out.println("-------");
            System.out.println("|" + inputs[1][0] + "|" + inputs[1][1] + "|" + inputs[1][2] + "|");
            System.out.println("-------");
            System.out.println("|" + inputs[2][0] + "|" + inputs[2][1] + "|" + inputs[2][2] + "|");

            // Step 2: handle player input
            // we need to know whose turn it is
            int playerTurn = 1;
            // we need to prompt the user for a move
            System.out.print("Please enter a row and cell (0 index) to place your mark: ");
            // take in user input
            String userInput = scanner.nextLine();
            // make sure they made a valid move
            /*
                This step is a bit more involved: if we want to keep it simple we could just check they entered a value between
                00 and 22. However, as positions are taken, there will be fewer and fewer valid options.
             */
            String[] validMoves = {"00", "01","02","10","11","12","20","21","22"};
            boolean validMove = false;
            // if the length of the user input is not 2 then we already know it is not valid, and there are no more checks that need to be made
            if(userInput.length() == 2){
                // if it is the right length we can check if the user input is listed in the valid move array
                for(int index = 0; index < validMoves.length; index++){
                    String move = validMoves[index];
                    // the equals() method is used to check if two strings have the same characters or not
                    if(userInput.equals(move)){
                        validMove = true;
                        validMoves[index] = null;
                        break;
                    }
                }
            }
            // if they made a valid move then move to update the board
            if(validMove){
                // update board state here
            } else {
                // end code loop and return to prompting user to get a valid input
            }

            // Step 3: display updated board
            // suggestion: it might be useful if the entirety of your code was wrapped in some kind of loop to make this step easier....

            // Step 4: check if there is a winner or a tie
            // use some sort of boolean to determine whether the game loop continues or not
            
        }
    }
}