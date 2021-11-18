package api.lang.string;

import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요: ");
		String ssn = sc.next();
		
		//921013-1234567
		System.out.println("앞자리: " + ssn.substring(0, 6));
		System.out.println("뒷자리: " + ssn.substring(7));
		
		//정수로 이루어진 문자열을 실제 정수로 변환하는 메서드.
		//int 변수 = Integer.parseInt(문자열 or 문자열이 들어있는 변수)
		//반드시 순수한 정수로만 이루어진 문자열을 정수로 변환가능하다.
		
//		int front = Integer.parseInt(ssn.substring(0, 6));
//		System.out.println(front + 1);
		
		int year = Integer.parseInt(ssn.substring(0, 2));
		int month = Integer.parseInt(ssn.substring(2, 4));
		int day = Integer.parseInt(ssn.substring(4, 6));
		char stan = ssn.charAt(7);
		
		String gender;
		
		if(stan == '1' || stan == '3') {
			gender = "남자";
		}
		else {
			gender = "여자";
		}
		
		int birthYear = 0;
		if(stan == '1' || stan == '2') {
			birthYear = 1900 + year;
		}
		else {
			birthYear = 2000 + year;
		}
		
		int age = 2020 - birthYear + 1;
		
		System.out.printf("%d년 %d월 %d일 %d세 %s", birthYear, month, day, age, gender);
		
		sc.close();
		
		/*
		int year, month, day, age;
		String gender;
		
		//2000년생 이후 주민번호 뒷자리 첫 글자 남자는 3, 여자는 4
		char front = ssn.charAt(7);
		if(front == '1' || front == '2') {
			year = 1900 + Integer.parseInt(ssn.substring(0,2));
		}
		else {
			year = 2000+ Integer.parseInt(ssn.substring(0,2));
		}
		
		month = Integer.parseInt(ssn.substring(2,4));
		day = Integer.parseInt(ssn.substring(4,6));
		age = 2020 - year + 1;
		
		if(front == '1' || front == '3') {
			gender = "남자";
		}
		else {
			gender = "여자";
		}
		
		System.out.printf("%d년 %d월 %d일 %d세 %s", year, month, day, age, gender);
		sc.close();
		 */
	}

}
