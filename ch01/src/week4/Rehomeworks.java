package week4;

import java.util.Scanner;
import java.lang.Math;

public class Rehomeworks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("select number");

		Scanner sc = new Scanner(System.in);
		int mnum;
		mnum = sc.nextInt();
		methods m = new methods();
		switch (mnum) {
		case 1:
			System.out.println(m.addnumbers());
			break;
		case 2:
			System.out.println(m.Factorial());
			break;
		case 3:
			System.out.println(m.Division());
		case 4:
			System.out.println("두 좌표 거리" + m.Distance());
			break;
		case 5:
			m.checkUpandDown();
		case 6:
			System.out.println(m.absoluteValue());
		}
		sc.close();
	}

}

class methods {
	public int addnumbers() {

		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);

		System.out.print("두 정수 입력: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		sum = num1 + num2;
		sc.close();
		return sum;
	}

	public int Factorial() {
		int fac = 1;
		int num;
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력: ");
		num = scan.nextInt();
		for (int i = 1; i <= num; i++)
			fac = fac * i;
		scan.close();
		return fac;
	}

	public int Division() {
		int cnt = 0;
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("두 정수 입력: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 > 0 && num2 > 0) {
				break;
			}
		}
		while (true) {
			if (num1 < num2)
				break;

			num1 = num1 - num2;
			cnt++;
		}
		sc.close();
		return cnt;
	}

	public double Distance() {
		int x1, y1, x2, y2;

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 좌표(X, Y) 입력: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();

		System.out.print("두 번째 좌표(X, Y) 입력: ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		double res = 0;

		res = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		sc.close();
		return res;
	}

	public void checkUpandDown() {
		int rnd_num, num;

		Scanner sc = new Scanner(System.in);

		rnd_num = (int) (Math.random() * 100);
		System.out.println("내가 선택한 숫자를 맞춰어 보세요 (0-99)");

		while (true) {
			System.out.print("숫자 입력: ");
			num = sc.nextInt();

			int flag = 0;

			if (num > rnd_num) {
				flag = 1; // 높음
				System.out.println("내가 선택한 숫자보다 낮습니다.");
				continue;
			}
			if (num < rnd_num) {
				flag = 2; // 낮음
				System.out.println("내가 선택한 숫자보다 높습니다.");
				continue;
			}
			if (num == rnd_num) {
				flag = 3; // 맞춤
				System.out.println("내가 선택한 숫자를 정확하게 맞췄습니다.");
				break;
			}

		}
		sc.close();
	}

	public int absoluteValue() {
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		num*=-1;
		sc.close();
		return num;
	}
}