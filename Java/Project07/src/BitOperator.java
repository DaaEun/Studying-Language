
public class BitOperator {

	public static void main(String[] args) {
		
		//비트 반전 연산자 (~: 단항)
		//각 비트의 값을 반전시킵니다. 0->1, 1->0
			
		byte a = 5; //0000 0101
		byte b = 3; //0000 0011
				
		//~a: 1111 1010 -> 1의 보수: 1000 0101 -> 2의 보수: 1000 0110
		System.out.println(~a);
				
		//비트 연산자 (&, |, ^)
				
		//&: 비트곱: 두 비트가 1이면 1, 나머지는 0
		System.out.println(a & b); //0000 0001
				
		//|: 비트합: 두 비트 중 하나 이상이 1이면 1, 두 비트가 모두 0이면 0
		System.out.println(a | b); //0000 0111
				
		//^: 배타적 논리합(xor): 두개가 다르면 1, 같으면 0
		System.out.println(a ^ b); //0000 0110
				
		//비트 이동 연산 (<<, >>)
				
		//00000000 00000000 00000000 11000000
		int i = 192;
				
		//00000000 00000000 00000110 00000000
		System.out.println(i << 3);
				
		//00000000 00000000 00000000 00110000
		System.out.println(i >> 2);
	}

}
