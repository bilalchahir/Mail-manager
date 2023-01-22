package login;

import java.util.ArrayList;


public class Bdd {
	ArrayList<PersonalMail> listeMail = new ArrayList<>();

	public Bdd(ArrayList<PersonalMail> listeMail) {
		super();
		this.listeMail = listeMail;
	}

	public ArrayList<PersonalMail> getListeMail() {
		return listeMail;
	}

	public void setListeMail(ArrayList<PersonalMail> listeMail) {
		this.listeMail = listeMail;
	}
	public void addMail(PersonalMail e) {
		listeMail.add(e);
	}
	
	public void removeMail(PersonalMail e) {
		listeMail.remove(e);
	}
	public PersonalMail search(int code) {
		PersonalMail e = new PersonalMail();
		for (int i = 0; i < listeMail.size(); i++) {
			if((listeMail.get(i)).getCode() == code) {	
				e= listeMail.get(i);
			}
		}
		return e;
	}
	public void search(String email,String pswrd) {
		PersonalMail e = new PersonalMail();
		for (int i = 0; i < listeMail.size(); i++) {
			if((listeMail.get(i)).getEmail() == email) {	
				if (listeMail.get(i).getPswrd() == pswrd){
					e = listeMail.get(i);
					System.out.println("Login succed!");
				}
				else System.out.println("Password is wrong!");
			}
			else System.out.println("Email adress is wrong!");
		}
	}
}
