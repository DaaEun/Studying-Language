package exception.throws_;

public class ThrowsExample1 {
	
	static String[] greetings = {"안녕", "헬로", "니하오"};
	
	/*
	 # throws
	 
	 - throws는 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우 예외 처리를 메서드의 
	 호출부로 떠넘기는 방식이다.
	 
	 - throws는 생성자에서도 선언이 가능하며, 메서드나 생성자를 호출 시 예외처리를 강요하고 
	 싶을 때 사용한다.
	 */
	
	static void greet(int idx) throws Exception{
		System.out.println(greetings[idx]);
	}
	
	public static void main(String[] args) {
		
		try {
			greet(3);
		} catch(Exception e) {
			e.printStackTrace();
			//printStackTrace메서드는 예외 발생 원인을 역추적하여 예외가 어디서 발생했는지,
			//그 이유는 무엇인지를 메세지를 통해 개발자에게 전달하므로 자주 사용됩니다.
		}
	}
}
