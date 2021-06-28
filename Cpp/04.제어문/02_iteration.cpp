// 범위 기반의 for 문

#include <iostream>
using namespace std;

int main(void) {
	
	int arr[5] = { 1, 3, 5, 7, 9 };

	for (int element : arr) {
		cout << element << " ";
	}

	return 0;
}