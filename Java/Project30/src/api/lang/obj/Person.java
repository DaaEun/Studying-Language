package api.lang.obj;

public class Person {
	
	String name;
	int age;
	String gender;
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "이름: " + this.name + "\n나이: " + this.age + "세\n성별: " + this.gender; 
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {	//odj가 Person타입인지 확인.
			Person p = (Person) obj;
			
			if(this.name.equals(p.name)) {
				return true;
			}		
		}
		return false;
	}
	
//	public void personInfo() {
//	System.out.println("이름: " + this.name);
//	System.out.println("나이: " + this.age);
//	System.out.println("성별: " + this.gender);
//}

}
