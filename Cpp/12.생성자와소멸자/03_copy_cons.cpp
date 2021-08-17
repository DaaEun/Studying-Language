/*
	# 복사 생성자(copy constructor)
	- C++에서 자신과 같은 클래스 타입의 다른 객체에 대한 참조(reference)를 인수로 전달받아, 
	그 참조를 가지고 자신을 초기화하는 방법이 복사 생성자이다.

	- 복사 생성자는 새롭게 생성되는 객체가 원본 객체와 같으면서도, 완전한 독립성을 가지게 해준다.
	왜냐하면, 복사 생성자를 이용한 대입은 깊은 복사(deep copy)를 통한 값의 복사이기 때문이다.


	- 복사 생성자는 다음과 같은 상황에서 주로 사용된다.

	1. 객체가 함수에 인수로 전달될 때
	2. 함수가 객체를 반환값으로 반환할 때
	3. 새로운 객체를 같은 클래스 타입의 기존 객체와 똑같이 초기화할 때
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
	Book(const Book&);	// 복사 생성자의 원형 정의 
	string title_;
	int total_page_;
	double percent_;
	void Move(int page);
	void Open();
	void Read();
};

int main(void)
{
	Book web_book("HTML과 CSS", 350);
	Book html_book(web_book);

	cout << "첫 번째 책의 제목은 " << web_book.title_ << "이고, 총 페이지는 " << web_book.total_page_ << "장이다." << endl;
	cout << "두 번째 책의 제목은 " << html_book.title_ << "이고, 총 페이지는 " << html_book.total_page_ << "장이다.";
	return 0;
}

Book::Book(const string& title, int total_page)
{
	title_ = title;
	total_page_ = total_page;
	current_page_ = 0;
	set_percent();
}

Book::Book(const Book& origin)	// 복사 생성자의 선언 
{
	title_ = origin.title_;
	total_page_ = origin.total_page_;
	current_page_ = origin.current_page_;
	percent_ = origin.percent_;
}

void Book::set_percent()
{
	percent_ = (double)current_page_ / total_page_ * 100;
}