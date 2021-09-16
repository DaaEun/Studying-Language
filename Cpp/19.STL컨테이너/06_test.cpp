#include <iostream>
#include <queue>
using namespace std;

int main(void)
{
	int n = 20;		// 20개의 피보나치 수열을 출력함. 
	queue<int> que;
	que.push(0);	// 초기값인 0과 1을 저장함. 
	que.push(1);
	
	// 피보나치 수열 
	for(int i = 2; i < n; i++)
	{
		int temp = que.front();
		cout << temp << " ";
		que.pop();
		que.push(temp + que.front());
	}
	return 0;
}