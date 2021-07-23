#include <iostream>
using namespace std;

int SmallNum(int, int);

int main(void)
{
	int result;

	result = SmallNum(4, 6);
	cout << " 두 수 중 더 작은 수는 " << result << "입니다." << endl;
	result = SmallNum(8, 6);
	cout << " 두 수 중 더 작은 수는 " << result << "입니다." << endl;
	result = SmallNum(2, 8);
	cout << " 두 수 중 더 작은 수는 " << result << "입니다." << endl;
	return 0;
}

int SmallNum(int num1, int num2)
{
	if (num1 <= num2)
	{
		return num1;
	}
	else
	{
		return num2;
	}
}