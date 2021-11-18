package abs.good;

public class Store extends HeadStore{

	public Store() {
		super();
	}

	@Override
	public void orderApple() {
		System.out.println("사과주스의 가격은 2500원 입니다.");
	}

	@Override
	public void orderBanana() {
		System.out.println("바나나주스의 가격은 2700원 입니다.");
	}

	@Override
	public void orderGrape() {
		System.out.println("포도주스의 가격은 2800원 입니다.");
	}

	@Override
	public void orderMelon() {
		System.out.println("멜론주스의 가격은 3100원 입니다.");
	}
	
	
}
