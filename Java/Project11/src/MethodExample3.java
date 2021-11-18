
public class MethodExample3 {
	
	//정수를 n개 전달하면 그 정수의 총 합을 리턴하는 메서드
	static int calcNumberTotal(int[] nums) {
		int total = 0;
		for(int n : nums)
			total += n;
		return total;
	}

	public static void main(String[] args) {
		
		int[] arr = {10, 30, 50, 70, 90};
		int sum = calcNumberTotal(arr);
		System.out.println("누적합: " + sum);
		
		sum = calcNumberTotal(new int[] {10, 20, 30, 40, 50});
		System.out.println("누적합: " + sum);

	}

}
