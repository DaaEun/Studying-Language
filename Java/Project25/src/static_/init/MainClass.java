package static_.init;

public class MainClass {

	public static void main(String[] args) {
		
//		LapTop l1 = new LapTop();
//		System.out.println("노트북의 정보 :" + l1.info);
		
		/*
		 - 정적 초기화자를 호출하려면 클래스 로딩한다.
		 
		 # 클래스 로딩 방법.
		 1. 클래스 이름으로 정적 멤버 호출.
		 2. 객체를 생성.
		 
		 - 정적 초기화자는 클래스 로딩시 최초 1회만 호출된다.
		 */
		
		System.out.println("노트북의 정보 :" + LapTop.info);	//정적 초기화자 호출
		
		LapTop l1 = new LapTop();
		LapTop l2 = new LapTop();
		LapTop l3 = new LapTop();
		LapTop l4 = new LapTop();	
		
		System.out.println("노트북의 정보 :" + LapTop.info);
		System.out.println("노트북의 정보 :" + LapTop.info);
		System.out.println("노트북의 정보 :" + LapTop.info);
		System.out.println("노트북의 정보 :" + LapTop.info);

	}

}
