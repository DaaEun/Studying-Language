package api.util.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		//배열의 복사
		char[] arr1 = {'J', 'A', 'V', 'A'};
		char[] arr2 = Arrays.copyOf(arr1,arr1.length);
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//배열 탐색: Arrays.binarySearch()
		//필수 조건: 반드시 정렬이 선행되어야 탐색이 가능하다.
		
		int[] numbers = {1, 3, 5, 7, 9, 11, 13};

		int idx = Arrays.binarySearch(numbers, 4);
		System.out.println("4의 인덱스 번호: " + idx);
		
		//배열 정렬.
		int[] numbers2 = {32, 44, 11, 3, 25, 100, 33};
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));
		
		//배열 내부 요소의 일치 여부 비교.
		arr2[2] = 'F';
		System.out.println(Arrays.equals(arr1, arr2));
	}

}
