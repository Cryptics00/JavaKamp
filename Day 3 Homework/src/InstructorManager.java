
public class InstructorManager {
	public void certificate(Instructor instructor) {
		
	}
	
	public void instructorsCourses(Instructor instructor) {

	}

	
	public void addInstructor(Instructor instructor) {
		System.out.println("Eðitmen Adý : " + instructor.getFirstName());
		System.out.println("Eðitmen Soyadý : " + instructor.getLastName());
		System.out.println("Eðitmenin Sertifikalarý : " + instructor.getCertificate());
		System.out.println("Eðitmenin Verdiði Kurslar : " + instructor.getInstructorsCourses());
	}
}