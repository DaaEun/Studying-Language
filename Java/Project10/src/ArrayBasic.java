import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
	
		// 1. 배열 변수의 선언
		int[] arr;	// java style
//		int[3] arr; (X)
		int arr2[];	// C style, 둘다 가능 
		
		// 2. 배열 객체의 생성 - 실제 값들이 저장될 공간을 형성.
		arr = new int[5];	
		//int가 5개 들어갈 수 있는 새로운 배열 선언, 배열의 크기를 늘리거나 줄일 수 없다.
		
		// 3. 배열의 초기화 - 배열 내부에 실제 값들을 저장.
		// 배열의 초기화는 인덱스를 통해 수행한다.
		// 인덱스는 배열 내부의 위치를 지정하는 값이다.
		// 인덱스는 0번부터 시작하여 1씩 순차적으로 증가한다.
//		arr = 65; (X) - arr의 타입은 int[]이기 때문에 인덱스를 지정해야 한다.
		arr[0] = 65;
		arr[1] = 88;
		arr[2] = arr[0];
		arr[3] = (int) 3.14;	// 값의 손실 발생
//		arr[4] = "못 들어가?"; (X)
		arr[4] = 100;
//		arr[5] = 77; (X) - 인덱스 범위 초과
		
		// 4. 배열의 총 크기(길이) 확인 -> 배열변수명.length
		System.out.println("arr 배열의  길이: " + arr.length);
		
		// 5. 배열에 저장된 값을 참조(사용)하는 법.
		System.out.println("배열의 1번째 데이터: " + arr[0]);
		System.out.println("배열의 2번째 데이터: " + arr[1]);
		System.out.println("배열의 3번째 데이터: " + arr[2]);
		System.out.println("배열의 4번째 데이터: " + arr[3]);
		System.out.println("배열의 5번째 데이터: " + arr[4]);

		System.out.println("----------------------------");
		// 배열을 사용하는 이유? 반복문을 쓰기 매우 유용
		// 6. 배열의 반복문 처리
		for(int idx = 0; idx < arr.length; idx++) {
			System.out.println("배열의 " + (idx+1) + "번째 데이터: " + arr[idx]);
		}
		
		// 7. 배열의 내부 요소값을 문자열 형태로 한눈에 출력하기
//		System.out.println(arr);	- 쓰레기값 출력
		System.out.println(Arrays.toString(arr));	//자동완성하면, 위에 import 생성됨
	
		// 8. 배열의 선언과 생성을 동시에 하기

		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		
		// 배열에 값을 넣지 않았을 때, 어떤 값이 있을지 출력
		System.out.println("---------------------------------");
		System.out.println(Arrays.toString(dArr));	
		System.out.println(Arrays.toString(sArr));	
		System.out.println(Arrays.toString(bArr));	
		System.out.println("---------------------------------");

		// 9. 배열의 생성과 동시에 초기화도 진행
		
		char[] letters = new char[] {'A', 'B', 'C', 'D'};	// 알아서 크기가 4로 고정됨.
		System.out.println(Arrays.toString(letters));	

		// 선언과 동시에 초기화를 할때, 딱 한번만 가능한 문법
		String[] names = {"홍길동", "고길동", "박길동"};
//		names = {"홍길동", "고길동", "박길동", "이길동"};	(X)
		names = new String[] {"홍길동", "고길동", "박길동", "이길동"};	
		// 기존의  names는 stack에서 가리키는 주고값이 없어지기 때문에 heap에서 버려지는 배열이 된다.
		// heap에 있는 가바지 컬렉션이 나중에 쓸모없는 배열로 인식하여 자동 삭제한다.
	}

}
