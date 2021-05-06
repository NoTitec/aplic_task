package week9;

import java.util.*;

public class ShapeSizeCalculatorUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ���� ���� (R: �簢��, T: �ﰢ��, C: ��) ? ");
		char shape = sc.next().charAt(0);
		int wth;
		int hit;
		int radius;
		switch (shape) {
		case 'R':
			System.out.print("�簢�� �ʺ� �� ���� �Է�? ");
			wth = sc.nextInt();
			hit = sc.nextInt();
			Rectangle r = new Rectangle(wth, hit);
			System.out.println("�簢�� ũ�� = " + r.getSize());
			break;
		case 'T':
			System.out.print("�ﰢ�� �ʺ� �� ���� �Է�? ");
			wth = sc.nextInt();
			hit = sc.nextInt();
			Triangle t = new Triangle();
			t.set(wth, hit);
			System.out.println("�ﰢ�� ũ�� = " + t.getSize());
			break;
		case 'C':
			System.out.print("�� ������ �Է�? ");
			radius = sc.nextInt();
			Circle c = new Circle();
			c.set(radius);
			System.out.println("�� ũ�� = " + c.getSize());
			break;
		default:
			System.out.println("���� ���� ����");
			break;
		}
		sc.close();
	}

}

class Circle {
	private int radius = 0; // ������

	public Circle() {
		radius = 0;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public void set(int radius) {
		this.radius = radius;
	}

	public double getSize() {
		return 3.14 * radius * radius;
	}
}

class Rectangle {
	private int wth = 0; // �ʺ�
	private int hit = 0; // ����

	public Rectangle() {
		wth = 0;
		hit = 0;
	}

	public Rectangle(int wth, int hit) {
		this.wth = wth;
		this.hit = hit;
	}

	public void set(int wth, int hit) {
		this.wth = wth;
		this.hit = hit;
	}

	public double getSize() {
		return wth * hit;
	}
}

class Triangle {
	private int wth = 0; // �ʺ�
	private int hit = 0; // ����

	public Triangle() {
		wth = 0;
		hit = 0;
	}

	public Triangle(int wth, int hit) {
		this.wth = wth;
		this.hit = hit;
	}

	public void set(int wth, int hit) {
		this.wth = wth;
		this.hit = hit;
	}

	public double getSize() {
		return wth * hit / 2.0;
	}
}
