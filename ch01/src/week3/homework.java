package week3;

//import java.io.*;
import java.util.*;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			swap(num1,num2);
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
		
		for(int i = 0; i < num2; i++)
			sum = sum + num1;
		
		System.out.println(num1 + " * " + num2 + " = " + sum);
		sc.close();
	}
}
