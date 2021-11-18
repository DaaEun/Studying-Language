# 문자열 처리 함수

python = "Python is Amazing"
print(python.lower())
print(python.upper())
print(python[0].isupper())
print(len(python))
print(python.replace("Python", "Java"))

index = python.index("n") # n 이 위치한 인덱스 찾기
print(index)
index = python.index("n", index + 1) # 위의 n이 위치한 인덱스 다음부터 n 이 위치한 인덱스 찾기
print(index)

print(python.find("n"))
print(python.find("Java")) # 없으면 -1 반환
# print(python.index("Java")) # 없으면 에러
print("hi") # 위에 문장에서 에러가 나면 그 아래 문장이 실행되지 않음

print(python.count("n"))
