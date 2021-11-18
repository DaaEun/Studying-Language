# super 이어서

class Unit:
    def __init__(self):
        print("Unit 생성자")

class Flyable:
    def __init__(self):
        print("Flyable 생성자")    

class FlyableUnit(Unit, Flyable):
    def __init__(self):
        super().__init__()    

# 드랍쉽
dropship = FlyableUnit()   
 # 부모 클래스 두개 이상 다중 상속을 받을 때, super 이용시, 맨 처음 상속받는 클래스만 호출 
 # class FlyableUnit(Unit, Flyable): 아래와 같이 정의한다.

class FlyableUnit2(Unit, Flyable):
    def __init__(self):
        Unit.__init__(self)
        Flyable.__init__(self)  

dropship = FlyableUnit2() 