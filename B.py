N,M = map(int, input().split())
P = []
C = []
F = []

for i in range(N):
    data = list(map(int, input().split()))
    P.append(data[0])
    C.append(data[1])
    F.append(data[2:2+data[1]])

for i in range(N):
    for j in range(N):
        if i != j:
            if P[i] < P[j]:
                continue
            F[i].sort()
            F[j].sort()
            if P[i] > P[j] and F[i] == F[j]:
                print("Yes")
                exit(0)

            if set(F[i]).issubset(set(F[j])) and F[i] != F[j]:
                print("Yes")
                exit(0)

print("No")
