/*
	# shared_ptr
	- 하나의 특정 객체를 참조하는 스마트 포인터가 총 몇 개인지를 참조하는 스마트 포인터이다.
	- 이렇게 참조하고 있는 스마트 포인터의 개수를 참조 횟수(reference count)라고 한다.
	
	- 참조 횟수는 특정 객체에 새로운 shared_ptr이 추가될 때마다 1씩 증가, 수명이 다할 때마다 1씩 감소한다.
	- 따라서 마지막 shared_ptr의 수명이 다하여, 참조 횟수가 0이 되면 delete 키워드를 사용하여 메모리를 자동 해제한다.
*/

#include <iostream>
#include <memory>
using namespace std;

class Person {
private:
	string name_;
	int age_;
public:
	Person(const string& name, int age);	// 기초 클래스 생성자의 선언
	~Person() {
		cout << "소멸자 호출" << endl;
	}
	void ShowPersonInfo();
};

int main(void) {

	shared_ptr<Person> yang = make_unique<Person>("양다은", 24);
	cout << "소유자 수 : " << yang.use_count() << endl;	// 1
	auto yya = yang;
	cout << "소유자 수 : " << yang.use_count() << endl;	// 2
	yya.reset();	//shared_ptr인 yya 해제
	cout << "소유자 수 : " << yang.use_count() << endl;	// 1
	
	return 0;
}

Person::Person(const string& name, int age) {// 기초 클래스 생성자의 정의
	name_ = name;
	age_ = age;
	cout << "생성자 호출" << endl;
}

void Person::ShowPersonInfo() {
	cout << name_ << "의 나의 : " << age_ << endl;
}



/*
	# weak_ptr
	- 하나 이상의 shared_ptr 인스턴스가 소유하는 객체에 대한 접근을 제공하지만, 소유자의 수에는 포함되지 않는 것이다.
 
	- shared_ptr은 참조 횟수를 기반으로 동작하는 스마트 포인터이다.
	- 만약 서로가 상대방을 가리키는 shared_ptr를 가지고 있다면, 
	참조 횟수는 절대 0이 되지 않으므로 메모리는 영원히 해제되지 않는다.
	- 서로가 상대방을 참조하고 있는 상황을 순환 참조(circular reference)라고 한다.
	- weak_ptr은 바로 이러한 shared_ptr 인스턴스 사이의 순환 참조를 제거하기 위해서 사용된다.
*/