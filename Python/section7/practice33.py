# pickle : 프로그램상에서 사용하고 있는 데이터를 파일 형태로 저장

import pickle

profile_file = open("section7/profile.pickle", "wb")
# wb: b는 바이너리 타입. 인코딩할 필요 X
profile = {"이름":"양다은", "나이":23, "취미":["낮잠","산책","시아"]}
print(profile)
pickle.dump(profile, profile_file)  # profile에 있는 정보를 file에 저장
profile_file.close()

profile_file = open("section7/profile.pickle", "rb")
profile = pickle.load(profile_file) # file에 있는 정보를 profile에 불러오기
#load(): 파일에 내용을 그대로 가져와서, 데이터의 형태로 로드
print(profile)
profile_file.close()
