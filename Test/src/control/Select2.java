package control;

import java.util.Scanner;

public class Select2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �� �� �ΰ���?");
		int grade = sc.nextInt();
		if(grade < 70 ) {
			System.out.println("F");
		}
		
		if(grade >= 70 && grade < 80 ) {
			System.out.println("C");
		}
		if(grade >= 80 && grade < 90) {
			System.out.println("B");
		}  
		if(grade >= 90) {
			System.out.println("A");
		} 
		
		
		
	
	}

}
