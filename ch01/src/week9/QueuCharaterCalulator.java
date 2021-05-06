package week9;

import java.util.Scanner;

public class QueuCharaterCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		CharacterQueue queue  = new CharacterQueue();

		while (true) {
			System.out.print("1. Insert, 2. Delete, 3. Print, 4. Exit ? ");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.print("문자 입력? ");
				char ch = sc.next().charAt(0);
				queue.Insert(ch);
			} else if (menu == 2) {
				char o=queue.Delete();
				System.out.println(o);
			} else if (menu == 3) {
				queue.print();
			} else if (menu == 4) {
				break;
			}
		}
		sc.close();
	}

}

class CharacterQueue {
	public static final int QUEUESIZE = 10;

	private char[] queue = new char[QUEUESIZE];
	int count = 0;

	public boolean Insert(char ch) {
		if (count == QUEUESIZE)
			return false;

		queue[count] = ch;
		count++;

		return true;
	}

	public char Delete() {
		char out=queue[0];
		for(int i=1;i<count;i++) {
			queue[i-1]=queue[i];
		}
		count--;
		
		return out;
		
	}

	public void print() {
		for (int i = 0; i < count; i++)
			System.out.println("[" + i + "]=" + queue[i]);
	}
}
