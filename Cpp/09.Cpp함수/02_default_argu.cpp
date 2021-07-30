#include <iostream>
using namespace std;

double Multi(double, double = 2);

int main(void)
{
	cout << Multi(3) << endl;		// Multi(3, 2)¿Í °°À½ : 3 * 3 
	cout << Multi(3, 3) << endl;	// 3 * 3 * 3
	cout << Multi(3, 4);			// 3 * 3 * 3 * 3
	return 0;
}

double Multi(double x, double n)
{
	double result = x;
	
	for (int i = 1; i < n; i++)
	{
		result *= x;
	}
	return result;
}