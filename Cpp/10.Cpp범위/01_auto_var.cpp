/*
	# 자동 변수(automatic variable)
	- 블록 내에서 선언된 변수를 의미하며, 함수의 매개변수도 여기에 포함된다.
	- 자동 변수는 변수선언된 블록 내에서만 유효하며, 블록이 종료되면 메모리에서 사라진다.
	- 메모리상의 스택(stack) 영역에 저장되며, 초기화하지 않으면 의미 없는 값(쓰레깃값)으로 초기화된다.
	- C언어의 지역 변수(local variable)와 같은 의미이다.
*/
#include <iostream>
using namespace std;

void Local(void);

int main(void) {

	int i = 5;
	int var = 10;
	cout << "main() 함수 내의 자동 변수 var : " << var << endl;

	if (i < 10) {
		Local();
		int var = 30;
		cout << "if문 내의 자동 변수 var : " << var << endl;
	}
	cout << "if문 후 자동 변수 var : " << var << endl;
	return 0;
}

void Local(void) {

	int var = 20;
	cout << "Local() 함수 내의 자동 변수 var : " << var << endl;
}