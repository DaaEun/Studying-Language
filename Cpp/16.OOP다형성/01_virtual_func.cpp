/*
	# 동적 바인딩(dynamic binding)
	함수를 호출할 때, 어느 블록에 있는 함수를 호출하고, 해당 함수가 저장된 정확한 메모리 위치도 알아야 한다.
	이처럼 함수를 호출하는 코드에서 어느 블록에 있는 함수를 실행하라는 의미로 바인딩(binding)이라 한다.
	하지만 함수가 오버로딩될 수 있으므로 이 작업이 조금 복잡해진다.

	대부분 함수를 호출하는 코드는 컴파일 타임에 고정된 메모리 주소로 변환된다.
	이것을 정적 바인딩(static binding) 또는 초기 바인딩(early binding)이라 한다.
	C++에서 가상 함수가 아닌 멤버 함수는 모두 이러한 정적 바인딩이다.

	하지만 가상 함수의 호출은 컴파일러가 어떤 함수를 호출해야 하는지 미리 알 수 없다.
	왜냐하면, 가상 함수는 프로그램이 실행될 때 객체를 결정하므로, 컴파일 타임에 해당 객체를 특정할 수 없기 때문이다.
	따라서 가상 함수의 경우, 런 타임에 올바른 함수가 실행될 수 있도록 해야 한다.
	이것을 동적 바인딩(dynamic binding) 또는 지연 바인딩(late binding)이라고 합니다.

	하지만 가상 함수도 결합하는 타입이 분명할 때에는 일반 함수와 같이 정적 바인딩을 한다.
	기초 클래스 타입의 포인터나 참조를 통하여 호출될 때만 동적 바인딩을 한다.
*/
#include <iostream>
using namespace std;

class A {
public:
	virtual void Print() { cout << "A 클래스 Print()" << endl; }
};

class B : public A {
	virtual void Print() { cout << "B 클래스 Print()" << endl; }
};

int main(void) {

	A* ptr;
	A objA;
	B objB;

	ptr = &objA;
	ptr->Print();
	ptr = &objB;
	ptr->Print();

	return 0;
}