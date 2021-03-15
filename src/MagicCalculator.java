package classesAndObjects;

public class MagicCalculator extends Calculator {

	public double squareRoot(double a) {
		double squareRoot = Math.sqrt(a);
		return squareRoot;
	}

	public double sin(double a) {
		double b = Math.sin(a);
		return b;
	}

	public double cosine(double a) {
		double b = Math.cos(a);
		return b;
	}

	public double tangent(double a) {
		double b = Math.tan(a);
		return b;
	}

	public Integer factorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
