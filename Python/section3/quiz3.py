# 퀴즈3

# Quiz) 사이트별로 비밀번호를 만들어 주는 프로그램을 작성하시오

# 예) http://naver.com
# 규칙1 : http:// 부분은 제외 => naver.com
# 규칙2 : 처음 만나는 점(.) 이후 부분은 제외 => naver
# 규칙3 : 남은 글자 중 처음 세자리 + 글자 갯수 + 글자 내 'e' 갯수 + "!" 로 구성
#                 (nav)                (5)            (1)         (!)
# 예) 생성된 비밀번호 : nav51!  

address = "http://naver.com"             
index1 = address.find("http://")
index2 = address.index(".")
address = address[index1 + 7 : index2]
pw = address[0 : 3] + str(len(address)) + str(address.count("e")) + "!"
print(pw)



# 강사님 답안

# url = "http://naver.com" 
url =  "http://youtube.com" 
my_str = url.replace("http://","") # 규칙1
my_str = my_str[:my_str.index(".")] # 규칙2
# my_str[0:5] -> 0 ~ 5 직전까지. (0, 1, 2, 3, 4)
password = my_str[:3] + str(len(my_str)) + str(my_str.count("e")) + "!" # 규칙3
print("{0} 의 비밀번호는 {1} 입니다.".format(url, password))