package If;

import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
		//입력하기 위해서 스캐너 클래스를 써줌
		Scanner sc = new Scanner(System.in);
		//int = 정수값을 입력해주는 메소드
		int A = sc.nextInt();
		int B = sc.nextInt();
		//닫아 준다
		sc.close();
		//반복을 위해 if문을 써준다.
		//만약에 A가 B보다 크면 >출력
		if (A > B) {
			System.out.println(">");
		}
		//만약에 A가 B보다 작으면 < 출력
		else if (A < B) {
			System.out.println("<");}
		//만약에 A와 B가 같으면 == 출력
		else {
			System.out.println("==");
		}

	}

}
