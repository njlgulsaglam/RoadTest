package timefortherace;
import java.util.Scanner;
public class RoadTest {

	public static void main(String[] args) {

		
	
		Car car= new Car();
		car.currentSpeed=15;
		car.make="BMW";
		car.isRunning=true;
		
		car.currentSpeed=15;
		car.accelerate(100);
		//car.slowDown(25);
		
		
		
		
		System.out.println(car.currentSpeed);
		System.out.println(car.isRunning);
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.year);
	
		}
		
		
	
	
	}


