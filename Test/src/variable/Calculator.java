package variable;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("� ������ �Ͻðڽ��ϱ�? 1.+  2.- 3.* 4./");
		String cal = sc.next();
		System.out.println("number 1 �� �Է��� �ּ���");
		int num1=sc.nextInt();
		System.out.println("number 2 �� �Է��� �ּ���");
		int num2=sc.nextInt();
		switch (cal) {
		case "1" : 
			System.out.println("����� " + num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case "2" :
			System.out.println("����� "  + num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case "3" :
			System.out.println("����� " + num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case "4" :
			System.out.println("����� " + num1 + " / " + num2 + " = " + (num1/num2));
			break;
			
		}
			
		
	}

}
