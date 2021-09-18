#include <iostream>
#include <functional>
using namespace std;

int main(void)
{
	plus<int> add;
	equal_to<int> comp;
	greater_equal<int> ge;
	
	cout << add(7, 3) << endl;
	cout << comp(7, 3) << endl;
	cout << ge(7, 3);
	return 0;
}