
interface Authentication {
	public boolean authenticateUser(String username, String password);
}

public class Exercise3 {
	public static void main(String[] args) {
		String username = "diparna";
		String password = "biswas";

		Authentication auth = (user, pwd) -> {
			if (user.equals(username) && pwd.equals(password)) {
				return true;
			} else
				return false;
		};
		System.out.println(auth.authenticateUser("diparna", "bisas"));

	}
}
