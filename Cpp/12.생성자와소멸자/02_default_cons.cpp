/*
	# 디폴트 생성자(default constructor)
	디폴트 생성자는 객체가 생성될 때 사용자가 초깃값을 명시하지 않으면, 컴파일러가 자동으로 제공하는 생성자이다.
	디폴트 생성자는 사용자로부터 인수를 전달받지 않으므로, 매개변수를 가지지 않는다.
	매개변수를 가지지 않으므로 대부분의 디폴트 생성자가 0이나 NULL, 빈 문자열 등으로 초기화한다.


	# 디폴트 생성자의 정의
	1. 함수 오버로딩을 이용한 방법
	EX)	Book();
	2. 디폴트 인수를 이용한 방법
	EX)	Book::Book(const string& title = "웹 프로그래밍", int total_page = "100");

	
	# 객체의 선언
	1. Book web_book;             // 디폴트 생성자의 암시적 호출
	2. Book web_book = Book();    // 디폴트 생성자의 명시적 호출
	3. Book *ptr_book = new Book; // 디폴트 생성자의 암시적 호출
*/
#include <iostream>
using namespace std;

class Book
{
private:
	int current_page_;
	void set_percent();
public:
	Book(const string& title = "웹 프로그래밍", int total_page = 100);
	string title_;
	int total_page_;
	double percent_;
	void Move(int page);
	void Open();
	void Read();
};

int main(void)
{
	Book web_book;	// 디폴트 생성자의 암시적 호출
	// 생성자가 호출되어 멤버 변수인 percent_가 초기화되었는지를 확인함. 
	cout << web_book.percent_;
	return 0;
}

Book::Book(const string& title, int total_page)
{
	title_ = title;
	total_page_ = total_page;
	current_page_ = 0;
	set_percent();
}

void Book::set_percent()
{
	percent_ = (double)current_page_ / total_page_ * 100;
}

/*
	하지만 컴파일러가 객체의 선언이 아닌 함수의 호출로 보고 오류를 발생시킬 것이다.
	EX)	Book web_book();
*/