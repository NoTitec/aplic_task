package week7;

import java.text.DecimalFormat;
import java.util.*;

public class basic_problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("select number");
		int number = sc.nextInt();
		solves f = new solves();
		switch (number) {
		case 2:
			System.out.println(f.firstDigit(3572));
			break;
		case 4:
			System.out.println(f.quadrant(-2.3, 3.5));
			System.out.println(f.quadrant(-15.2, -3.1));
			break;
		case 6:// study
			System.out.println(f.digitrange(68437));
			System.out.println(f.digitrange(-517));
			System.out.println(f.digitrange(23456));

			break;
		case 8:
			int[] arr = { 8, 3, 5, 7, 2, 4 };
			System.out.println(f.range(arr, number));
			break;
		case 10:
			f.InterestRate();
		case 12:
			int[] arr2 = { 8, 3, 5, 7, 2, 4 };
			System.out.println(f.isSorted(arr2));
			break;
		case 14:
			int[] p = { 6, 2, 9, 11, 3 };
			f.percentEven(p);
			break;
		case 16:
			f.printstar();
			break;
		case 18:
			f.printnumbers();
			break;
		case 20:
			f.printnumbers2();
			break;
		case 22:
			f.printnumbers3();
			break;
		case 24:
			f.print_andnum();
			break;
		case 26:
			f.print_exp(10);
			break;
		case 28:
			System.out.println(f.fractionSum(3));
			break;
		case 30:
			f.printRange(2, 7);
			break;
		case 32:
			f.randomX();
			break;
		case 34:
			f.randomWalk();
			break;
		case 36:
			f.lastigit(7, 17);
			f.lastigit(6, 17);
			f.lastigit(3, 113);
			break;
		case 38:
			f.missingChar("kitten", 1);
			break;
		case 40:
			System.out.println(f.or35(3));
			System.out.println(f.or35(10));
			System.out.println(f.or35(8));
			break;
		case 41:
			System.out.println(f.nearHundred(93));
			System.out.println(f.nearHundred(90));
			System.out.println(f.nearHundred(89));
			break;
		case 42:
			System.out.println(f.stringE("Hello"));
			System.out.println(f.stringE("Heelle"));
			System.out.println(f.stringE("Heeelele"));
			break;
		case 43:
			f.stringTimes("Hi", 2);
			f.stringTimes("Hi", 3);
			break;
		case 44:
			f.frontTimes("Chocolate", 2);
			f.frontTimes("C", 2);
			break;
		case 45:
			System.out.println(f.countXX("abcxx"));
			System.out.println(f.countXX("xxx"));
			System.out.println(f.countXX("abcxxxx"));
			break;
		case 46:
			int[] a1 = { 1, 9, 9 };
			System.out.println(f.arrayCount9(a1));
			break;
		case 47:
			int[] a11 = { 1, 1, 2, 3, 1 };
			int[] a2 = { 1, 1, 2, 4, 1 };
			int[] a3 = { 1, 1, 2, 1, 2, 3 };
			System.out.println(f.array123(a11));
			System.out.println(f.array123(a2));
			System.out.println(f.array123(a3));

			break;
		case 48:
			System.out.println(f.stringExplosion("Java"));
			System.out.println(f.stringExplosion("abc"));
			System.out.println(f.stringExplosion("ab"));
			break;
		case 49:
			int[] a41 = { 1, 1, 2, 2, 1 };
			int[] a42 = { 1, 1, 2, 2, 2, 1 };
			int[] a43 = { 1, 1, 1, 2, 2, 2, 1 };
			System.out.println(f.noTriples(a41));
			System.out.println(f.noTriples(a42));
			System.out.println(f.noTriples(a43));

			break;
		case 50:
			System.out.println(f.stringX("xxHxix"));
			System.out.println(f.stringX("abxxxcd"));
			System.out.println(f.stringX("xabxxxcdx"));

			break;
		case 51:
			int[] a511 = { 6, 6, 2 };
			int[] a512 = { 6, 6, 2, 6 };
			int[] a513 = { 6, 7, 2, 6 };
			System.out.println(f.array667(a511));
			System.out.println(f.array667(a512));
			System.out.println(f.array667(a513));

			break;
		case 52:
			System.out.println("put the number");
			int inputn = sc.nextInt();
			f.reverseNumbers(inputn);
			break;
		case 53:
			sc.nextLine();
			String inputS = sc.nextLine();
			if (f.chpassword(inputS) == true) {
				System.out.println(inputS);
			} else {
				System.out.println("error");
			}
			break;
		case 54:
			f.toStringdemo();
			break;
		case 55:
			f.createString();
			break;
		case 56:
			f.equalstring();
			break;
		case 57:
			f.compareString();
			break;
		case 58:
			f.concateString();
			break;
		case 59:
			f.containString();
			break;
		case 60:
			f.getindexchar();
			break;
		case 61:
			System.out.println(f.wordcount());
			break;
		case 62:
			String []sarr= {"is","S8","S8","Oreo","updata","Oreo","is","S8"};
			f.removeStringdup(sarr);
			break;
		case 63:
			f.countwordandwordlen("Hello this is Java World");
			break;
		}
		sc.close();
	}

}

class solves {
	Scanner sc = new Scanner(System.in);

	public int firstDigit(int inn) {
		int last = inn;

		while (inn > 9) {
			inn = inn / 10;
			last = inn;
		}
		return last;

	}

	public int quadrant(double d, double e) {
		if (d > 0) {
			if (e > 0) {
				return 1;
			} else {
				return 4;
			}
		} else {
			if (e > 0) {
				return 2;
			} else {
				return 3;
			}
		}
	}

	public int digitrange(int num) {
		int large, small;
		int rem;
		boolean first = true;
		large = small = 0;
		if (num < 0)
			num = -num;
		if (num < 10)
			return 1;
		while (num > 0) {
			rem = num % 10;
			if (first) {
				small = large = rem;
				first = false;
			}
			if (rem < small)
				small = rem;
			if (rem > large)
				large = rem;
			num = num / 10;
		}
		return large - small + 1;
	}

	public int range(int[] a, int b) {
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		return max - min + 1;
	}

	public void InterestRate() {
		double baseMoney = 1000000.;
		double rate = 0.04;
		double totalMoney = baseMoney;
		DecimalFormat myFormatter = new DecimalFormat("#,###,###¿ø");
		String output;
		for (int i = 0; i < 5; i++) {
			totalMoney = totalMoney + totalMoney * rate;
			output = myFormatter.format(totalMoney);
			System.out.println("Year " + (i + 1) + " Balance " + output);

		}
	}

	public boolean isSorted(int[] a) {
		boolean ch = true;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				ch = false;
				return ch;
			}
		}
		return ch;
	}

	public void percentEven(int[] a) {
		int pdnum = 0;
		double percent = 0;

		DecimalFormat pe = new DecimalFormat("##.0");
		String output;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				pdnum++;
			}
		}
		percent = (double) pdnum / a.length * 100.0;
		output = pe.format(percent);
		System.out.println(output);
	}

	public void printstar() {
		for (int i = 0; i < 4; i++) {
			System.out.println("*****");
		}
	}

	public void printnumbers() {
		for (int i = 0; i < 7; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
	}

	public void printnumbers2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
	}

	public void printnumbers3() {
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k <= 9; k++) {
				for (int i = k; i < k + 3; i++) {
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}

	public void print_andnum() {
		int count = 5;
		int num = 1;
		for (int i = 1; i < 10; i += 2) {
			for (int j = 0; j < count; j++) {
				System.out.print("-");
			}
			for (int k = 0; k < num; k++) {
				System.out.print(i);
			}
			for (int j = 0; j < count; j++) {
				System.out.print("-");
			}
			count--;
			num += 2;
			System.out.println();
		}
	}

	public void print_exp(int a) {
		for (int i = 0; i <= a; i++) {
			System.out.print((int) Math.pow(2.0, i) + " ");
		}
	}

	public String fractionSum(int n) {
		DecimalFormat df = new DecimalFormat("#.####");
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += (1.0 / i);
		}
		return df.format(sum);

	}

	public void printRange(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}

	public void randomX() {
		Random gen = new Random();
		while (true) {
			int x = gen.nextInt(12) + 5;
			if (x >= 16)
				break;
			else {
				for (int i = 0; i < x; i++) {
					System.out.print("x");
				}
				System.out.println();
			}
		}
	}

	public void randomWalk() {
		int x = 0;
		int move = 0;
		int tempmax = 0;
		Random gen = new Random();
		int max = 3;
		int min = -3;
		System.out.println("position=0");
		while (true) {
			move = gen.nextInt(2);
			if (move == 0) {
				x--;
			} else {
				x++;
			}
			if (x > tempmax) {
				tempmax = x;
			}
			System.out.println("position=" + x);
			if (x == max || x == min) {
				System.out.println("max position=" + tempmax);
				break;
			}
		}
	}

	public void lastigit(int a, int b) {
		if (a % 10 == b % 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public void missingChar(String str, int n) {

		for (int i = 0; i < str.length(); i++) {
			if (i != n) {
				System.out.print(str.charAt(i));
			}
		}

	}

	public boolean or35(int n) {
		if ((n % 3 == 0) || (n % 5 == 0)) {
			return true;
		} else
			return false;
	}

	public boolean nearHundred(int n) {
		return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));

	}

	public boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e')
				count++;
			// alternately: str.substring(i, i+1).equals("e")
		}
		if (count == 0) {
			return false;
		}
		return (count <= 3);

	}

	public void stringTimes(String str, int n) {
		System.out.print("\"");
		for (int i = 0; i < n; i++) {
			System.out.print(str);
		}
		System.out.print("\"");
	}

	public void frontTimes(String str, int n) {
		if (str.length() < 3) {
			System.out.print("\"");
			for (int i = 0; i < n; i++) {
				System.out.print(str);
			}
			System.out.print("\"");
		} else {
			String temp = "";
			System.out.print("\"");
			for (int i = 0; i < n; i++) {
				temp = temp + str.substring(0, 3);
			}
			System.out.print(temp);
			System.out.println("\"");
		}
	}

	public int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("xx"))
				count++;
		}
		return count;
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

	public boolean array123(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3) {
				return true;
			}
		}
		return false;
	}

	public String stringExplosion(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			temp = temp + str.substring(0, i + 1);
		}
		return temp;
	}

	public boolean noTriples(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
				return false;
			}
		}
		return true;
	}

	public String stringX(String str) {
		String temp = "";
		temp = temp + str.charAt(0);
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
				continue;
			} else {
				temp = temp + str.charAt(i);
			}
		}
		temp = temp + str.charAt(0);
		return temp;
	}

	public int array667(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 6 && arr[i + 1] == 6) {
				count++;
			}
			if (arr[i] == 6 && arr[i + 1] == 7) {
				count++;
			}

		}
		return count;
	}

	public void reverseNumbers(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}

	public boolean chpassword(String str) {
		if (str.length() < 8) {
			return false;
		}
		int numcount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(ch >= '0' && ch <= '9' || ch >= 'A' && ch <= 'z')) {
				return false;
			} else {
				if (ch >= '0' && ch <= '9') {
					numcount++;
				}
			}
		}
		if (numcount >= 2) {
			return true;
		} else
			return false;
	}

	public void toStringdemo() {
		char ch = '1';
		String str = Character.toString(ch);
		System.out.println(str);
	}

	public void createString() {
		char[] arr = { '1', '2', '3', '4' };
		String str = String.valueOf(arr, 0, 4);
		System.out.println(str);
	}

	public void equalstring() {
		String str1 = "java problems";
		String str2 = "java problem";
		String str3 = "java problems";

		if (str1.equals(str2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (str1.equals(str3)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public void compareString() {
		String str1 = "This is Java";
		String str2 = "This is C++";
		int result = str1.compareTo(str2);

		if (result < 0) {
			System.out.println("String 1 is less than String 2");
		} else if (result == 0) {
			System.out.println("String 1 is equal to String 2");
		} else // if (result > 0) {
			System.out.println("String 1 is greater than String 2");

	}

	public void concateString() {
		String str1 = "Java Problems and ";
		String str2 = "C++ Problems";
		String str3 = str1.concat(str2);
		System.out.println(str3);

	}

	public void containString() {
		String str1 = "Java Problems and C++ Problems";
		String str2 = "and";
		System.out.println(str1.contains(str2));
	}

	public void getindexchar() {

		String str = "Hello Java World!";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(11));

	}

	public int wordcount() {
		String str = "hello java!";
		int count = 0;
		if (str.length() == 0) {
			return 0;
		} else {
			count++;
		}
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	public void removeStringdup(String[] arr) {
		String[] array = new TreeSet<String>(Arrays.asList(arr)).toArray(new String[0]);
		for( int i=0;i<array.length;i++) {
			System.out.print(array[i]+" t");
		}
	}
	
	public void countwordandwordlen(String str) {
		for(int i=0;i<str.length();i++) {
			String temp="";
			
			while(i<str.length()&&str.charAt(i)!=' ') {
				temp=temp+str.charAt(i);
				i++;
			}
			if(temp.length()>0) {
				System.out.println(temp+":"+temp.length());
			}
		}
	}
}