package api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
	
		Person oh = new Person("오승준", 27, "남자");
		Person yang = new Person("양다은", 23, "여자");
		Person yang2 = new Person("양다은", 20, "여자");

		System.out.println(yang);
		System.out.println("---------------------------");
		System.out.println(oh);
		System.out.println("---------------------------");
		
		if(yang.equals(oh)) {
			System.out.println("이름이 서로 같습니다.");
		}
		else {
			System.out.println("이름이 서로 다릅니다.");
		}
	}

}
