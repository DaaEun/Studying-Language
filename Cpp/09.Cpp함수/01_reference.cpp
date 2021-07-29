#include <iostream>
using namespace std;

int main(void)
{
	int x = 10;	// 변수의 선언 
	int& y = x;	// 참조자 선언 
	
	cout << "x : " << x << ", y : " << y << endl;
	y++;		// 참조자를 이용한 증가 연산
	cout << "x : " << x << ", y : " << y << endl;
	cout << "x의 주소값 : " << &x << ", y의 주소값 : " << &y;
	return 0;
}