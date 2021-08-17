/*
	#소멸자(destructor)
	- C++에서 생성자는 객체 멤버의 초기화뿐만 아니라, 객체를 사용하기 위한 외부 환경까지도 초기화하는 역할을 한다.
	따라서 객체의 수명이 끝나면 생성자의 반대 역할을 수행할 멤버 함수도 필요하다.
	이러한 역할을 하는 멤버 함수가 소멸자이다.

	- 소멸자는 객체의 수명이 끝나면 컴파일러에 의해 자동으로 호출되며, 사용이 끝난 객체를 정리한다.

	- 클래스 소멸자의 이름은 해당 클래스의 이름과 같으며, 이름 앞에 물결 표시(tilde, ~)를 붙여 생성자와 구분한다.
	즉, Book 클래스의 소멸자는 ~Book()이다.

 
	# 소멸자 특징

	1. 소멸자는 인수를 갖지 않는다.
	2. 소멸자는 반환값이 없지만 void형으로 선언하지 않는다.
	3. 객체는 여러 개의 생성자를 가질 수 있지만, 소멸자는 단 하나만 가질 수 있다.
	4. 소멸자는 const, volatile 또는 static으로 선언될 수는 없지만, 
	const, volatile 또는 static으로 선언된 객체의 소멸을 위해서 호출될 수 있다.


	# 한 예제에서 클래스의 소멸자는 반환값이 없음에 주의한다.
	- 예를 들어 생성자에서 new 키워드를 이용해 동적으로 메모리를 할당했다면, 
	소멸자에서는 delete 키워드를 이용해 동적으로 할당받은 메모리를 반환해야 한다.
	- 그렇지 않으면 해당 프로그램에 메모리 누수(memory leak)가 계속해서 발생하게 될 것이다.
*/
#include <iostream>
using namespace std;

class Book
{
private:
	int current_page_;
	void set_percent();
public:
	Book(const string& title, int total_page);
	~Book();	// 소멸자의 원형 정의 
	string title_;
	int total_page_;
	double percent_;
	void Move(int page);
	void Open();
	void Read();
};

int main(void)
{
	Book web_book("HTML과 CSS", 350);	// 생성자의 암시적 호출 
	// 생성자가 호출되어 멤버 변수인 percent_가 초기화되었는지를 확인함. 
	cout << web_book.percent_ << endl;
	return 0;
}

Book::Book(const string& title, int total_page)
{
	title_ = title;
	total_page_ = total_page;
	current_page_ = 0;
	set_percent();
}

Book::~Book()	// 소멸자의 선언 
{
	// 프로그램이 종료될 때 컴파일러에 의해 자동으로 호출됨.
	cout << "**Book 객체의 소멸자 호출**" << endl;
}

void Book::set_percent()
{
	percent_ = (double)current_page_ / total_page_ * 100;
}