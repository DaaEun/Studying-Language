/*
	# 오버라이딩(overriding)
	- 함수 오버로딩(overloading)이란 서로 다른 시그니처를 갖는 여러 함수를 같은 이름으로 정의하는 것이다.
	- 함수 오버라이딩(overriding)이란 이미 정의된 함수를 무시하고, 같은 이름의 함수를 새롭게 정의하는 것이다.


	# 멤버 함수 오버라이딩
	- 파생 클래스는 상속을 받을 때 명시한 접근 제어 권한에 맞는 기초 클래스의 모든 멤버를 상속받는다.
	이렇게 상속받은 멤버 함수는 그대로 사용해도 되고, 필요한 동작을 위해 재정의하여 사용할 수도 있다.
	- 오버라이딩이란 멤버 함수의 동작만을 재정의하는 것이므로, 함수의 원형은 기존 멤버 함수의 원형과 같아야 한다.
*/
#include <iostream>
using namespace std;

class Person {

private:
    string name_;
    int age_;
public:
    Person(const string& name, int age);    // 기초 클래스 생성자의 선언
    //void ShowPersonInfo();
    virtual void ShowPersonInfo();          // 오버라이딩의 문제점 해결을 위한 virtual 가상 함수 
};

class Student :public Person {

private:
    int student_id_;
public:
    Student(int sid, const string& name, int age);  // 파생 클래스 생성자의 선언
    //void ShowPersonInfo();                          // 파생 클래스에서 상속받은 멤버 함수의 재정의
    virtual void ShowPersonInfo();                  // 오버라이딩의 문제점 해결을 위한 virtual 가상 함수 
};

int main(void) {

    Person hong("길동", 35);
    hong.ShowPersonInfo();
    Student yang(2017920036, "다은", 24);
    yang.Person::ShowPersonInfo();  //  범위 지정 연산자(::) 사용 -> 파생 클래스에서 기초 클래스의 원래 멤버함수 호출
    yang.ShowPersonInfo();

    // 파생 클래스에서 오버라이딩의 문제점
    Person* ptr_person;
    ptr_person = &hong;
    ptr_person->ShowPersonInfo();
    ptr_person = &yang;
    ptr_person->ShowPersonInfo();
    /*
        # 파생 클래스에서 오버라이딩의 문제점
        - 두 번 모두 Person 객체의 ShowPersonInfo() 함수가 호출된다.
        - 포인터 변수가 실제로 가리키는 객체의 타입을 기준으로 함수를 호출하는 것이 아니라,
        해당 포인터의 타입을 기준으로 함수를 호출하기 때문이다.
        - 따라서 Person 객체를 가리킬 수 있는 포인터 변수로는 Person 객체의 멤버 함수만을 호출할 수 있다.
    */
    return 0;
}

Person::Person(const string& name, int age) {   // 기초 클래스 생성자의 정의
    name_ = name;
    age_ = age;
}

void Person::ShowPersonInfo() {
    cout << "이름 : " << name_ << endl << "나의 : " << age_ << endl;
}

Student::Student(int sid, const string& name, int age) :Person(name, age) { // 파생 클래스 생성자의 정의
    student_id_ = sid;
}

void Student::ShowPersonInfo() {
    cout << "학번 : " << student_id_ << endl;
}