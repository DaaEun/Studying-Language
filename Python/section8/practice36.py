# 메소드
# 상속

# 메소드 오버라이딩
# 부모 클래스에서 정의한 메소드 말고, 자식 클래스에서 정의한 메소드를 쓰고 싶을 때,
# 메소드를 새롭게 정의하는 것 -> 오버라이딩

class Unit: # 부모 클래스
    def __init__(self, name, hp, speed):
        self.name = name
        self.hp = hp
        self.speed = speed

    def move(self, location):
        print("[지상 유닛 이동]")    
        print("{0} : {1} 방향으로 이동합니다. [속도 {2}]"\
            .format(self.name, location, self.speed))

# 공격 유닛
class AttackUnit(Unit): # 자식 클래스
    def __init__(self, name, hp, speed, damage):
        Unit.__init__(self, name, hp, speed)
        self.damage = damage

    def attack(self, location):
        print("{0} : {1} 방향으로 적군을 공격합니다. [공격력 {2}]"\
            .format(self.name, location, self.damage)) 

    def damaged(self, damage):
        print("{0} : {1} 데미지를 입었습니다.".format(self.name, damage))
        self.hp -= damage
        print("{0} : 현재 체력은 {1} 입니다.".format(self.name, self.hp))
        if self.hp <= 0:
            print("{0} : 파괴되었습니다.".format(self.name))

# 날 수 있는 기능을 가진 클래스
class Flyable:
    def __init__(self, flying_speed):
        self.flying_speed = flying_speed

    def fly(self, name, location):
        print("{0} : {1} 방향으로 날아갑니다. [속도 {2}]"\
            .format(name, location, self.flying_speed)) 



# 다중상속  # 부모 클래스가 둘이상
# 공중 공격 유닛 클래스 
class FlyableAttackUnit(AttackUnit, Flyable):
    def __init__(self, name, hp, damage, flying_speed):
        AttackUnit.__init__(self, name, hp, 0, damage)  # 지상 speed 0
        Flyable.__init__(self, flying_speed)

    def move(self, location):
        print("[공중 유닛 이동]")   
        self.fly(self.name, location) 


# 파이어뱃 : 공격 유닛, 화염방사기
firebat1 = AttackUnit("파이어뱃", 50, 0, 16)
firebat1.attack("5시")

# 공격 2번 받는다고 가정
firebat1.damaged(25)
firebat1.damaged(25)

# 메딕 : 의무병

# 드랍쉽 : 공중 유닛, 수송기. 마린 / 파이어뱃 / 탱크 등을 수송. 공격 X

# 발키리 : 공중 공격 유닛, 한번에 14발 미사일 발사
valkyrie = FlyableAttackUnit("발키리", 200, 6, 5)
valkyrie.fly(valkyrie.name, "3시")


# Unit        Flyable
#   \             |
# AttackUnit      |
#     \           |
#      \          |
#       \         |
#     FlyableAttackUnit


# 벌쳐 : 지상 유닛, 기동성이 좋음
vulture = AttackUnit("벌쳐", 80, 10, 20)

# 배틀크루저 : 공중 유닛, 체력도 굉장히 좋음, 공격력도 좋음
battlecruiser = FlyableAttackUnit("배틀크루저", 500, 25, 3)

# vulture.move("11시")
# battlecruiser.fly(battlecruiser.name, "9시")
# # 매번 함수(move, fly)를 확인 후 불러야하는 번거로움이 있음 
# # -> 메소드 오버라이딩을 통해 move만 불러서 작동하게 함.

vulture.move("11시")
battlecruiser.move("9시")

# Unit        Flyable
# move()          |
#   \             |
# AttackUnit      |
#     \           |
#      \          |
#       \         |
#     FlyableAttackUnit
#       move() 재정의



# # pass

# # 건물
# class BuildingUnit(Unit):
#     def __init__(self, name, hp, location):
#         pass    # 일단 아무것도 안하고 넘긴다. 완성된것 처럼 보이게.

# # 서플라이 디폿 : 건물, 1개 건물 = 8 유닛생성
# supply_depot = BuildingUnit("서플라이 디폿", 500, "7시")    



# super 

# 건물
class BuildingUnit(Unit):
     def __init__(self, name, hp, location):
        # Unit.__init__(self, name, hp, 0)    # speed 0
        super().__init__(name, hp, 0)   # super 사용시 , ()사용 / self 사용X
        self.location = location