package week9;

import java.util.Scanner;

public class Matrix2x2Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Matrix m1 = new Matrix();
		Matrix m2 = new Matrix();

		int a, b, c, d;

		System.out.print("Matrix 1 입력? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		m1.set(a, b, c, d);

		System.out.print("Matrix 2 입력? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		m2.set(a, b, c, d);

		System.out.println("Matrix 1");
		m1.print();

		System.out.println("Matrix 2");
		m2.print();

		Matrix m3 = m1.Add(m2);
		System.out.println("Matrix 1 + Matrix 2");
		m3.print();

		Matrix m4 = m1.Sub(m2);
		System.out.println("Matrix 1 - Matrix 2");
		m4.print();

		Matrix m5 = m1.Mul(m2);
		System.out.println("Matrix 1 * Matrix 2");
		m5.print();

		sc.close();
	}

}

class Matrix {
	public int[][] mat = new int[2][2];

	public Matrix() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				mat[i][j] = 0;
			}
		}
	}

	public Matrix(int a, int b, int c, int d) {
		mat[0][0] = a;
		mat[0][1] = b;
		mat[1][0] = c;
		mat[1][1] = d;
	}

	public void print() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public int get(int i, int j) {
		return mat[i][j];
	}

	public void set(int i, int j, int n) {
		mat[i][j] = n;
	}

	public void set(int a, int b, int c, int d) {
		mat[0][0] = a;
		mat[0][1] = b;
		mat[1][0] = c;
		mat[1][1] = d;
	}

	public Matrix Add(Matrix iMat) {
		Matrix rMat = new Matrix();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				rMat.mat[i][j] = mat[i][j] + iMat.mat[i][j];
			}
		}

		return rMat;
	}

	public Matrix Sub(Matrix iMat) {
		Matrix rMat = new Matrix();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				// set 함수 사용 예
				rMat.set(i, j, mat[i][j] - iMat.get(i, j));
			}
		}
		return rMat;
	}

	Matrix Mul(Matrix iMat) {
		Matrix rMat = new Matrix();
		for (int i = 0; i < iMat.mat.length; i++) {
			for (int j = 0; j < iMat.mat[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < 2; k++) {
					rMat.mat[i][j] += sum + mat[i][k] * iMat.mat[k][j];
				}
				
			}
		}
		return rMat;
	}
}