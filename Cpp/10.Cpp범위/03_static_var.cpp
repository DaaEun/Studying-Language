//2. 내부 연결을 가지는 정적 변수
#include <iostream>
using namespace std;

static int var;	// 내부 연결을 가지는 정적 변수

void Local(void);

int main(void) {

	cout << "var 초기값 : " << var << endl;
	
	int i = 5;
	int var = 10;	// 자동 변수 선언
	cout << "main() 함수 내의 자동 변수 var 초기값 : " << var << endl;

	if (i < 10) {

		Local();
		cout << "현재 var 값 : " << var << endl;
	}
	cout << "더 이상 main() 함수에서 정적 변수 var에 접근 불가" << endl;
	return 0;
}

void Local(void) {

	var = 20;	// 정적 변수 값 변경
	cout << "Local() 함수 내의 정적 변수 var 값 : " << var << endl;
}