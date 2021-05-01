
public class UserManager {
	
	public void SignUp(User user) {
		System.out.println("Kullanýcýnýn Adý : " + user.getFirstName());
		System.out.println("Kullanýcýnýn Soyadý : " + user.getLastName());
		System.out.println("Kullanýcýnýn Emaili : " + user.getEmail());
		System.out.println("Kullanýcýnýn Þifresi : " + user.getPassword());
		System.out.println("Kayýt Baþarýlý!");
		System.out.println("--------------------------");
	}
	
	public void SignIn(User user) {
		System.out.println("Kullanýcýnýn Adý : " + user.getFirstName());
		System.out.println("Kullanýcýnýn Soyadý : " + user.getLastName());
		System.out.println("Kullanýcýnýn Emaili : " + user.getEmail());
		System.out.println("Giriþ Baþarýlý!");
		System.out.println("--------------------------");
	}
}
