package exam03;

public class Contact {
	private String name;
	private String num;
	private String mail;
	
	
	public Contact(String name, String num, String mail) {
		this.name = name;
		this.num = num;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
