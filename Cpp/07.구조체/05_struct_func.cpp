#include <iostream>
#include <string>
using namespace std;

struct Name {

	string first;
	string last;
};

struct Friends {

	Name first_name;
	string address;
	string job;
};

int main(void) {

	Friends cho = {
		{"혜림", "조"},
		"서울시 동작구 보라매 언저리",
		"학생"
	};

	cout << cho.address << endl << endl;
	cout << cho.first_name.last << cho.first_name.first << "에게," << endl;
	cout << "그동안 잘 지냈니? 아직도 " << cho.job << "이니?" << endl;
	cout << "다음에 꼭 한번 보자." << endl << "잘 지내.";

	return 0;
}