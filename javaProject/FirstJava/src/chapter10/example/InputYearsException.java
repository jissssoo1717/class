package chapter10.example;

import java.util.Scanner;

public class InputYearsException {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("태어난 년도를 입력해주세요. >> ");
			int year = input.nextInt();
			System.out.println((2023 - year + 1) + "살 입니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
