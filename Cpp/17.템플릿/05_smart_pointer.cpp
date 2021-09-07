/*
	# 스마트 포인터(smart pointer)
	new 키워드를 사용하여 동적으로 할당받은 메모리는, 반드시 delete 키워드를 사용하여 해제해야 한다.
	C++에서는 메모리 누수(memory leak)로부터 프로그램의 안전성을 보장하기 위해 스마트 포인터를 제공한다.
	
	- 포인터처럼 동작하는 클래스 템플릿으로, 사용이 끝난 메모리를 자동으로 해제해 준다.


	# 스마트 포인터의 종류
 
	1. unique_ptr
	2. shared_ptr
	3. weak_ptr
*/
/*
	# unique_ptr
	- 하나의 스마트 포인터만이 특정 객체를 소유할 수 있도록, 객체에 소유권 개념을 도입한 스마트 포인터이다.


	- 해당 객체의 소유권을 가지고 있을 때만, 소멸자가 해당 객체를 삭제할 수 있다.
	- move() 멤버 함수를 통해 소유권을 이전할 수는 있지만, 복사할 수는 없다.
	- 소유권이 이전되면, 이전 unique_ptr 인스턴스는 더는 해당 객체를 소유하지 않게 재설정된다.
*/
#include <iostream>
#include <memory>
using namespace std;

class Person
{
private:
	string name_;
	int age_;
public:
	Person(const string& name, int age);	// 기초 클래스 생성자의 선언 
	~Person() { cout << "소멸자가 호출되었습니다." << endl; }
	void ShowPersonInfo();
};

int main(void)
{
	shared_ptr<Person> hong = make_shared<Person>("길동", 29);
	cout << "현재 소유자 수 : " << hong.use_count() << endl;	// 1
	auto han = hong;
	cout << "현재 소유자 수 : " << hong.use_count() << endl;	// 2
	han.reset();		// shared_ptr인 han을 해제함. 
	cout << "현재 소유자 수 : " << hong.use_count() << endl;	// 1
	return 0;
}

Person::Person(const string& name, int age)	// 기초 클래스 생성자의 정의 
{
	name_ = name;
	age_ = age;
	cout << "생성자가 호출되었습니다." << endl;
}

void Person::ShowPersonInfo()
{
	cout << name_ << "의 나이는 " << age_ << "살입니다." << endl;
}