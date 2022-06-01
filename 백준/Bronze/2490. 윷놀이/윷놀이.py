# 도는 A  / 개는 B / 걸은 C  / 윷은 D  / 모는 E

def check(arr):
    num_of_zero = arr.count(0)
    if num_of_zero == 0:
        print("E")
    elif num_of_zero == 4:
        print("D")
    elif num_of_zero == 3:
        print("C")
    elif num_of_zero == 2:
        print("B")
    else:
        print("A")


for i in range(3):
    arr = list(map(int, input().split()))
    check(arr)
