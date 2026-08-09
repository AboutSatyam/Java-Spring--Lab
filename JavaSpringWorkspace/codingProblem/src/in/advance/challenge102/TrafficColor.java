package in.advance.challenge102;

public enum TrafficColor {
	RED(12000), YELLOW(3000), GREEN(6000);

	private final int onTimeInMin;

	private TrafficColor(int onTimeInMin) {
		this.onTimeInMin = onTimeInMin;

	}

	public int getOnTimeInMin() {
		return onTimeInMin;
	}

}
