import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class mapOfVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Map<String, String> cars = new HashMap<>();

		cars.put("Mustang", "Ford");
		cars.put("Caravan", "Dodge");
		cars.put("RAV4", "Toyota");
		cars.put("Camry", "Toyota");

		System.out.println("What car are you looking for?");
		String buyer = input.nextLine();

		if (cars.containsKey(buyer)) {
			System.out.println("Oh, you are looking for a " + buyer + "?" + " Our " + cars.get(buyer)
					+ " selection is right over there");
		} else {
			System.out.println("oh, sorry. I am not familiar with that model.");
		}

	}
}
