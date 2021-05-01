package homework;

public class InstructorManager extends UserManager {
	
	public void instructorList(Instructor instructor) {
		
		Instructor[] instructors = {instructor};
		
		for (Instructor e�itmen : instructors) {
			System.out.println("E�itmen ad�: " + e�itmen.getFirstName());
			System.out.println("E�itmen soyad�: " + e�itmen.getLastName());
			System.out.println("�leti�im: " + e�itmen.getEmail());
			System.out.println("Verdi�i kurslar: " + e�itmen.getCoursesOfInstructor());
		}

	}
	
	public void instructorAdd(Instructor instructor ) {
		System.out.println(instructor.getFirstName() +  instructor.getLastName() + " adl� e�itmen eklendi" );
	}
	
	public void instructorRemove(Instructor instructor ) {
		System.out.println(instructor.getFirstName() +  instructor.getLastName() + " adl� e�itmen silindi" );
	}
	
	
	public void coursesOfInstructorAdd(Instructor instructor ) {
		System.out.println(instructor.getCoursesOfInstructor() + " yeni kursunuz sat��a ��kar�ld�");
	}

}
