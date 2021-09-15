#include <iostream>
#include <iterator>
#include <set>
using namespace std;

int main(void)
{
	int arr[5] = {10, 20, 30, 40, 50};	// 배열 생성 및 초기화 
	set<int> st(arr, arr+3);			// 배열의 일부 요소를 가지고 셋 컨테이너를 생성함. 
	cout << "현재 집합의 모든 요소는 다음과 같습니다." << endl;
	copy(st.begin(), st.end(), ostream_iterator<int>(cout, " "));
	cout << endl;
	
	st.insert(60);	// 요소의 추가 
	st.insert(70);	// 요소의 추가 
	st.erase(20);	// 요소의 삭제 
	cout << "현재 집합의 모든 요소는 다음과 같습니다." << endl;
	copy(st.begin(), st.end(), ostream_iterator<int>(cout, " "));
	return 0;
}