package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot Emma = new Robot();
        Emma.penDown();
		Emma.setSpeed(5000);
		Emma.miniaturize();
		Emma.sparkle();
		Emma.setPenColor(Color.cyan);
		for(int i=0;i<4;i++) {
		Emma.move(200);
		Emma.turn(90);
		Emma.penDown();
		}
		// START HERE
		
		
	}	
}
