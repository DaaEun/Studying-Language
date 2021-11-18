package api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		/*
		 - Random클래스는 난수를 얻어내기 위한 다양한 메서드를 제공하며,
		  Math클래스의 random()메서드보다 다양하고 쉽게 난수값을 얻도록 해줍니다.
		 */
		
		Random r = new Random();
		
		//실수 난수값 발생: 0.0 <= ~ < 1.0
		double d = r.nextDouble();
		System.out.println(d);
		
		//정수 난수값 발생
		int i = r.nextInt(); //int타입의 난수를 리턴(int 전체 범위)
		System.out.println(i);
		
		//0이상 6미만의 난수를 발생. (0~5)
		int j = r.nextInt(6);
		System.out.println(j);
		
		//1이상 11미만의 난수를 발생. (1~10)
		int k = r.nextInt(10)+1;
		System.out.println(k);
		
	}

}
