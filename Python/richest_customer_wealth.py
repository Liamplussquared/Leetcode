class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        largest = 0
        for acc in accounts:
            acc_tot = sum(acc)
            if acc_tot > largest:
                largest = acc_tot
        return largest