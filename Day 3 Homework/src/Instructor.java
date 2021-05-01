
public class Instructor extends User{
	int id;
	String firstName;
	String lastName;
	String certificate;
	String instructorsCourses;
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName, String certificate, String instructorsCourses) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.certificate = certificate;
		this.instructorsCourses = instructorsCourses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getInstructorsCourses() {
		return instructorsCourses;
	}

	public void setInstructorsCourses(String instructorsCourses) {
		this.instructorsCourses = instructorsCourses;
	}
	

	
	
}
