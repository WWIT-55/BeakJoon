package If;

import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
		//�Է��ϱ� ���ؼ� ��ĳ�� Ŭ������ ����
		Scanner sc = new Scanner(System.in);
		//int = �������� �Է����ִ� �޼ҵ�
		int A = sc.nextInt();
		int B = sc.nextInt();
		//�ݾ� �ش�
		sc.close();
		//�ݺ��� ���� if���� ���ش�.
		//���࿡ A�� B���� ũ�� >���
		if (A > B) {
			System.out.println(">");
		}
		//���࿡ A�� B���� ������ < ���
		else if (A < B) {
			System.out.println("<");}
		//���࿡ A�� B�� ������ == ���
		else {
			System.out.println("==");
		}

	}

}
