# 전달값과 반환값

# 입금하기
def deposit(balance, money):    # 전달값
    # money = 입금액
    print("입금이 완료되었습니다. 잔액은 {0} 원입니다." .format(balance + money))
    return balance + money # 반환값

# 출금하기
def withdraw(balance, money):
    # money = 출금액
    if balance >= money:    # 잔액이 출금보다 많으면
        print("출금이 완료되었습니다. 잔액은 {0} 원입니다." .format(balance - money))
        return balance - money
    else:
        print("출금이 완료되지 않았습니다. 잔액은 {0} 원입니다." .format(balance))
        return balance

# 저녁에 출금하기(수수료 붙음)
def withdraw_night(balance, money):
    commission = 100 # 수수료 100원
    return commission, balance - money - commission


balance = 0 # 잔액
balance = deposit(balance, 1000)
balance = withdraw(balance, 2000)
balance = withdraw(balance, 500)
commission, balance = withdraw_night(balance, 300)
print("수수료 {0} 원이며, 잔액은 {1} 원입니다." .format(commission, balance))