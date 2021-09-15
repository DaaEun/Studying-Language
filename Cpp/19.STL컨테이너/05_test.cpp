#include <iostream>
#include <stack>
using namespace std;

int main(void)
{
	int decimal = 123;
	stack<int> st;
	
	// 10진수를 2진수로 변환 
	do {
		st.push(decimal % 2);
		decimal /= 2;
	} while(decimal);
	
	// 스택의 모든 요소를 인출 
	while(!st.empty())
	{
		cout << st.top();
		st.pop();
	}
	return 0;
}