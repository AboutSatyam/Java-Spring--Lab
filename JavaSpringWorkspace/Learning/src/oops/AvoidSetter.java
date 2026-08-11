package oops;

class dog {

	private int cost;
	private String Name;
	private String Color;

	dog(int cost, String Name, String Color)

	{
		this.cost = cost;
		this.Name = Name;
		this.Color = Color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

}

public class AvoidSetter {

	public static void main(String[] args) {

		dog doggy = new dog(400, "Shreu", "White");

		
		System.out.println(doggy.getCost());
		System.out.println(doggy.getName());
		System.out.println(doggy.getColor());
		

	}

}
