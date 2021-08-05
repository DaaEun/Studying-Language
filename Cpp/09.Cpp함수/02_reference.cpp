#include <iostream>
using namespace std;

struct Book {
	
	string title;
	string author;
	int price;
};

void Display(const Book&);

int main(void) {

	Book web_book = { "웹 프로그래머 되기!", "양경식", 35000 };
	Display(web_book);
	
	return 0;
}

void Display(const Book& bk) {

	cout << "책 제목 : " << bk.title << endl;
	cout << "책 저자 : " << bk.author << endl;
	cout << "책 가격 : " << bk.price << "원" << endl;
}