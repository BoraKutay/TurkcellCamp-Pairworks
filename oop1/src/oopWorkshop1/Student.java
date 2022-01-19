package oopWorkshop1;

public class Student {
	
	private int id;
	private String name;
	
	private Course[] enrolledCourses;
	
	
	public Student() {
		
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course[] getEnrolledCourses() {
		return enrolledCourses;
	}
	public void setEnrolledCourses(Course[] enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	
}
