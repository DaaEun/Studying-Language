#include <iostream>
#include <iterator>
#include <list>
using namespace std;

int main(void)
{
	list<int> ls = {10};
	ls.push_back(20);	// back_insert_iterator를 사용함. 
	ls.push_front(30);	// front_insert_iterator를 사용함. 
	copy(ls.begin(), ls.end(), ostream_iterator<int>(cout, " "));
	return 0;
}