package _01_robot._2_robot_graffiti;
import org.jointheleague.graphical.robot.Robot;

public class Robot_Graffiti {
		public static void main(String[] args) {
				Robot delta= new Robot();
				delta.setSpeed(100);
				delta.penDown();
				delta.move(200);
				delta.turn(90);
				delta.move(200);
				delta.move(-200);
				delta.turn(-90);
				delta.move(-200);
				delta.turn(-90);
				delta.move(-200);
				delta.turn(-90);
				delta.move(-100);
				delta.turn(-90);
				delta.move(-100);
				delta.turn(-90);
				delta.turn(270);
				delta.move(-100);
				delta.turn(90);
				delta.move(-200);
}
}
