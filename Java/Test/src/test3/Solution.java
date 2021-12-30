package test3;
/*
 문제 설명
기본 내장된 Hash 나 Set 라이브러리를 사용하지 않고, 배열(혹은 List, Vector)만으로 집합Set을 구현합니다.
세부적인 동작으로 다음과 같은 함수를 구현해야 합니다.

sum(base, other) : Base Set에 other Set 원소들을 더해서 합집합을 리턴합니다. 이미 같은 값이 있으면 추가하지 않습니다.
complement(base, other) : Base Set에서 other Set 원소를 빼서 차집합을 리턴합니다. 공통 값이 포함되어 있지 않으면 Base Set 원소를 그대로 리턴합니다.
intersect(base, other) : Base Set와 other Set 값과 비교해서, 두 집합에 모두 있는 원소들만 리턴합니다.

Solution 함수의 매개변수는 집합 Set을 생성하기 위한 배열 A 와 B를 받습니다.

출력은 각 함수의 결과를
[ A로 생성한 Set 원소 개수,
B로 생성한 Set 원소 개수,
sum() 결과 집합 원소 개수,
complement() 결과 집합 원소 개수,
intersect() 결과 집합 원소 개수] 형태 배열로 만들어서 리턴합니다.

제한 사항
입력하는 값 크기는 0이상 1,000,000 이하입니다.
배열에 값이 있을 수도 있고, 없을 수도 있습니다.
Array, List나 Vector 만 사용 가능하며, Object, Hash, Dictionary, Map, Set 등은 사용하지 않고 구현합니다.
만약 Object, Hash, Dictionary, Map, Set 등을 사용하면 감점 사유가 됩니다.
 */
import java.util.*;

public class Solution {

	public static List<Integer> count(int[] base) {

		List<Integer> Base = new ArrayList<>();

		for(int i=0; i<base.length; i++) {
			boolean flag = false;
			for(int j=0; j<i; j++) {
				if(base[i] == base[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) Base.add(base[i]);
		}
		
		return Base;
	}

	public static List<Integer> sum(List<Integer> base, List<Integer> other) {;
		
		for(int i=0; i<other.size(); i++) {
			boolean flag = false;
			for(int j=0; j<base.size(); j++) {
				if(base.get(j) == other.get(i)) {
					flag = true;
					break;
				}
			}
			if(!flag) base.add(other.get(i));
		}
		return base;
	}

	public static List<Integer> complement(List<Integer> base, List<Integer> other) {

		 for(int i=0; i<other.size(); i++) {
			boolean flag = false;
			for(int j=0; j<base.size(); j++) {
				if(base.get(j) == other.get(i)) {
					flag = true;
					break;
				}
			}
			if(flag) base.remove(other.get(i));
		}
		return base;
	}

	public static List<Integer> intersect(List<Integer> base, List<Integer> other) {

		List<Integer> inter = new ArrayList<>();
		
		for(int i=0; i<other.size(); i++) {
			boolean flag = false;
			for(int j=0; j<base.size(); j++) {
				if(base.get(j) == other.get(i)) {
					flag = true;
					break;
				}
			}
			if(flag) inter.add(other.get(i));
		}
		return inter;
	}

	public static ArrayList<Integer> solution(int[] arrayA, int[] arrayB) {

		ArrayList<Integer> answer = new ArrayList<>();

		answer.add(count(arrayA).size());
		answer.add(count(arrayB).size());
		answer.add(sum(count(arrayA),count(arrayB)).size());
		answer.add(complement(count(arrayA),count(arrayB)).size());
		answer.add(intersect(count(arrayA),count(arrayB)).size());

		return answer;
	}

	public static void main(String[] args) {

		int[] arr1 = {2,3,4,3,5};
		int[] arr2 = {1,6,7};

		ArrayList<Integer> ans = solution(arr1, arr2);

		System.out.println(ans);
	}
}
