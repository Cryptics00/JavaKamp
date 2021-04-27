
public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Kurslar�m");
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "T�m Kurslar";
		System.out.println("--------------------");
		
		
		Category category3 = new Category();
		category3.id = 3;
		category3.name = "Kampa Haz�rl�k";
		System.out.println("--------------------");
		
		
		Category category4 = new Category();
		category4.id = 4;
		category4.name = "S�k Sorulan Sorular";
		System.out.println("---------------------");
		
		categoryManager Categorymanager = new categoryManager();
		Categorymanager.selectCategory(category1);
		System.out.println("--------------------------------");
		Categorymanager.selectCategory(category2);
		System.out.println("--------------------------------");
		Categorymanager.selectCategory(category3);
		System.out.println("--------------------------------");
		Categorymanager.selectCategory(category4);
		System.out.println("--------------------------------");
		
		Category[] categories = {category1, category2, category3, category4};
		
		for (Category category : categories) {
			System.out.println(category.id + " : " + category.name);
			System.out.println("------------------------------");
			
			
		}
		
		
		
		memberManager memberManager = new memberManager();
		
		Member member1 = new Member(1, "H�so", "Kumru");
		
		Member member2 = new Member();
		member2.id = 2;
		member2.name = "Semih";
		member2.surname = "�lbey";
		memberManager.signUp();
		
		Member[] members = {member1, member2};
		
		for (Member member : members) {
			System.out.println(member.name + member.surname);
		}
		
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�");
		
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)";
		course2.teacher = "Engin Demiro�";
		System.out.println("--------------------");
		
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlamaya Giri� ��in Temel Kurs";
		course3.teacher = "Engin Demiro�";
		System.out.println("--------------------");
		
		Course[] courses = {course1, course2, course3};
		courseManager CourseManager = new courseManager();
		
		for (Course course : courses) {
			System.out.println("\nKurs Ad� : " + course.name);
			System.out.println("Kurs E�itmeni : " + course.teacher);
		}
		
		System.out.println("-----------------------------");
		
		memberManager.login(member2);
		CourseManager.joinCourse(course2);
		CourseManager.showCourseContent(course2);
		
		
		
	}

}
