package homework;

public class StudentManager extends UserManager {
	
	public void studentList(Student student) {
		
		Student[] students = {student};
		
		for (Student ogrenci : students) {
			System.out.println("Öðrenci adý: " + ogrenci.getFirstName());
			System.out.println("Öðrenci soyadý: " + ogrenci.getLastName());
			System.out.println("Ýletiþim: " + ogrenci.getEmail());
			System.out.println("Aldýðý kurslar: " + ogrenci.getjoinedCourse());
		}

	}
	
	public void studentAdd(Student student ) {
		System.out.println(student.getFirstName() +  student.getLastName() + " adlý öðrenci eklendi" );
	}
	
	public void studentRemove(Student student ) {
		System.out.println(student.getFirstName() +  student.getLastName() + " adlý öðrenci silindi" );
	}
	
	public void joinedCourseAdd(Student student) {
		System.out.println(student.getjoinedCourse() + "adlý yeni kurs eklendi");
	}
	

}
