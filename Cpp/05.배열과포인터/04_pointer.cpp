/*
	# 포인터
	- 메모리의 주소값을 저장하는 변수
	- 주소 연산자(&)
	- 참조 연산자(*)
*/


#include <iostream>
using namespace std;

int main(void)
{
	int num1 = 1234;
	double num2 = 3.14;

	int* ptr_num1 = &num1;
	double* ptr_num2 = &num2;

	cout << "포인터의 크기는 " << sizeof(ptr_num1) << "입니다." << endl;
	cout << "포인터 ptr_num1가 가리키고 있는 주소값은 " << ptr_num1 << "입니다." << endl;
	cout << "포인터 ptr_num1가 가리키고 있는 주소에 저장된 값은 " << *ptr_num1 << "입니다." << endl;
	cout << "포인터 ptr_num2가 가리키고 있는 주소값은 " << ptr_num2 << "입니다." << endl;
	cout << "포인터 ptr_num2가 가리키고 있는 주소에 저장된 값은 " << *ptr_num2 << "입니다.";
	return 0;
}