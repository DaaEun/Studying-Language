#include <iostream>
using namespace std;

void Local(int&);

int main(void)
{
	int var = 10;
	cout << "변수 var의 초기값은 " << var << "입니다." << endl;
	
	Local(var);
	cout << "Local() 함수 호출 후 변수 var의 값은 " << var << "입니다.";
	return 0;
}

void Local(int& num)
{
	num += 10;
}