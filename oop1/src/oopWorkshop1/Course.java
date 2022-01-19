package oopWorkshop1;

public class Course {

	private int id;
	private String name;
	private double price;
	private int numberOfLectures;
	private String image;
	
	private Instructor[] instructors;
	private Student[] students;
	private Category category;


	public Course() {
		
		
	}
	
	public Course(int id, double price, String name, int numberOfLectures, String image) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.numberOfLectures = numberOfLectures;
		this.image = image;
	}
	
	
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Instructor[] getInstructors() {
		return instructors;
	}

	public void setInstructors(Instructor[] instructors) {
		this.instructors = instructors;
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
	public int getNumberOfLectures() {
		return numberOfLectures;
	}
	public void setNumberOfLectures(int numberOfLectures) {
		this.numberOfLectures = numberOfLectures;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
