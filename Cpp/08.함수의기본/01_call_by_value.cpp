#include <iostream>
using namespace std;

void Local(int);

int main(void) {

	int var = 10;
	cout << " 변수 var 초기값 : " << var << endl << endl;

	Local(var);
	cout << "Local()함수 호출 후 변수 var : " << var;
	
	return 0;
}

void Local(int num) {
	num += 10;
}