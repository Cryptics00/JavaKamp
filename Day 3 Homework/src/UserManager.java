
public class UserManager {
	
	public void SignUp(User user) {
		System.out.println("Kullan�c�n�n Ad� : " + user.getFirstName());
		System.out.println("Kullan�c�n�n Soyad� : " + user.getLastName());
		System.out.println("Kullan�c�n�n Emaili : " + user.getEmail());
		System.out.println("Kullan�c�n�n �ifresi : " + user.getPassword());
		System.out.println("Kay�t Ba�ar�l�!");
		System.out.println("--------------------------");
	}
	
	public void SignIn(User user) {
		System.out.println("Kullan�c�n�n Ad� : " + user.getFirstName());
		System.out.println("Kullan�c�n�n Soyad� : " + user.getLastName());
		System.out.println("Kullan�c�n�n Emaili : " + user.getEmail());
		System.out.println("Giri� Ba�ar�l�!");
		System.out.println("--------------------------");
	}
}
