import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9, 11, 13};
		
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6];
		// 반복문 처리

		for(int i = 3; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
		
		int[] temp = new int[arr.length-1];
		
		for(int i = 0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		System.out.println(Arrays.toString(temp));
		
		arr = temp;
		temp = null;
		
		System.out.println(Arrays.toString(arr));
	}

}
