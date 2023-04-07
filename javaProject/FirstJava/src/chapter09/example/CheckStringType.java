package chapter09.example;

import java.util.Scanner;

public class CheckStringType {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.println("이름을 입력하세요 >> ");
		name = input.nextLine();
		
		if(name.contains(" ")) {
			System.out.println("공백 X");
		}
		else if(name.matches(".*[^a-zA-Z].*")) {
			System.out.println("문자열만 입력하세용");
		}
		else {
			System.out.println("hello " + name);
		}
		
	}

}
