
public class InstructorManager {
	public void certificate(Instructor instructor) {
		
	}
	
	public void instructorsCourses(Instructor instructor) {

	}

	
	public void addInstructor(Instructor instructor) {
		System.out.println("E�itmen Ad� : " + instructor.getFirstName());
		System.out.println("E�itmen Soyad� : " + instructor.getLastName());
		System.out.println("E�itmenin Sertifikalar� : " + instructor.getCertificate());
		System.out.println("E�itmenin Verdi�i Kurslar : " + instructor.getInstructorsCourses());
	}
}