package training1_13;

//사람 클래스(Ver.2)
public class Human {
	private String name;
	private int height;
	private int weight;
	public Human(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	public String getName() {return name;}
	
	public int getHeight() {return height;}
	
	public int getWeight() {return weight;}
	
	void gianWeight(int w) {weight += w;}
	void reduceWeight(int w) {weight -= w;}


}

