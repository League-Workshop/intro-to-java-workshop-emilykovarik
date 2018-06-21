package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
	String answer=	JOptionPane.showInputDialog(null, "What Disney movie does Emma Watson play as Belle in?");
		// 3.  Use an if statement to check if their answer is correct
		String value= "Beauty and the Beast"; 
		// 4.  if the user's answer is correct
		if(answer.equals(value)) {score++;
		// -- add one to their score 
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String character=JOptionPane.showInputDialog(null,"What Disney princess loses a glass slipper?");
		if(character.equals("Cinderella")) {score++;
		}
		
		String tale=JOptionPane.showInputDialog(null, "In what tale does a girl carry a basket?");
		if(tale.equals("Little Red Riding Hood")) {score++;
		}
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score++);
	}
}
