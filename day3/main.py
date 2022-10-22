from typing import List


def fibonnaci(n: int) -> List[int]:
    fibonnaciSeq = [0] if n < 1 else [0, 1]

    if n > 1:
        a = 0

        b = 1

        for i in range(n):
            c = a + b

            a = b

            b = c

            fibonnaciSeq.append(c)

    return fibonnaciSeq


print(fibonnaci(10))

print(fibonnaci(50))

print(fibonnaci(100))
