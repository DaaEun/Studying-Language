/*
    # 파생 클래스(derived class) : 기초 클래스의 모든 특성을 물려받아 새롭게 작성된 클래스

    class 파생클래스이름 : 접근제어지시자 기초클래스이름[, 접근제어지시자 기초클래스이름, ...]
    {
        // 파생 클래스 멤버 리스트
    }

    - 접근 제어 지시자는 기초 클래스의 멤버를 사용할 수 있는 파생 클래스의 접근 제어 권한을 설정한다.
    이때 접근 제어 지시자를 생략하면, 파생 클래스의 접근 제어 권한은 private로 기본 설정이다.
 
    - 쉼표(,)를 사용하여 상속받을 기초 클래스를 여러 개 명시할 수 있다.
    이때 파생 클래스가 상속받는 기초 클래스가 하나이면 단일 상속(single inheritance),
    여러 개의 기초 클래스를 상속받으면 다중 상속(multiple inheritance)이라 한다.


    # 파생 클래스의 특징

    1. 반드시 자신만의 생성자를 작성해야 한다.
    2. 기초 클래스의 접근할 수 있는 모든 멤버 변수들이 저장된다.
    3. 기초 클래스의 접근할 수 있는 모든 멤버 함수를 사용할 수 있다.
    4. 필요한 만큼 멤버를 추가할 수 있다.
*/
#include <iostream>
using namespace std;

class Person {

private:
    string name_;
    int age_;
public:
    Person(const string& name, int age);    // 기초 클래스 생성자의 선언
    void ShowPersonInfo();
};

class Student :public Person {

private:
    int student_id_;
public:
    Student(int sid, const string& name, int age);  // 파생 클래스 생성자의 선언
};

int main(void) {
    Student yang(2017920036, "다은", 24);
    yang.ShowPersonInfo();
    
    return 0;
}

Person::Person(const string& name, int age) {   // 기초 클래스 생성자의 정의
    name_ = name;
    age_ = age;
}

void Person::ShowPersonInfo() {
    cout << "이름 : " << name_ << endl << "나의 : " << age_;
}

Student::Student(int sid, const string& name, int age) :Person(name, age) { // 파생 클래스 생성자의 정의
    student_id_ = sid;
}