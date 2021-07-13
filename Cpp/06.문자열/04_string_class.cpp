#include <iostream>
#include <string>
using namespace std;

int main(void) {
	
	string str1 = "C++ is easy!";
	string str2;

	str2 = str1;	// 문자열 대입 연산
	cout << str2 << endl;


	string str3 = "I'm studying ";
	string str4 = "C++.";
	string str5;

	str5 = str3 + str4;	// 문자열 결합 연산
	cout << str5 << endl;
	str3 += str4;		// 문자열 추가 연산
	cout << str3 << endl;
	return 0;
}