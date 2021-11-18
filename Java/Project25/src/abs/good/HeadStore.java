package abs.good;

public abstract class HeadStore {

	/*
	 # 추상 클래스, 추상 메서드
	 
	 1. 추상 클래스의 메서드에 abstract를 붙이면 해당 메서드는
	  실체가 없는 추상 메서드가 되며, 이 메서드는 상속을 통해 자식 클래스에서
	  반드시 오버라이딩을 하도록 강요됩니다.
	  
	 2. 추상메서드는 실체가 존재하지 않는 틀 역할을 하기 때문에
	  메서드의 바디 부분({})이 없고, 세미콜론으로 메서드 선언을 마감합니다.
	  
	 3. 일반 클래스에서는 추상 메서드를 선언할 수 없습니다. 추상 메서드가
	  단 하나라도 존재하는 경우에는 반드시 해당 클래스를 추상 클래스로 선언해야 합니다.
	  
	 4. 추상 클래스에 추상 메서드만을 선언할 필요는 없습니다. 
	 일반 인스턴스 메서드나, 인스턴스 변수도 얼마든지 선언이 가능합니다.
	 */
	
	public int a;
	
	public abstract void orderApple();
	public abstract void orderBanana();
	public abstract void orderGrape();
	public abstract void orderMelon();

	public void orderWaterMelon() {
		System.out.println("수박주스의 가격은 3500원 입니다.");
	}
	
	public HeadStore() {
		System.out.println("HeadStore의 생성자 호출!");
	}
	

}










