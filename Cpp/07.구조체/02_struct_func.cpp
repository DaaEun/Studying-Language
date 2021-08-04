#include <iostream>
using namespace std;

struct Prop {

	int savings;
	int loan;
};

int CalcProperty(int, int);

int main(void) {

	int yang_prop;
	Prop yang = { 10000000, 4000000 };

	yang_prop = CalcProperty(yang.savings, yang.loan);
	// 구조체의 멤버 변수를 함수의 인수로 전달

	cout << "양다은의 재산은" << endl;
	cout << "적금 : " << yang.savings << "원" << endl;
	cout << "대출 : " << yang.loan << "원" << endl;
	cout << "총   : " << yang_prop << "원" << endl;
	cout << "입니다." << endl;

	return 0;
}

int CalcProperty(int s, int l) {
	return (s - l);
}