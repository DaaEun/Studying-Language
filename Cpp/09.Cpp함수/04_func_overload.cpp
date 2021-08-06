/*
	# 함수 오버로딩(function overloading)
	- 같은 이름의 함수를 중복하여 정의하는 것을 의미한다.

	- C++에서 새롭게 추가된 함수 오버로딩은 여러 함수를 하나의 이름으로 연결한다.
	- 즉, 같은 일을 처리하는 함수를 매개변수의 형식을 조금씩 달리하여, 하나의 이름으로 작성 가능하다는 것이다.
	- 함수 오버로딩은 객체 지향 프로그래밍의 특징 중 바로 다형성(polymorphism)의 구현이다.

	# 함수 시그니처(function signature)
	- 함수의 원형에 명시되는 매개변수 리스트를 가리킨다.

	- 만약 두 함수가 매개변수의 개수와 그 타입이 모두 같다면, 이 두 함수의 시그니처는 같다고 할 수 있다.
	- 즉, 함수의 오버로딩은 서로 다른 시그니처를 갖는 여러 함수를 같은 이름으로 정의하는 것이다.
*/
#include <iostream>
using namespace std;

void Shift(int, int);
void Shift(int, int, int);
void Shift(int, int, int, int);

int main(void)
{
	Shift(1, 2);
	Shift(1, 2, 3);
	Shift(1, 2, 3, 4);
	return 0;
}

void Shift(int a, int b)
{
	int temp;

	temp = a;
	a = b;
	b = temp;

	cout << a << ", " << b << endl;
}

void Shift(int a, int b, int c)
{
	int temp;

	temp = a;
	a = b;
	b = c;
	c = temp;

	cout << a << ", " << b << ", " << c << endl;
}

void Shift(int a, int b, int c, int d)
{
	int temp;

	temp = a;
	a = b;
	b = c;
	c = d;
	d = temp;

	cout << a << ", " << b << ", " << c << ", " << d << endl;
}