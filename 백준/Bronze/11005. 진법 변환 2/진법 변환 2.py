import sys

# 그냥 문자열로 나열하는게 더 효율적이다.
system = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
N, B = map(int, sys.stdin.readline().split())
answer = str()  # 정답을 담을 str()

while N != 0:  # 몫이 0이 될 때까지 (0이 되면 while문 중단)
    # system 문자열의 인덱스 중 나머지와 같은 문자를 answer에 담는다.
    # 만약 나머지가 4이면 system 문자열 안에서 인덱스 4에 해당하는 문자 반환
    answer += system[N % B]
    N //= B  # N // B (몫에 해당하는 값)을 다시 N에다가 대입해서 while 문이 반복해서 돌게끔 한다.

print(answer[::-1])  # 정답을 뒤집어서 출력 나누기 과정 검산과정.
