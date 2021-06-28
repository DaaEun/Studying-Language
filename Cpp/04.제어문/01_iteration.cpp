// do/while 문 

#include <iostream>
using namespace std;

int main(void) {

	int i = 0, num = 4;

	do {
		cout << "do / while 문이 현재 " << i + 1 << " 번째 반복 수행중입니다." << endl;
		i++;	
	} while (i < num);

	cout << "do / while 문이 종료된 후 변수 i의 값은 " << i << "입니다." << endl;
	return 0;
}