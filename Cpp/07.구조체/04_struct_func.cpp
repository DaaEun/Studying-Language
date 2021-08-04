#include <iostream>
using namespace std;

struct Prop {
	
	int savings;
	int loan;
};

Prop InitProperty(void);
int CalcProperty(const Prop*);

int main(void) {

	Prop hong;
	int hong_prop;

	hong = InitProperty();
	hong_prop = CalcProperty(&hong);	//구조체의 멤버변수를 함수의 인수로 전달

	cout << "홍길동의 재산은" << endl;
	cout << "적금 : " << hong.savings << "원" << endl;
	cout << "대출 : " << hong.loan << "원" << endl;
	cout << "총   : " << hong_prop << "원" << endl;
	cout << "입니다." << endl;

	return 0;
}

Prop InitProperty(void) {

	Prop hong_prop = { 10000000, 4000000 };
	return hong_prop;	//구조체를 함수의 반환값으로 반환
}

int CalcProperty(const Prop* money) {
	// const 키워드 사용 -> 구조체의 데이터를 직접 수정하는 것을 방지
	//money->savings = 100; (X)
	return(money->savings - money->loan);
}