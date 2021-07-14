/*
	# 메모리의 동적할당(dynamic allocation)
	데이터 영역과 스택 영역에 할당되는 메모리의 크기는 compile time에 의해 미리 결정된다.
	하지만 힙 영역의 크기는 프로그램이 실행되는 도중인 run time에 사용자가 직접 결정한다.
	이렇게 run time에 메모리를 할당받는 것을 메모리의 동적할당(dynamic allocation)이라 한다.

	포인터의 가장 큰 목적은 런 타임에 이름 없는 메모리를 할당받아 포인터에 할당하여, 할당받은 메모리에 접근하는 것이다.
	C언어에서는 malloc() 함수 등의 라이브러리 함수를 제공하여 이러한 작업을 수행할 수 있게 해준다.

	C++에서도 C언어의 라이브러리 함수를 사용하여 메모리의 동적 할당 및 해제를 할 수 있다.
	하지만 C++에서는 메모리의 동적 할당 및 해제를 위한 더욱 효과적인 방법을 new 연산자와 delete 연산자를 통해 제공한다.
*/
#include <iostream>
using namespace std;

int main(void) {

	int* ptr_int = new int;
	*ptr_int = 100;

	double* ptr_double = new double;
	*ptr_double = 3.14;

	cout << "int형 숫자 값 : " << *ptr_int << endl;
	cout << "int형 숫자의 메모리 주소 : " << ptr_int << endl;

	cout << "double형 숫자 값 : " << *ptr_double << endl;
	cout << "double형 숫자의 메모리 주소 : " << ptr_double << endl;

	delete ptr_int;
	delete ptr_double;
	// new 연산자를 통해 생성한 메모리가 아닌 변수를 선언하여 생성한 메모리는 delete 연산자로 해제할 수 없다.
	
	return 0;
}