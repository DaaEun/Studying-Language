package exception.throws_;

public class ThrowsExample2 {

	private void aaa(int i) throws Exception{
		System.out.println("aaa호출!");
		int n = 10 / i;
	}
	
	private void bbb() throws Exception{
		System.out.println("bbb호출!");
		aaa(0);
	}
	
	private void ccc() throws Exception{
		System.out.println("ccc호출!");
		bbb();
	}
	
	public ThrowsExample2() throws Exception{
		System.out.println("생성자 호출!");
		ccc();
	}
	
	public static void main(String[] args) {
		
		try {
			ThrowsExample2 t = new ThrowsExample2();
			t.bbb();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료!");
	}

}
