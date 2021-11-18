# 기본값

def profile(name, age, main_lang):
    print("이름: {0}\t나이: {1}\t주 사용 언어: {2}" \
        .format(name, age, main_lang))

profile("양다은", 23, "Java") 
profile("오승준", 27, "HTML")  


# 같은 학교/ 학년/ 반/ 수업
def profile(name, age=17, main_lang="python"):   # 기본값 지정
    print("이름: {0}\t나이: {1}\t주 사용 언어: {2}" \
        .format(name, age, main_lang))

profile("양다은")
profile("오승준")        