
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.

		// 2. Print out the random variable above
		Random david = new Random();
		int num = 0;
		num = david.nextInt(101);
		System.out.println(num);

		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 11; i++) {
			String guesst = JOptionPane.showInputDialog("guess the number");
			int guest = Integer.parseInt(guesst);

			if (guest == num) {
				JOptionPane.showMessageDialog(null, "you win");
				System.exit(0);
			}
			else if(guest>num) {
				JOptionPane.showMessageDialog(null, "to high");

			}
			else {
				
				JOptionPane.showMessageDialog(null, "to low");

			}
			if (guest<num) {
			JOptionPane.showMessageDialog(null, "you lose");
			}
		}
		// 1. Ask the user for a guess using a pop-up window, and save their response

		// 4.Convert the users’ answer to an int (Integer.parseInt(string))

		// 5. if the guess is correct
		// 6. Win
		// 12. Use "System.System(0);" to quit the game if the user guessed the right
		// answer.
		// 7. if the guess is high
		// 8. Tell them it's too high
		// 9. if the guess is low
		// 10. Tell them it's too low

		// 13. Tell them they lose

	}

}
