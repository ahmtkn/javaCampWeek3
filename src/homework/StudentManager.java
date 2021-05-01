package homework;

public class StudentManager extends UserManager {
	
	public void studentList(Student student) {
		
		Student[] students = {student};
		
		for (Student ogrenci : students) {
			System.out.println("��renci ad�: " + ogrenci.getFirstName());
			System.out.println("��renci soyad�: " + ogrenci.getLastName());
			System.out.println("�leti�im: " + ogrenci.getEmail());
			System.out.println("Ald��� kurslar: " + ogrenci.getjoinedCourse());
		}

	}
	
	public void studentAdd(Student student ) {
		System.out.println(student.getFirstName() +  student.getLastName() + " adl� ��renci eklendi" );
	}
	
	public void studentRemove(Student student ) {
		System.out.println(student.getFirstName() +  student.getLastName() + " adl� ��renci silindi" );
	}
	
	public void joinedCourseAdd(Student student) {
		System.out.println(student.getjoinedCourse() + "adl� yeni kurs eklendi");
	}
	

}
