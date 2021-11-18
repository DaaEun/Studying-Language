package test3;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result2 {

    public static int countGroups(List<String> related) {

    	//관련있는 사람들로 묶기 위한 배열 group
    	List<Integer> group = new ArrayList<Integer>();
    	
    	//아직 아무도 연결되어 있지 않아서 각각의 group으로 존재
    	for(int n=0; n<related.size(); n++) {
    		group.add(n);
    	}
    	
    	for(int i=0; i<related.size()-1; i++) {
    		//related의 각 인덱스를 저장하는 문자열 nums
    		String nums = related.get(i);
    		
    		// 그래프가 대칭을 이루고, 자기자신과의 비교는 필요없기때문에 j=(i+1)부터 시작 
    		for(int j=(i+1); j<related.size(); j++) {
    			
    			//nums의 각 문자 num
    			char num = nums.charAt(j);
    			//num=1이고, group.get(i)와 group.get(j) 다른 경우
    			//즉, i번째와 j번째가 서로 다른 group에 속해있는 경우
    			if(num == '1' && !(group.get(i) == group.get(j))) {	
    				
    				if(group.get(i) > group.get(j)) {
    					for(int n=0; n<related.size(); n++) 
    						if(group.get(i) == group.get(n)) 
    							group.set(n, group.get(j));
    				}
    				else if(group.get(i) < group.get(j)) {
    					for(int n=0; n<related.size(); n++) 
    						if(group.get(j) == group.get(n))
    							group.set(n, group.get(i));
    				}
    			}
    		}
    	}
    	Set<Integer> answer = new HashSet<>();
    	for(int n : group) answer.add(n);
    
    	return answer.size();
    }

    public static void main(String[] args) {
    	String[] arr = {"1111", "1110", "1110", "1001"};
		List<String> related = new ArrayList<String>();
		for(String s : arr) {
			related.add(s);
		}
		System.out.println(countGroups(related));
	}
}
