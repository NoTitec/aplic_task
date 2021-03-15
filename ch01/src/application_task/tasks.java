package application_task;

import java.util.Scanner;
import java.io.*;

public class tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문제번호입력");
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
		case 4:
			m1.ObesityLevel();
			break;
		case 5:
			m1.Time();
			break;
		case 6:
			m1.Circle();
			break;
		case 7:
			m1.PrintString();
			break;
		case 8:
			m1.Twonumbercomparison();
			break;
		case 9:
			m1.EvenOddChecker();
			break;
		case 10:
			m1.EOandPNChecker();
			break;
		case 11:
			m1.EquationCalculator();
			break;
		case 12:
			m1.VowelChecker();
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

	public void ObesityLevel() {
		double weight = 0;
		double height = 0;
		double BMI = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("몸무게 입력(Kg) : ");
		weight = sc.nextDouble();

		System.out.print("키 입력(cm) : ");
		height = sc.nextDouble();

		BMI = (height - 110) / weight;

		System.out.print("몸무게: " + weight + "Kg, " + "키: " + height + "cm --> 비만도: ");
		System.out.printf("%.3f", BMI);
		sc.close();
	}

	public void Time() {
		int time, minute, second;

		Scanner sc = new Scanner(System.in);

		System.out.print("시간 입력(초) : ");
		second = sc.nextInt();

		minute = second / 60;
		second = second % 60;
		time = minute / 60;
		minute = minute % 60;

		System.out.println("입력된 시간: " + time + "시 " + minute + "분" + second + "초");
		sc.close();
	}

	public void Circle() {
		final double PI = 3.14;
		int radius;
		double area, perimeter;

		Scanner sc = new Scanner(System.in);

		System.out.print("원의 반지름 입력 : ");
		radius = sc.nextInt();

		area = PI * radius * radius;
		perimeter = 2 * PI * radius;

		System.out.println("면적: " + area + " 둘레: " + perimeter);
		sc.close();
	}

	public void PrintString() {
		try {
			String str1, str2;
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 입력: ");
			str1 = sc.nextLine();

			Scanner sc2 = new Scanner(new File("C:\\Users\\zkxkr\\iCloudDrive\\금오공대3-1\\프로그래밍응용\\과제\\sample.txt"));
			str2 = sc2.useDelimiter("\\\n").next();
			System.out.println(str1 + str2);
			sc2.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Twonumbercomparison() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number 1 ? ");
		int num1 = sc.nextInt();

		System.out.print("Input number 2 ? ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " is bigger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is less than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
		sc.close();
	}

	public void EvenOddChecker() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number? ");
		int num = sc.nextInt();

		if ((num & 0x1) == 0) {
			System.out.println(num + " is Even number");
		} else {
			System.out.println(num + " is Odd number");
		}
		sc.close();
	}

	public void EOandPNChecker() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number? ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			if (num >= 0) {
				System.out.println(num + " is Even and Positive number");
			} else {
				System.out.println(num + " is Even and Negative number");
			}
		} else {
			if (num >= 0) {
				System.out.println(num + " is Odd and Positive number");
			} else {
				System.out.println(num + " is Odd and Negative number");
			}
		}
		sc.close();
	}

	public void EquationCalculator() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input equation? ");
		int num1 = sc.nextInt();
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		int num2 = sc.nextInt();

		int result;

		if (op == '+') {
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
		} else if (op == '-') {
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + result);
		} else if (op == '*') {
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
		} else if (op == '/') {
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
		}
		sc.close();
	}

	public void VowelChecker() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input character? ");
		char ch = sc.nextLine().charAt(0);

		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
				|| ch == 'o' || ch == 'u') {
			System.out.println(ch + " is Vowel");
		} else {
			System.out.println(ch + " is Consonant");
		}
		sc.close();
	}
}
