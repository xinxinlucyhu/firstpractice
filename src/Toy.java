package classesAndObjects;

public class Toy {

	private String name;
	private String type;
	private Integer price;

	public Toy() {

	}

	public Toy(String name, String type, Integer price) {

		this.name = name;
		this.type = type;
		this.price = price;

	}

	public Toy(String name, String type) {

		this.name = name;
		this.type = type;

	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;

	}

	public Integer getPrice() {
		return price;
	}

	public void setName(String name) {

	}

	public void setType(String type) {

	}

	public void setPrice(int price) {

	}

	public Boolean isSafe() {
		if (type.equals("stuffed")) {

			return true;
		} else {
			return false;
		}

	}

}
