
public class courseManager {
	void joinCourse(Course course) {
		System.out.println("Kursa Kayýt Olundu : " + course.name);
	}
	
	void showCourseContent(Course course) {
		System.out.println("Kurs Ýçeriði Gösterildi : " + course.name + course.teacher);
	}
	
}
