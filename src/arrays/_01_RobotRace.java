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
	Robot[] rob = new Robot[6];
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
	//make shure it goes on after the while loop(rob[0].getX()>1||rob[1].getX()>1 ||rob[1].getX()>1 ||rob[3].getX()>1 ||rob[4].getX()>1||rob[5].getX()>1||rob[6].getX()>1||rob[7].getX()>1||rob[8].getX()>1||rob[9].getX()>1)
	while(true) {
		
		for(int i = 0;i<rob.length;i++) {
			if(rob[i].getY()>1){
				int randy = new Random().nextInt(50);
				rob[i].setSpeed(250);
				rob[i].move(randy);
				
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
					}	
			else if(rob[i].getY()<=1) {
			
				int b= i+1;
					JOptionPane.showMessageDialog(null,"Robot "+b+" wins!");
					System.exit(0);
				
					}
		}
		
				
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	
	}
}
}
