package final_.field;

public class Person {
	
//	final String nation; (X) - 초기화가 되어있지 않음.
	final String nation = "대한민국";	//변수 값이 변경안됨.(불변의 값)
	final String name;
	int age;
	
	public Person(String name) {
		this.name = name;
	}

}
