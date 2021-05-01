
public class StudentManager{
	public void addStudent(Student student) {
		System.out.println("Öðrencinin Adý : " + student.getFirstName());
		System.out.println("Öðrencinin Soyadý : " + student.getLastName());
		System.out.println("Öðrenci Kurs Tamamlama Oraný : " + student.getCourseCompletionRate());
		System.out.println("--------------------------");
	}
	
	public void courseCompletionRate(Student student) {
		System.out.println("Öðrencinin Kurs Tamamlama Oraný : " + student.getCourseCompletionRate());
	}
}
