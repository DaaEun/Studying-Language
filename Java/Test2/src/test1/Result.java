package test1;

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

    public static int countStudents(List<Integer> height) {
    	
    	//제대로 줄을 서지 않는 answer의 학생 수
    	int answer = 0;
    	
    	//제대로 줄을 서는 배열 sortHeight
    	int[] sortHeight = new int[height.size()];
    	for(int i=0; i<sortHeight.length; i++) {
    		sortHeight[i] = height.get(i);
    	}
    	Arrays.sort(sortHeight);
    	
    	//sortHeight와 height 비교하기
    	for(int idx=0; idx<height.size(); idx++) {
    		if(height.get(idx) != sortHeight[idx]) {
    			answer++;
    		}
    	}
    	return answer;
    }
    
    public static void main(String[] args) {
		
    	int[] arr = {244,
    			8633,
    			2539,
    			9654,
    			933,
    			5366,
    			8748,
    			5894,
    			1271,
    			2881,
    			1370,
    			8622,
    			7033,
    			4700,
    			386,
    			6472,
    			5742,
    			5351,
    			8010,
    			2512,
    			1647,
    			2672,
    			622,
    			9932,
    			7531,
    			6034,
    			862,
    			6578,
    			5003,
    			6354,
    			688,
    			9833,
    			1299,
    			4320,
    			7697,
    			5661,
    			1727,
    			1841,
    			3679,
    			4345,
    			7891,
    			8974,
    			923,
    			5758,
    			2573};
    	List<Integer> height = new ArrayList<Integer>();
    	for(int i : arr) {
    		height.add(i);
    	}
//    	height.add(1);
//    	height.add(1);
//    	height.add(3);
//    	height.add(4);
//    	height.add(1);
    	int result = countStudents(height);
    	System.out.println(result);
	}
}

