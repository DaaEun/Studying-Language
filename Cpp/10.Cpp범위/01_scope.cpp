#include <iostream>
using namespace std;

void Local(void);

int main(void)
{
	int i = 5;
	int var = 10;
	cout << "main() 함수 내의 자동 변수 var의 값은 " << var << "입니다." << endl;

	if (i < 10)
	{
		Local();
		int var = 30;
		cout << "if 문 내의 자동 변수 var의 값은 " << var << "입니다." << endl;
	}
	cout << "현재 자동 변수 var의 값은 " << var << "입니다." << endl;
	return 0;
}

void Local(void)
{
	int var = 20;
	cout << "Local() 함수 내의 자동 변수 var의 값은 " << var << "입니다." << endl;
}