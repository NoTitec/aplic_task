package application_task;

import java.util.Scanner;

public class tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴���ȣ�Է�");
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

		}
		sc.close();

	}

}

class menus {
	public void Calculation() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է�: ");
		int num1 = sc.nextInt();

		System.out.print("�� ��° ���� �Է�: ");
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
		System.out.println("2�� ���׽� y = a*x^2 + b*x + c");
		System.out.print("��� �� x �Է� (a, b, c, x): ");

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		x = sc.nextDouble();

		System.out.print("��� ��� y = " + (a * x * x + b * x + c));
		sc.close();
	}

	public void Alphabet() {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		num = sc.nextInt();

		System.out.println("���ĺ� ��� = " + (char) (97 + num));
		sc.close();
	}

	public void ObesityLevel() {
		double weight = 0;
		double height = 0;
		double BMI = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է�(Kg) : ");
		weight = sc.nextDouble();

		System.out.print("Ű �Է�(cm) : ");
		height = sc.nextDouble();

		BMI = (height - 110) / weight;

		System.out.print("������: " + weight + "Kg, " + "Ű: " + height + "cm --> �񸸵�: ");
		System.out.printf("%.3f", BMI);
		sc.close();
	}

	public void Time() {
		int time, minute, second;

		Scanner sc = new Scanner(System.in);

		System.out.print("�ð� �Է�(��) : ");
		second = sc.nextInt();

		minute = second / 60;
		second = second % 60;
		time = minute / 60;
		minute = minute % 60;

		System.out.println("�Էµ� �ð�: " + time + "�� " + minute + "��" + second + "��");
		sc.close();
	}

	public void Circle() {
		final double PI = 3.14;
		int radius;
		double area, perimeter;

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ������ �Է� : ");
		radius = sc.nextInt();

		area = PI * radius * radius;
		perimeter = 2 * PI * radius;

		System.out.println("����: " + area + " �ѷ�: " + perimeter);
		sc.close();
	}
}
