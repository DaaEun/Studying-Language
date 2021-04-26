#include <iostream>
using namespace std;

int main() {
    
    char irum[30];
    cout << "성함과 전화번호를 입력하세요\n";
    // cin >> irum;
    cin.getline(irum, sizeof(irum));
    cout << "구매금액을 입력하세요" << endl;
    int caltot, calpoint;
    cin >> caltot;
    calpoint = caltot * 0.01;
    cout << irum << "님 금회 발생 포인트 = " << calpoint << "점 입니다.\n";
}