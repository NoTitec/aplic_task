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
		case 5:
			f.removearray();
			break;
		case 6:
			f.insertarrval();
			break;
		case 7:
			f.print9val();
			break;

		case 8:
			f.is_array_sorted();
			break;
		case 9:
			f.count_min_to_max();
			break;
		case 10:
			f.NoTriples();
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

	public int[] reverse(int[] a, int count) {

		for (int i = 0; i < count / 2; i++) {
			int max = count - 1 - i;
			int temp = 0;
			temp = a[i];
			a[i] = a[max];
			a[max] = temp;
		}
		return a;
	}

	public void removearray() {
		int[] my_array = { 25, 14, 56, 15, 36, 56 };
		System.out.println("                  Original Array : " + Arrays.toString(my_array));
		// Remove the second element (index->1, value->14) of the array
		this.removeArr(my_array, 1);
		// We cannot alter the size of an array , after the removal,
		// the last and second last element in the array will exist twice
		System.out.println("After removing the second element: " + Arrays.toString(my_array));

		int[] new_array = new int[my_array.length - 1];
		for (int i = 0; i < new_array.length; i++)
			new_array[i] = my_array[i];

		System.out.println("After removing the second element: " + Arrays.toString(new_array));
	}

	public void removeArr(int[] arr, int ix) {
		for (int i = ix; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];
	}

	public void insertarrval() {
		int[] my_array = { 11, 22, 33, 44, 55 };
		// Insert an element in 3rd position of the array (index->2, value->999)
		int Index_position = 2;
		int newValue = 99;
		System.out.println("Original Array : " + Arrays.toString(my_array));

		this.insertArray(my_array, Index_position);
		my_array[Index_position] = newValue;
		System.out.println("      New Array: " + Arrays.toString(my_array));
	}

	public void insertArray(int[] arr, int ix) {
		for (int i = arr.length - 1; i > ix; i--)
			arr[i] = arr[i - 1];
	}

	public void print9val() {
		int[] a1 = { 1, 2, -9 };
		int[] a2 = { 1, 9, 9 };
		int[] a3 = { 1, 9, 9, 3, 9 };
		System.out.println(this.arrayCount9(a1));
		System.out.println(this.arrayCount9(a2));
		System.out.println(this.arrayCount9(a3));
	}

	public int arrayCount9(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 9) {
				count++;
			}
		}
		return count;
	}

	public void is_array_sorted() {
		int[] a1 = { 1, 1, 2, 3, 4 };
		int[] a2 = { 1, 1, 2, 4, 1 };
		int[] a3 = { 1, 1, 2, 2, 2, 3 };
		System.out.println(this.array123(a1));
		System.out.println(this.array123(a2));
		System.out.println(this.array123(a3));
	}

	public boolean array123(int[] arr) {
		boolean judge = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				judge = false;
			}
		}
		return judge;
	}

	public void count_min_to_max() {
		int[] a1 = { 8, 3, 5, 7, 2, 4 };
		int[] a2 = { 14, 1, 22, 17, 36, 7, -43, 5 };
		System.out.println(this.countIn(a1, 9, 1));
		System.out.println(this.countIn(a2, 4, 17));
	}

	public int countIn(int[] arr, int min, int max) {
		int jud = 0;
		if (min > max) {
			jud = -1;
			return jud;
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= min && arr[i] <= max) {
				jud++;
			}

		}
		return jud;
	}
	
	public void NoTriples() {
		int[] a1 = { 1, 1, 2, 2, 1 };
		int[] a2 = { 1, 1, 2, 2, 2, 1 };
		int[] a3 = { 1, 1, 1, 2, 2, 2, 1 };
		System.out.println(this.noTriples(a1));
		System.out.println(this.noTriples(a2));
		System.out.println(this.noTriples(a3));
	}
	
	public boolean noTriples(int []nums) {
		for (int i = 0; i < (nums.length - 2); i++) {
			int first = nums[i];
			if (nums[i + 1] == first && nums[i + 2] == first)
				return false;
		}
		
		return true;
	}
}
