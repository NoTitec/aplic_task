package application_task;

import java.util.Scanner;

public class tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴번호입력");
		menus m1 = new menus();
		int cc = sc.nextInt();
		switch (cc) {
		case 1:

			m1.Calculation();
			break;
		case 2:
			m1.PolynomialExpression();
			break;
		case 3:
			m1.Alphabet();
			break;
		}
		sc.close();

	}

}

class menus {
	public void Calculation() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력: ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 입력: ");
		int num2 = sc.nextInt();

		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / (double) num2));
		System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
		sc.close();
	}

	public void PolynomialExpression() {
		double a = 0;
		double b = 0;
		double c = 0;
		double x = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("2차 다항식 y = a*x^2 + b*x + c");
		System.out.print("계수 및 x 입력 (a, b, c, x): ");

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		x = sc.nextDouble();

		System.out.print("계산 결과 y = " + (a * x * x + b * x + c));
		sc.close();
	}

	public void Alphabet() {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		num = sc.nextInt();

		System.out.println("알파벳 출력 = " + (char) (97 + num));
		sc.close();
	}
}
