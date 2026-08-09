package in.advance.challenge102;

public enum TrafficColor {
	RED(9000), YELLOW(1000), GREEN(3000);

	private final int onTimeInMin;

	private TrafficColor(int onTimeInMin) {
		this.onTimeInMin = onTimeInMin;

	}

	public int getOnTimeInMin() {
		return onTimeInMin;
	}

}
