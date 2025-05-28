package simplephoneinfo;

import java.util.Scanner;

public class PhoneInfo {
	private String name, phoneNumber, birthday;
	private boolean tof;
	private int select;
	
	private Scanner input = new Scanner(System.in);
	
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
	public void inputPhoneNumber() {
		while(true) {
			System.out.println("선택하세요.\n1. 데이터 입력\n2. 프로그램종료");
			System.out.print("선택: ");
			select = input.nextInt();
			
			if(select == 1) {
				input.nextLine();
			
				System.out.print("\n이름: ");
				setName(input.nextLine());
									
				System.out.print("전화번호: ");
				setPhoneNumber(input.nextLine());
										
				System.out.print("생년원일: ");
				setBirthday(input.nextLine());
					
				if(birthday.equals("")) {
					tof = false;
				}
			
				System.out.println("\n입력된 정보 출력...");
				showPhoneInfo();
				System.out.println("\n");
			}else if(select == 2) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("\n1혹은 2를 입력하세요.");
				continue;
			}
		}
	}
}
