package homework;

public class Main {

	public static void main(String[] args) {
		
		User kisi = new User();
		
		kisi.setFirstName("Ahmet");
		kisi.setLastName("Tekin");
		
		UserManager userManager = new UserManager();
		
		userManager.add(kisi);
		
		Student student = new Student();
		student.setFirstName("Gürkan");
		student.setLastName("Mutlu");
		student.setEmail("info@gurkanmutlu.com");
		student.setjoinedCourse("C,Java");
		
		StudentManager studentManager = new StudentManager();
		studentManager.studentList(student);
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Fırat");
		instructor.setLastName("Can");
		instructor.setEmail("info@firatcan.com");
		instructor.setCoursesOfInstructor("Python,Java");
		
		System.out.println(" ");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.instructorList(instructor);
		
		
		
	
		
	

	}

}
