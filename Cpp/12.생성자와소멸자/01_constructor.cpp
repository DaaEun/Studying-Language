/*
	# 멤버 변수의 초기화
	클래스를 가지고 객체를 생성하면, 해당 객체는 메모리에 즉시 생성된다.
	하지만 이 객체는 모든 멤버변수를 초기화하기 전에 사용할 수 없다.

	객체의 멤버변수 중에 private 멤버도 있어 직접 접근할 수 없기때문에
	사용자나 프로그램이 일반적인 초기화 방식으로 초기화할 수 없다.

	따라서 private 멤버에 접근할 수 있는 초기화만을 위한 public 함수가 필요하다.
	이러한 초기화 함수는 객체가 생성된 후부터 사용되기 전까지 반드시 멤버의 초기화를 위해 호출되어야 한다.


	# 생성자(constructor)
	C++에서 객체의 생성과 동시에 멤버변수를 초기화하는 생성자라는 멤버 함수를 제공한다.
	클래스 생성자의 이름은 해당 클래스의 이름과 같다.


	# 생성자의 특징
	1. 생성자는 초기화를 위한 데이터를 인수로 전달받을 수 있다.
	2. 생성자는 반환값이 없지만, void형으로 선언하지 않는다.
	3. 객체를 초기화하는 방법이 여러 개인 경우 오버로딩 규칙에 따라 여러 개의 생성자를 가질 수 있다.
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
};

int main(void) {

	Book web_book("HTML과 CSS", 350);	// 생성자의 암시적 호출
	//Book web_book = Book("HTML과 CSS", 350);	// 생성자의 명시적 호출
	 
	// 생성자가 호출되어 멤버변수인 percent_가 초기화되었는지를 확인함.
	cout << web_book.percent_;
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