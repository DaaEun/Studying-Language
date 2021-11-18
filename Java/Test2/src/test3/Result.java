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

class Result {

    public static int countGroups(List<String> related) {
    
    	int answer = related.size();
    	
    	List<Integer> group = new ArrayList<Integer>();
    	for(int i=0; i<related.size(); i++) {
    		String nums = related.get(i);
    		
    		for(int j=(i+1); j<related.size(); j++) {

    			char num = nums.charAt(j);
    			if(num == '1' && !(group.contains(j) && group.contains(i))) {
    				group.add(i);
    				group.add(j);
    				answer--;
    			}
    		}
    	}
    	return answer;
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
