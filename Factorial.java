public class Factorial {

	public int factorial(int x, String type) {

		int result;
		if (type == "recursive") {

			if (x <= 1) {

				return 1;

			}

			result = (factorial(x - 1, type) * x);
			return result;

		}

		else if (type == "iterative") {

			int total = 1;
			for (int i = 1; i <= x; i++) {

				total *= i;

			}

			return total;

		}

		return 1;

	}

}

