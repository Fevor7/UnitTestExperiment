package by.itacademy.app;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	private Fibonacci() {

	}

	public static BigInteger fecthNumber(int number) {
		return (number != 0) ? fecthList(number).get(Math.abs(number) - 1) : BigInteger.valueOf(0);
	}

	public static List<BigInteger> fecthList(int number) {
		if (number < 0) {
			return fecthNegativeList(number);
		}
		if (number > 0) {
			return fecthPositiveList(number);
		}
		List<BigInteger> list = new ArrayList<>(1);
		list.add(BigInteger.valueOf(0));
		return list;
	}

	private static List<BigInteger> fecthNegativeList(int number) {
		List<BigInteger> list = new ArrayList<>(Math.abs(number));
		list.add(BigInteger.valueOf(-1));
		list.add(BigInteger.valueOf(-1));
		for (int i = 2; i < Math.abs(number); i++) {
			BigInteger result = list.get(i - 1).add(list.get(i - 2));
			list.add(result);
		}
		return list;
	}

	private static List<BigInteger> fecthPositiveList(int number) {
		List<BigInteger> list = new ArrayList<>(number);
		list.add(BigInteger.valueOf(1));
		list.add(BigInteger.valueOf(1));
		for (int i = 2; i < number; i++) {
			BigInteger result = list.get(i - 1).add(list.get(i - 2));
			list.add(result);
		}
		return list;
	}

}
