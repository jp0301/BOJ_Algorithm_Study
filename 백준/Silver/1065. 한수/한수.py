def solve(a):

    result = 0

    for i in range(1, a+1):
        a_list = list(map(int, str(i)))

        if i < 100:
            result += 1
        elif a_list[0] - a_list[1] == a_list[1] - a_list[2]:
            result += 1

    return result


num = int(input())
print(solve(num))
