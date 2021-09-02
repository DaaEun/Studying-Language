#include <iostream>
using namespace std;

template <typename T>
void Swap(T& a, T& b);

template <> 
void Swap<double>(double&, double&);

int main(void) {

	int c = 2, d = 3;
	cout << "c : " << c << ", d : " << d << endl;
	Swap(c, d);
	cout << "c : " << c << ", d : " << d << endl;

	double e = 1.234, f = 4.321;
	cout << "e : " << e << ", f : " << f << endl;
	Swap(e, f);
	cout << "e : " << e << ", f : " << f << endl;

	return 0;
}

template <typename T>
void Swap(T& a, T& b) {

	T temp;
	temp = a;
	a = b;
	b = temp;
}

template <>
void Swap<double>(double&, double&) {
	//double 형은 값을 서로 바꾸지 않음.
}