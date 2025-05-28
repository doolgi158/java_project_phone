package simplephoneinfo;

public class PhoneBookVer01 {

	public static void main(String[] args) {
		PhoneInfo info1 = new PhoneInfo("임미경", "010-2345-6573", "1965.03.28");
		
		info1.showPhoneInfo();
		System.out.println("\n");
		
		PhoneInfo info2 = new PhoneInfo();
		
		info2.setName("김현수");
		info2.setPhoneNumber("010-6435-1249");
		info2.showPhoneInfo();
	}

}
