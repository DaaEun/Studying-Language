package test3;

import java.util.ArrayList;
import java.util.List;

public class Count {

	public static void main(String[] args) {

		int[] base = {1,2,3,2};
		
		int count = 0;

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
		
		System.out.println(Base);
		System.out.println(Base.size());
		
		ArrayList<Integer> answer = new ArrayList<>();

		answer.add(count);
		
		System.out.println(answer);
	}

}
