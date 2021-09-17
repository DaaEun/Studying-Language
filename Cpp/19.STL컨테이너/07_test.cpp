#include <iostream>
#include <queue>
using namespace std;

int main(void)
{
	priority_queue<int> pq;
	pq.push(10); 
	pq.push(20);
	pq.push(100);
	pq.push(3);
	
	// 우선 순위 큐의 모든 요소를 인출 
	while(!pq.empty())
	{
		cout << pq.top() << " ";
		pq.pop();
	}
	return 0;
}