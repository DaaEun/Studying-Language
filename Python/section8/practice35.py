# # 클래스

# # 마린 : 공격 유닛, 군인. 총을 쓸 수 있음
# name = "마린"   # 유닛의 이름
# hp = 40         # 유닛의 체력
# damage = 5      # 유닛의 공격력
# print("{0} 유닛의 생성되엇습니다.".format(name))
# print("체력 {0}, 공격력 {1}\n".format(hp, damage))


# # 탱크 : 공격 유닛, 탱크. 포를 쓸 수 있는데, 일반모드 / 시즈모드
# tank_name = "탱크"
# tank_hp = 150
# tank_damage = 35
# print("{0} 유닛의 생성되엇습니다.".format(tank_name))
# print("체력 {0}, 공격력 {1}\n".format(tank_hp, tank_damage))

# tank2_name = "탱크"
# tank2_hp = 150
# tank2_damage = 35
# print("{0} 유닛의 생성되엇습니다.".format(tank2_name))
# print("체력 {0}, 공격력 {1}\n".format(tank2_hp, tank2_damage))


# def attack(name, location, damage):
#     print("{0} : {1} 방향으로 적군으로 공격합니다. [공격력 {2}]".format(\
#         name, location, damage))

# attack(name, "1시", damage)
# attack(tank_name, "1시", tank_damage)
# attack(tank2_name, "1시", tank2_damage)

class Unit:
    def __init__(self, name, hp, damage):
        self.name = name
        self.hp = hp
        self.damage = damage
        print("{0} 유닛의 생성되엇습니다.".format(self.name))
        print("체력 {0}, 공격력 {1}".format(self.hp, self.damage))

marine1 = Unit("마린", 40, 5)
marine2 = Unit("마린", 40, 5)
tank = Unit("탱크", 150, 35)



# __init__ : 생성자
# 객체를 만들때 자동으로 호출
# marine1, marine2, tank 는 __init__ 함수의 instance(인스턴스)라고 함.



# 멤버변수
# 클래스 내에 정의된 변수

# 레이스: 공중 유닛, 비행기. 클로킹(상대방에게 보이지 않음)
wraith1 = Unit("레이스", 80, 5)
print("유닛 이름: {0}, 공격력: {1}".format(wraith1.name, wraith1.damage))
# 멤버변수에 다음과 같이 접근가능

# 마인드 컨트롤: 상대방 유닛을 내 것으로 만드는 것(빼았음)
wraith2 = Unit("빼앗은 레이스", 80, 5)
wraith2.clocking = True

if wraith2.clocking == True:
    print("{0} 는 현재 클로킹 상태입니다.".format(wraith2.name))