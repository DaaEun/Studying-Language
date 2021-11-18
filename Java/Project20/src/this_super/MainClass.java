package this_super;

public class MainClass {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.name = "플레이어1";
//		System.out.println("p1의 주소값: " + p1);
		p1.characterInfo();
		
		System.out.println("--------------------------------");
		
		Player p2 = new Player("플레이어2");
//		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();
		
		System.out.println("--------------------------------");
		
		Player p3 = new Player("플레이어3", 100);
		p3.characterInfo();
		
		System.out.println("--------------------------------");
		
		Warrior w1 = new Warrior("전사1");
		w1.characterInfo();
		
		System.out.println("--------------------------------");
		
		Mage m1 = new Mage("마법사1");
		m1.characterInfo();
		
		System.out.println("--------------------------------");
		
		Hunter h1 = new Hunter("사냥꾼1");
		h1.characterInfo();

	}

}
