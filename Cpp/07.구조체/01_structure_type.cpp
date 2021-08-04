/*
	구조체(structure type)
	- 사용자가 C++의 기본 타입을 가지고 새롭게 정의할 수 있는 사용자 정의 타입이다.
	- 기본 타입만으로는 나타낼 수 없는 복잡한 데이터를 표현할 수 있다.

	- 배열이 같은 타입의 변수 집합이라고 한다면, 구조체는 다양한 타입의 변수 집합을 하나의 타입으로 나타낸 것이다.
	- 구조체를 구성하는 변수를 구조체의 멤버(member) 또는 멤버변수(member variable)라고 한다.

	- C++의 구조체는 변수뿐만 아니라 함수까지도 멤버 변수로 가질 수 있다.
	- 구조체는 타입일 뿐만 아니라, 객체 지향 프로그래밍의 핵심이 되는 클래스(class)의 기초가 된다.
*/
#include <iostream>
#include <string>
using namespace std;

struct book {
	string title;
	string author;
	int price;
};

int main(void) {

	book web_book = { "HTML과 CSS", "양다은", 25000 };
	book java_book = { "JAVA 기초 배우기","양경식" };

	cout << "웹 교재의 제목 : " << web_book.title << endl;
	cout << "웹 교재의 저자 : " << web_book.author << endl;
	cout << "웹 교재의 가격 : " << web_book.price << endl;
	cout << endl;
	cout << "자바 교재의 제목 : " << java_book.title << endl;
	cout << "자바 교재의 저자 : " << java_book.author << endl;
	cout << "자바 교재의 가격 : " << java_book.price << endl;
}