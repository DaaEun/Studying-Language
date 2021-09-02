#include <iostream>
using namespace std;

template <typename T>
class Data {
private:
	T data_;
public:
	Data(T dt);
	T get_data();
};

int main(void) {
	
	Data<string> str_data("인공지능 강의");
	Data<int> int_data(24);

	cout << "str_data : " << str_data.get_data() << endl;
	cout << "int_data : " << int_data.get_data() << endl;

	return 0;
}

template <typename T>
Data<T>::Data(T dt) {
	data_ = dt;
}

template <typename T>
T Data<T>::get_data() {
	return data_;
}





/*
	# 클래스 템플릿의 특징

	1. 하나 이상의 템플릿 인수를 가지는 클래스 템플릿 선언

		template <typename T, int i> // 두 개의 템플릿 인수를 가지는 클래스 템플릿을 선언함.
		class X
		{ ... }


	2. 클래스 템플릿에 디폴트 템플릿 인수 명시
	
		template <typename T = int, int i> // 디폴트 템플릿 인수의 타입을 int형으로 명시함.
		class X
		{ ... }


	3. 클래스 템플릿를 기초 클래스로 상속
	
		template <typename Type>
		class Y : public X <Type> // 클래스 템플릿 X를 상속받음.
		{ ... }
*/

