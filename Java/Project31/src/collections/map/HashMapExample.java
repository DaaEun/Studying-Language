package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		/*
		 - Map 계열 컬렉션은 키(key)와 값(value)이 한 쌍으로 구성된
		  객체를 저장하는 구조를 가지고 있습니다.
		  
		 - 키는 중복저장을 허용하지 않지만, 값은 중복 저장을 허용합니다.
		 */
		
		Map<String, String> map = new HashMap<>();
		
		//map에 객체를 저장: put(key, value)
		map.put("멍멍이", "김철수");
		map.put("야옹이", "홍길동");
		map.put("짹짹이", "박영희");
		System.out.println(map);
//		{멍멍이=김철수, 야옹이=홍길동, 짹짹이=박영희}
		
		//map은 key의 중복 저장을 허용하지 않습니다.
		//만약 중복 key를 통해 put을 사용하면 value가 수정됩니다.
		map.put("멍멍이", "박철수");
		map.put("어흥이", "홍길동");
		System.out.println(map);
//		{어흥이=홍길동, 멍멍이=박철수, 야옹이=홍길동, 짹짹이=박영희}
		
		//map에 저장된 value값을 참조: get(key)
		String name = map.get("야옹이");
		System.out.println("별명이 야옹이인 학생: " + name);
//		별명이 야옹이인 학생: 홍길동
		
		//map에 저장된 총 객수의 얻기: size()
		System.out.println("map에 저장된 객체의 갯수: " + map.size());
//		map에 저장된 객체의 갯수: 4
		
		//map에 저당된 key들을 전부 추출하는 메서드: keySet()
		Set<String> keys = map.keySet();
		for(String n : keys) {
			System.out.println(n + " : " + map.get(n));
		}
//		어흥이 : 홍길동
//		멍멍이 : 박철수
//		야옹이 : 홍길동
//		짹짹이 : 박영희
		
		//map에 저장된 key의 존재 유무를 확인하는 메서드: containKey()
		String nick = "삐약이";
		System.out.println("--------------------------------");
		if(map.containsKey(nick)) {
			System.out.println("별명이 " + nick + "인 학생의 이름은 "
					+ map.get(nick) + "입니다.");
		}
		else {
			System.out.println("존재하지 않는 별명입니다.");
		}
		
		//map의 데이터 삭제: remove(key)
		//remove 메서드에 key를 넣어주면 value도 함께 제거됩니다.
		map.remove("야옹이");
		System.out.println(map);
//		{어흥이=홍길동, 멍멍이=박철수, 짹짹이=박영희}
	}

}
