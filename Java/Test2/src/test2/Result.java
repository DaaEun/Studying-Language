package test2;

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

    public static void commonSubstring(List<String> a, List<String> b) {
    	
    	for(int i=0; i<a.size(); i++) {
    		//a와 b의 i인덱스에 같은 문자 존재 유무를 나타내는 flag
    		// 존재하면 YES로 바꿈, 존재하지않으면 NO로 유지
        	String flag = "NO";
        	
        	//a의 i인덱스안에 있는 문자열 str
    		String str = a.get(i);
    		
    		for(int j=0; j<str.length(); j++) {
    			//str의 j번째 있는 문자 ch (0부터 번호붙임)
    			char ch = str.charAt(j);
    			
    			//b의 i인덱스안에 ch가 존재하니?
    			if(b.get(i).indexOf(ch) != -1) {
    				//같은 문자가 존재하므로, flag를 YES로 바꿈
    				flag = "YES";
    				break;
    			}
    		}
    		System.out.println(flag);
    	}
    }
    
    public static void main(String[] args) {
		
    	List<String> a = new ArrayList<String>();
    	List<String> b = new ArrayList<String>();
    	a.add("hello");
    	a.add("hi");
    	b.add("world");
    	b.add("bye");
    	commonSubstring(a, b);
    
	}

}
