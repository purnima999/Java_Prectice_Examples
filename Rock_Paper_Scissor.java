package tut1;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
	public static void main(String [] args) {
		Random rand = new Random();
		// Obtain a number between [0 - 49].
		int options = rand.nextInt(3) + 1;
		String cmpChoice = "";
		
		if(options == 1) {
			cmpChoice = "Rock";
		}else if(options == 2) {
			cmpChoice = "Paper";
		}else if(options == 3) {
			cmpChoice = "Scissor";
		}
		
		System.out.println("Computer already made it's choice");
		Scanner sc = new Scanner(System.in);
		System.out.print("Now it's your turn to choose, Enter your choice:");
		String userChoice = sc.nextLine();
		System.out.printf("computer choose %s and you choose %s",cmpChoice, userChoice);
		
		String winner="";
		
		if(cmpChoice.equalsIgnoreCase(userChoice)) {
			winner = "Draw";
		}else {
			if(cmpChoice.equals("Rock") && userChoice.equalsIgnoreCase("scissor")) {
				winner = "Computer";
			}else{
				winner = "You";
			}
			
			if(cmpChoice.equals("Scissor") && userChoice.equalsIgnoreCase("Paper")) {
				winner = "Computer";
			}else{
				winner = "You";
			}
			
			if(cmpChoice.equals("Paper") && userChoice.equalsIgnoreCase("Rock")) {
				winner = "Computer";
			}else{
				winner = "You";
			}
		}
		
		
		System.out.printf("\nWinner : %s", winner);
	}

}
