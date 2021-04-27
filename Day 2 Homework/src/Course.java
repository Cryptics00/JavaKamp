
public class Course {
	Course() {
		System.out.println("Kurs Eklendi!");
	}
	
	Course(int id, String name, String teacher) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
	}


int id;
String name;
String teacher;

}