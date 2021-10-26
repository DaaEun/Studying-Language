#include <iostream>
#include <vector>
#include <iterator>
#include <algorithm>
#include <functional>
using namespace std;

int main(void)
{
	vector<int> vc = {20, 40, 10, 30};	// vector 객체의 선언 및 초기화 

	sort(vc.begin(), vc.end(), greater<int>());
	copy(vc.begin(), vc.end(), ostream_iterator<int>(cout, " "));
	cout << endl;
	
	// sort(vc.begin(), vc.end(), less<int>());
	// copy(vc.begin(), vc.end(), ostream_iterator<int>(cout, " "));
	return 0;
}