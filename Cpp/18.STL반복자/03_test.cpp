#include <iostream>

#include <fstream>

#include <string>

using namespace std;

 

int main()

{

    ifstream ifs;

    string str;

 

    ifs.open("example.txt"); // "C++ 프로그래밍"

    if(!ifs.is_open())

    {

        cout << "파일을 열 수가 없습니다!" << endl;

        exit(1);

    }

    else

    {

        cout << "파일을 성공적으로 열었습니다!" << endl;

        getline(ifs, str);

        cout << str << endl;

        ifs.close();

    }

}