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

	public String middle(String str) {// 문자열 짝수면 1개 홀수면 2개출력
		int len = str.length();
		if (len % 2 == 1) { // 문자열 홀수

			return Character.toString(str.charAt(len / 2)); // Most efficient way
		} else {// 문자열 짝수
			return str.substring(len / 2 - 1, len / 2 + 1);
		}
	}

	public void match_password() {
		Scanner input = new Scanner(System.in);
		System.out.print("1. 8글자 이상입니다.\n" + "2. 영문자와 숫자만 사용 가능합니다. \n" + "3. 숫자는 2개 이상이어야 합니다.\n"
				+ "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
		String s = input.nextLine();
		if (is_Valid_Password(s)) {
			System.out.println("적절한 패스워드입니다: " + s);
		} else {
			System.out.println("패스워드 규칙에 어긋납니다: " + s);
		}
		input.close();
	}

	public boolean is_Valid_Password(String password) {
		final int PASSWORD_LENGTH = 8;
		if (password.length() < PASSWORD_LENGTH)// 8자이하면 즉시 false
			return false;
		int charCount = 0;
		int numCount = 0;// 2이상이어야함
		for (int i = 0; i < password.length(); i++) {// 루프에서 1글자씩 가져옴
			char ch = password.charAt(i);
			if (this.is_Numeric(ch))
				numCount++;
			else if (this.is_Letter(ch))
				charCount++;
			else
				return false;// 영문이나 숫자가아니면 즉시 false 반환
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
		System.out.println("Original = " + Arrays.toString(sa));// char배열 string 변환
		this.removeDuplicate(sa);
	}

	public void removeDuplicate(String[] array) {
		boolean[] flag = new boolean[array.length];// flag배열생성
		int newLen = 0;
		for (int i = 0; i < array.length; i++) // flag배열 false로 초기화
			flag[i] = false;

		for (int i = 0; i < array.length; i++) {// 앞원소부터 뒤쪽에 중복있으면 그것들은 모두 true
			for (int j = i + 1; j < array.length; j++)
				if (array[i].equals(array[j]))
					flag[j] = true;
		}
		for (int i = 0; i < array.length; i++) { // 생성할 배열크기 =false개수
			if (flag[i] == false)
				newLen++;
		}
		String[] nA = new String[newLen];// false크기만큼 배열생성
		int ix = 0;
		for (int i = 0; i < array.length; i++) {// flagfalse면 생성한 nA배열에 넣는다
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

			if (st.charAt(i) == ' ') {// 공백이면 단어개수증가
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
		char[] ch = str.toCharArray();// 입력받은 문자열을 char배열로 변환
		for (int i = 0; i < ch.length; i++) {// char배열 길이만큼 반복
			// k : index of first character
			// i : index of last character
			int k = i;
			while (i < ch.length && ch[i] != ' ') {// 문자열 끝이아니고 공백문자가 아닐때까지반복
				i++;
			}
			// Swapping
			char temp = ch[k];// 원래 맨앞글자 보존
			ch[k] = ch[i - 1];// 단어 맨뒤글자와 교환
			ch[i - 1] = temp;// 맨뒤에 원래 앞글자넣기
		}
		return new String(ch);// char배열을 String으로 변환
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
		while (str.charAt(i) == '0')//0아닐때까지 반복
			i++;
		// Convert str into StringBuffer as Strings
		// are immutable.
		StringBuffer sb = new StringBuffer(str);//String 버퍼생성

		// The StringBuffer replace function removes
		// i characters from given index (0 here)
		sb.replace(0, i, "");//버퍼스트링의 0번째위치부터 i위치까지 삭제
		return sb.toString(); // return in String
	}
}
