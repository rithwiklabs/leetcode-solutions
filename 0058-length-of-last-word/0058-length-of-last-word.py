class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        # l=0
        s=s.strip()
        li=list(s.split(" "))
        l=len(li)
        return len(li[l-1])
        