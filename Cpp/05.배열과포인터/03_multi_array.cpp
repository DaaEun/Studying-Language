#include <iostream>
#include <iomanip>
using namespace std;

int main(void) {
	
	int arr_col_len, arr_row_len;
	int arr[3][4] = {
		{10, 20},
		{30, 40, 50, 60},
		{0, 0, 70, 80}
	};
	// (row)행의 길이는 생략할 수 있으나, (col)열의 길이는 반드시 명시한다.
	// arr[row][col]

	arr_col_len = sizeof(arr[0]) / sizeof(arr[0][0]);
	arr_row_len = (sizeof(arr) / arr_col_len) / sizeof(arr[0][0]);
	/*
		sizeof(arr[0]) : 16
		sizeof(arr[0][0]) : 4 
		sizeif(arr) : 48
		arr_col_len : 4
		arr_row_len : 3
	*/

	cout << "arr의 배열 요소의 값" << endl;
	for (int i = 0; i < arr_row_len; i++) {
		for (int j = 0; j < arr_col_len; j++) {
			cout << setw(4) << arr[i][j];
		}
		cout << endl;
	}
	return 0;
}