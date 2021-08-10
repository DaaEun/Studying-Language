/*
	# 매크로 함수(macro function)
	C언어에서 C++의 인라인 함수와 비슷한 기능의 매크로 함수를 사용한다.
	#define 선행처리 지시문에 인수로 함수의 정의를 전달함으로써, 함수처럼 동작하는 매크로를 만들 수 있다.

	하지만 매크로 함수는 일반 함수와는 달리 단순 치환만을 해주므로, 일반 함수와 똑같은 방식으로 동작하지 않는다.
	일반 함수처럼 사용하기 위해서는 모든 인수를 괄호({})로 감싸야 한다.
	일반 함수처럼 값이나 수식을 인수로 전달할 수 있으며, 매개변수 타입에 맞춘 자동 타입 변환도 지원한다.
*/
#include <iostream>
using namespace std;

inline int Sqr(int x) {
	return x * x;
}

int main(void) {
	
	int result;
	int x = 5;

	cout << "계산 결과 : " << Sqr(10) << endl;
	cout << "계산 결과 : " << Sqr(x) << endl;
	cout << "계산 결과 : " << Sqr(x+3);

	return 0;
}