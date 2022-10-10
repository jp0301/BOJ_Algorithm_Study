# 4673번 셀프 넘버

# 생성자 함수 선언
def d(n):
    x = 0
    a = list(str(n))
    for i in a:
        x = x + int(i)
    return n+x


s_set = set()

# 생성자가 있는 숫자 모두 추가
for k in range(1, 10000):
    s_set.add(d(k))

# 전체 set에서 생성자가 있는 숫자를 빼는 차집합 이용
ans = set(range(1, 10000)) - s_set

# 셀프 넘버 오름차순 정렬 후 한 줄에 하나씩 출력
for num in sorted(ans):
    print(num)