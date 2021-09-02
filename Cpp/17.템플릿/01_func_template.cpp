/*
	# 템플릿(template)
	- 매개변수의 타입에 따라 함수나 클래스를 생성하는 메커니즘을 의미한다.
	- 템플릿은 타입이 매개변수에 의해 표현되므로, 매개변수화 타입(parameterized type)이라고도 불린다.
	- 템플릿을 사용하면 타입마다 별도의 함수나 클래스를 만들지 않고, 
	여러 타입에서 동작할 수 있는 단 하나의 함수나 클래스를 작성하는 것이 가능하다.


	# 함수 템플릿(function template)
	- 함수의 일반화된 선언을 의미한다.
	- 함수 템플릿을 사용하면 같은 알고리즘을 기반으로 하면서, 서로 다른 타입에서 동작하는 함수를 한 번에 정의할 수 있다.
	- 임의의 타입으로 작성된 함수에 특정 타입을 매개변수로 전달하면, 해당 타입에 맞는 함수가 생성된다.

	- C++98에서 추가된 typename 키워드 이전에는 class 키워드를 사용했다.
	따라서 C++ 컴파일러는 템플릿 정의 내의 typename 키워드와 class 키워드를 같은 것으로 간주한다.

	- 타입 이름은 함수의 원형과 본체에서 임의의 타입으로 사용할 수 있다.
	이렇게 정의된 함수 템플릿을 호출할 때 매개변수로 int형을 전달하면, 
	함수의 원형과 본체에서 정의된 타입 이름은 모두 int형으로 바뀌게 된다.
*/
#include <iostream>
using namespace std;

template <typename T>
void Swap(T& a, T& b);

int main(void) {

	int c = 2, d = 3;
	cout << "c : " << c << ", d : " << d << endl;
	Swap(c, d);
	cout << "c : " << c << ", d : " << d << endl;

	string e = "yang", f = "kim";
	cout << "e : " << e << ", f : " << f << endl;
	Swap(e, f);
	cout << "e : " << e << ", f : " << f << endl;

	return 0;
}

template <typename T>
void Swap(T& a, T& b) {

	T temp;
	temp = a;
	a = b;
	b = temp;
}