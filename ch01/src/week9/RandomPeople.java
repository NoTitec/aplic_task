package week9;
import java.util.Random;
import java.util.Scanner; 
public class RandomPeople {
	private static final int MAX_PEOPLE = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p_List = new Person[MAX_PEOPLE];
		Random rng = new Random();//util Random클래스
		
		for (int i = 0; i < p_List.length; i++) {
		    boolean student = rng.nextBoolean();
		    if (student) {	// student
				String name, address;
				int num_course;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("<< 학생 >>");
				
				System.out.print("성명: ");
				name = sc.nextLine();
				
				System.out.print("주소: ");
				address = sc.nextLine();
				
				System.out.print("수강과목 수: ");
				num_course = sc.nextInt();
				sc.nextLine();
                		// nextInt()가 버퍼에서 엔터를 가져오지 않기 때문에 사용
				
				Students st = new Students(name, address);
				
				for (int j = 0; j < num_course; j++) {
					int score = rng.nextInt(101);
                                    	// 0 ~ 100 사이의 점수 생성
					st.addCourseGrade(score);
				}	
		        p_List[i] = st;
		    } 
		    else {		// teacher
				String name, address;
				int num_course;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("<< 선생님 >>");
				
				System.out.print("성명: ");
				name = sc.nextLine();
				
				System.out.print("주소: ");
				address = sc.nextLine();
				
				System.out.print("강의과목 수: ");
				num_course = sc.nextInt();
				sc.nextLine();
              			// nextInt()가 버퍼에서 엔터를 가져오지 않기 때문에 사용
				
				Teacher te = new Teacher(name, address);
				
				for (int j = 0; j < num_course; j++) {
					System.out.print((j+1) + "번째 교과목 입력: ");
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