package final_.constant;

public class Earth {

	/*
	 # 상수(constant)
	 
	 -상수는 고정된 불변의 값이다. 따라서 어디에서 접근하더라도 같은 값이 나와야 하며, 변경이 불가능하다.
	 
	 -따라서 자바에서는 상수를 선언할 때 static, final을 함께 사용한다.
	 */
	
	static final double RADIUS = 6400;
	
	static final double SURFACE_AREA;
	
	static {
		SURFACE_AREA = RADIUS * RADIUS * Math.PI * 4;
	}
	
	public static void main(String[] args) {
		
		System.out.println("지구의 반지름: " + Earth.RADIUS + "km");
		System.out.println("지구의 표면적: " + Earth.SURFACE_AREA + "km^2");
	}

}
