import java.util.Scanner;

/**
 * 
 */

/*Homework 2 for Menuo su IT Project
 * 
 * @author Ieva Orth
 *
 */
public class GuessingGame3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String promptText = "Please guess the number 1 - 100";
		String tooLowText = "Guess is too low";
		String tooHighText = "Guess is too high";
		String correctText = "Correct! You won!";
		String lostText = "Sorry, you lost.";
		String playAgainText = "Play again? Yes or No?";
		int guess = 0;
		int userGuess = 0;
		String userChoice = " ";
		int gameCount = 0;
		int gamesWon = 0;

		do {
			gameCount++; // counts the number of games played;

			guess = (int) (Math.random() * 100) + 1;

			
			System.out.println(guess);
			for (int i = 1; i < 6; i++) {

				System.out.println(promptText);
				Scanner keyboard = new Scanner(System.in);
				userGuess = keyboard.nextInt();
				

				if (userGuess == guess) {
					System.out.println(correctText + " The number was " + guess + "!");
					gamesWon++; // counts the number of games won
					break;

				}

				if (userGuess < guess) {
					System.out.println(tooLowText);
				} else if (userGuess > guess) {
					System.out.println(tooHighText);

				}

				if (i == 5) {
					System.out.println(lostText + " The number was " + guess + "!");
				}
			}

			System.out.println(playAgainText);
			Scanner keyboard = new Scanner(System.in);
			userChoice = keyboard.nextLine();
			
			
		} 
		
		while (userChoice.equalsIgnoreCase("Yes"));

		System.out.println("You played " + gameCount + " time(s).");

		System.out.println("You won " + gamesWon + " time(s).");
		
		
	}
	
}



