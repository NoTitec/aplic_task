package week5;

import java.util.*;

public class arrayandstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		methods f = new methods();
		switch (num) {
		case 1:
			f.ForLoopArray();
			break;
		case 2:
			f.printarraysum();
			break;
		case 3:
			f.percenteven();
			break;
		case 4:
			f.printreversearray();
			break;
		}
		sc.close();
	}

}

class methods {
	Scanner sc = new Scanner(System.in);

	public void ForLoopArray() {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < vowels.length; ++i) {
			System.out.print(vowels[i] + " ");
		}
		System.out.println();

		for (char item : vowels) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	public void printarraysum() {
		int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int result1 = 0;
		int result2 = 0;
		for (int item : my_array) {

			result1 += item;

		}
		System.out.println("the sum is " + result1);
		for (int i = 0; i < my_array.length; i++) {

			result2 += my_array[i];

		}
		System.out.println("The sum is " + result2);
	}

	public void percenteven() {
		int[] a1 = { 2, 15, 150, 11, 27 };
		int[] a2 = { 8, 11, 34, 20 };
		System.out.println(this.percent(a1) + "%");
		System.out.println(this.percent(a2) + "%");
	}

	public double percent(int a[]) {
		int count = 0;
		if (a.length == 0)
			return 0.0;

		for (int i = 0; i < a.length; i++)
			if (a[i] % 2 == 0)
				count++;

		return (double) count / (double) a.length * 100.0;
	}

	public void printreversearray() {
		int counter, i;
		int number[] = new int[100];

		Scanner scanner = new Scanner(System.in);
		System.out.print("How many integer elements(max 100)?");
		counter = scanner.nextInt();

		for (i = 0; i < counter; i++) {
			System.out.print("Enter Array Element" + (i) + ": ");
			number[i] = scanner.nextInt();
		}

		number = this.reverse(number, counter);

		System.out.print("Reversed array: ");
		for (i = 0; i < counter; i++) {
			System.out.print(number[i] + "  ");
		}
		scanner.close();
	}
	
	public int[] reverse(int[]a, int count) {
		
		for (int i = 0; i < count/2 ; i++) {
	         int max = count-1-i; 
	         int temp = 0;
	         temp = a[i];
	         a[i] = a[max];
	         a[max] = temp;
	     }
		return a;
	}
}
