
public class bird extends animal{
	private int wingspan;
	private boolean flight;

	public bird(int height, int pop, String name, int wingspan, boolean flight) {
		super(height, pop, name);
		this.wingspan=wingspan;
		this.flight=flight;
	}

	public void setWingspan(int length) {
		this.wingspan=length;
	}
	
	public int getWingspan() {
		return wingspan;
	}
	
	public void setFlightpos(boolean fly) {
		this.flight=fly;
	}
	
	public boolean getFlightpos() {
		return flight;
	}
	
	@Override
	public String toString() {
		return "this animal is called " + this.name + " and its " + this.height + " inches tall and has " + this.pop + " many members left and a wingspan of " + this.wingspan + " and flight possibility is " + this.flight;
	}
}
