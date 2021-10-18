#include <iostream>
#include <iterator>
#include <vector>
using namespace std;

int main(void)
{
	vector<int> vc = {1, 2, 3, 4, 5};
	//copy(vc.begin(), vc.end(), ostream_iterator<int>(cout));
	cout << endl;
	//copy(vc.begin(), vc.end(), ostream_iterator<int>(cout, " "));
	return 0;
}