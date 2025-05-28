package simplephoneinfo;

import java.util.Scanner;

public class PhoneBookVer02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		String tof;
		
		PhoneInfo info = new PhoneInfo();
		
		while(true){
			System.out.println("선택하세요.\n1. 데이터 입력\n2. 프로그램종료");
			System.out.print("선택: ");
			select = input.nextInt();
			
			if(select == 1) {
				input.nextLine();
				
				System.out.print("이름: ");
				info.setName(input.nextLine());
												
				System.out.print("전화번호: ");
				info.setPhoneNumber(input.nextLine());
												
				System.out.print("생년원일: ");
				info.setBirthday(input.nextLine());
				tof = info.getBirthday();
				
				if(tof.equals("")) {
					info.tof = false;
				}
				
				System.out.println("\n입력된 정보 출력...");
				info.showPhoneInfo();
				System.out.println("\n");
												
			}else if(select == 2) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}else{
				System.out.println("\n1혹은 2를 입력하세요.");
				continue;
			}
		}
		input.close();
	}
}
