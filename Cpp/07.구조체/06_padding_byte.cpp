#include <iostream>
using namespace std;

struct TypeSize
{
	char a;
	int b;
	double c;
};

int main(void) {

	cout << "구조체 TypeSize의 각 멤버의 크기는 다음과 같다." << endl;
	cout << "char a   : " << sizeof(char) << endl;
	cout << "int b    : " << sizeof(int) << endl;
	cout << "double c : " << sizeof(double) << endl << endl;

	cout << "구조체 TypeSize의 크기는 다음과 같다." << endl;
	cout << sizeof(TypeSize);

	return 0;
}

/*
	구조체를 메모리에 할당할 때 컴파일러는 프로그램의 속도 향상을 위해 바이트 패딩(byte padding)규칙을 이용한다.

	구조체는 다양한 크기의 타입을 멤버 변수로 가질 수 있는 타입이다.
	하지만 컴파일러는 메모리의 접근을 쉽게 하려고 크기가 가장 큰 멤버 변수를 기준으로 모든 멤버 변수의 메모리 크기를 맞추게 된다.
	이것을 바이트 패딩이라고 하며, 이때 추가되는 바이트를 패딩 바이트(padding byte)라고 한다.
*/