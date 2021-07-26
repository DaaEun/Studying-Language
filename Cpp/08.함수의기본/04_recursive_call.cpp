#include <iostream>
using namespace std;

int RecursiveSum(int);

int main(void)
{
	int n = 10;
	
	cout << "1부터 " << n << "까지의 합은 " << RecursiveSum(n) << "입니다.";
	return 0;
}

int RecursiveSum(int n)
{
	if (n == 1)						// n이 1이면, 그냥 1을 반환함. 
	{
		return 1;
	}
	return n + RecursiveSum(n-1);	// n이 1이 아니면, n을 1부터 (n-1)까지의 합과 더한 값을 반환함.
}