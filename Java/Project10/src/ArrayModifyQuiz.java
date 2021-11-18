import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

	public static void main(String[] args) {

		/*
		 1. 배열을 선언하고, 무지, 네오, 어피치, 라이언, 제이지를 저장하세요.(String[])
		 
		 2. 사용자에게 수정할 친구 이름을 입력받아 입력한 친구가 배열에 존재한다면 수정값을 다시 입력받으세요.
		 
		 3. 이름을 수정한 후에 "수정 후 결과: ~~~"를 출력하세요.
		 
		 4. 사용자가 입력한 친구가 배열에 없다면 "XXX(이)란 친구는 없습니다."를 출력하세요. 
		 */
		
		String[] kakaos = {"무지", "네오", "어피치", "라이언", "제이지"};
		System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakaos));
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("변경할 카카오 친구: ");
		String name = sc.next();
		
		int idx;
		for(idx = 0; idx < kakaos.length; idx++) {
			if(name.equals(kakaos[idx])) {
				
				System.out.printf("%s의 이름을 수정합니다.\n", kakaos[idx]);
				System.out.print("변경할 이름을 입력하세요: ");
				kakaos[idx] =sc.next();
				
				System.out.println("변경 완료!");
				System.out.println("변경 후 정보: " + Arrays.toString(kakaos));
				break;
			}
		}
		
		if(idx == kakaos.length) 
			System.out.printf("%s(이)란 친구는 없습니다.", name);
		
		sc.close();
	}

}
