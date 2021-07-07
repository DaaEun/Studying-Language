#include <iostream>
#include <string>
using namespace std;

int main(void) {

    const int SIZE = 20;
    char address[SIZE];
    char name[SIZE];

    cout << "자신의 이름을 적어주세요 : ";
    cin.get(name, SIZE).ignore(SIZE, '\n');
    cout << "자신이 살고 있는 도시를 적어주세요 : ";
    cin.get(address, SIZE).ignore(SIZE, '\n');

    cout << address << "에 살고 있는 " << name << "님~ 감사합니다!";
}