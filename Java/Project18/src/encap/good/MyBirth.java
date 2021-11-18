package encap.good;

public class MyBirth {
	
	/*
	 # 은닉(캡슐화): 데이터 보호의 목적으로 사용하는 OOP 기술 중 하나.
	 
	 - 은닉할 멤버변수에 private 접근 제한을 붙임
	 */
	
	private int year;
	private int month;
	private int day;
	
	/*
	 - 은닉은 데이터에 접근 제한을 걸어서 정보를 보호하는 것이 목적이지만,
	 private을  설정하면 데이터 접근 자체가 불가능하다.
	 
	 - 따라서 데이터의 유효성을 검증할 수 있는 제어문을 사용하여 데이터의 접근을 허용하도록 
	 설정하는데, 이 때 사용하는 메서드를 setter/getter 메서드라고 부른다.
	 
	 
	 # setter method 
	 
	 1. setter는 은닉된 변수에 값을 저장하기 위한 메서드이다.
	 
	 2. 메서드 내부에 데이터 유효성 검증 로직을 작성하여 적절한 데이터만 
	 멤버변수에 저장시키고, 접근제한자는 public으로 설정하여 외부에서 
	 사용할 수 있게 한다.
	 
	 3. 메서드 이름은 일반적으로 set + 멤버변수이름으로 지정한다.
	 */
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("잘못된 일 입력입니다.");
		}
		else {
			this.day = day;
		}
	}
}
