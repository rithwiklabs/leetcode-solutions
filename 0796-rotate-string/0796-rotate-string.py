class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if goal in s+s:
            return True
        else :
            return False