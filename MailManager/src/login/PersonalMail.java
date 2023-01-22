package login;

public class PersonalMail {
	String email;
	String pswrd;
	static int code=0;
	public PersonalMail(String email, String pswrd) {
		super();
		this.email = email;
		this.pswrd = pswrd;
		code++;
	}
	public PersonalMail() {
		super();
		this.email = "";
		this.pswrd = "";
		code++;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPswrd() {
		return pswrd;
	}
	public void setPswrd(String pswrd) {
		this.pswrd = pswrd;
	}
	public int getCode() {
		return code;
	}
	
}
