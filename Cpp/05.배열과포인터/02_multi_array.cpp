#include <iostream>
using namespace std;

int main(void)
{
	int arr1[2][3] = { 10, 20, 30, 40 };
	int arr2[2][3] = {
		{10, 20, 30},
		{40, 50, 60}
	};

	cout << "arr1의 배열 요소의 값" << endl;
	cout << arr1[0][0] << " ";
	cout << arr1[0][1] << " ";
	cout << arr1[0][2] << " ";
	cout << arr1[1][0] << " ";
	cout << arr1[1][1] << " ";
	cout << arr1[1][2] << endl;

	cout << "arr2의 배열 요소의 값" << endl;
	cout << arr2[0][0] << " ";
	cout << arr2[0][1] << " ";
	cout << arr2[0][2] << " ";
	cout << arr2[1][0] << " ";
	cout << arr2[1][1] << " ";
	cout << arr2[1][2];
	return 0;
}