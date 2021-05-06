package week9;

import java.util.Scanner;

public class CharacterStackCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		CharacterStack stack = new CharacterStack();

		while (true) {
			System.out.print("1. Push, 2. Pop, 3. Print, 4. Exit ? ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if (menu == 1) {
				System.out.print("문자 입력? ");
				char ch = sc.next().charAt(0);
				stack.Push(ch);
			} else if (menu == 2) {
				char ch = stack.Pop();
				if (ch != 0)
					System.out.println("문자 출력: " + ch);
			} else if (menu == 3) {
				stack.print();
			} else if (menu == 4) {
				break;
			}
		}
		sc.close();
	}
}

class CharacterStack {
	public static final int STACKSIZE = 10;

	private char[] stack = new char[STACKSIZE];
	int count = 0;

	public boolean Push(char ch) {
		if (count == STACKSIZE)
			return false;

		stack[count] = ch;
		count++;

		return true;
	}

	public char Pop() {
		if (count == 0)
			return 0;

		char ch = stack[count - 1];
		count--;

		return ch;
	}

	public void print() {
		for (int i = 0; i < count; i++)
			System.out.println("[" + i + "]=" + stack[i]);
	}
}