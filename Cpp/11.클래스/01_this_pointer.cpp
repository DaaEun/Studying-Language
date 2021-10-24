/*
	# this 포인터
	- 모든 멤버 함수가 자신만의 this 포인터를 가지고 있다.
	- 해당 멤버 함수를 호출한 객체를 가리키게 되며, 호출된 멤버 함수의 숨은 인수로 전달된다.
	- 호출된 멤버 함수는 자신을 호출한 객체가 무엇인지 정확히 파악할 수 있다

	- this는 포인터이므로, 반환할 때에는 참조 연산자(*)를 사용하여 호출한 객체 그 자체를 반환해야 한다.
	- 암시적으로도 사용될 수 있지만, 가급적 화살표(->) 연산자를 통해 명시적으로 사용하는 것이 좋다.


	# this 포인터의 특징

	1. this 포인터는 클래스, 구조체 또는 열거체 타입의 비정적 멤버 함수에서만 사용할 수 있다.
	2. 정적 멤버 함수는 this 포인터를 가지지 않는다.
	3. this 포인터는 언제나 포인터 상수이며, 따라서 값을 재할당할 수 없다.
*/
#include <iostream>
using namespace std;

class Book {
private:
	int current_page_;
	void set_persent();
	
public:
	Book(const string& title, int total_page);
	string title_;
	int total_page_;
	double percent_;
	void Move(int page);
	void Open();
	void Read();
	const Book& ThickerBook(const Book&);	// TickerBook() 함수의 원형
};

int main(void) {

	Book web_book("HTML & CSS", 350);
	Book java_book("JAVA", 200);

	cout << web_book.ThickerBook(java_book).title_;	//더 두꺼운 책의 이름 출력
	return 0;
}

Book::Book(const string& title, int total_page) {

	title_ = title;
	total_page_ = total_page;
	current_page_ = 0;
	set_persent();
}

void Book::set_persent() {
	percent_ = (double)current_page_ / total_page_ * 100;
}

const Book& Book::ThickerBook(const Book& comp_book) {

	if (comp_book.total_page_ > this->total_page_) {
		return comp_book;
	}
	else
	{
		return *this;
	}
}