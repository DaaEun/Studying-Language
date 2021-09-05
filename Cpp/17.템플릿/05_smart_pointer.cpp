#include <iostream>
#include <memory>
using namespace std;

class Person
{
private:
	string name_;
	int age_;
public:
	Person(const string& name, int age);	// ���� Ŭ���� �������� ���� 
	~Person() { cout << "�Ҹ��ڰ� ȣ��Ǿ����ϴ�." << endl; }
	void ShowPersonInfo();
};

int main(void)
{
	shared_ptr<Person> hong = make_shared<Person>("�浿", 29);
	cout << "���� ������ �� : " << hong.use_count() << endl;	// 1
	auto han = hong;
	cout << "���� ������ �� : " << hong.use_count() << endl;	// 2
	han.reset();		 
	cout << "���� ������ �� : " << hong.use_count() << endl;	// 1
	return 0;
}

Person::Person(const string& name, int age)	
{
	name_ = name;
	age_ = age;
	cout << "�����ڰ� ȣ��Ǿ����ϴ�." << endl;
}

void Person::ShowPersonInfo()
{
	cout << name_ << "�� ���̴� " << age_ << "���Դϴ�." << endl;
}