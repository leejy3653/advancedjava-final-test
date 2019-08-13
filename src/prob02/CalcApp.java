package prob02;

import java.util.Scanner;

public class CalcApp {
	int result;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();

		Arithmetic calc = null;

		switch (operation) {
		case "+": {
			calc = new Add();
			break;
		}
		case "-": {
			calc = new Sub();
			break;
		}
		case "*": {
			calc = new Mul();
			break;
		}

		case "/": {
			calc = new Mul();
		}
		}
		System.out.println(calc.calculate(a, b));
	}
}
