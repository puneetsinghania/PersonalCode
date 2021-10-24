package timbudemy;

public class OperatorChallenge {

	public static void main(String[] args) {
		double a = 20.00d;
		double b = 80.00d;
		double sum = (a + b) * 100.00d;
		double rem = sum % 40.00d;

		boolean isRem = (rem == 0) ? true : false;
		System.out.println(isRem);

		if (!isRem)
			System.out.println("Got some remainder");

	}

}
