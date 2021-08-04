/*
	# 공용체(union)
	- union 키워드를 사용하여 선언하며, 모든 면에서 구조체와 같다.
	- 하지만 모든 멤버 변수가 하나의 메모리 공간을 공유한다는 점만 다르다.
	- 모든 멤버 변수가 같은 메모리를 공유하기 때문에, 공용체는 한 번에 하나의 멤버 변수밖에 사용할 수 없다.

	- 순서가 규칙적이지 않고, 미리 알 수 없는 다양한 타입의 데이터를 저장할 수 있도록 설계된 타입이다.
	- 크기가 가장 큰 멤버 변수의 크기로 메모리를 할당받는다.
	- 따라서, 같은 크기로 구성된 배열 요소에 다양한 크기의 데이터를 저장할 수 있다.
*/

#include <iostream>
using namespace std;

union ShareData {

	unsigned char a;
	unsigned short b;
	unsigned int c;
};

int main(void) {

	ShareData var;
	var.c = 0x12345678;

	cout << hex;
	cout << var.a << endl;
	cout << var.b << endl;
	cout << var.c;

	return 0;
}