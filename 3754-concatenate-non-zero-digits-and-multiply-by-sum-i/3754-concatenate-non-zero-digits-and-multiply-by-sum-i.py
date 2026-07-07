class Solution:
    def sumAndMultiply(self, n: int) -> int:
        if n==0:
            return 0
        digsum=0
        x=""
        n=str(n)
        for i in range(len(n)):
            if n[i] != '0':
                digsum+=int(n[i])
                x+=n[i]
        return int(x) * digsum


        