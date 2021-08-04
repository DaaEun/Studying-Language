/*
	# 함수 포인터
	- 프로그램에서 정의된 함수는 프로그램이 실행될 때 모두 메인 메모리에 올라간다.
	- 이때 함수의 이름은 메모리에 올라간 함수의 시작 주소를 가리키는 포인터 상수(constant pointer)가 된다.
	- 함수의 시작 주소를 가리키는 포인터 상수를 함수 포인터(function pointer)라고 한다.

	# 포인터 상수(constant pointer)란 포인터 변수가 가리키고 있는 주소 값을 변경할 수 없는 포인터를 의미하며,
	상수 포인터(pointer to constant)란 상수를 가르키는 포인터를 의미한다.
*/

#include <iostream>
using namespace std;

double Add(double, double);
double Sub(double, double);
double Mul(double, double);
double Div(double, double);
double Calculator(double, double, double (*func)(double, double));

int main(void) {

	double (*calc)(double, double) = NULL;	//함수 포인터 선언
	/*
		포인터를 초기화할 때 0이나 NULL을 대입하여 초기화한 포인터를 널 포인터(null pointer)라고 한다.
		널 포인터는 아무것도 가리키지 않는 포인터라는 의미이다.	
	*/
	double num1 = 3, num2 = 4, result = 0;
	char oper = '*';

	switch (oper)
	{
	case '+':
		calc = Add;
		break;
	case '-':
		calc = Sub;
		break;
	case '*':
		calc = Mul;
		break;
	case '/':
		calc = Div;
		break;
	default:
		cout << "사칙연산(+,-,*,/)만 지원한다.";
		break;
	}

	result = Calculator(num1, num2, calc);
	cout << "결과 : " << result;
	
	return 0;
}

double Add(double num1, double num2) {
	return num1 + num2;
}
double Sub(double num1, double num2) {
	return num1 - num2;
}
double Mul(double num1, double num2) {
	return num1 * num2;
}
double Div(double num1, double num2) {
	return num1 / num2;
}
double Calculator(double num1, double num2, double (*func)(double, double)) {
	return func(num1, num2);
}
