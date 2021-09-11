#include <iostream>
#include <iterator>
#include <list>
using namespace std;

int main(void)
{
	list<int> ls = {1, 2, 2, 3, 4, 3, 5, 5};	// list 객체의 선언 및 초기화 
	// ls.sort();	// 1, 2, 3, 4, 5
	ls.unique();	// 1, 2, 3, 4, 3, 5
	cout << "현재 리스트의 모든 요소는 다음과 같습니다 :" << endl;
	copy(ls.begin(), ls.end(), ostream_iterator<int>(cout, " "));
	return 0;
}