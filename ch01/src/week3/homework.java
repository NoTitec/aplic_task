package week3;

//import java.io.*;
import java.util.*;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("put m num");
		Scanner sc = new Scanner(System.in);
		part3 me = new part3();
		int cf = 0;
		if (sc.hasNextInt()) {
			cf = sc.nextInt();

		} else {
			System.out.println("input number please");
		}

		switch (cf) {
		case 1:
			me.num5_1();
			break;
		case 2:
			me.num5_2();
			break;
		case 3:
			me.num5_3();
			break;
		case 4:
			me.num5_4();
			break;
		case 5:
			me.num5_5();
			break;
		case 6:
			me.num5_6();
			break;
		case 7:
			me.num5_7();
			break;
		case 8:
			me.num5_8();
			break;
		case 9:
			me.num5_9();
		case 10:
			me.num5_10();
			break;
		case 11:
			me.num5_11();
			break;
		case 12:
			me.num5_12();
			break;
		case 13:
			me.num5_13();
			break;
		case 14:
			me.num5_14();
			break;
		case 15:
			me.num5_15();
			break;
		default:
			System.exit(cf);
		}
		sc.close();
	}

}

class part3 {
	public void swap(int a, int b) {
		int temp = b;
		b = a;
		a = temp;
	}

	public void num5_1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number? ");
		int num = sc.nextInt();

		while (num > 0) {
			System.out.print(num % 10 + " ");
			num = num / 10;
			sc.close();
		}
	}

	public void num5_2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number 1 ? ");
		int num1 = sc.nextInt();

		System.out.print("Input number 2 ? ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			swap(num1, num2);
		}

		int sum = 0;

		for (int i = num1; i <= num2; i++)
			sum = sum + i; // sum += i;

		System.out.println("작은 수부터 큰 수까지의 합 : " + sum);
		sc.close();
	}

	public void num5_3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number 1 ? ");
		int num1 = sc.nextInt();

		System.out.print("Input number 2 ? ");
		int num2 = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < num2; i++)
			sum += num1;

		System.out.println(num1 + " * " + num2 + " = " + sum);
		sc.close();
	}

	public void num5_4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number 1 ? ");
		int num1 = sc.nextInt();

		System.out.print("Input number 2 ? ");
		int num2 = sc.nextInt();

		int r = num1;

		while (r > num2) {
			r -= num2;
		}

		System.out.println(num1 + " % " + num2 + " = " + r);
		sc.close();
	}

	public void num5_5() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Input Equation (num1 op num2)? ");
			float num1 = sc.nextFloat();
			String op = sc.next();
			float num2 = sc.nextFloat();

			float result = 0;

			if (op.equals("+")) {
				result = num1 + num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + result);
			} else if (op.equals("-")) {
				result = num1 - num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + result);
			} else if (op.equals("*")) {
				result = num1 * num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + result);
			} else if (op.equals("/")) {
				result = num1 / num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + result);
			} else {
				System.out.println("잘못된 연산입니다.");
			}

			System.out.println("if you want to exit program please enter \"No\")");
			String str = sc.next();

			if (str.equals("No"))
				break;

			sc.close();
		}
	}

	public void num5_6() {
		Scanner sc = new Scanner(System.in);

		int min = Integer.MAX_VALUE;// min변수에 int최대값대입
		int max = Integer.MIN_VALUE;// int최소값 대입
		int sum = 0;
		int cnt = 0;

		while (true) {
			System.out.print("Input number?(-1=>exit) ");
			int num = sc.nextInt();

			if (num == -1)
				break;

			if (min > num)
				min = num;// min이 입력받은 num보다 크면 min=num
			if (num > max)
				max = num;// max가 입력받은 num보다 작으면 max=num

			sum += num;// 입력받은수를 모두더함
			cnt++;// 반복문한번돌때마다 수 1개 입력받은것
		}
		System.out.println("최솟값 : " + min);
		System.out.println("최댓값 : " + max);
		System.out.printf("%.1f", (double) sum / (double) cnt);

		sc.close();
	}

	public void num5_7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number? ");
		int num = sc.nextInt();

		System.out.print("Divisor : ");

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				System.out.print(i + " ");

		sc.close();
	}

	public void num5_8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input binary number");
		int num = sc.nextInt(2);
		System.out.println(num);
		sc.close();
	}

	public void num5_9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("put number");
		int input = sc.nextInt();
		for (int i = input; i > 0; i--) {
			for (int s = i; s > 0; s--) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		sc.close();
	}

	public void num5_10() {
		char ch = 'a';

		for (int i = 0; i < 'z' - 'a' + 1; i++)
			System.out.print((char) (ch + i));
	}

	public void num5_11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number 1 ? ");
		int num1 = sc.nextInt();

		System.out.print("Input number 2 ? ");
		int num2 = sc.nextInt();

		if (num2 <= num1) {
			swap(num2, num1);
		}

		int sum = 0;

		System.out.print("Odd Number : ");

		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
				sum += i;
			}
		}

		System.out.println();
		System.out.println("Odd Sum from min odd to max odd : " + sum);
		sc.close();
	}

	public void num5_12() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Input Shape Size : ");
			int num = sc.nextInt();

			if (num == -1)
				break;

			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= num; j++) {
					if (i == 1 || i == num)
						System.out.print("*");
					else {
						if (j == 1 || j == num)
							System.out.print("*");
						else
							System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}

	public void num5_13() {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		do {
			System.out.print("Input number ? ");
			num = sc.nextInt();
		} while (num % 2 == 0);

		for (int i = num / 2; i >= 0; i--) {// 위쪽 그림
			for (int k = 0; k < i; k++)
				System.out.print(" ");
			for (int j = 0; j < num - (i * 2); j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i <= num / 2; i++) {// 아래쪽 그림
			for (int k = 0; k < i; k++)
				System.out.print(" ");
			for (int j = 0; j < num - (i * 2); j++)
				System.out.print("*");
			System.out.println();
		}

		sc.close();
	}

	public void num5_14() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number 1 ? ");
		int num1 = sc.nextInt();

		System.out.print("Input number 2 ? ");
		int num2 = sc.nextInt();

		for (int i = num1; i <= num2; i++) {

			if (i % 3 == 0) {
				System.out.println(i);
				continue;
			}
			if (i % 5 == 0)
				System.out.println(i);

		}
		sc.close();
	}

	public void num5_15() {
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = ");
				System.out.printf("%2s ", Integer.toString(i*j));
			}
			System.out.println();
	}
}
}
