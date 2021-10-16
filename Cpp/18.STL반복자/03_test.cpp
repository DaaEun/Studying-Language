#include <iostream>
#include <iterator>
#include <list>
using namespace std;

int main(void)
{
	list<int> ls = {10, 20, 30};
	list<int>::iterator iter;
	list<int>::const_iterator citer;
	
	iter = ls.begin();
	*iter = 100;
	citer = ls.end();
	// *citer = 300;	// 상수 반복자이므로 값의 변경은 불가능함. 
		
	for(citer = ls.begin(); citer != ls.end(); citer++)
	{
		cout << *citer << " ";
	}
	return 0;
}