/*
	# string 메소드

	1. length() 메소드와 size() 메소드
	2. append() 메소드
	3. find() 메소드
	4. compare() 메소드
	5. replace() 메소드
	6. capacity() 메소드와 max_size() 메소드
*/
#include <iostream>
#include <string>
using namespace std;

int main(void) {

	cout << "1. length() 메소드와 size() 메소드" << endl;
	string str1 = "C++ Programming";

	cout << "length() 메소드 : " << str1.length() << endl;
	cout << "size() 메소드 : " << str1.size() << endl;
	// length() 메소드는 문자열의 길이를 나타내지만, 
	// size() 메소드는 해당 string 객체가 메모리에서 실제 사용하고 있는 크기를 나타낸다.
	cout << endl;



	cout << "2. append() 메소드" << endl;
	string str2, str3, str4;

	str2.append("Let's go to a party!");
	str3.append("Let's go to a party!", 4, 7);
	str4.append(4, 'X');

	cout << str2 << endl;
	cout << str3 << endl;
	cout << str4 << endl;
	cout << endl;



	cout << "3. find() 메소드" << endl;
	cout << str1.find("Pro") << endl;
	cout << str1.find('r') << endl;

	if (str1.find("Pro", 5) != string::npos) {
		cout << "해당 문자열을 찾았습니다." << endl;
	}
	else {
		cout << "해당 문자열을 찾지 못했습니다." << endl;
	}
	// find() 메소드는 찾지 못하면, string::size_type의 string::npos라는 상수를 반환한다.
	// 정적 상수인 string::npos 는 static const size_type = -1 로 명시되어 있다.
	cout << endl;



	cout << "4. compare() 메소드" << endl;
	string str5 = "ABC";
	string str6 = "ABD";

	if (str5.compare(str6) == 0) {
		cout << str5 << "가(이) " << str6 << "와 같다." << endl;
	}
	else if (str5.compare(str6) < 0) {
		cout << str5 << "가(이) " << str6 << "보다 사전 편찬 순으로 앞에 있다." << endl;
	}
	else if (str5.compare(str6) > 0) {
		cout << str5 << "가(이) " << str6 << "보다 사전 편찬 순으로 뒤에 있다." << endl;
	}
	cout << endl;



	cout << "5. replace() 메소드" << endl;
	string str7 = "He is very nice!";
	string str8 = "nice";
	string str9 = "handsome";

	string::size_type index = str7.find(str8);
	if (index != string::npos) {
		str7.replace(index, str8.length(), str9);
	}
	cout << str7 << endl;
	// replace() 메소드를 사용하기 전, find() 메소드를 사용하여 해당 문자열이 존재하는 파악하는 것이 좋다.
	cout << endl;



	cout << "6. capacity() 메소드와 max_size() 메소드" << endl;
	// capacity() 메소드는 해당 문자열이 재대입(reallocation) 받지 않고 저장할 수 있는 최대 문자열의 길이를 반환한다.
	// max_size() 메소드는 해당 문자열이 최대한 대입받으면 가질 수 있는 최대 문자열의 길이를 반환한다.
	cout << "length : " << str1.length() << endl;
	cout << "capacity : " << str1.capacity() << endl;
	cout << "max_size : " << str1.max_size() << endl;

	return 0;
}