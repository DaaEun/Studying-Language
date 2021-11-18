package abs.good;

public class MainClass {

	public static void main(String[] args) {
		
//		HeadStore h = new HeadStore(); (X)
		
		HeadStore s = new Store();
		s.orderApple();
		s.orderBanana();
		s.orderGrape();
		s.orderMelon();
		s.orderWaterMelon();
	}

}
