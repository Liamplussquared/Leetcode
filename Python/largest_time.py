class Solution:
    def not_valid(self, permutation):
        if permutation[0] > 2:
            return False
        if permutation[2] >= 6:
            return False
        if permutation[0] == 2 and permutation[1] > 3:
            return False
        return True
    
    def largestTimeFromDigits(self, arr: List[int]) -> str:
        perms = list(itertools.permutations(arr))
        possible = [perm for perm in perms if self.not_valid(perm)]
        if not possible:
            return ""
        best_possible = ""
        for digit in max(possible):
	        best_possible+=str(digit)
        return best_possible[0:2]+":"+best_possible[2:]
