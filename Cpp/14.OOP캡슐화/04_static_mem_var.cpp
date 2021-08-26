/*
	# 정적 멤버함수 특징

	1. 객체를 생성하지 않고 클래스 이름만으로 호출할 수 있다.
	2. 객체를 생성하지 않으므로, this 포인터를 가지지 않는다.
	3. 특정 객체와 결합하지 않으므로, 정적 멤버 변수밖에 사용할 수 없다.
*/
#include <iostream>
using namespace std;

class Person {
private:
	string name_;
	int age_;
public:
	static int person_count_;				// 정적 멤버 변수의 선언
	static int person_count();				// 정적 멤버 함수의 선언
	Person(const string& name, int age);	// 생성자
	~Person() { person_count_--; }			// 소멸자
	void ShowPersonInfo();
};

int Person::person_count_ = 0;	//정적 멤버 변수의 정의 및 초기화

int main(void) {
	
	Person yang("다은", 24);
	yang.ShowPersonInfo();
	Person im("진혁", 49);
	im.ShowPersonInfo();

	cout << "현재 등록한 총 인원 수는 " << Person::person_count() << " 명 입니다." << endl;

	return 0;
}

Person::Person(const string& name, int age) {
	
	name_ = name;
	age_ = age;
	cout << ++person_count_ << " 번째 사람이 등록했습니다." << endl;
}

void Person::ShowPersonInfo() {
	cout << name_ << " 님은 " << age_ << " 세 입니다." << endl;
}

int Person::person_count() {	// 정적 멤버 함수의 정의
	return person_count_;
}