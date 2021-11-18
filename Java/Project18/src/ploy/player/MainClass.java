package ploy.player;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("전사1");
		Warrior w2 = new Warrior("전사2");
		Mage m1 = new Mage("마법사1");
		Mage m2 = new Mage("마법사2");
		Mage m3 = new Mage("법사짱짱맨");
		Hunter h1 = new Hunter("사냥꾼1");
		Hunter h2 = new Hunter("사냥꾼2");
		
		/*
		 1. Mage는 blizzard라는 광역 기술(메서드)을 가지고 있습니다.
		 
		 2. Mage클래스에 blizzard라는 메서드를 선언하세요. (void)
		 
		 3. 메서드 호출부에 들어갈 매개값으로 맞는 매개변수를 선언하세요.
		  광역 마법이기 때문에 타겟이 여러 명이어야 합니다.
		  
		 4. blizzard라는 기술을 시전하는 사람의 이름을 적절한 키워드를
		  사용하여 출력해 보세요.
		  
		 5. 피해량(데미지)은 10~15사이의 난수를 발생시켜서
		  타겟들에게 각각 적용시켜 주세요.
		  
		 6. 기본 객체의 hp는 50입니다. hp에서 피해량을 뺀 남은 체력을 
		 출력해 주세요.
		 */
		
		Player[] targets = {w1, w2, m1, m2, h1, h2};
		m3.blizzard(targets);
		
		System.out.println("----------------------------------------");
		
		w1.rush(w2);
		w1.rush(m1);
		w1.rush(h1);
	}

}
