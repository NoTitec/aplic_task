package week6;

import java.util.Scanner;

public class Basic_pgmming_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("select menu number");
		int num = sc.nextInt();
		methods6 f = new methods6();
		switch (num) {
		case 1:
			f.print10thnum();
			break;
		case 3:
			f.n10to2string();
			break;
		case 5:
			f.numjUnique(18, 3, 4);
			f.numjUnique(6, 7, 6);
			break;
		case 7:
			int[] arr = { 74, 85, 102, 99, 101, 85, 56 };
			f.lastindexOf(arr, 85);
			break;
		case 9:
			f.printwhatyear();
			break;
		case 11:
			int[] arr2 = { 14, 1, 22, 17, 36, 7, -43, 5 };
			f.countInRange(arr2, 4, 17);
			break;
		case 13:
			int[] marr = { 27, 15, 15, 11, 27 };
			f.mod(marr);
			break;
		case 15:
			f.print_sqrt();
			break;
		case 17:
			f.print_stars();
			break;
		case 19:
			f.print_space_and_num();
			break;
		case 21:
			f.print_bar_and_num();
			break;
		case 23:
			f.print_nn();
			break;
		case 25:
			int n=sc.nextInt();
			f.printNumbers(n);
			break;
		case 27:
			int s=sc.nextInt();
			int h=sc.nextInt();
			f.printSquare(s, h);
		}
		sc.close();
	}

}

class methods6 {
	Scanner sc = new Scanner(System.in);

	public void print10thnum() {
		int num = sc.nextInt();
		int result = (num % 100) / 10;

		System.out.println(result);
	}

	public void n10to2string() {
		int c = sc.nextInt();
		String num2 = Integer.toBinaryString(c);
		System.out.println(num2);
	}

	public void numjUnique(int n1, int n2, int n3) {
		int count = 0;
		int[] a = { n1, n2, n3 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != a[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public void lastindexOf(int[] a, int fnum) {
		int mequlindex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == fnum) {
				mequlindex = i;
			}
		}
		System.out.println(mequlindex);
	}

	public void printwhatyear() {
		int year = 2018;
		if (year % 4 == 0)
			if (year % 400 == 0)
				System.out.println(year + " is Leap Year");

			else if (year % 100 == 0)
				System.out.println(year + " is Not Leap Year");

			else
				System.out.println(year + " is Leap Year");

		else
			System.out.println(year + " is Not Leap Year");
	}

	public void countInRange(int[] a, int min, int max) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= min && a[i] <= max) {
				count++;
			}
		}
		System.out.println(count);
	}

	public void mod(int[] a) {
		int check[] = new int[a.length];// 빈도수저장배열생성
		for (int i = 0; i < a.length; i++) {// 빈도수0으로초기화
			check[i] = 0;

		}
		int maxidx = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {// 같은수있으면그위치빈도수배열값증가
					check[i]++;

					if (check[maxidx] < check[i]) {// 최빈값 위치찾기
						maxidx = i;
					}
				}
			}
		}
		if (check[maxidx] == 0) {// 초기인 0이면아무것도 없는것
			System.out.println("없다.");
			return;
		}
		int minval = 0;

		for (int i = 0; i < check.length; i++) {//
			if (check[i] == check[maxidx]) {
				minval = a[i];
			}
		}
		for (int i = check.length - 1; i >= 0; i--) {
			if (check[i] == check[maxidx]) {
				if (a[i] < minval) {
					minval = a[i];
				}
			}
		}
		System.out.println(minval);
		System.out.printf("\n");

	}
	public void print_sqrt() {
		
		for(int i=1;i<=10;i++)
		{
			int sqrval=0;
			for(int j=0;j<i;j++) {
				
				sqrval=sqrval+i;
			}
			System.out.print(sqrval+" ");
		}
	}
	public void print_stars() {
		int i;
		for(i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=1;k<i-1;k++) {
			System.out.print("*");
		}
	}
	public void print_space_and_num() {
		int spacecount;
		int num=1;
		for(spacecount=4;spacecount>=0;spacecount--) {
			for(int j=spacecount;j>0;j--) {
				System.out.print(" ");
			}
			System.out.println(num);
			num++;
		}
	}
	public void print_bar_and_num() {
		for(int i=0;i<=5;i++) {
			System.out.print("|       ");
		}
		System.out.println();
		for(int j=0;j<=5;j++) {
			for(int k=1;k<=9;k++) {
				System.out.print(k);
			}
			System.out.print("0");
		}
	}
	public void print_nn() {
		for(int i=0;i<5;i++) {
			for(int k=9;k>=0;k--) {
				for(int j=0;j<5;j++) {
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}
	public void printNumbers(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print("["+i+"]");
		}
	}
	public void printSquare(int s, int h) {
		 int i,j,k;
		    for(i=s;i<=h;i++) {
		        for(j=i;j<=h;j++) {
		            System.out.print(j);
		        }
		        for(k=s;k<i;k++){
		            System.out.print(k);
		        }
		        System.out.println();
		    }
	}
}