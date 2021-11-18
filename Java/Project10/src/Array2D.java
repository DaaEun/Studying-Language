import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
	
//		int[] arr1 = {1, 2, 3};
//		int[] arr2 = {4, 5, 6};
//		int[] arr3 = {7, 8, 9};
		
//		int[][] arr3by3 = {arr1, arr2, arr3};
		
		int[][] arr3by3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println(Arrays.toString(arr3by3));
		System.out.println(arr3by3.length);
		System.out.println(Arrays.toString(arr3by3[0]));
		System.out.println(Arrays.toString(arr3by3[1]));
		System.out.println(Arrays.toString(arr3by3[2]));

		// 다차원 배열에서 내부의 값을 문자열 형태로 출력
		System.out.println(Arrays.deepToString(arr3by3));
		
		System.out.println(arr3by3[1][2]);
		System.out.println(arr3by3[0][1]);

		System.out.println("==================================================");
		
		// 빈 2차원 배열 만들기
		int[][] arr3by4 = new int[3][4];
		
		System.out.println(Arrays.deepToString(arr3by4));
		
		arr3by4[1][2] = 85;
		arr3by4[2][0] = 120;

		for(int[] arr : arr3by4) {
			for(int n :  arr) {
				System.out.print(n + " ");
			}
			System.out.println();	// 한 행이 출력되고 단순 줄 개행 
		}
	}

}
