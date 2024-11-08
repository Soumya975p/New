import java.util.*;

public class Rockpaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String[] available_moves = {"Rock", "Paper", "Scissors"};

            String computermove = available_moves[new Random().nextInt(available_moves.length)];

            System.out.println("Computer has chosen its move");
            System.out.println();
            System.out.println("Now you have to choose");

            String Usermove;
            while (true) {
                System.out.println("Enter Rock, Paper or Scissors");
                System.out.print("**************");
                Usermove = input.nextLine();
                if (Usermove.equals("Rock") || Usermove.equals("Paper") || Usermove.equals("Scissors")) {
                    System.out.println();
                    break;
                }
                System.out.println("Invalid Choice");
                System.out.println("Enter from the available choices only");
            }
            System.out.println("Computer chose: " + computermove);

            if (Usermove.equals(computermove)) {
                System.out.println("It's a tie");
            } else if (Usermove.equals("Rock")) {
                if (computermove.equals("Paper")) {
                    System.out.println("Computer won!😊😊");
                    System.out.println("Better luck next time");
                } else if (computermove.equals("Scissors")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations");
                }
            } else if (Usermove.equals("Paper")) {
                if (computermove.equals("Scissors")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time");
                } else if (computermove.equals("Rock")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations");
                }
            } else if (Usermove.equals("Scissors")) {
                if (computermove.equals("Paper")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations");
                } else if (computermove.equals("Rock")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time");
                }
            }
            System.out.println();
			String playAgain;
			System.out.println("Do you want to play again? ");
			
			// loop until the user chooses the correct option
			while(true) {
				
				System.out.println("Type 'yes' or 'no' ");
				playAgain = input.nextLine();
				
				if(playAgain.equals("yes") || playAgain.equals("Yes") || playAgain.equals("no") || playAgain.equals("No")) {
					System.out.println();
					System.out.println("*****************************************************************************");
					System.out.println();
					break;
				}
				System.out.println();
				System.out.println("Invalid Input");
				System.out.println();
			}
			
			if(playAgain.equals("no") || playAgain.equals("No")) {
				break;
			}
        }
    }
}
