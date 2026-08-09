package in.advance.challenge102;

public class Road {

	public static void main(String[] args) {

		TrafficLightThread red = new TrafficLightThread(TrafficColor.RED);
		TrafficLightThread yelloe = new TrafficLightThread(TrafficColor.YELLOW);

		TrafficLightThread green = new TrafficLightThread(TrafficColor.GREEN);

	}

}
