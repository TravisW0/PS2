package base;

public class MyInteger {
	// int data field
		private static int iValue;

		// constructor
		public MyInteger(int iValue) {
			MyInteger.iValue = iValue;
		}

		// get method
		public static int getValue() {
			return iValue;
		}

		// isEven method
		public boolean isEven() {
			if (iValue % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}

		// isOdd method
		public boolean isOdd() {
			if (iValue % 2 == 1) {
				return true;
			} else {
				return false;
			}
		}

		// isPrime method
		public boolean isPrime() {
			if (iValue % 2 == 0)
				return false;
			for (int a = 3; a * a <= iValue; a += 2)
				if (iValue % a == 0)
					return false;
			return true;
		}

		// isEven method with int
		public static boolean isEven(int value) {
			if (value % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}

		// isOdd method with int
		public static boolean isOdd(int value) {
			if (value % 2 == 1) {
				return true;
			} else {
				return false;
			}
		}

		// isPrime method with int
		public static boolean isPrime(int value) {
			if (value % 2 == 0)
				return false;
			for (int a = 3; a * a <= value; a += 2)
				if (value % a == 0)
					return false;
			return true;

		}

		// static isEven method with MyInteger
		public static boolean isEven(MyInteger sum) {
			if (getValue() % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}

		// static isOdd method with MyInteger
		public static boolean isOdd(MyInteger sum) {
			if (getValue() % 2 == 1) {
				return true;
			} else {
				return false;
			}
		}

		// static isPrime method with MyInteger
		public static boolean isPrime(MyInteger sum) {
			if (getValue() % 2 == 0)
				return false;
			for (int a = 3; a * a <= getValue(); a += 2)
				if (getValue() % a == 0)
					return false;
			return true;
		}

		// equals method with int
		public boolean equals(int value) {
			if (value == getValue()) {
				return true;
			} else {
				return false;
			}
		}

		// equals method with MyInteger
		public boolean equals(MyInteger sum) {
			if (iValue == getValue()) {
				return true;
			} else {
				return false;
			}
		}
}
