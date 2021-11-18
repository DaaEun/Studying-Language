package test4;

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

    public static int stockPairs(List<Integer> stocksProfit, long target) {
    	
    	//오름차순으로 정렬
    	Collections.sort(stocksProfit);
    	int size = stocksProfit.size();
    	//주식이익의 쌍이 맞는 횟수 추가. 중복제거
    	Set<Integer> count = new HashSet<>();

    	for(int i=0; i<size; i++) {
    		for(int j=size-1; j>i; j--) {
    			//두쌍의 합이 target되면
    			if(target == (long)(stocksProfit.get(i) + stocksProfit.get(j))) {
    				//i가 j보다 무조건 작은 수를 가지고 있음
    				int num = stocksProfit.get(i);
    		    	count.add(num);
    		    	break;
    			}
    		}
    	}
    	return count.size();
    }

    public static void main(String[] args) {
    	
		int[] arr = {6, 6, 3, 9, 3, 5, 1};
    	List<Integer> stocksProfit = new ArrayList<Integer>();
    	for(int a : arr) {
    		stocksProfit.add(a);
    	}
    	long target = 12;
    	
    	System.out.println(stockPairs(stocksProfit, target));
	}
}

