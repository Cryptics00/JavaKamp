
public class StudentManager{
	public void addStudent(Student student) {
		System.out.println("��rencinin Ad� : " + student.getFirstName());
		System.out.println("��rencinin Soyad� : " + student.getLastName());
		System.out.println("��renci Kurs Tamamlama Oran� : " + student.getCourseCompletionRate());
		System.out.println("--------------------------");
	}
	
	public void courseCompletionRate(Student student) {
		System.out.println("��rencinin Kurs Tamamlama Oran� : " + student.getCourseCompletionRate());
	}
}
