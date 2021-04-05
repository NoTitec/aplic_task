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
		case 11:
			f.count_word();
			break;
		case 12:
			f.print_n_String();
			break;
		case 13:
			f.print_middle_char();
			break;
		case 14:
			f.match_password();
			break;
		case 15:
			f.delsame_String();
			break;
		case 16:
			f.count_word_num();
			break;
		case 17:
			f.schars();
			break;
		case 18:
			f.remove0();
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

	public boolean noTriples(int[] nums) {
		for (int i = 0; i < (nums.length - 2); i++) {
			int first = nums[i];
			if (nums[i + 1] == first && nums[i + 2] == first)
				return false;
		}

		return true;
	}

	public void count_word() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the string: ");
		String str = sc.nextLine();
		System.out.print("Number of words: " + this.countwords(str) + "\n");
		sc.close();
	}

	public int countwords(String str) {
		if (str.length() == 0)
			return 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				continue;
			if (i > 0 && str.charAt(i - 1) == ' ') {
				count++;
			} else if (i == 0 && str.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}

	public void print_n_String() {
		System.out.println(sTimes("Hi", 3));
		System.out.println(sTimes("Hello", 2));
		System.out.println(sTimes("My Java", 2));
	}

	public String sTimes(String str, int n) {
		String tempstr = str;
		for (int i = 1; i < n; i++) {
			str = tempstr + tempstr;
		}
		return str;
	}

	public void print_middle_char() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = in.nextLine();
		System.out.print("The middle character in the string: " + middle(str) + "\n");
		in.close();
	}

	public String middle(String str) {// ���ڿ� ¦���� 1�� Ȧ���� 2�����
		int len = str.length();
		if (len % 2 == 1) { // ���ڿ� Ȧ��

			return Character.toString(str.charAt(len / 2)); // Most efficient way
		} else {// ���ڿ� ¦��
			return str.substring(len / 2 - 1, len / 2 + 1);
		}
	}

	public void match_password() {
		Scanner input = new Scanner(System.in);
		System.out.print("1. 8���� �̻��Դϴ�.\n" + "2. �����ڿ� ���ڸ� ��� �����մϴ�. \n" + "3. ���ڴ� 2�� �̻��̾�� �մϴ�.\n"
				+ "���� �н����� ��Ģ�� ���� ���ϴ� �н����带 �Է��Ͻÿ�: ");
		String s = input.nextLine();
		if (is_Valid_Password(s)) {
			System.out.println("������ �н������Դϴ�: " + s);
		} else {
			System.out.println("�н����� ��Ģ�� ��߳��ϴ�: " + s);
		}
		input.close();
	}

	public boolean is_Valid_Password(String password) {
		final int PASSWORD_LENGTH = 8;
		if (password.length() < PASSWORD_LENGTH)// 8�����ϸ� ��� false
			return false;
		int charCount = 0;
		int numCount = 0;// 2�̻��̾����
		for (int i = 0; i < password.length(); i++) {// �������� 1���ھ� ������
			char ch = password.charAt(i);
			if (this.is_Numeric(ch))
				numCount++;
			else if (this.is_Letter(ch))
				charCount++;
			else
				return false;// �����̳� ���ڰ��ƴϸ� ��� false ��ȯ
		}
		return (charCount >= 1 && numCount >= 2);
	}

	public boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}

	public boolean is_Numeric(char ch) {
		return (ch >= '0' && ch <= '9');
	}

	public void delsame_String() {
		String[] sa = new String[] { "is", "S8", "S8", "Oreo", "update", "Oreo", "is", "S8" };
		System.out.println("Original = " + Arrays.toString(sa));// char�迭 string ��ȯ
		this.removeDuplicate(sa);
	}

	public void removeDuplicate(String[] array) {
		boolean[] flag = new boolean[array.length];// flag�迭����
		int newLen = 0;
		for (int i = 0; i < array.length; i++) // flag�迭 false�� �ʱ�ȭ
			flag[i] = false;

		for (int i = 0; i < array.length; i++) {// �տ��Һ��� ���ʿ� �ߺ������� �װ͵��� ��� true
			for (int j = i + 1; j < array.length; j++)
				if (array[i].equals(array[j]))
					flag[j] = true;
		}
		for (int i = 0; i < array.length; i++) { // ������ �迭ũ�� =false����
			if (flag[i] == false)
				newLen++;
		}
		String[] nA = new String[newLen];// falseũ�⸸ŭ �迭����
		int ix = 0;
		for (int i = 0; i < array.length; i++) {// flagfalse�� ������ nA�迭�� �ִ´�
			if (flag[i] == false) {
				nA[ix] = array[i];
				ix++;
			}
		}
		System.out.println("  Result = " + Arrays.toString(nA));
	}

	public void count_word_num() {
		String str = "Hello this is Java World";
		System.out.println("String is : " + str);
		countword(str);
	}

	public void countword(String str) {
		String st = str.trim();
		int count = 0;
		String[] wordnum = st.split(" ");
		int wt = 0;
		for (int i = 0; i < st.length(); i++) {

			if (st.charAt(i) == ' ') {// �����̸� �ܾ������
				count++;
				System.out.println(count + " : " + wordnum[wt] + " : " + wordnum[wt].length());
				wt++;
			}
		}
		count++;
		System.out.println(count + " : " + wordnum[wt] + " : " + wordnum[wt].length());
	}

	public void schars() {
		String str = "Hello Java World!";
		System.out.println("String          = " + str);
		System.out.println("Reversed String = " + reverse(str));
	}

	public String reverse(String str) {
		char[] ch = str.toCharArray();// �Է¹��� ���ڿ��� char�迭�� ��ȯ
		for (int i = 0; i < ch.length; i++) {// char�迭 ���̸�ŭ �ݺ�
			// k : index of first character
			// i : index of last character
			int k = i;
			while (i < ch.length && ch[i] != ' ') {// ���ڿ� ���̾ƴϰ� ���鹮�ڰ� �ƴҶ������ݺ�
				i++;
			}
			// Swapping
			char temp = ch[k];// ���� �Ǿձ��� ����
			ch[k] = ch[i - 1];// �ܾ� �ǵڱ��ڿ� ��ȯ
			ch[i - 1] = temp;// �ǵڿ� ���� �ձ��ڳֱ�
		}
		return new String(ch);// char�迭�� String���� ��ȯ
	}

	public void remove0() {
		String str = "00100234000";
		System.out.println("String    = " + str);
		str = removeFrontZ(str);
		System.out.println("Converted = " + str);
	}

	public String removeFrontZ(String str) {
		// Count preceding zeros
		int i = 0;
		while (str.charAt(i) == '0')//0�ƴҶ����� �ݺ�
			i++;
		// Convert str into StringBuffer as Strings
		// are immutable.
		StringBuffer sb = new StringBuffer(str);//String ���ۻ���

		// The StringBuffer replace function removes
		// i characters from given index (0 here)
		sb.replace(0, i, "");//���۽�Ʈ���� 0��°��ġ���� i��ġ���� ����
		return sb.toString(); // return in String
	}
}
