/*
	# 디폴트 인수(default argument)
	- C++에서 새롭게 정의된 디폴트 인수는 기본값이 미리 정의되어 있는 인수를 의미한다.
	- 함수를 호출할 때 인수를 전달하지 않으면, 함수는 자동으로 미리 정의되어 있는 디폴트 인수값을 사용한다.


	# 디폴트 인수의 설정
	1. 함수의 원형에만 지정할 수 있다.
	2. 가장 오른쪽부터 시작하여 순서대로만 지정할 수 있다.
	3. 가운데 인수들만 별도로 지정할 수는 없다.


	# 디폴트 인수가 설정된 함수의 호출
	- 함수로 전달된 인수는 왼쪽부터 순서대로 매개변수 목록에 대입된다.
	- 따라서 디폴트 인수가 설정된 함수를 호출할 때에는 인수의 전달을 건너뛸 수 없다.
*/
#include <iostream>
using namespace std;

double Multi(double, double = 2);

int main(void) {

	cout << Multi(3) << endl;		// 3 * 3
	cout << Multi(3, 3) << endl;	// 3 * 3 * 3
	cout << Multi(3, 4) << endl;	// 3 * 3 * 3 * 3

	return 0;
}

double Multi(double x, double n) {

	double result = x;

	for (int i = 1; i < n; i++) {
		result *= x;
	}

	return result;
}