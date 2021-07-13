#include <iostream>
#include <string>
using namespace std;

int main(void) {

	string address, name;

	cout << "이름 : ";
	getline(cin, name);
	cout << "도시 : ";
	getline(cin, address);

	cout << address << "에 살고 있는 " << name << "님~ 안녕하세요.";

	return 0;
}
// 앞서 살펴본 문자열의 띄어쓰기 문제나 문자열의 길이와 상관없이 모든 문자열을 정확히 입력받을 수 있다.