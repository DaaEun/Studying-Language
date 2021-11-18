# 키워드값

def profile(name, age, main_lang):
    print(name, age, main_lang)

# 순서가 섞여도 키워드에 따라 알맞게 호출
profile(name="유재석", main_lang="python", age=20)
profile(main_lang="Java", age=25, name="김태호")


