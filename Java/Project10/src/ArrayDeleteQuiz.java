import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		
		String[] kakaos = {"무지", "네오", "어피치", "라이언", "제이지"};
		System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakaos));
		System.out.print("삭제할 카카오 친구: ");
		String name = sc.next();
		
		/*
		 1. 삭제할 이름을 입력받아서 해당 값을 삭제해 주세요.
		 
		 2. 삭제 후 정보를 출력해주세요.
		 
		 3. 없으면 없는 이름이라고도 출력해주세요.
		 */
		
		int i;
		
		for(i = 0; i < kakaos.length; i++) {
			if(name.equals(kakaos[i])) {
				System.out.println(kakaos[i] + "의 이름을 삭제합니다.");
				
				for(int j = i; j< kakaos.length-1; j++) {
					kakaos[j] = kakaos[j+1];	
				}
				break;
			}
		}
		
		if(i != kakaos.length) {
			String[] temp = new String[kakaos.length-1];
			for(int k = 0; k < temp.length; k++) {
				temp[k] = kakaos[k];
			}
			kakaos = temp;
			temp = null;
			System.out.println("삭제 후 정보: " + Arrays.toString(kakaos));
		}
		else
			System.out.println(name + "은(는) 없는 이름 입니다.");
		
		sc.close();
	}

}
