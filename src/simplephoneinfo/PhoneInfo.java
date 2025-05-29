package simplephoneinfo;

public class PhoneInfo {
	private String name, phoneNumber, birthday;
	public boolean tof;
		
	public PhoneInfo() {
		
	}
	public PhoneInfo(String name) {
		this.name = name;
	}
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		tof = true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
		tof = true;
	}
	public void showPhoneInfo() {
		if(tof) {
			System.out.printf("name: %s\nphone: %s\nbirth: %s", name, phoneNumber, birthday);
			tof = false;
		}else {
			System.out.printf("name: %s\nphone: %s", name, phoneNumber);
		}
	}
}
