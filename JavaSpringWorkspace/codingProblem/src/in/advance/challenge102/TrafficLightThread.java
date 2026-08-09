package in.advance.challenge102;

public class TrafficLightThread extends Thread {

	private final TrafficColor Color;

	public TrafficLightThread(TrafficColor color) {
		super();
		Color = color;
	}

	@Override
	public void run() {
		super.run();

		System.out.printf("%s Colour Active:\n", Color);

		try {
			Thread.sleep(Color.getOnTimeInMin());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("%s Colour inactive:\n", Color);

	}

}
