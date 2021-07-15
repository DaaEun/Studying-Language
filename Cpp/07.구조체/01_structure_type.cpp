#include <iostream>
#include <string>
using namespace std;

struct book
{
	string title;
	string author;
	int price;
};

int main(void)
{
	book web_book = {"HTML과 CSS", "홍길동", 28000};
	book java_book = {"Java language", "이순신"};
	
	cout << "첫 번째 책의 제목은 " << web_book.title << "이고, 저자는 " << web_book.author
		<< "이며, 가격은 " << web_book.price << "원입니다." << endl;
	cout << "두 번째 책의 제목은 " << java_book.title << "이고, 저자는 " << java_book.author
		<< "이며, 가격은 " << java_book.price << "원입니다.";
	return 0;
}