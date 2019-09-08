package _02_Advanced_Robot_Race;


import java.util.Random;

	import javax.swing.JOptionPane;

	import org.jointheleague.graphical.robot.Robot;

	
public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
		//1. make a main method
		public static void main(String[] args) {
	Robot[]robots = new Robot[5];
	for (int i = 0; i < robots.length; i++) {
			robots[i]=new Robot(200*i+500,800);
	}
	
	Thread r1 = new Thread(()->{
		while(robots[robots.length-5].getY()>=-5) {
			int r=new Random().nextInt(50);
			robots[robots.length-5].move(r);
		}
			
		
	});
	r1.start();
	
		}
			//2. create an array of 5 robots.

			//3. use a for loop to initialize the robots.

				//4. make each robot start at the bottom of the screen, side by side, facing up
		
			//5. use another for loop to iterate through the array and make each robot move 
		    //   a random amount less than 50.
	    	
			//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

			//7. declare that robot the winner and throw it a party!
	    	
			//8. try different races with different amounts of robots.
	    	
		  
	}
		
	

	

