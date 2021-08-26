/*
	# 프렌드 멤버함수
	프렌드 클래스란 해당 클래스의 모든 멤버 함수가 특정 클래스의 프렌드가 된다.
	하지만 멤버함수에 따라 특정 클래스의 프렌드 설정이 필요없는 멤버함수도 있다.

	앞선 예제에서 
	ShowDiagonal() 함수는 Rect 클래스의 private 멤버에 직접 접근하도록 구현되어 있다.
	ShowSize() 함수는 Rect 클래스의 public 인터페이스만으로 구현되어 있다.
	따라서 Display 클래스에서 Rect 클래스에 대해 프렌드 설정이 필요한 함수는 ShowDiagonal() 함수뿐이다.

	- 프렌드 멤버함수란 해당 클래스의 특정 멤버 함수만을 프렌드로 지정하는 것을 의미한다.
	- 이것은 프렌드 설정이 꼭 필요한 함수에 대해서만 접근을 허락하므로, 
	정보 은닉(data hiding) 및 캡슐화(encapsulation) 개념에 더욱 가깝게 구현할 수 있다.
*/
#include <iostream>
#include <cmath>
using namespace std;

class Rect;		// 전방 선언(forward declaration)

class Display {
public:
	void ShowSize(const Rect& target);
	void ShowDiagonal(const Rect& target);
};

class Rect {

private:
	double height_;
	double width_;
public:
	Rect(double height, double width);	// 생성자
	void height() const;
	void width() const;
	friend void Display::ShowDiagonal(const Rect& target);	// 프렌드 멤버함수 선언
};

int main(void) {

	Rect rect01(10, 20);

	Display rect_display;
	rect_display.ShowSize(rect01);
	rect_display.ShowDiagonal(rect01);

	return 0;
}

Rect::Rect(double height, double width) {
	height_ = height;
	width_ = width;
}

void Rect::height() const {
	cout << "사각형의 높이 : " << this->height_ << endl;
}

void Rect::width() const {
	cout << "사각형의 너비 : " << this->width_ << endl;
}

void Display::ShowSize(const Rect& target) {
	target.height();
	target.width();
}

void Display::ShowDiagonal(const Rect& target) {
	double diagonal;
	diagonal = sqrt(pow(target.height_, 2) + pow(target.width_, 2));

	cout << "사각형의 대각선 : " << diagonal << endl;
}
