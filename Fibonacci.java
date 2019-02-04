public class Fibonacci {

	public int fibonacci(int x, String type) {

		if (type == "recursive") {

			if (x <= 1) {

				return x;

			}

			return ((fibonacci((x - 1), type)) + fibonacci((x - 2), type));

		}

	

		 else if (type == "iterative") {

		 	int num = 1;
		 	int prevnum = 1;
		 	for (int i = 2; i < x; i++) {

		 		int temp = num;
		 		num += prevnum;
		 		prevnum = temp;

		 	}

		 	return num;

		}

		return 1;

	}

}
