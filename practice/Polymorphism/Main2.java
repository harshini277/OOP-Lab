class Notifier {
	public void send(String message) {
		System.out.println("General: " + message);
	}

	protected void send(String message, String email) {
		System.out.println("Email to " + email + ", Message:  " + message);
	}

	void send(String message, int phone) {
		System.out.println("SMS sent to " + phone + ": " + message);
	}
	private void send(String message, String email, int phone){
		System.out.println("SMS sent to " + phone + ": " + message);
		System.out.println("Email to " + email + ", Message:  " + message);

	}
	public void allSend(String message, String email, int phone){
		send(message,email,phone);
	}
	
	
}

class AppNotifier extends Notifier {
	public void alerts() {
		send("Message");				 
		send("Message", "hello@gmail.com"); 
		send("Message", 987654321);
		allSend("All notifs","hello@gmail.com",987654321);	  
	}
}

public class Main2 {
	public static void main(String[] args) {
		AppNotifier app = new AppNotifier();
		app.alerts();
	}
}