#include <iostream>
#include <iterator>
#include <deque>
using namespace std;

int main(void)
{
	deque<int> dq = {20};	// deque 객체의 선언 및 초기화 
	dq.push_back(30);		// 요소의 후방 삽입 
	dq.push_front(10);		// 요소의 전방 삽입 

	cout << "현재 데큐의 모든 요소는 다음과 같습니다 :" << endl;
	copy(dq.begin(), dq.end(), ostream_iterator<int>(cout, " "));
	cout << endl << "현재 데큐의 첫 번째 요소는 " << dq.front() << "입니다." << endl;

	dq.pop_front();			// 요소의 전방 삭제 
	cout << "현재 데큐의 모든 요소는 다음과 같습니다 :" << endl;
	copy(dq.begin(), dq.end(), ostream_iterator<int>(cout, " "));
	return 0;
}