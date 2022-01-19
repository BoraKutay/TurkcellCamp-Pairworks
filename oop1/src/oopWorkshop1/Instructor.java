package oopWorkshop1;

public class Instructor {

	private int id;
	private String name;
	private double point;
	
	private Course[] courses;
	
	public Instructor() {
		
		
	}
	
	public Instructor(int id, String name, double point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
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
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
	
	
}
