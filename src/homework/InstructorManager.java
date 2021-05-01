package homework;

public class InstructorManager extends UserManager {
	
	public void instructorList(Instructor instructor) {
		
		Instructor[] instructors = {instructor};
		
		for (Instructor eðitmen : instructors) {
			System.out.println("Eðitmen adý: " + eðitmen.getFirstName());
			System.out.println("Eðitmen soyadý: " + eðitmen.getLastName());
			System.out.println("Ýletiþim: " + eðitmen.getEmail());
			System.out.println("Verdiði kurslar: " + eðitmen.getCoursesOfInstructor());
		}

	}
	
	public void instructorAdd(Instructor instructor ) {
		System.out.println(instructor.getFirstName() +  instructor.getLastName() + " adlý eðitmen eklendi" );
	}
	
	public void instructorRemove(Instructor instructor ) {
		System.out.println(instructor.getFirstName() +  instructor.getLastName() + " adlý eðitmen silindi" );
	}
	
	
	public void coursesOfInstructorAdd(Instructor instructor ) {
		System.out.println(instructor.getCoursesOfInstructor() + " yeni kursunuz satýþa çýkarýldý");
	}

}
