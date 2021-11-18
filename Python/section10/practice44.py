# # 패키지
# # 모듈의 집합

# import travel.thailand # class나 함수는 바로 import 할 수 없다.
# trip_to = travel.thailand.ThailandPackage()
# trip_to.detail()

# from travel.thailand import ThailandPackage # 모든것 import 가능
# trip_to = ThailandPackage()
# trip_to.detail()

# from travel import vietnam
# trip_to = vietnam.VietnamPackage()
# trip_to.detail()



# # __all__

# # from random import *
# from travel import *
# trip_to = vietnam.VietnamPackage()
# # trip_to = thailand.ThailandPackage() # __init__에서 비활성함.
# trip_to.detail()



#모듈 직접 실행

from travel import *
trip_to = thailand.ThailandPackage()
trip_to.detail()



# 패키지, 모듈 위치

import inspect
import random
print(inspect.getfile(random))  # random 모듈이 어느 위치인지 알려줌
print(inspect.getfile(thailand))
