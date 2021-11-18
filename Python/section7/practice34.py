# with

import pickle

with open("section7/profile.pickle", "rb") as profile_file: # 파일을 열어서 profile_file 변수에 저장
    print(pickle.load(profile_file)) # 볼러옴
    # close 할 필요없음

with open("section7/study.txt", "w", encoding="utf8") as study_file:
    study_file.write("파이썬을 열심히 공부하고 있어요")

with open("section7/study.txt", "r", encoding="utf8") as study_file:
    print(study_file.read())