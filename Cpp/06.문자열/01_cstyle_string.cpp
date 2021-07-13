/*
	- C++에서는 문자열의 길이에 제한을 두지 않는다.
	- 문자열 배열을 선언할 때는 반드시 널 문자까지 포함해서 생각한다.
*/
#include <iostream>
using namespace std;
const int SIZE = 20;
char address[SIZE];
char name[SIZE];

int main() {

	//cout << "이름 : ";
	//cin >> name;
	//cout << "도시 : ";
	//cin >> address;

	//cout << address << "에 살고 있는 " << name << "님~ 안녕하세요.";
	///*
	//	# 문제
	//	1. 이름에 띄어쓰기가 들어가면 도시를 입력받을 수 없다.
	//	2. 20바이트 이상의 이름이나 도시를 입력하면 프로그램이 강제 종료한다.
	//	
	//	# 해결
	//	- cin 객체는 띄어쓰기, 탭, 캐리지 문자 등 모두를 문자열의 끝으로 인식한다.
	//	- get() 메소드를 사용한다.
	//*/



	//cout << "이름 : ";
	//cin.get(name, SIZE).get();
	//cout << "도시 : ";
	//cin.get(address, SIZE).get();

	//cout << address << "에 살고 있는 " << name << "님~ 안녕하세요.";
	///*
	//*	# 문제
	//*	- 20바이트 이상 이름을 입력하면, 도시를 입력받지 못한다.
	//*	
	//*	# 해결
	//*	- ignore() 메소드를 사용한다.
	//*/



	cout << "이름 : ";
	cin.get(name, SIZE).ignore(SIZE, '\n');
	cout << "도시 : ";
	cin.get(address, SIZE).ignore(SIZE, '\n');

	cout << address << "에 살고 있는 " << name << "님~ 안녕하세요.";
	/*
	*	- 20바이트 이상 이름이나 도시를 입력하여도, 20바이트까지만 입력받고 확인한다.
	*	- string 클래스를 이용하면 더 간단히 해결할 수 있다.
	*/
	return 0;
}