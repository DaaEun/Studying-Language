/*
# 연산자 함수의 정의 방법
2. 전역 함수로 정의하는 방법 : private 멤버에 대한 접근을 위해 C++에서 제공하는 프렌드 함수 사용가능
*/
#include <iostream>
using namespace std;

class Position {
private:
	double x_;
	double y_;
public:
	Position(double x, double y);	// 생성자
	void Display();
	friend Position operator-(const Position& pos1, const Position& pos2);	// - : 연산자 함수
};

int main(void) {

	Position pos1 = Position(3.3, 12.5);
	Position pos2 = Position(-14.4, 7.8);
	Position pos3 = pos1 - pos2;

	pos3.Display();
	return 0;
}

Position::Position(double x, double y) {
	x_ = x;
	y_ = y;
}

Position operator-(const Position& pos1, const Position& pos2) {
	return Position((pos1.x_ + pos2.x_) / 2, (pos1.y_ + pos2.y_) / 2);
}

void Position::Display() {
	cout << "두 지점의 중간 지점의 좌표 : (" << this->x_ << ", " << this->y_ << ")";
}


/*
	# 오버로딩의 제약 사항

	1. 전혀 새로운 연산자를 정의할 수 없다.
	ex) 몫을 나타내기 위한 %%라는 연산자를 새롭게 정의할 수 없다.

	2. 기본 타입을 다루는 연산자의 의미는 재정의할 수 없으며, 
	따라서 오버로딩된 연산자의 피연산자 중 하나는 반드시 사용자 정의 타입이어야 한다.
	ex) 두 개의 double 형에 대한 덧셈 연산자(+)가 뺄셈을 수행하도록 오버로딩할 수 없다.

	3. 오버로딩된 연산자는 기본 타입을 다루는 경우에 적용되는 피연산자의 수, 우선순위 및 그룹화를 준수해야 한다.
	ex) 나눗셈 연산자(/)는 이항 연산자이므로 단항 연산자로 오버로딩할 수 없다.

	4. 오버로딩된 연산자는 디폴트 인수를 사용할 수 없다.
*/