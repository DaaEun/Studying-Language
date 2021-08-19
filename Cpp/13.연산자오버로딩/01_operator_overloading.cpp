#include <iostream>
using namespace std;

class Position
{
private:
	double x_;
	double y_;
public:
	Position(double x, double y);	// 생성자 
	void Display();
	Position operator-(const Position& other);	// - 연산자 함수 
};

int main(void)
{
	Position pos1 = Position(3.3, 12.5);
	Position pos2 = Position(-14.4, 7.8);
	Position pos3 = pos1 - pos2;

	pos3.Display();
	return 0;
}

Position::Position(double x, double y)
{
	x_ = x;
	y_ = y;
}

Position Position::operator-(const Position& other)
{
	return Position((x_ + other.x_) / 2, (y_ + other.y_) / 2);
}

void Position::Display()
{
	cout << "두 지점의 중간 지점의 좌표는 x좌표가 " << this->x_ << "이고, y좌표가 " << this->y_ << "입니다." << endl;
}