package control;

import java.util.Scanner;

public class Select3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �� �� �ΰ���?");
		int grade = sc.nextInt();
		
		switch (grade) {
		case 90 :
			System.out.println("A");
			break;
		case 80 :
			System.out.println("B");
			break;
		case 70 :
			System.out.println("C");
			break;
		default :
			System.out.println("F");
		
		
		}

	}

}
