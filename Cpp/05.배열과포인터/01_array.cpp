#include <iostream>
using namespace std;

int main(void) {
	
	int grade[] = { 85, 65, 90 };				// 배열의 길이를 명시하지 않음
	int len = sizeof(grade) / sizeof(grade[0]);	// 배열의 길이를 구하는 공식

	cout << "배열 grade의 길이는 " << len << "입니다.";
	return 0;
}