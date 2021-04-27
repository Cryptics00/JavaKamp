
public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Kurslarým");
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Tüm Kurslar";
		System.out.println("--------------------");
		
		
		Category category3 = new Category();
		category3.id = 3;
		category3.name = "Kampa Hazýrlýk";
		System.out.println("--------------------");
		
		
		Category category4 = new Category();
		category4.id = 4;
		category4.name = "Sýk Sorulan Sorular";
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
		
		Member member1 = new Member(1, "Hüso", "Kumru");
		
		Member member2 = new Member();
		member2.id = 2;
		member2.name = "Semih";
		member2.surname = "Ýlbey";
		memberManager.signUp();
		
		Member[] members = {member1, member2};
		
		for (Member member : members) {
			System.out.println(member.name + member.surname);
		}
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð");
		
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		course2.teacher = "Engin Demiroð";
		System.out.println("--------------------");
		
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlamaya Giriþ Ýçin Temel Kurs";
		course3.teacher = "Engin Demiroð";
		System.out.println("--------------------");
		
		Course[] courses = {course1, course2, course3};
		courseManager CourseManager = new courseManager();
		
		for (Course course : courses) {
			System.out.println("\nKurs Adý : " + course.name);
			System.out.println("Kurs Eðitmeni : " + course.teacher);
		}
		
		System.out.println("-----------------------------");
		
		memberManager.login(member2);
		CourseManager.joinCourse(course2);
		CourseManager.showCourseContent(course2);
		
		
		
	}

}
