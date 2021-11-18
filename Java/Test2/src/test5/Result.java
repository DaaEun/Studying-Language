package test5;

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

	private static String[][] g;			//그래프 
	private static boolean[] visit;		//방문한 숫자 
	private static int count;			//인접한 edges에 있는 숫자들의 수
	
	public static int connectedSum(int n, List<String> edges) {
		
		int answer=0;	
    	g = new String[n+1][n+1];	//인덱스 0을 사용하지 않음
    	visit = new boolean[n+1];	//인덱스 0을 사용하지 않음
    	int size = edges.size();
 
    	//edges의 각 인덱스값을 받아서 그래프에 저장
    	for(int idx=0; idx<size; idx++) {
    		String[] a = edges.get(idx).split(" ");
    		int a0 = Integer.parseInt(a[0]);
    		int a1 = Integer.parseInt(a[1]);
    		g[a0][a1] = g[a1][a0] = "1";	//존재하면 1
    	}

    	// 숫자들을 하나씩 넣어보면서 인접하는 노드들 완성하기
		for(int i = 1; i <= n; i++) {
			count = 0;	
			dfsAlgorithm(n,i);
			if(count != 0) {
				answer += Math.ceil(Math.sqrt(count));	//count의 제곱근 후 올림한 값의 합
			}	
		}
		return answer;
	}
	
	// DFS 알고리즘 재귀호출, dfsAlgorithm
	private static void dfsAlgorithm(int n, int v) {
		// 방문한 숫자는 내보내기
		if(visit[v]) return;
		
		visit[v] = true;
		// 방문하지 않은 숫자 찾아가서 확인하기
		for(int i = 1; i <= n; i++) {
			if(g[v][i] != null) {
				//재귀호출 
				dfsAlgorithm(n, i);
			}
		}
		count++;
		return;
	}
	
    public static void main(String[] args) {
		int n = 4;
		List<String> edges = new ArrayList<String>();
		edges.add("1 2");
		edges.add("1 4");
		edges.add("2 1");
		
		System.out.println(connectedSum(n, edges));
	}
}
