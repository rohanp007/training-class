
public class animal {
	public int height;
	public int pop;
	public String name;
	
	public animal(int height, int pop, String name) {
		this.height=height;
		this.pop=pop;
		this.name=name;
	}
	
	public void setPopulation(int newPop) {
		this.pop = newPop;
	}
	
	public int getPopulation() {
		return pop;
	}
	
	public void setHeight(int newHeight) {
		this.height = newHeight;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String toString() {
		return "this animal is called " + name + " and its " + height + " tall and has " + pop + "many members left";
	}
}
