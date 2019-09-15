package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	static int isfinished = 0;
static int speed = 100;
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot(200 * i + 500, 800);
			
		}

		Thread r1 = new Thread(() -> {
			while (robots[robots.length - 5].getY() >= -5 && isfinished ==0) {
				int r = new Random().nextInt(speed)-25;
				robots[robots.length - 5].move(r);
			}
			if(isfinished ==0) {
				isfinished =1;
			}

		});
		Thread r2 = new Thread(() -> {
			while (robots[robots.length - 4].getY() >= -5 && isfinished ==0) {
				int r = new Random().nextInt(speed)-25;
				robots[robots.length - 4].move(r);
			}
			if(isfinished ==0) {
				isfinished =2;
			}
			

		});
		Thread r3 = new Thread(() -> {
			while (robots[robots.length - 3].getY() >= -5 && isfinished ==0) {
				int r = new Random().nextInt(speed)-25;
				robots[robots.length - 3].move(r);
			}
			if(isfinished ==0) {
				isfinished =3;
			}
		});
		Thread r4 = new Thread(() -> {
			while (robots[robots.length - 2].getY() >= -5 && isfinished ==0) {
				int r = new Random().nextInt(speed)-25;
				robots[robots.length - 2].move(r);
			}
			if(isfinished ==0) {
				isfinished =4;
			}
		});
		Thread r5 = new Thread(() -> {
			while (robots[robots.length - 1].getY() >= -5 && isfinished ==0) {
				int r = new Random().nextInt(speed)-25;
				robots[robots.length - 1].move(r);
			}
			if(isfinished ==0) {
				isfinished =5;
			}
		});

		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		while (isfinished == 0) {
System.out.println("checking");
		}
		System.out.println("Robot " + isfinished + " is the winner");
	}
	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

}
