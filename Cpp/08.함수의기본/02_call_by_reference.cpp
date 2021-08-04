// 참조에 의한 전달 방법은 인수로 전달된 변수의 값을 복사하는 것이 아닌, 원본 데이터를 직접 전달하는 것이다.

#include <iostream>
using namespace std;

void Local(int&);

int main(void) {

	int var = 10;
	cout << " 변수 var 초기값 : " << var << endl << endl;

	Local(var);
	cout << "Local()함수 호출 후 변수 var : " << var;

	return 0;
}

void Local(int& num) {
	num += 10;
}