#include <iostream>
using namespace std;

int main(void) {
	
	int x = 10;	//변수의 선언
	int& y = x;	//참조자 선언

	cout << "x : " << x << ", y : " << y << endl;
	y++;
	cout << "x : " << x << ", y : " << y << endl;
	cout << "x 주소값 : " << &x << ", y 주소값 : " << &y << endl;

	return 0;
}