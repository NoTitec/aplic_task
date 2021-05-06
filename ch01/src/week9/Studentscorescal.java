package week9;

import java.util.Scanner;

public class Studentscorescal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		StudentList sl = new StudentList();
		/*for (int i = 0; i < 10; i++) {
			sl.list[i] = new Student();
		}*/
		int count = 0;
		while (true) {
			System.out.print("이름입력 ? ");

			String str = sc.nextLine();

			if (str.equals("종료")) {
				sl.Print(count);
				break;

			} else {
				Student in = new Student();
				in.Insert(str);
				sl.list[count] = in;
				count++;
			}
		}
		sc.close();
	}

}

class Student {
	Scanner sc = new Scanner(System.in);

	public String sname = " ";
	public int rscore = 0;
	public int escore = 0;
	public int mscore = 0;
	public double avg = 0.0;
	public String grade = " ";

	public void Insert(String a) {
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		this.sname = a;
		this.rscore = b;
		this.escore = c;
		this.mscore = d;
		this.avg = (b + c + d) / 3;
		if (this.avg >= 90) {
			this.grade = "A";
		} else if (this.avg >= 80) {
			this.grade = "B";
		} else if (this.avg >= 70) {
			this.grade = "C";
		} else if (this.avg >= 60) {
			this.grade = "D";
		} else {
			this.grade = "F";
		}
	}
}

class StudentList {
	public static final int QUEUESIZE = 10;

	Student[] list = new Student[QUEUESIZE];

	public void Print(int a) {
		for (int i = 0; i < a; i++) {
			System.out.print(list[i].sname + "\t");
			System.out.print(list[i].rscore + "\t");
			System.out.print(list[i].escore + "\t");
			System.out.print(list[i].mscore + "\t");
			System.out.print(list[i].avg + "\t");
			System.out.println(list[i].grade);
		}
	}
}