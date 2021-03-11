import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;

public class loopAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner input= new Scanner(System.in);
//		System.out.println("Give me 5 numbers");
//		int userNum=input.nextInt();
//		

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		String numbers = input.nextLine();

		String numArr[] = numbers.split("");

		List<String> myList = new ArrayList<>();
		myList = Arrays.asList(numArr);

		int sum = 0;
		int product = 1;
		for (int i = 0; i < myList.size(); i++) {
			int a = Integer.parseInt(myList.get(i));
			sum = sum + a;
			product = product * a;
		}
		System.out.println(sum);
		System.out.println(product);

		int max = Integer.parseInt(myList.get(0));
		for (int i = 0; i < myList.size(); i++) {
			int a = Integer.parseInt(myList.get(i));
			if (a > max) {
				max = a;
			}
		}
		System.out.println("The largest is : " + max);

		int min = Integer.parseInt(myList.get(0));
		for (int i = 0; i < myList.size(); i++) {
			int a = Integer.parseInt(myList.get(i));
			if (a < min) {
				min = a;
			}
		}
		System.out.println("The smallest is : " + min);

	}
}
