# 표준 입출력

print("Python", "Java", sep=", ")
print("Python", "Java", sep=" vs ")
print("Python", "Java", sep=" vs ", end="?")
print("무엇이 더 재밌을까요?")



import sys

print("Python", "Java", file=sys.stdout)
print("Python", "Java", file=sys.stderr)



# 시험성적
scores = {"수학":0, "영어":50, "코딩":100}
for subject, score in scores.items():
    # items()를 사용하면 key와 value를 쌍으로 전달
    # print(subject, score)
    print(subject.ljust(8), str(score).rjust(4), sep=":")



# 은행 대기순번표
# 001, 002, 003, ...
for num in range(1,21):
    print("대기번호 : " + str(num).zfill(3))



answer = input("아무 값이나 입력하세요: ")
print("입력하신 값은 " + answer + "입니다")
# 숫자를 출력하여도 잘 출력된다. 왜? int형인데? 
# type이 문자열(str)이기때문이다.