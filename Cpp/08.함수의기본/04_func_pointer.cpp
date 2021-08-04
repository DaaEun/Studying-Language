/*
	# typedef 키워드를 이용하면 복잡한 함수 포인터형에 새로운 이름을 붙일 수 있다.
*/

#include <iostream>
using namespace std;

typedef double (*Arith)(double, double);	//typedef 키워드를 이용한 새로운 선언

double Add(double, double);
double Sub(double, double);
double Mul(double, double);
double Div(double, double);
double Calculator(double, double, Arith);

int main(void) {

	Arith calc = NULL;	//함수 포인터 선언
	double num1 = 4, num2 = 5, result = 0;
	char oper = '+';

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
double Calculator(double num1, double num2, Arith func) {
	return func(num1, num2);
}
