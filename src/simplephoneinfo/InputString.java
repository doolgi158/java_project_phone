package exam_input2;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		Scanner kinput = new Scanner(System.in);
		/* 요구사항
		 * 이름 나이 주소를 입력 받아
		 * 아래와 같이 출력
		 * 00님 안녕하세요! 00살이시네요.
		 * 주소는 모시깽 이네요.
		 */
		String name;
		String address;
		int age;
		
		System.out.println("이름을 입력 해주세요.");
		name = kinput.next();
		
		System.out.println("나이를 입력 해주세요.");
		age = kinput.nextInt();
		kinput.nextLine();
		
		/* 숫자 이후에 문자를 받을 때 공백(스페이스 혹은 엔터)을 입력하면
		 * 숫자 입력 받고 친 엔터 때문에 다음 문자는 이미 받은 것으로 처리된다.
		 * 그렇기 때문에 숫자 뒤에 문자를 받으려면 중간에 공백을 처리해줄
		 * 이름.nextLine()이 필요하다.
		 */
		
		System.out.println("주소를 입력 해주세요.");
		address = kinput.nextLine();
		
		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
		System.out.print("주소는 " + address + "이네요.");
		kinput.close();
	}

}
