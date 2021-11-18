# 가변 인자

# def profile(name, age, lang1, lang2, lang3, lang4, lang5):
#     print("이름: {0}\t나이: {1}\t" .format(name, age), end=" ") 
#     # print후에 줄바꿈을 하지 않고, end를 출력후 바로 그다음 출력값나옴
#     print(lang1, lang2, lang3, lang4, lang5)

# profile("양다은", 23, "python", "Java", "C", "JSP", "C++")    
# profile("오승준", 27, "한국어", "영어", "붕어", "", "")  


def profile(name, age, *language):
    print("이름: {0}\t나이: {1}\t" .format(name, age), end=" ") 
    # print후에 줄바꿈을 하지 않고, end를 출력후 바로 그다음 출력값나옴
    for lang in language:
        print(lang, end=" ")
    print()    

profile("양다은", 23, "python", "Java", "C", "JSP", "C++", "C#")    
profile("오승준", 27, "한국어", "영어", "붕어")    
