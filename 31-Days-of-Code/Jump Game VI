class Solution(object):
    def maxResult(self, nums, k):
        
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        pq = [(0, -k)]
        for i, a in enumerate(nums):
            while i - pq[0][1] > k: heappop(pq)
            a -= pq[0][0]
            heappush(pq, (-a, i))
        return a
