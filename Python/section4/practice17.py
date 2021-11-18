# 집합

# 집합 (set)
# 중복 안됨, 순서 없음
my_set = {1,2,3,3,3}
print(my_set)

java = {"유재석", "김태호", "양세형"}
python = set(["유재석", "박명수"]) # 먼저 리스트로 만들고 set으로 감싼다.

# 교집합 (java와 python을 모두 할 수 있는 개발자)
print(java & python)
print(java.intersection(python))

# 합집합 (java를 할 수 있거나 python을 할 수 있는 개발자)
print(java | python)
print(java.union(python))
# 순서가 보장되지 않음

# 차집합 (java를 할 수 있지만 python을 할 줄 모르는 개발자)
print(java - python)
print(java.difference(python))

# python을 할 줄 아는 사람이 늘어났다.
python.add("김태호")
print(python)

# java를 까먹었다.
java.remove("김태호")
print(java)










