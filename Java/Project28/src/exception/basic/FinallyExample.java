package exception.basic;

public class FinallyExample {

	public static void main(String[] args) {
		
		String[] pets = {"강아지", "고양이", "짹짹이"};
		
		for(int i=0; i<4; i++) {
			try {
				System.out.println(pets[i] + "키우고 싶다.");
			} catch(Exception e) {
				System.out.println("애완동물의 정보가 없습니다.");
			} finally {
				System.out.println("아무튼 실행되는 문장입니다.");
				System.out.println("-----------------------");
			}
		}
	}

}
