#include <iostream>
using namespace std;

class A
{
public:
	virtual void Print() { cout << "A 클래스의 Print() 함수" << endl; }
};

class B : public A
{
	virtual void Print() { cout << "B 클래스의 Print() 함수" << endl; }
};

int main(void)
{
	A* ptr;
	A obj_a;
	B obj_b;
	
	ptr = &obj_a;
	ptr->Print();
	ptr = &obj_b;
	ptr->Print();
	return 0;
}