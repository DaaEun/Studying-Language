package static_.init;

public class LapTop {
	
	public static String company;
	public static String model;
	public static String info;
	public int price;
	
	// 정적 변수를 자동으로 초기화하려면 정적 초기화자를 사용.
	static {
		System.out.println("정적 초기화자 호출!");
		company = "LG";
		model = "Gram";
		info = company + "-" + model;
//		price = 1000000; (X)
	}
	
	public LapTop() {
		System.out.println("생성자 호출!");
		company = "LG";
		model = "lg";
		info = company + "-" + model;
		price = 1000000;
	}

}
