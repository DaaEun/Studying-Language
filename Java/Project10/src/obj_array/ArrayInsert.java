package obj_array;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		/*
		 1. Person객체를 생성하기 위해 필요한 회원 정보를
		  스캐너를 통해 입력받으세요. (이름, 나이, 성별)
		  
		 2. 입력받은 정보를 바탕으로 Person객체를 생성하세요.
		 
		 3. 입력은 반복문을 통해 배열의 크기만큼 반복해서 받겠습니다.
		  배열의 크기는 3으로 통일하겠습니다.
		  
		 4. 입력이 종료가 되면 입력받은 정보를 토대로 
		  생성한 객체의 personInfo()메서드를
		  반복문을 이용하여 출력해 주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[3];
		
		for(int i=0; i<people.length; i++) {
			
			System.out.println("*** 회원 정보 입력 ***");
			System.out.print("이름> ");
			String name = sc.next();
			
			System.out.print("나이> ");
			int age = sc.nextInt();
			
			System.out.print("성별> ");
			String gender = sc.next();
			
			people[i] = new Person(name, age, gender);
		}
		
		for(Person p : people) {
			p.personInfo();
		}

		sc.close();
	}

}
