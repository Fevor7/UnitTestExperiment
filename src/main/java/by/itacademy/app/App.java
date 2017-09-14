package by.itacademy.app;

import java.math.BigInteger;

import java.util.List;
import java.util.Scanner;

public class App {
	
	private static final String INPUT_TEXT = "Input number: ";
	private static Scanner in;

	public static void main(String[] args) {
		int input = readNumber();
		System.out.println(Fibonacci.fecthNumber(input));
		List<BigInteger> list = Fibonacci.fecthList(input);
		for(int i = 0; i< Math.abs(input)-1; i++) {
			System.out.println(list.get(i));
		}
	}

	private static int readNumber() {
		System.out.print(INPUT_TEXT);
		in = new Scanner(System.in);
		String  line = in.nextLine();
		try {
			return Integer.parseInt(line);
		} catch (NumberFormatException e) {
			return readNumber();
		}
	}
}
