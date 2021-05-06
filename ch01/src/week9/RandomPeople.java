package week9;
import java.util.Random;
import java.util.Scanner; 
public class RandomPeople {
	private static final int MAX_PEOPLE = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p_List = new Person[MAX_PEOPLE];
		Random rng = new Random();//util RandomŬ����
		
		for (int i = 0; i < p_List.length; i++) {
		    boolean student = rng.nextBoolean();
		    if (student) {	// student
				String name, address;
				int num_course;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("<< �л� >>");
				
				System.out.print("����: ");
				name = sc.nextLine();
				
				System.out.print("�ּ�: ");
				address = sc.nextLine();
				
				System.out.print("�������� ��: ");
				num_course = sc.nextInt();
				sc.nextLine();
                		// nextInt()�� ���ۿ��� ���͸� �������� �ʱ� ������ ���
				
				Students st = new Students(name, address);
				
				for (int j = 0; j < num_course; j++) {
					int score = rng.nextInt(101);
                                    	// 0 ~ 100 ������ ���� ����
					st.addCourseGrade(score);
				}	
		        p_List[i] = st;
		    } 
		    else {		// teacher
				String name, address;
				int num_course;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("<< ������ >>");
				
				System.out.print("����: ");
				name = sc.nextLine();
				
				System.out.print("�ּ�: ");
				address = sc.nextLine();
				
				System.out.print("���ǰ��� ��: ");
				num_course = sc.nextInt();
				sc.nextLine();
              			// nextInt()�� ���ۿ��� ���͸� �������� �ʱ� ������ ���
				
				Teacher te = new Teacher(name, address);
				
				for (int j = 0; j < num_course; j++) {
					System.out.print((j+1) + "��° ������ �Է�: ");
					String subject = sc.nextLine();
					te.addCourse(subject);
				}	
		        p_List[i] = te;
		    }
		}
		for (Person tmp: p_List)
			tmp.showInfo();
	}	
	

}

class Person {
	private String name;
	private String address;
	   
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}	   
	public void showInfo() {
		System.out.println("   Name: " + name + ", Address: " + address);
	}
	public String toString() {
		return name + " (" + address + ")";
	}
}

class Students extends Person {
	private int numCourses;   // number of courses taken
	private int[] grades;
	private static final int MAX_COURSES = 5;
                                 // maximum number of courses

	public Students(String name, String address) {
		super(name, address);
		numCourses = 0;
		grades = new int[MAX_COURSES];
	}
	@Override
	public void showInfo() {
		System.out.println("Student");
		super.showInfo();
		System.out.println("   Average Grade: " + getAverageGrade());
	}
	public void addCourseGrade(int grade) {
		grades[numCourses] = grade;
		++numCourses;
	}
	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++ )
			sum += grades[i];
		
		return (double)sum/numCourses;
	}
}

class Teacher extends Person {
	private int numCourses;   // number of courses taught
	private String[] courses; // course codes
	private static final int MAX_COURSES = 5; // maximum courses
	   
	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
	}
	@Override
	public void showInfo() {
		System.out.println("Teacher");
		super.showInfo();
		System.out.print("   Courses: ");
		for (int i = 0; i < numCourses; i++)
			System.out.print(courses[i] + " " );

		System.out.println();
	}	
	public boolean addCourse(String course) {
		if(numCourses >= MAX_COURSES) return false;
		
		courses[numCourses] = course;
		numCourses++;
		return true;
	}	
}