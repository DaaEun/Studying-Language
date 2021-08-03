#include <iostream>
using namespace std;

inline int Sqr(int x)
{
	return x * x;
}

int main(void)
{
	int result;
	int x = 5;
	
	cout << "계산 결과는 " << Sqr(10) << "입니다." << endl;
	cout << "계산 결과는 " << Sqr(x) << "입니다." << endl;
	cout << "계산 결과는 " << Sqr(x+3) << "입니다.";
	return 0;
}