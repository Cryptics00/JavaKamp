
public class Main {

	public static void main(String[] args) {
		
		User Enes = new User(1, "Enes", "Arslan", "asdasdasdqweqwe@gmail.com", "31231242363asdqw4223");
		
		
		Student Enes2 = new Student(1, "Enes", "Arslan", "asdasdasdqweqwe@gmail.com", 55);
		
		
		Instructor Engin = new Instructor(1, "Engin", "Demiroð", "MCT PMP ITIL", "C# + ANGULAR, JAVA + REACT");
		
		
		
		
		UserManager UserManager = new UserManager();
		UserManager.SignUp(Enes);
		UserManager.SignIn(Enes2);
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.addStudent(Enes2);
		
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.addInstructor(Engin);
	}

}
