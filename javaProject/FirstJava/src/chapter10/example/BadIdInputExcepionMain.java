package chapter10.example;

import java.util.Scanner;

public class BadIdInputExcepionMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요 >> ");
		String id = input.nextLine();
		
		try {
			if(id.contains(" ") || id.matches(".*[^a-zA-Z0-9].*")) {
				BadIdInputException e = new BadIdInputException();
				throw e;
			}
		}
		catch (BadIdInputException e) {
			e.printStackTrace();
		}
		

	}

}
