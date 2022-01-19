package oopWorkshop1;


//oopWorkshop1 proje oluþtur 4 tane nesnesi olan kurslar, kategoriler, eðitmenler  var 
//bir kursun birden fazla eðitmeni olabilir
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(1,"Bora");
		Student student2 = new Student(2,"Burak");
		
		
		Category category = new Category(1,"Donaným");
		Category category2 = new Category(2,"Yazýlým");
		
		Instructor instructor = new Instructor(1,"Can",4.5);
		Instructor instructor2 = new Instructor(2,"Kutay",3.5);
		
		//int id, String name, int numberOfLectures, String image
		Course course = new Course(1,16.5,"Electronics", 15,"image1.png");
		course.setCategory(category);
		course.setInstructors(new Instructor[] {instructor});
		course.setStudents(new Student[] {student,student2});
		
		
		Course course2 = new Course(2,18,"Java", 17,"image1.png");
		course2.setCategory(category2);
		course2.setInstructors(new Instructor[] {instructor,instructor2});
		course2.setStudents(new Student[] {student,student2});
		
		
		Course[] courses = {course, course2 };
		Instructor[] instructors = {instructor, instructor2};
		
		for (Course course_ : courses) {
			System.out.println(course_.getName());
			System.out.println(course_.getNumberOfLectures());
		}
		
		System.out.println("Instructors");
		for (Instructor instructor_: instructors) {
			System.out.println(instructor_.getName());
			
		}
		
		
	}

}
