package poly.casting;

public class MainClass {

	public static void main(String[] args) {
	
		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2; (X)
		
		p.method1();
		p.method2();
//		p.method3(); (X)
		
		System.out.println("---------------------------------------");
		
		Child c = new Child();
		
		c.n1 = 1;	//부모로부터 물려받은 속성.
		c.n2 = 2; 	//자식 고유의 속성.
		
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("---------------------------------------");
		
		//다형성 적용(promotion)
		Parent p2 = new Child();
		p2.n1 = 1;
//		p2.n2 = 2; (X)
		
		p2.method1();
		p2.method2();
//		p2.method3(); (X)
		System.out.println(p2);
		
		/*
		 - promotion이 적용되면 자식 클래스의 본래의 멤버 (멤버변수, 메서드)를 참조하지 못하는 
		 문제 발생한다.
		  
		 - 이를 해결하기 위해 강제 타입 변환(Downcasting)을 사용한다.
		 */
		
		Child  c2 = (Child) p2;
		
		c2.method3();
		c2.n2 = 4;
		
		System.out.println("---------------------------------------");
		System.out.println("p2의 주소값: " + p2);
		System.out.println("c2의 주소값: " + c2);
		
		//다형성이 한 번도 발생하지 않은 객체는 강제 형 변환을 진행할 수 없습니다.
		
//		Child c3 = (Child) p;
// 		Child p = new Parent(); (x)
		
	}

}
