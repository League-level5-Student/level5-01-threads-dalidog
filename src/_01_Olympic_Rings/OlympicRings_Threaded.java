package _01_Olympic_Rings;

import java.awt.Color;
import java.awt.geom.Ellipse2D;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	
	

	Thread r1 = new Thread(()->{
			Robot a = new Robot(400, 200);
			a.setPenColor(Color.BLUE);
			a.penDown();
			for (int i = 0; i < 36; i++) {
				a.move(25);
				a.turn(10);
		}
		});
		Thread r2 = new Thread(()->{
			Robot b = new Robot(600, 400);
			b.setPenColor(Color.YELLOW);
			b.penDown();
		for (int i = 0; i < 36; i++) {
			b.move(25);
			b.turn(10);
		}
		});
		Thread r3 = new Thread(()-> {
			Robot c = new Robot(800, 200);
			c.setPenColor(Color.BLACK);
			c.penDown();
			for (int i = 0; i < 36; i++) {
			c.move(25);
			c.turn(10);
			}
		});
		Thread r4 = new Thread(()->{
			Robot d = new Robot(1000, 400);
			d.setPenColor(Color.GREEN);
			d.penDown();
			for (int i = 0; i < 36; i++) {
			d.move(25);
			d.turn(10);
			}
		});
		Thread r5 = new Thread(()->{
			Robot e = new Robot(1200, 200);
			e.setPenColor(Color.RED);
			e.penDown();
			for (int i = 0; i < 36; i++) {
			e.move(25);
			e.turn(10);
			}
		});

	
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start();
		
	
		
		
}
	
	
}


