package simplephoneinfo;

import java.util.Scanner;

public class PhoneBookVer02 {
	
	public static Scanner input = new Scanner(System.in);

	public static void menu() {
		System.out.println("선택하세요.\n1. 데이터 입력\n2. 프로그램종료");
		System.out.print("선택: ");
	}
	
	public static void inputData() {
		String name, phoneNumber, birthday;
				
		System.out.print("\n이름: ");
		name = input.nextLine();
							
		System.out.print("전화번호: ");
		phoneNumber = input.nextLine();
								
		System.out.print("생년원일: ");
		birthday = input.nextLine();
		
		PhoneInfo info = new PhoneInfo(name, phoneNumber, birthday);
		
		if(birthday.equals("")) {
			info.tof = false;
		}
			
		System.out.println("\n입력된 정보 출력...");
		info.showPhoneInfo();
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		int select;
		
		while(true) {
			menu();
			select = input.nextInt();
			input.nextLine();
			
			switch(select) {
			case 1 :
				inputData();
				break;
			case 2 :
				System.out.print("프로그램을 종료합니다.");
				return;
			}
		}
		
	}
}
