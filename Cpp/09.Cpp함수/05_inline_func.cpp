/*
	# 인라인 함수(inline function)
	- 함수 실행시간이 오래 걸린다면, 함수 호출시간은 전혀 문제가 되지 않는다.
	- 하지만 함수 실행시간이 매우 짧다면, 함수 호출시간도 부담이 될 수 있다.

	- 인라인 함수는 일반적인 함수의 호출과정을 거치지 않고, 함수의 모든 코드를 호출된 자리에 바로 삽입하는 방식의 함수이다.
	- 함수 호출시간은 절약되나, 함수 호출 과정으로 생기는 여러 이점을 포기한다.
	- 따라서 코드가 매우 적은 함수만을 인라인 함수로 선언하는 것이 좋다.
*/
#include <iostream>
using namespace std;

inline int Sub(int x, int y) {
	return x - y;
}

inline void Print(int x) {
	cout << "계산 결과 : " << x;
}

int main(void) {
	
	int num1 = 5, num2 = 3;
	int result;

	result = Sub(num1, num2);
	Print(result);

	return 0;
}
/*
	# 인라인 함수 삽입 예

	int main(void)
	{
		int num1 = 5, num2 = 3;
		int result;
		{
			int x = num1, y = num2;
			result = x - y;
		}
		{
			int x = result;
			cout << "계산 결과는 " << x << "입니다.";
		}
		return 0;
	}
*/