/*
	# 정적 변수(static variable)
	- 메모리상의 데이터(data) 영역에 저장되며, 초기화하지 않으면 0으로 자동 초기화한다.

	1. 연결을 가지지 않는 정적 변수
	2. 내부 연결을 가지는 정적 변수
	3. 외부 연결을 가지는 정적 변수
*/ 

//1. 연결을 가지지 않는 정적 변수
#include <iostream>
using namespace std;

void Local(void);
void StaticVar(void);

int main(void) {

	for (int i = 0; i < 3; i++) {
		Local();
		StaticVar();
	}
	return 0;
}

void Local(void) {

	int count = 1;
	cout << "Local() 함수 " << count << " 번째 호출" << endl;
	count++;
}

void StaticVar(void) {
	static int static_count = 1; // 연결을 가지지 않는 정적 변수
	cout << "StaticVar() 함수 " << static_count << " 번째 호출" << endl;
	static_count++;
}
