package variable;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("� ������ �Ͻðڽ��ϱ�? 1.+  2.- 3.* 4./");
		String cal = sc.next();
		System.out.println("number 1 �� �Է��� �ּ���");
		int num1=sc.nextInt();
		System.out.println("number 2 �� �Է��� �ּ���");
		int num2=sc.nextInt();
		
		if(cal.equals("+")) {
			System.out.println("����� " + num1 + " + " + num2 + " = " + (num1+num2));
		} else if (cal.equals("-")) {
			System.out.println("����� "  + num1 + " - " + num2 + " = " + (num1-num2));
		} else if (cal.equals("*")) {
			System.out.println("����� " + num1 + " * " + num2 + " = " + (num1*num2));
		} else if (cal.equals("/")) {
			System.out.println("����� " + num1 + " / " + num2 + " = " + (num1/(double)num2));
		}
		
		//System.out.println("??");
		
		/*switch (cal) {
		case "+" : 
			System.out.println("����� " + num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case "-" :
			System.out.println("����� "  + num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case "*" :
			System.out.println("����� " + num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case "/" :
			System.out.println("����� " + num1 + " / " + num2 + " = " + (num1/num2));
			break;
			
		}*/
			
		
	}

}
