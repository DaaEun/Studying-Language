/*
	# 프렌드(friend)
	C++에서 객체의 private 멤버에는 해당 객체의 public 멤버함수를 통해서만 접근할 수 있다.
	하지만 경우에 따라 해당 객체의 멤버함수가 아닌 함수도 private 멤버에 접근해야만 할 경우가 있다.
	매번 private 멤버에 접근하기 위한 새로운 public 멤버함수를 작성하는 것은 매우 비효율적이다.

	따라서 프렌드라는 새로운 접근 제어 키워드를 사용한다.
	프렌드는 지정한 대상에 한해 해당 객체의 모든 멤버에 접근할 수 있는 권한을 부여해 준다.
	전역함수, 클래스, 멤버함수의 세 가지 형태로 사용할 수 있다.



	#프렌드 함수 선언
	
	friend 클래스이름 함수이름(매개변수목록);

	선언된 프렌드함수는 클래스 선언부에 그 원형이 포함되지만, 클래스의 멤버함수는 아니다.
	해당 클래스의 멤버함수는 아니지만, 멤버함수와 같은 접근 권한을 가진다.

	- friend 키워드는 함수의 원형에서만 사용해야 하며, 함수의 정의에서 사용하지 않는다.
	- 클래스 선언부의 public, private, protected 영역 등 어디에나 위치할 수 있으며, 위치에 따른 차이는 전혀 없다.



	#프렌드의 필요성
	클래스에 대해 이항 연산자를 오버로딩할 때 프렌드의 필요성이 자주 발생한다.
	그 이유는 바로 멤버함수의 호출 형태에 있다.
	멤버함수는 왼쪽 피연산자인 객체가 호출하는 형태이므로, 이항 연산자의 매개변수 순서라든가 타입에 민감해진다.

	하지만 멤버함수가 아닌 함수를 사용하면 해당 객체의 private 멤버에 접근할 수 없다.
	따라서 이때 사용하는 것이 프렌드이다.
*/
#include <iostream>
using namespace std;

class Rect {

private:
	double height_;
	double width_;
public:
	Rect(double height, double width);	// 생성자
	void DisplaySize();
	Rect operator*(double mul) const;
	friend Rect operator*(double mul, const Rect& origin);	// 프렌드 함수
};

int main(void) {

	Rect origin_rect(10, 20);
	Rect changed_rect01 = origin_rect * 2;
	Rect changed_rect02 = 3 * origin_rect;

	changed_rect01.DisplaySize();
	changed_rect02.DisplaySize();
	return 0;
}

Rect::Rect(double height, double width) {
	height_ = height;
	width_ = width;
}

void Rect::DisplaySize() {
	cout << "사각형의 높이 : " << this->height_ << endl;
	cout << "사각형의 너비 : " << this->width_ << endl;
}

Rect Rect::operator*(double mul)const {
	return Rect(height_ * mul, width_ * mul);
}

// changed_rect02 에러없이 실행
Rect operator*(double mul, const Rect& origin) {
	return origin * mul;
}
