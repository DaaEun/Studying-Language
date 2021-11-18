package api.lang.stringbuilder;

public class StrbuilderExample {

	public static void main(String[] args) {
		
		String str = "hello";
		System.out.println("str의 주소값: " + str.hashCode());
		
		str = "hello world";
		System.out.println("str의 주소값: " + str.hashCode());
		
		str = "hello!!";
		System.out.println("str의 주소값: " + str.hashCode());
		
		System.out.println("-----------------------------------------");
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());
		
		//문자열을 맨 끝에 추가하는 메서드: append(문자열)
		sb.append(" world");
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());
		
		//문자열을 특정 인덱스에 삽입하는 메서드: insert(인덱스, 삽입할 문자열)
		sb.insert(6, "my ");
		System.out.println(sb);
		
		//특정 인덱스 범위의 문자열을 교체하는 메서드: replace(begin, end, 문자열)
		sb.replace(6, 8, "your");
		System.out.println(sb);

		//문자열 내의 특정 단어를 삭제하는 메서드: delete(begin, end)
		sb.delete(6, 11);
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());
	}

}
