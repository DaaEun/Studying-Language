package final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person oh = new Person("오승준");
//		oh.nation = "호주"; (X) - 변경할 수 없음.
//		oh.name = "오라클"; (X) - 변경할 수 없음.
		oh.age = 27;
		
		Person yang = new Person("양다은");
//		yang.nation = "이탈리아"; (X)

	}

}
