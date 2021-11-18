package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> kakao = new  ArrayList<>();
		kakao.add("무지");
		kakao.add("어피치");
		kakao.add("라이언");
		kakao.add("제이지");
		kakao.add("네오");

		System.out.println("현재 저장된 친구들: " + kakao);
		System.out.print("삭제할 친구 입력: ");
		String name = sc.next();
		
		/*
		 1. 삭제할 이름을 입력받아서 해당 값을 삭제해 주세요.
		 2. 삭제 후 정보를 출력해 주세요.
		 3. 없으면 없는 이름이라고도 출력해 주세요.
		 */
		
		if(kakao.contains(name)) {
			System.out.println(name + "을(를) 삭제합니다.");
			kakao.remove(name);
			System.out.println("삭제 후 정보: " + kakao);
		}
		else {
			System.out.println("해당 이름은 존재하지 않습니다.");
		}
		
		sc.close();
	}

}


