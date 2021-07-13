#include <iostream>
#include <string>
using namespace std;

int main(void) {
	
	string dog;

	cout << "초기화 dog 변수의 길이 : " << dog.length() << endl;

	dog = "black흰둥이";
	cout << "dog 변수 값 입력 완료" << endl;
	cout << "dog 변수 값 : " << dog << endl;
	cout << "dog 변수 길이 : " << dog.length() << endl;
	cout << "dog 변수의 첫 글자 : " << dog[0];
	
	return 0;
}