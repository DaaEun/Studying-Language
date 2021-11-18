# 변수

# 애완동물을 소개해 주세요~
print("우리집 강아지의 이름은 연탄이에요.")
print("연탄이는 4살이며, 산책을 아주 좋아해요.")
print("연탄이는 어른일까요? True")



animal = "강아지"
name = "연탄이"
age = 4
hobby = "산책"
is_adult = age >= 3

print("우리집 " + animal + "의 이름은 " + name + "에요.")
hobby = "공놀이"
# print(name + "는 " + str(age) + "살이며, " + hobby + "을 아주 좋아해요.")
print(name, "는 ", str(age), "살이며, ", hobby, "을 아주 좋아해요.")
# + 대신에 ,를 사용하면 띄어쓰기가 하나 포함된다. 
print(name + "는 어른일까요? " + str(is_adult))



# 주석

'''
이렇게 하면 여러 문장이 주석 처리된다.
'''

# ctrl + /
# print("우리집 강아지의 이름은 연탄이에요.")
# print("연탄이는 4살이며, 산책을 아주 좋아해요.")
# print("연탄이는 어른일까요? True")