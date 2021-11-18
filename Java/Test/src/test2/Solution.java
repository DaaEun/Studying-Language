package test2;

import java.util.*;

public class Solution {

	public boolean Solution(String[] name_list) {
		boolean answer = true;
		
		for(int i=0; i<name_list.length; i++) {
			for(int j=0; j<i; j++) {
				if(name_list[i].contains(name_list[j])) {
					return answer;
				}
			}
		}
		answer = false;
		
		return answer;
	}
	
}
