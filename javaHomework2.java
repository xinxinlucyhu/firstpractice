import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class javaHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();

		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter your name: ");
//		String name = input.nextLine();
//		System.out.println("Hello " + name);
//
//		System.out.println("continue?");
//		String answer = input.nextLine();
//		if (answer != "yes" && answer != "y") {
//			System.out.println("Please return later to complete the survey.");
//			return;
//			// System.exit(0);
//
//		}

		Random random = new Random();
		int num1 = random.nextInt(5) + 1;
		int num2 = random.nextInt(2);
		int num3 = random.nextInt(75);

		while (true) {

			System.out.println("Do you have a red car? (yes, no) q to quit");
			String yesOrno = input.nextLine();
			if (yesOrno.equalsIgnoreCase("q")) {
				System.out.println("Thank you!");
				break;
			}
			System.out.println(" What is your favorite pet name?");
			String petName = input.nextLine();

			System.out.println(" How old is your favorite pet? ");
			int age = input.nextInt();
			while (age < 0) {

				System.out.println("Can't be negative number! Type it again!");

				age = input.nextInt();

			}

			System.out.println("What is your lucky number?");
			int luckyNumber = input.nextInt();
			while (luckyNumber < 0) {

				System.out.println("Can't be negative number! Type it again!");

				luckyNumber = input.nextInt();

			}

			System.out.println("Do you have a favorite quarterback?" + " If so, what is his jersey number?");
			int quarterBack = input.nextInt();
			while (quarterBack < 1) {

				System.out.println("Can't be negative number or 0! Type it again!");

				quarterBack = input.nextInt();

			}

			System.out.println("What is the last two-digit model year of your car?");
			int carModel = input.nextInt();

			while (carModel < 10 && carModel > 99) {

				System.out.println("Two digits! Type it again!");

				carModel = input.nextInt();

			}

			System.out.println("What is the first name of your favorite actor or actress?");
			String favoriteActor = input.nextLine();
			input.nextLine();

			System.out.println("Enter a random number between 1 and 50.");
			int randomNum = input.nextInt();
			while (randomNum<1&&randomNum>50) {

				System.out.println("Between 1 and 50! Type it again!");

				age = input.nextInt();

			}

			int magicBall = quarterBack * num1;
			while (magicBall > 75) {
				magicBall = magicBall - 75;
			}
			System.out.println(magicBall);

			List<Integer> fiveNum = new ArrayList<>();
			fiveNum.add(Character.getNumericValue(petName.charAt(0)));
			fiveNum.add(carModel);
			fiveNum.add(randomNum - num2);
			fiveNum.add(age + carModel);
			fiveNum.add(quarterBack + age + luckyNumber);

			for (int i = 0; i < fiveNum.size(); i++) {

				int eachNum = fiveNum.get(i);
				while (eachNum > 65) {
					eachNum = eachNum - 65;
					fiveNum.set(i, eachNum);
				}
				if (eachNum < 1) {
					int random4 = random.nextInt(65);
					eachNum = eachNum + random4;
					fiveNum.set(i, eachNum);

				}
				System.out.println(fiveNum);

			}

			System.out.println("Lottery numbers: " + fiveNum + " Magic ball: " + magicBall);
			input.nextLine();

		}

	}

}
