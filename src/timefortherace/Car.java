package timefortherace;

public class Car {
	
	String make;
		String model;
		int year;
		 double currentSpeed;
         boolean isRunning;
         
public void start() {
	System.out.println(" car is starting");
	isRunning = true;
}
public void stop() {
	System.out.println(" car is stopping");
	isRunning = false;
}

public void accelerate(int targetSpeed) {
	if(targetSpeed< currentSpeed) {
		System.out.println("you are already running more tahan target speed");
		return;
	}
while(currentSpeed<=targetSpeed) {
	currentSpeed++;
}
System.out.println();

}

public void String getCarInfo() {
	return make+year+model;
	
}
public void readDirection(String d1, String d2, String d3) {
	System.out.println("turning to direc 1" +d1);
	System.out.println("turning to direc 1" +d3);
	System.out.println("turning to direc 1" +d3);
}
public long getTotalDistance(long[] distancArr) {
	long sum=0;
	for(long eachDistance : distancArr) {
		sum+=eachDistance;
	}
	return sum;
}



}






