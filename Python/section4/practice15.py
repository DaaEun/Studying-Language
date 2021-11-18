# 사전

cabinet ={3:"유재석", 100:"김태호"} # key : value
print(cabinet[3])
print(cabinet[100])
print(cabinet.get(3))

# print(cabinet[5])
# print("hi") 
# cabinet에 5라는 key가 없어서 오류가 났기 때문에 hi가 출력되지  않는다.

print(cabinet.get(5)) 
print("hi") 
# cabinet에 5라는 key가 없어 None을 출력하고 hi가 출력된다.

print(cabinet.get(5, "사용 가능"))

print(3 in cabinet) # True
print(5 in cabinet) # False

cabinet ={"A-3":"유재석", "B-100":"김태호"} 
print(cabinet["A-3"])
print(cabinet["B-100"])

# 새 손님
print(cabinet)
cabinet["A-3"] = "김종국"
cabinet["C-20"] = "조세호"
print(cabinet)
 
# 간 손님
del cabinet["A-3"]
print(cabinet)

# key들만 출력
print(cabinet.keys())

# value들만 출력
print(cabinet.values())

# key, value 쌍으로 출력
print(cabinet.items())

# 목욕탕 폐점
cabinet.clear()
print(cabinet)



