package week9;

import java.util.*;

public class ShapeSizeCalculatorUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("도형 종류 선택 (R: 사각형, T: 삼각형, C: 원) ? ");
		char shape = sc.next().charAt(0);
		int wth;
		int hit;
		int radius;
		switch (shape) {
		case 'R':
			System.out.print("사각형 너비 및 높이 입력? ");
			wth = sc.nextInt();
			hit = sc.nextInt();
			Rectangle r = new Rectangle(wth, hit);
			System.out.println("사각형 크기 = " + r.getSize());
			break;
		case 'T':
			System.out.print("삼각형 너비 및 높이 입력? ");
			wth = sc.nextInt();
			hit = sc.nextInt();
			Triangle t = new Triangle();
			t.set(wth, hit);
			System.out.println("삼각형 크기 = " + t.getSize());
			break;
		case 'C':
			System.out.print("원 반지름 입력? ");
			radius = sc.nextInt();
			Circle c = new Circle();
			c.set(radius);
			System.out.println("원 크기 = " + c.getSize());
			break;
		default:
			System.out.println("도형 선택 오류");
			break;
		}
		sc.close();
	}

}

class Circle {
	private int radius = 0; // 반지름

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
	private int wth = 0; // 너비
	private int hit = 0; // 높이

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
	private int wth = 0; // 너비
	private int hit = 0; // 높이

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
