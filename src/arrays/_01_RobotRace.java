package arrays;

import java.awt.AWTException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jointheleague.graphical.robot.Robot;


public class _01_RobotRace {

public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	//2. create an array of 5 robots.
	Robot[] rob = new Robot[5];
	//3. use a for loop to initialize the robots.
	for(int i = 0; i<rob.length;i++) {
		
			System.out.println("it worked");
			rob[i]=new Robot();
		
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
	for(int i = 0;i<rob.length;i++) {
	
		rob[i].setX((i*120)+50);
	rob[i].setY(500);
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	//make shure it goes on after the while loop
	while(rob[0].getX()>1||rob[1].getX()>1 ||rob[1].getX()>1 ||rob[3].getX()>1 ||rob[4].getX()>1||rob[5].getX()>1||rob[6].getX()>1||rob[7].getX()>1||rob[8].getX()>1||rob[9].getX()>1) {
		for(int i = 0;i<5;i++) {
		int randy = new Random().nextInt(50);
		rob[i].setY(rob[i].getY()-randy);
		
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
	if(rob[0].getX()==0) {
		System.out.println("Robot 1 wins!");
	}
	else if(rob[1].getX()==0) {
		System.out.println("Robot 2 wins!");
	}
	else if(rob[2].getX()==0) {
		System.out.println("Robot 3 wins!");
	}
	else if(rob[3].getX()==0) {
		System.out.println("Robot 4 wins!");
	}
	else if(rob[4].getX()==0) {
		System.out.println("Robot 5 wins!");
	}
	else if(rob[5].getX()==0) {
		System.out.println("Robot 6 wins!");
	}
	else if(rob[6].getX()==0) {
		System.out.println("Robot 7 wins!");
	}
	else if(rob[7].getX()==0) {
		System.out.println("Robot 8 wins!");
	}
	else if(rob[8].getX()==0) {
		System.out.println("Robot 9 wins!");
	}
	else if(rob[9].getX()==0) {
		System.out.println("Robot 10 wins!");
	}
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	
	}
}
