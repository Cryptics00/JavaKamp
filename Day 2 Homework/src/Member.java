
public class Member {
	
	Member() {
		System.out.println("�ye Eklendi.");
	}
	
	Member(int id, String name, String surname) {
		this();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	int id;
	String name;
	String surname;
}