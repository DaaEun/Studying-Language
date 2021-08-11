/*
	# 네임스페이스(namespace)
    - 변수, 함수, 구조체, 클래스 등을 서로 구분하기 위해서 이름으로 사용되는 다양한 내부 식별자(identifier)를 가지고 있다.
    - 하지만 프로그램이 복잡해지고 여러 라이브러리가 포함될수록 내부 식별자 간에 충돌할 가능성이 있다.
    - 이러한 이름 충돌 문제를 네임스페이스를 통해 해결한다.

    - 네임스페이스란 내부 식별자에 사용될 수 있는 유효 범위를 제공하는 선언적 영역을 의미한다.
    - 일반적으로 네임스페이스는 헤더 파일에서 정의되며, 언제나 이름을 추가할 수 있도록 개방되어 있다.

    < namespace.h >

        namespace kang {
            void Display(); // 함수의 원형
            int count;      // 변수의 선언
        }
        namespace kim {
            double display; // 변수의 선언
            int count;      // 변수의 선언
        }
    


    # 네임스페이스로의 접근
    - 네임스페이스에 접근하기 위해서는 범위 지정 연산자(::, scope resolution operator)를 사용하여, 
    해당 이름을 특정 네임스페이스로 제한한다.

    < namespace.cpp >

        #include "namespace.h"

        kang::count = 4;
        kim::display = 3.14;
        kim::count = 100;



    # 간소화된 네임스페이스로의 접근

    1. using 지시자(directive)     using namespace 네임스페이스이름;
    2. using 선언(declaration)    using 네임스페이스이름::이름;
*/