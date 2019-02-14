

public enum TrafficLight {
	RED (3),
	YELLOW (2),
	GREEN (1);
	
	private final int code;
	
	private TrafficLight(int c) {
		this.code = c;
	}
	
	public int getTrafficLightCode() {
		return code;
	}
}
