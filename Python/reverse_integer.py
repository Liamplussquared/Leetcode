# https://leetcode.com/problems/reverse-integer/

class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        odd_flag = 0
        
        if x < 0:
            x = abs(x)
            odd_flag = 1
        
        temp_str = str(x)[::-1]
        x_rev = int(temp_str)
        
        if odd_flag == 1:
            x_rev = x_rev - x_rev - x_rev
        
        if x_rev < (2**31 - 1) and x_rev > (-2**31):
            return x_rev
        else:
            return 0
            