/*
	열거체(enumerated types)
	- enum 키워드를 사용하여 선언한다.
	- 새로운 타입을 선언하면서 동시에 그 타입이 가질 수 있는 정수형 상수값도 같이 명시한다.
	- 이때 상수값을 따로 명시하지 않으면 0부터 시작되며, 그 다음은 바로 앞의 상숫값보다 1만큼 증가되며 정의된다.
	- 열거체를 이용하면 프로그램의 가독성이 높아지고, 변수가 지니는 값에 의미를 부여할 수 있다.
*/


#include <iostream>
#include <string>
using namespace std;

enum Weather {SUUNY = 0, CLOUD = 10, RAIN = 20, SNOW = 30};

int main(void) {

	int input;
	Weather wt;

	cout << "오늘의 날씨를 입력해 주세요 : " << endl;
	cout << "(SUUNY = 0, CLOUD = 10, RAIN = 20, SNOW = 30)" << endl;
	cin >> input;
	wt = (Weather)input;

	switch (wt)
	{
	case SUUNY:
		cout << "오늘의 날씨 : 맑음";
		break;
	case CLOUD:
		cout << "오늘의 날씨 : 흐림";
		break;
	case RAIN:
		cout << "오늘의 날씨 : 비";
		break;
	case SNOW:
		cout << "오늘의 날씨 : 눈";
		break;
	default:
		cout << "정확한 상수값을 입력하세요.";
		break;
	}

	cout << endl << "열거체 Weather의 각 상수값은 " << SUUNY << ", " << CLOUD << ", " << RAIN << ", " << SNOW << "입니다.";
	
	return 0;
}