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