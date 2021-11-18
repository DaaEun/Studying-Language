package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		/*
		 - HashSet 클래스는 Set인터페이스를 구현한 클래스입니다.
		  저장된 객체의 순서를 보장하지 않고, 중복 또한 허용되지 않습니다.
		  
		 - Set인터페이스를 구현한 컬렉션 중 대표적으로 사용하는 클래스 중 하나입니다.
		 */
		
		Set<String> set = new HashSet<>();
		
		//set에 객체를 추가: add(객체)
		set.add("김밥");
		set.add("김말이");
		set.add("떡볶이");
		set.add("단무지");
		set.add("김말이");	//set은 중복 저장을 허용하지 않는다.
		System.out.println(set);
//		[김밥, 김말이, 단무지, 떡볶이]
		
		//set에 저장된 객체의 수를 알아보는 메서드: size()
		System.out.println("set에 저장된 객체 수: " + set.size());
//		set에 저장된 객체 수: 4
		
		/*
		 - Set의 객체 데이터를 검색하려면 반복자(Iterator)를 통해
		  모든 객체를 대상으로 한 번씩 반복해서 꺼내봐야 합니다.
		 */
		Iterator<String> iter = set.iterator();
		
		//Iterator의 next()메서드는 set에 저장된 객체를 하나씩 꺼내옵니다.
//		String str1 = iter.next();
//		System.out.println(str1);
//		String str2 = iter.next();
//		System.out.println(str2);
		
		/*
		 - 반복자 객체의 next()메서드를 통해 set의 내부 데이터를 
		  반복 조회할 때, 더 이상 조회할 데이터가 없으면 예외를 발생시킵니다.
		  
		 - 그렇기 때문에 hasNext() 메서드를 통해 set에서 데이터를 
		  더 조회할 수 있는지의 여부를 체크해야 합니다.
		 */
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
//		김밥
//		김말이
//		단무지
//		떡볶이
		
		System.out.println("---------------------------------");
		
		for(String n : set) {
			System.out.println(n);	
		}
		
		//set의 데이터 삭제: remove(객체)
		set.remove("단무지");
		System.out.println(set);
//		[김밥, 김말이, 떡볶이]
		
		//set.clear: set의 데이터 전체 삭제
		set.clear();
		System.out.println(set);
//		[]
	}

}
