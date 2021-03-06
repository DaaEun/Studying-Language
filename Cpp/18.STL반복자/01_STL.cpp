/*
	# STL(Standard Template Library)
	- C++ 특징 중 하나로 일반화 프로그래밍(generic programming)을 들 수 있다.
	일반화 프로그래밍은 데이터를 중시하는 객체 지향 프로그래밍과는 달리 프로그램의 알고리즘에 그 중점을 둔다.

	- C++ 표준 템플릿 라이브러리인 STL도 이러한 일반화 프로그래밍 패러다임의 한 축을 담당한다.
	STL은 알고리즘을 일반화한 표현을 제공하여, 데이터의 추상화와 코드를 재활용할 수 있게 한다.


	# STL의 구성 요소

	1. 반복자(iterator)
	2. 컨테이너(container)
	3. 알고리즘(algorithm)


	# 반복자(iterator)
	- STL 컨테이너에 저장된 요소를 반복적으로 순회하여, 각각의 요소에 대한 접근을 제공하는 객체이다.
	즉, 컨테이너의 구조나 요소의 타입과는 상관없이 컨테이너에 저장된 데이터를 순회하는 과정을 일반화한 표현이다.
	템플릿이 타입과 상관없이 알고리즘을 표현할 수 있게 해준다면, 반복자는 컨테이너와 상관없이 알고리즘을 표현할 수 있게 한다.

	반복자가 가져야 할 요구 사항과 정의되어야 할 연산자는 다음과 같다.
	요구 사항을 모두 갖춰야만 STL 알고리즘에서 반복자로 사용 가능하다.

	1. 가리키는 요소의 값에 접근할 수 있어야 한다.			-> 참조 연산자(*) 정의
	2. 반복자 사이의 대입 연산, 비교 연산이 가능해야 한다.	-> 대입, 관계 연산자 정의
	3. 가리키는 요소의 주변 요소로 이동할 수 있어야 한다.	-> 증가 연산자(++) 정의
*/
#include <iostream>
#include <iterator>
#include <list>
using namespace std;

int main(void)
{
	list<int> ls = {10};
	ls.push_back(20);	// back_insert_iterator를 사용함. 
	ls.push_front(30);	// front_insert_iterator를 사용함. 
	copy(ls.begin(), ls.end(), ostream_iterator<int>(cout, " "));
	return 0;
}