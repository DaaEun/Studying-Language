#include <iostream>
using namespace std;

struct Prop
{
	int savings;
	int loan;
};

int CalcProperty(Prop*);

int main(void) {

	int kim_prop;
	Prop kim = { 10000000, 4000000 };

	kim_prop = CalcProperty(&kim);	//구조체의 주소를 함수의 인수로 전달

	cout << "김씨의 재산은" << endl;
	cout << "적금 : " << kim.savings << "원" << endl;
	cout << "대출 : " << kim.loan << "원" << endl;
	cout << "총   : " << kim_prop << "원" << endl;
	cout << "입니다." << endl;

	return 0;
}

int CalcProperty(Prop* money) {

	money->savings = 100;	// 호출된 함수에서 원본 구조체의 데이터를 변경
	return(money->savings - money->loan);
}