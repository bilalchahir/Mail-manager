package mailManager;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;

public class ApiMail {

	public static void sendMail(String recepient) {
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		String myAccountEmail= "";
		String password = "********";
		
		
	}
}
