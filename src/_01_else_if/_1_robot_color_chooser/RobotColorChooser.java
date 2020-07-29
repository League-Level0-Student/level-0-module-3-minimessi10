
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;


public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
Robot rob=new Robot();
for (int i = 0; i < 15; i++) {
	
	

String robot= JOptionPane.showInputDialog("what color should the pen be");
if(robot.contains("green"))
	rob.setPenColor(Color.green);
else if(robot.contains("red"))
	rob.setPenColor(Color.red);
else if(robot.contains("blue"))
	rob.setPenColor(Color.blue);
else if(robot.contains("orange"))
	rob.setPenColor(Color.orange);
else if(robot.contains("black"))
	rob.setPenColor(Color.black);
else if(robot.contains("yellow"))
	rob.setPenColor(Color.yellow);
else if(robot.contains("pink"))
	rob.setPenColor(Color.pink);
else rob.setRandomPenColor();

rob.setSpeed(100);
rob.penDown();
rob.move(150);
rob.turn(90);
rob.move(150);
rob.turn(90);
rob.move(150);
rob.turn(90);
rob.move(150);
rob.sparkle();		
		
		
		
}
		
		
		
	}
}
