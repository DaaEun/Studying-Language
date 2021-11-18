package collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
//		String[] str = new String[100];
		ArrayList<String> nick = new ArrayList<>();

		String str1 = "댕댕이";
		String str2 = "야옹이";
		
		//list에 객체를 추가: add(객체)
		nick.add(str1);
		nick.add(str2);
		nick.add("짹짹이");
		nick.add("개구리");
		nick.add("야옹이");	// list는 객체의 중복 저장을 허용한다.
		System.out.println(nick);
//		[댕댕이, 야옹이, 짹짹이, 개구리, 야옹이]
		
		//list에 객체를 추가: add(index, 객체)
		nick.add(2,"어흥이");
		System.out.println(nick);
//		[댕댕이, 야옹이, 어흥이, 짹짹이, 개구리, 야옹이]
		
		//list에 저장된 총 객체의 수 얻기: size()
		System.out.println("nick에 저장된 요소의 갯수: " + nick.size());
//		nick에 저장된 요소의 갯수: 6
		
		//list에 저장된 객체를 참조하기: get(index)
//		String nickname = nick[4]; (X)
		String nickname = nick.get(4);
		System.out.println("4번 인덱스의 값: " + nickname);
//		4번 인덱스의 값: 개구리
		
		//list의 데이터 수정하기: set(index, 수정할 객체)
		nick.set(3, "메롱이");
		System.out.println(nick);
//		[댕댕이, 야옹이, 어흥이, 메롱이, 개구리, 야옹이]
		
		//list에 저장된 객체를 삭제: remove(index), remove(객체)
		nick.remove(5);
		System.out.println(nick);
//		[댕댕이, 야옹이, 어흥이, 메롱이, 개구리]
		
		nick.remove(str1);
		System.out.println(nick);
//		[야옹이, 어흥이, 메롱이, 개구리]
		
		//list 내부에 저장된 객체의 존재 유무를 파악: contains(객체)
		System.out.println(nick.contains("어흥이"));
		System.out.println(nick.contains("삐약이"));
//		true
//		false
		
		//list 내부 객체의 인덱스 확인: indexOf(객체)
		int idx = nick.indexOf("어흥이");
		System.out.println("어흥이가 위치한 인덱스: " + idx);
//		어흥이가 위치한 인덱스: 1
		
		//list의 반복문 처리
		for(String s : nick) {
			System.out.println(s + " 키우고 싶다.");
		}
		
		//list 내부 객체 전체 삭재: clear()
		nick.clear();
		System.out.println(nick);
//		[]
		
		//list 내부가 비어있는지의 여부를 확인: isEmpty()
		System.out.println(nick.isEmpty());
//		true
		
		//list의 정렬
		ArrayList<Integer> scores = new ArrayList<>();
		
		scores.add(95);
		scores.add(47);
		scores.add(69);
		scores.add(80);
		scores.add(100);
		scores.add(21);
		
		System.out.println(scores);
//		[95, 47, 69, 80, 100, 21]
		
		//오름차 정렬
		Collections.sort(scores);
		System.out.println(scores);
//		[21, 47, 69, 80, 95, 100]
		
		//내림차 정렬
		Collections.sort(scores, Collections.reverseOrder());
		System.out.println(scores);
//		[100, 95, 80, 69, 47, 21]
		
		
		
		
		
		
		
		
		
		
	}

}














